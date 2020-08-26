package com.test.miltonio

import android.content.Intent
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.test.miltonio.ui.CardResposta

class TelaRespostas : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_respostas)

        fun loadResultado(resul:Int) {
            val intent = Intent(this, TelaResultado::class.java)
            intent.putExtra("resul", resul)
            startActivity(intent)
        }

        val resulIntent = intent
        val categoria = resulIntent.getIntExtra("resul", 0)

        val db_val = MyApplication.database?.categoriaDao()?.loadById(categoria)

        var acertos = 0
        var resposta = 0
        var progresso = 0

        var arrPerguntas : TypedArray? = null
        val qntPerguntas: Int
        var ordemPerguntas: MutableList<Int> = mutableListOf()

        val corFundo = findViewById(R.id.cor_fnd) as RelativeLayout
        val imgFundo = findViewById(R.id.img_fnd) as RelativeLayout
        val progressoBarra = findViewById(R.id.progressoBarra) as ProgressBar
        val gridPergunta = findViewById<GridLayout>(R.id.grid_pergunta)
        val txtPergunta = findViewById(R.id.pergunta) as TextView
        val btnConferir = findViewById(R.id.btn_conferir) as Button

        fun getPergunta(indice: Int){
            txtPergunta.text = arrPerguntas?.getTextArray(ordemPerguntas[indice])?.get(0)
            val qntRespostas = arrPerguntas?.getTextArray(ordemPerguntas[indice])?.size?.minus(1)
            val ordemRespostas: MutableList<Int> = (1..qntRespostas!!).toMutableList()
            ordemRespostas.shuffle()

            if (gridPergunta.childCount>1)
                for (i in 1 until gridPergunta.childCount)
                    gridPergunta.removeViewAt(1)

            for (i in 0 until qntRespostas) {
                val cardLayout = CardResposta(this)
                val param = GridLayout.LayoutParams(
                    GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f),
                    if (i == qntRespostas-1 && qntRespostas%2!=0)
                        GridLayout.spec(GridLayout.UNDEFINED, 2, 2f)
                    else
                        GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f)
                )
                param.width = 0
                cardLayout.layoutParams = param
                cardLayout.setRespostaText(arrPerguntas?.getTextArray(ordemPerguntas[indice])?.get(ordemRespostas[i]))
                gridPergunta.addView(cardLayout)
                cardLayout.setOnClickListener {
                    if (!btnConferir.isEnabled) btnConferir.isEnabled = true
                    //setCardsInativos(arrayOf(card_resposta_2,card_resposta_3,card_resposta_4))
                    //card_resposta_1.setCardBackgroundColor(applicationContext.getColor(R.color.respostaCerta))
                    resposta = ordemRespostas[i]
                }
            }
        }

        if (db_val != null) {
            corFundo.setBackgroundColor(getColor(db_val.cor_db))
            imgFundo.setBackgroundResource(db_val.fundo_db)
            if (db_val.isPreto_db)
                txtPergunta.setTextColor(getColor(R.color.colorPrt))
            else
                txtPergunta.setTextColor(getColor(R.color.colorBnc))

            arrPerguntas = resources.obtainTypedArray(db_val.arrayPerguntas_db)
            qntPerguntas = arrPerguntas.length()
            ordemPerguntas = (0..(qntPerguntas-1)).toMutableList()
            ordemPerguntas.shuffle()
            getPergunta(progresso)
        }
        else {
            corFundo.setBackgroundColor(getColor(R.color.color_sgu))
            imgFundo.setBackgroundResource(R.drawable.fndsgu)
            arrPerguntas = resources.obtainTypedArray(R.array.sgu_perguntas)
            qntPerguntas = arrPerguntas.length()
            ordemPerguntas = (0..(qntPerguntas-1)).toMutableList()
            ordemPerguntas.shuffle()
            getPergunta(progresso)
        }



        fun setCardsInativos(cards: Array<CardView>){
            for(card in cards)
                card.setCardBackgroundColor(applicationContext.getColor(R.color.color_card_respostas))
        }

        btnConferir.setOnClickListener {
            //setCardsInativos(arrayOf(card_resposta_1, card_resposta_2, card_resposta_3, card_resposta_4))
            if (resposta == 1) {
                acertos ++
                progressoBarra.setProgressTintList(
                    ColorStateList.valueOf(Color.rgb(50,180,75))
                )
            }
            else
                progressoBarra.setProgressTintList(
                    ColorStateList.valueOf(Color.rgb(235,5,0))
                )
            progresso++
            progressoBarra.progress = ((progresso.toDouble()/qntPerguntas.toDouble())*100).toInt()
            if (progresso < 10)
                getPergunta(progresso)
            else {
                arrPerguntas.recycle()
                if (db_val != null) {
                    db_val.pontos_db = acertos * 10
                    MyApplication.database?.categoriaDao()?.updateCatg(db_val)
                }
                loadResultado(categoria)
            }
            btnConferir.isEnabled = false
        }

    }
}