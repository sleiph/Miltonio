package com.test.miltonio.ui

import com.test.miltonio.MyApplication
import com.test.miltonio.R
import com.test.miltonio.ui.componentes.CardResposta
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.setMargins

class TelaPerguntas : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_perguntas)

        fun loadTelaResultado(id :Int) {
            val intent = Intent(this, TelaResultado::class.java)
            intent.putExtra("id", id)
            startActivity(intent)
        }

        // pega a materia escolhida do intent da tela anterior
        val resulIntent = intent
        val id = resulIntent.getIntExtra("id", 0)
        val materia = MyApplication.materiasdatabase?.MateriaDao()?.loadById(id)

        println(materia?.materia_db)

        fun escolherPerguntas ( nPerguntas: Int ) : MutableList<Array<CharSequence>> {
            val arrPerguntas = mutableListOf<Array<CharSequence>>()

            if (materia != null) {
                val arrPerguntasTemp = resources.obtainTypedArray(materia.arrayPerguntas_db)

                var qntPerguntas = arrPerguntasTemp.length()

                if (qntPerguntas > nPerguntas)
                    qntPerguntas = nPerguntas

                val ordemPerguntas = (0 until qntPerguntas).toMutableList()
                ordemPerguntas.shuffle()

                for (i in 0 until qntPerguntas)
                    arrPerguntas.add( arrPerguntasTemp.getTextArray(ordemPerguntas[i]) )

                arrPerguntasTemp.recycle()
            }
            return arrPerguntas
        }

        // declarando os elementos do layout
        val corFundo = findViewById<RelativeLayout>(R.id.cor_fnd)
        val imgFundo = findViewById<RelativeLayout>(R.id.img_fnd)
        val progressoBarra = findViewById<ProgressBar>(R.id.progressoBarra)
        val gridPergunta = findViewById<GridLayout>(R.id.grid_pergunta)
        val txtPergunta = findViewById<TextView>(R.id.pergunta)
        val btnConferir = findViewById<Button>(R.id.btn_conferir)

        val fundoRespostaDrawable = ContextCompat.getDrawable(
            this,
            R.drawable.card_respostas_fundo
        )
        val fundoSelecionadoDrawable = ContextCompat.getDrawable(
            this,
            R.drawable.card_respostas_selecionada
        )

        val somBom = MediaPlayer.create(this, R.raw.certo)
        val somRuim = MediaPlayer.create(this, R.raw.errado)

        // desenhando a view
        if (materia != null) {
            corFundo.setBackgroundColor(getColor(materia.cor_db))
            imgFundo.setBackgroundResource(materia.fundo_db)
            if (materia.isPreto_db)
                txtPergunta.setTextColor(getColor(R.color.colorPrt))
            else
                txtPergunta.setTextColor(getColor(R.color.colorBnc))
        }

        val nPerguntas = 10
        var acertos = 0
        var progresso = 0
        var resposta = 0

        val perguntas = escolherPerguntas(nPerguntas)

        btnConferir.setOnClickListener {
            if (resposta == 1) {
                acertos += 1
                progressoBarra.progressTintList = ColorStateList.valueOf(
                    Color.rgb(50, 180, 75)
                )
                somBom.start()
            }
            else {
                progressoBarra.progressTintList = ColorStateList.valueOf(
                    Color.rgb(235, 5, 0)
                )
                somRuim.start()
            }
            progresso += 1
            progressoBarra.progress =
                ((progresso.toDouble() / nPerguntas.toDouble()) * 100).toInt()
            btnConferir.isEnabled = false
        }

        fun montarResposta( resposta: CharSequence ) : CardResposta {
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
                resposta
            )
            cardLayout.setRespostaDrawable(fundoRespostaDrawable)

            return cardLayout
        }

        fun montarPergunta( pergunta: Array<CharSequence>) {
            txtPergunta.text = perguntas[progresso][0]

            val qntRespostas = pergunta.size - 1
            val ordemRespostas = (1..qntRespostas).toMutableList()
            ordemRespostas.shuffle()

            val respostaCards = mutableListOf<CardResposta>()

            // remove os elementos passados do layout
            matarChildren(gridPergunta)
            respostaCards.clear()

            // começa a desenhar os cards de resposta
            for (i in 0 until qntRespostas) {
                val cardResposta = montarResposta( pergunta[ordemRespostas[i]] )
                respostaCards.add( cardResposta )

                gridPergunta.addView( cardResposta )
                cardResposta.setOnClickListener {
                    resposta = ordemRespostas[i]
                    if (!btnConferir.isEnabled)
                        btnConferir.isEnabled = true

                    //Todo: Tentar usar Tints em vez de drawables diferentes
                    ///fundoRespostaDrawable?.setTint(getColor(R.color.colorBnc))

                    for (card in respostaCards)
                        card.setRespostaDrawable(fundoRespostaDrawable)
                    respostaCards[i].setRespostaDrawable(fundoSelecionadoDrawable)
                }
            }
        }

        while(progresso < nPerguntas) {
            montarPergunta( perguntas[progresso] )
        }
        val pontos = (acertos.toDouble() / nPerguntas.toDouble()) * 100
        if (materia != null) {
            if (pontos > materia.pontos_db) {
                materia.pontos_db = pontos.toInt()
                MyApplication.materiasdatabase?.MateriaDao()?.updateCatg(materia)
            }
        }
        loadTelaResultado( id )
    }
}

//Todo: Adicionar imagens nas perguntas
//Todo: Se você errar a pergunta, ela volta no final (igual o Duolingo)
//Todo: Perguntas de múltipla escolha
//Todo: Scroll mais bonito/intuitivo das respostas
//Todo: formatar melhor strings de código
