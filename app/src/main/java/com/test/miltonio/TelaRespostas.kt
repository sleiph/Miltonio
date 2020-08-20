package com.test.miltonio

import android.content.Intent
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class TelaRespostas : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_respostas)

        fun loadResultado(resul:Int){
            val intent = Intent(this, TelaResultado::class.java)
            intent.putExtra("resul", resul)
            startActivity(intent)
        }

        val resulIntent = intent
        val categoria = resulIntent.getIntExtra("resul", 0)

        var progresso = 0
        var acertos = 0
        var resposta = 0

        val ordemPerguntas:MutableList<Int> = (0..9).toMutableList()
        val ordemRespostas:MutableList<Int> = (1..4).toMutableList()

        val cor_fnd: RelativeLayout = findViewById(R.id.cor_fnd) as RelativeLayout
        val img_fnd: RelativeLayout = findViewById(R.id.img_fnd) as RelativeLayout

        val txt_pergunta:TextView = findViewById(R.id.pergunta) as TextView
        val txt_resposta_1:TextView = findViewById(R.id.txt_resposta1) as TextView
        val txt_resposta_2:TextView = findViewById(R.id.txt_resposta2) as TextView
        val txt_resposta_3:TextView = findViewById(R.id.txt_resposta3) as TextView
        val txt_resposta_4:TextView = findViewById(R.id.txt_resposta4) as TextView

        val progresso_barra:ProgressBar = findViewById(R.id.progressoBarra) as ProgressBar

        val card_resposta_1 = findViewById<CardView>(R.id.btn_resposta1)
        val card_resposta_2 = findViewById<CardView>(R.id.btn_resposta2)
        val card_resposta_3 = findViewById<CardView>(R.id.btn_resposta3)
        val card_resposta_4 = findViewById<CardView>(R.id.btn_resposta4)
        val btn_conferir:Button = findViewById(R.id.btn_conferir) as Button

        val db_val = MyApplication.database?.categoriaDao()?.loadById(categoria)

        fun setCategoria(catg:Int): TypedArray {
            var corCateg = R.color.color_sgu
            var imgFnd = R.drawable.fndadm
            var arrCateg = R.array.sgu_perguntas
            var escuro = false
            when (catg){
                1 -> {
                    corCateg = R.color.color_tru
                    imgFnd = R.drawable.fndalg
                    arrCateg = R.array.tru_perguntas
                    escuro = true
                }
                2 -> {
                    corCateg = R.color.color_trd
                    imgFnd = R.drawable.fndaoc
                    arrCateg = R.array.trd_perguntas
                    escuro = true
                }
                3 -> {
                    corCateg = R.color.color_qru
                    imgFnd = R.drawable.fndeng
                    arrCateg = R.array.qru_perguntas
                }
                4 -> {
                    corCateg = R.color.color_qrd
                    imgFnd = R.drawable.fndlhw
                    arrCateg = R.array.qrd_perguntas
                }
                5 -> {
                    corCateg = R.color.color_qnu
                    imgFnd = R.drawable.fndmat
                    arrCateg = R.array.qnu_perguntas
                    escuro = true
                }
                6 -> {
                    corCateg = R.color.color_sxu
                    imgFnd = R.drawable.fndprg
                    arrCateg = R.array.sxu_perguntas
                    escuro = true
                }
            }
            cor_fnd.setBackgroundColor(applicationContext.getColor(corCateg))
            img_fnd.setBackgroundResource(imgFnd)
            if (escuro)
                txt_pergunta.setTextColor(applicationContext.getColor(R.color.colorBnc))
            return resources.obtainTypedArray(arrCateg)
        }

        fun setCardsInativos(cards: Array<CardView>){
            for(card in cards)
                card.setCardBackgroundColor(applicationContext.getColor(R.color.card_respostas))
        }

        val arr_perguntas: TypedArray = setCategoria(categoria)

        fun getPerguntas(index:Int) {
            txt_pergunta.text = arr_perguntas.getTextArray(ordemPerguntas[index])[0]
            ordemRespostas.shuffle()
            txt_resposta_1.text = arr_perguntas.getTextArray(ordemPerguntas[index])[ordemRespostas[0]]
            txt_resposta_2.text = arr_perguntas.getTextArray(ordemPerguntas[index])[ordemRespostas[1]]
            txt_resposta_3.text = arr_perguntas.getTextArray(ordemPerguntas[index])[ordemRespostas[2]]
            txt_resposta_4.text = arr_perguntas.getTextArray(ordemPerguntas[index])[ordemRespostas[3]]
        }

        ordemPerguntas.shuffle()
        getPerguntas(progresso)

        card_resposta_1.setOnClickListener {
            if (!btn_conferir.isEnabled) btn_conferir.isEnabled = true
            setCardsInativos(arrayOf(card_resposta_2,card_resposta_3,card_resposta_4))
            card_resposta_1.setCardBackgroundColor(applicationContext.getColor(R.color.respostaCerta))
            resposta = ordemRespostas[0]
        }

        card_resposta_2.setOnClickListener {
            if (!btn_conferir.isEnabled) btn_conferir.isEnabled = true
            setCardsInativos(arrayOf(card_resposta_1,card_resposta_3,card_resposta_4))
            card_resposta_2.setCardBackgroundColor(applicationContext.getColor(R.color.respostaCerta))
            resposta = ordemRespostas[1]
        }

        card_resposta_3.setOnClickListener {
            if (!btn_conferir.isEnabled) btn_conferir.isEnabled = true
            setCardsInativos(arrayOf(card_resposta_1, card_resposta_2, card_resposta_4))
            card_resposta_3.setCardBackgroundColor(applicationContext.getColor(R.color.respostaCerta))
            resposta = ordemRespostas[2]
        }

        card_resposta_4.setOnClickListener {
            if (!btn_conferir.isEnabled) btn_conferir.isEnabled = true
            setCardsInativos(arrayOf(card_resposta_1, card_resposta_2, card_resposta_3))
            card_resposta_4.setCardBackgroundColor(applicationContext.getColor(R.color.respostaCerta))
            resposta = ordemRespostas[3]
        }

        btn_conferir.setOnClickListener {
            setCardsInativos(arrayOf(card_resposta_1, card_resposta_2, card_resposta_3, card_resposta_4))
            if (resposta == 1) {
                acertos ++
                progresso_barra.setProgressTintList(
                    ColorStateList.valueOf(Color.rgb(50,180,75))
                )
            }
            else{
                progresso_barra.setProgressTintList(
                    ColorStateList.valueOf(Color.rgb(235,5,0))
                )
            }
            progresso++
            progresso_barra.progress = progresso*10
            if (progresso < 10) getPerguntas(progresso)
            else{
                if (db_val != null) {
                    db_val.pontos = acertos * 10
                    MyApplication.database?.categoriaDao()?.updateCatg(db_val)
                }
                loadResultado(categoria)
            }
            btn_conferir.isEnabled = false
        }

    }
}