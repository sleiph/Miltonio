package com.test.miltonio

import android.content.Intent
import android.content.res.ColorStateList
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

class tela_respostas : AppCompatActivity() {

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

        var arr_perguntas:Array<Array<String>> = arrayOf()
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

        fun setCategoria(catg:Int){
            var corCateg = R.color.colorAdm
            var imgFnd = R.drawable.fndadm
            var arrCateg = arrayOf(R.array.adm_1, R.array.adm_2, R.array.adm_3, R.array.adm_4, R.array.adm_5, R.array.adm_6, R.array.adm_7, R.array.adm_8, R.array.adm_9, R.array.adm_10)
            var escuro = false
            when (catg){
                1 -> {
                    corCateg = R.color.colorAlg
                    imgFnd = R.drawable.fndalg
                    arrCateg = arrayOf(R.array.alg_1, R.array.alg_2, R.array.alg_3, R.array.alg_4, R.array.alg_5, R.array.alg_6, R.array.alg_7, R.array.alg_8, R.array.alg_9, R.array.alg_10)
                    escuro = true
                }
                2 -> {
                    corCateg = R.color.colorAoc
                    imgFnd = R.drawable.fndaoc
                    arrCateg = arrayOf(R.array.aoc_1, R.array.aoc_2, R.array.aoc_3, R.array.aoc_4, R.array.aoc_5, R.array.aoc_6, R.array.aoc_7, R.array.aoc_8, R.array.aoc_9, R.array.aoc_10)
                    escuro = true
                }
                3 -> {
                    corCateg = R.color.colorEng
                    imgFnd = R.drawable.fndeng
                    arrCateg = arrayOf(R.array.eng_1, R.array.eng_2, R.array.eng_3, R.array.eng_4, R.array.eng_5, R.array.eng_6, R.array.eng_7, R.array.eng_8, R.array.eng_9, R.array.eng_10)
                }
                4 -> {
                    corCateg = R.color.colorLhw
                    imgFnd = R.drawable.fndlhw
                    arrCateg = arrayOf(R.array.lhw_1, R.array.lhw_2, R.array.lhw_3, R.array.lhw_4, R.array.lhw_5, R.array.lhw_6, R.array.lhw_7, R.array.lhw_8, R.array.lhw_9, R.array.lhw_10)
                }
                5 -> {
                    corCateg = R.color.colorMat
                    imgFnd = R.drawable.fndmat
                    arrCateg = arrayOf(R.array.mat_1, R.array.mat_2, R.array.mat_3, R.array.mat_4, R.array.mat_5, R.array.mat_6, R.array.mat_7, R.array.mat_8, R.array.mat_9, R.array.mat_10)
                    escuro = true
                }
                6 -> {
                    corCateg = R.color.colorPrg
                    imgFnd = R.drawable.fndprg
                    arrCateg = arrayOf(R.array.prg_1, R.array.prg_2, R.array.prg_3, R.array.prg_4, R.array.prg_5, R.array.prg_6, R.array.prg_7, R.array.prg_8, R.array.prg_9, R.array.prg_10)
                    escuro = true
                }
            }
            cor_fnd.setBackgroundColor(applicationContext.getColor(corCateg))
            img_fnd.setBackgroundResource(imgFnd)
            if (escuro)
                txt_pergunta.setTextColor(applicationContext.getColor(R.color.colorBnc))
            for (array in arrCateg)
                arr_perguntas += resources.getStringArray(array)
        }

        fun setCardsInativos(cards: Array<CardView>){
            for(card in cards)
                card.setCardBackgroundColor(applicationContext.getColor(R.color.card_respostas))
        }

        fun getPerguntas(index:Int) {
            txt_pergunta.text = arr_perguntas[ordemPerguntas[index]][0]
            ordemRespostas.shuffle()
            txt_resposta_1.text = arr_perguntas[ordemPerguntas[index]][ordemRespostas[0]]
            txt_resposta_2.text = arr_perguntas[ordemPerguntas[index]][ordemRespostas[1]]
            txt_resposta_3.text = arr_perguntas[ordemPerguntas[index]][ordemRespostas[2]]
            txt_resposta_4.text = arr_perguntas[ordemPerguntas[index]][ordemRespostas[3]]
        }

        setCategoria(categoria)
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
                progresso_barra.setProgressTintList(ColorStateList.valueOf(Color.rgb(50,180,75)))
            }
            else{
                progresso_barra.setProgressTintList(ColorStateList.valueOf(Color.rgb(235,5,0)))
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