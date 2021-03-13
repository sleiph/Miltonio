package com.test.miltonio

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
import com.test.miltonio.ui.CardResposta

class TelaPerguntas : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_perguntas)

        fun loadResultado(resul :IntArray) {
            val intent = Intent(this, TelaResultado::class.java)
            intent.putExtra("resul", resul)
            startActivity(intent)
        }

        val resulIntent = intent
        val categoria = resulIntent.getIntExtra("resul", 0)

        var acertos = 0
        var resposta = 0
        var progresso = 0

        val arrPerguntas = mutableListOf<Array<CharSequence>>()

        val fundoRespostaDrawable = ContextCompat.getDrawable(this, R.drawable.card_respostas_fundo)
        val fundoSelecionadoDrawable = ContextCompat.getDrawable(this, R.drawable.card_respostas_selecionada)

        val somBom = MediaPlayer.create(this, R.raw.certo)
        val somRuim = MediaPlayer.create(this, R.raw.errado)

        val corFundo = findViewById<RelativeLayout>(R.id.cor_fnd)
        val imgFundo = findViewById<RelativeLayout>(R.id.img_fnd)
        val progressoBarra = findViewById<ProgressBar>(R.id.progressoBarra)
        val gridPergunta = findViewById<GridLayout>(R.id.grid_pergunta)
        val txtPergunta = findViewById<TextView>(R.id.pergunta)
        val btnConferir = findViewById<Button>(R.id.btn_conferir)

        fun getPergunta(indice: Int){
            txtPergunta.text = arrPerguntas[indice][0]

            val qntRespostas = arrPerguntas[indice].size - 1
            val ordemRespostas = (1 .. qntRespostas).toMutableList()
            ordemRespostas.shuffle()

            val respostaCards = mutableListOf<CardResposta>()

            // remove os elementos passados do layout
            matarChildren(gridPergunta)
            respostaCards.clear()

            // começa a desenhar os cards de resposta
            for (i in 0 until qntRespostas) {
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
                    arrPerguntas[indice][ordemRespostas[i]]
                )
                cardLayout.setRespostaDrawable(fundoRespostaDrawable)
                respostaCards.add(cardLayout)
                gridPergunta.addView(cardLayout)
                cardLayout.setOnClickListener {
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

        fun setPontuacao(pontos: Int, semestre: Int) {
            when(semestre) {
                0 -> {
                    val dados = MyApplication.sem1database?.Sem1Dao()?.loadById(categoria-10)
                    if (dados != null) {
                        dados.pontos_db = pontos
                        MyApplication.sem1database?.Sem1Dao()?.updateCatg(dados)
                    }
                }
                1 -> {
                    val dados = MyApplication.sem2database?.Sem2Dao()?.loadById(categoria-20)
                    if (dados != null) {
                        dados.pontos_db = pontos
                        MyApplication.sem2database?.Sem2Dao()?.updateCatg(dados)
                    }
                }
                2 -> {
                    val dados = MyApplication.sem3database?.Sem3Dao()?.loadById(categoria-30)
                    if (dados != null) {
                        dados.pontos_db = pontos
                        MyApplication.sem3database?.Sem3Dao()?.updateCatg(dados)
                    }
                }
            }
        }

        fun desenhaPerguntas (
            record: Int, arrPerg: Int,
            cor: Int, fundo: Int, isPreto: Boolean
        ) {
            corFundo.setBackgroundColor(getColor(cor))
            imgFundo.setBackgroundResource(fundo)
            if (isPreto)
                txtPergunta.setTextColor(getColor(R.color.colorPrt))
            else
                txtPergunta.setTextColor(getColor(R.color.colorBnc))

            val arrPerguntasTemp = resources.obtainTypedArray(arrPerg)

            var qntPerguntas = arrPerguntasTemp.length()
            // número de perguntas que vão fazer parte do jogo
            val maxPerguntas = 10
            if (qntPerguntas > maxPerguntas) qntPerguntas = maxPerguntas

            val ordemPerguntas = (0 until qntPerguntas).toMutableList()
            ordemPerguntas.shuffle()

            for (i in 0 until qntPerguntas)
                arrPerguntas.add(arrPerguntasTemp.getTextArray(ordemPerguntas[i]))

            arrPerguntasTemp.recycle()

            getPergunta(progresso)

            btnConferir.setOnClickListener {
                if (resposta == 1) {
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
                    ((progresso.toDouble() / qntPerguntas.toDouble()) * 100).toInt()

                if (progresso < qntPerguntas) {
                    getPergunta(progresso)
                }
                else {
                    val pontos = (acertos.toDouble() / qntPerguntas.toDouble()) * 100
                    if (pontos > record)
                        setPontuacao(pontos.toInt(), semestre)

                    loadResultado( intArrayOf(categoria, pontos.toInt()) )
                }
                btnConferir.isEnabled = false
            }
        }

        fun setSemestre(categ: Int) {
            when(categ) {
                in 0 until 20 -> {
                    val dados = MyApplication.sem1database?.Sem1Dao()?.loadById(categ-10)
                    if (dados != null) {
                        val pontos = dados.pontos_db
                        val arrPerg = dados.arrayPerguntas_db
                        val cor = dados.cor_db
                        val fundo = dados.fundo_db
                        val isPreto = dados.isPreto_db

                        desenhaPerguntas(
                            pontos, arrPerg,
                            cor, fundo, isPreto
                        )
                    }
                }
                in 20 until 30 -> {
                    val dados = MyApplication.sem2database?.Sem2Dao()?.loadById(categ-20)
                    if (dados != null) {
                        val pontos = dados.pontos_db
                        val arrPerg = dados.arrayPerguntas_db
                        val cor = dados.cor_db
                        val fundo = dados.fundo_db
                        val isPreto = dados.isPreto_db

                        desenhaPerguntas(
                            pontos, arrPerg,
                            cor, fundo, isPreto
                        )
                    }
                }
                in 30 until 40 -> {
                    val dados = MyApplication.sem3database?.Sem3Dao()?.loadById(categ-30)
                    if (dados != null) {
                        val pontos = dados.pontos_db
                        val arrPerg = dados.arrayPerguntas_db
                        val cor = dados.cor_db
                        val fundo = dados.fundo_db
                        val isPreto = dados.isPreto_db

                        desenhaPerguntas(
                            pontos, arrPerg,
                            cor, fundo, isPreto
                        )
                    }
                }
            }
        }

        setSemestre(categoria)
    }
}

//Todo: Adicionar imagens nas perguntas
//Todo: Se você errar a pergunta, ela volta no final (igual o Duolingo)
//Todo: Perguntas de múltipla escolha
//Todo: Scroll mais bonito/intuitivo das respostas
//Todo: formatar melhor strings de código
