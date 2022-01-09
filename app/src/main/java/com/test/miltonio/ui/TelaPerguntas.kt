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

class TelaPerguntas : AppCompatActivity() {
    fun loadTelaResultado(id :Int) {
        val intent = Intent(this, TelaResultado::class.java)
        intent.putExtra("id", id)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_perguntas)

        // pegando o id do intent da tela anterior
        val resulIntent = intent
        val id = resulIntent.getIntExtra("id", 0)

        // pegando a materia do banco de dados
        val materia = MyApplication.materiasdatabase?.MateriaDao()?.get( id )

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
        val perguntas = MyApplication.materiasdatabase?.PerguntaDao()?.getByMateriaId( id )
        // número de perguntas que vão fazer parte do jogo
        var nPerguntas = 10

        if (perguntas != null) {
            val qntPerguntasTemp = perguntas.size

            if (nPerguntas > qntPerguntasTemp)
                nPerguntas = qntPerguntasTemp

            // embaralhando as perguntas
            perguntas.shuffle()
        }

        fun montarResposta(resposta: Resposta, cards: MutableList<CardResposta>): CardResposta {
            val cardLayout = CardResposta(this)

            // adicionando o texto da resposta
            cardLayout.setRespostaText( resources.getString(resposta.id) )
            cardLayout.setRespostaDrawable(fundoRespostaDrawable)

            cardLayout.setOnClickListener {
                isCerta = resposta.isCerta
                if (!btnConferir.isEnabled)
                    btnConferir.isEnabled = true

                //Todo: Tentar usar Tints em vez de drawables diferentes
                ///fundoRespostaDrawable?.setTint(getColor(R.color.colorBnc))

                for (card in cards) {
                    card.setRespostaDrawable(fundoRespostaDrawable)
                }
                cardLayout.setRespostaDrawable(fundoSelecionadoDrawable)
            }

            return cardLayout
        }

        fun montarPergunta(pergunta: Pergunta) {
            // remove os cards da pergunta anterior
            MainActivity.matarChildren(gridPergunta)

            val respostas = MyApplication.materiasdatabase?.RespostaDao()
                ?.getByPerguntaId( pergunta.id )

            txtPergunta.text = resources.getString( pergunta.id )

            val cards = mutableListOf<CardResposta>()

            if (respostas != null) {
                respostas.shuffle()

                // começa a desenhar os cards de resposta
                for (i in 0 until respostas.size) {
                    val card = montarResposta(respostas[i], cards)
                    cards.add(card)
                    gridPergunta.addView(card)
                }
            }
        }

        if (materia != null) {
            // desenhando a base da tela
            corFundo.setBackgroundColor( ContextCompat.getColor(this, materia.cor) )
            imgFundo.setBackgroundResource( materia.imgFundo )
            if (materia.isPreto)
                txtPergunta.setTextColor(ContextCompat.getColor(this, R.color.colorPrt))
            else
                txtPergunta.setTextColor(ContextCompat.getColor(this, R.color.colorBnc))

            // desenhando a primeira pergunta
            if (perguntas != null) {
                montarPergunta(perguntas[progresso])
            }

            // funcao click do botao de conferir resposta
            btnConferir.setOnClickListener {
                // se a resposta ta certa
                if (isCerta) {
                    acertos += 1
                    progressoBarra.progressTintList = ColorStateList.valueOf(
                        Color.rgb(50, 180, 75)
                    )
                    if (MainActivity.isSonando) {
                        somBom.start()
                    }
                // se a resposta ta errada
                } else {
                    progressoBarra.progressTintList = ColorStateList.valueOf(
                        Color.rgb(235, 5, 0)
                    )
                    if (MainActivity.isSonando) {
                        somRuim.start()
                    }
                }
                progresso += 1
                progressoBarra.progress =
                    ((progresso.toDouble() / nPerguntas.toDouble()) * 100).toInt()

                // se ainda tem mais perguntas
                if (progresso < nPerguntas) {
                    if (perguntas != null) {
                        montarPergunta(perguntas[progresso])
                    }
                }
                // se acabaram as perguntas
                else {
                    val pontos = (acertos.toDouble() / nPerguntas.toDouble()) * 100
                    materia.pontos = pontos.toInt()
                    MyApplication.materiasdatabase?.MateriaDao()?.update(materia)
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
