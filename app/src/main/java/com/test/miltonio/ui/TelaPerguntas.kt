package com.test.miltonio.ui

import com.test.miltonio.MyApplication
import com.test.miltonio.R
import com.test.miltonio.ui.componentes.CardResposta
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.setMargins

class TelaPerguntas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_perguntas)

        fun loadTelaResultado(id :Int) {
            val intent = Intent(this, TelaResultado::class.java)
            intent.putExtra("id", id)
            startActivity(intent)
        }

        // pegando o id do intent da tela anterior
        val resulIntent = intent
        val id = resulIntent.getIntExtra("id", 0)

        // pegando a materia do banco de dados
        val materia = MyApplication.materiasdatabase?.MateriaDao()?.loadById( id )

        // elementos do layout
        val fundoRespostaDrawable = ContextCompat.getDrawable(this, R.drawable.card_respostas_fundo)
        val fundoSelecionadoDrawable = ContextCompat.getDrawable(this,
            R.drawable.card_respostas_selecionada
        )

        val somBom = MediaPlayer.create(this, R.raw.certo)
        val somRuim = MediaPlayer.create(this, R.raw.errado)

        val corFundo = findViewById<RelativeLayout>(R.id.cor_fnd)
        val imgFundo = findViewById<RelativeLayout>(R.id.img_fnd)
        val progressoBarra = findViewById<ProgressBar>(R.id.progressoBarra)
        val gridPergunta = findViewById<GridLayout>(R.id.grid_pergunta)
        val txtPergunta = findViewById<TextView>(R.id.pergunta)
        val btnConferir = findViewById<Button>(R.id.btn_conferir)

        // controles do estado
        var acertos = 0
        var progresso = 0
        // se a resposta selecionada está certa
        var isCerta = false

        // pegando as perguntas do banco de dados
        val perguntas = MyApplication.materiasdatabase?.PerguntaDao()?.loadByMateriaId( id )
        // número de perguntas que vão fazer parte do jogo
        var nPerguntas = 10

        if (perguntas != null) {
            val qntPerguntasTemp = perguntas.size

            if (nPerguntas > qntPerguntasTemp)
                nPerguntas = qntPerguntasTemp

            // embaralhando as perguntas
            perguntas.shuffle()
        }

        fun montarResposta(indice: Int, resposta: Resposta, cards: MutableList<CardResposta>) {
            val cardLayout = CardResposta(this)
            val param = GridLayout.LayoutParams(
                GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f),
                GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f)
            )
            param.width = 0
            param.setMargins(resources.getDimension(R.dimen.margem_meia_margin).toInt())
            cardLayout.layoutParams = param

            // adicionando o texto da resposta
            cardLayout.setRespostaText(
                resources.getString(resposta.id)
            )
            cardLayout.setRespostaDrawable(fundoRespostaDrawable)
            cards.add(cardLayout)
            gridPergunta.addView(cardLayout)
            cardLayout.setOnClickListener {
                isCerta = resposta.isCerta
                if (!btnConferir.isEnabled)
                    btnConferir.isEnabled = true

                //Todo: Tentar usar Tints em vez de drawables diferentes
                ///fundoRespostaDrawable?.setTint(getColor(R.color.colorBnc))

                for (card in cards)
                    card.setRespostaDrawable(fundoRespostaDrawable)
                cards[indice].setRespostaDrawable(fundoSelecionadoDrawable)
            }
        }

        fun montarPergunta(pergunta: Pergunta) {
            val respostas = MyApplication.materiasdatabase?.RespostaDao()
                ?.loadByPerguntaId( pergunta.id )

            txtPergunta.text = resources.getString( pergunta.id )

            // remove os elementos passados do layout
            matarChildren(gridPergunta)
            val cards = mutableListOf<CardResposta>()

            if (respostas != null) {
                respostas.shuffle()

                // começa a desenhar os cards de resposta
                for (i in 0 until respostas.size) {
                    montarResposta(i, respostas[i], cards)
                }
            }
        }

        if (materia != null) {
            // desenhando a base da tela
            corFundo.setBackgroundColor( ContextCompat.getColor(this, materia.cor_db) )
            imgFundo.setBackgroundResource( materia.fundo_db )
            if (materia.isPreto_db)
                txtPergunta.setTextColor(ContextCompat.getColor(this, R.color.colorPrt))
            else
                txtPergunta.setTextColor(ContextCompat.getColor(this, R.color.colorBnc))

            // desenhando a primeira pergunta
            if (perguntas != null) {
                montarPergunta(perguntas[progresso])
            }

            // funcao click do botao de conferir resposta
            btnConferir.setOnClickListener {
                if (isCerta) {
                    acertos += 1
                    progressoBarra.progressTintList = ColorStateList.valueOf(
                        Color.rgb(50, 180, 75)
                    )
                    somBom.start()
                } else {
                    progressoBarra.progressTintList = ColorStateList.valueOf(
                        Color.rgb(235, 5, 0)
                    )
                    somRuim.start()
                }
                progresso += 1
                progressoBarra.progress =
                    ((progresso.toDouble() / nPerguntas.toDouble()) * 100).toInt()

                if (progresso < nPerguntas) {
                    if (perguntas != null) {
                        montarPergunta(perguntas[progresso])
                    }
                }
                else {
                    val pontos = (acertos.toDouble() / nPerguntas.toDouble()) * 100
                    materia.pontos_db = pontos.toInt()
                    MyApplication.materiasdatabase?.MateriaDao()?.updateCatg(materia)
                    loadTelaResultado( id )
                }

                btnConferir.isEnabled = false
            }
        }
    }
}

//Todo: Adicionar imagens nas perguntas
//Todo: Se você errar a pergunta, ela volta no final (igual o Duolingo)
//Todo: Perguntas de múltipla escolha
//Todo: Scroll mais bonito/intuitivo das respostas
//Todo: formatar melhor strings de código
