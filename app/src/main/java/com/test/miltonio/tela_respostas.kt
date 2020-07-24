package com.test.miltonio

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.ArrayMap
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import org.w3c.dom.Text
import java.util.*

class tela_respostas : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_respostas)

        fun loadResultado(catg:Int, pnts:Int){
            val intent = Intent(this, TelaResultado::class.java)
            intent.putIntegerArrayListExtra("resul", arrayListOf(catg, pnts))
            startActivity(intent)
        }

        var progresso = 0
        var acertos = 0
        var resposta = 0

        val catgIntent = intent
        val categoria = catgIntent.getIntExtra("catg", 1)

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

        fun setCategoria(catg:Int){
            if (catg == 1){
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorAdm))
                img_fnd.setBackgroundResource(R.drawable.fndadm)
            }
            else if (catg == 2){
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorAlg))
                img_fnd.setBackgroundResource(R.drawable.fndalg)
            }
            else if (catg == 3){
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorAoc))
                img_fnd.setBackgroundResource(R.drawable.fndaoc)
            }
            else if (catg == 4){
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorEng))
                img_fnd.setBackgroundResource(R.drawable.fndeng)
            }
            else if (catg == 5){
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorLhw))
                img_fnd.setBackgroundResource(R.drawable.fndlhw)
            }
            else if (catg == 6){
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorMat))
                img_fnd.setBackgroundResource(R.drawable.fndmat)
            }
            else{
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorPrg))
                img_fnd.setBackgroundResource(R.drawable.fndprg)
            }
        }

        val arr_adm_perguntas = arrayOf(
            resources.getStringArray(R.array.adm_1),
            resources.getStringArray(R.array.adm_2),
            resources.getStringArray(R.array.adm_3),
            resources.getStringArray(R.array.adm_4),
            resources.getStringArray(R.array.adm_5),
            resources.getStringArray(R.array.adm_6),
            resources.getStringArray(R.array.adm_7),
            resources.getStringArray(R.array.adm_8),
            resources.getStringArray(R.array.adm_9),
            resources.getStringArray(R.array.adm_10)
        )

        val ordemPerguntas:MutableList<Int> = (0..9).toMutableList()
        val ordemRespostas:MutableList<Int> = (1..4).toMutableList()

        fun setCardsInativos(cards:Array<CardView>){
            for(card in cards) card.setCardBackgroundColor(applicationContext.getColor(R.color.card_respostas))
        }

        fun getPerguntas(index:Int) {
            txt_pergunta.text = arr_adm_perguntas[ordemPerguntas[index]][0]
            ordemRespostas.shuffle()
            txt_resposta_1.text = arr_adm_perguntas[ordemPerguntas[index]][ordemRespostas[0]]
            txt_resposta_2.text = arr_adm_perguntas[ordemPerguntas[index]][ordemRespostas[1]]
            txt_resposta_3.text = arr_adm_perguntas[ordemPerguntas[index]][ordemRespostas[2]]
            txt_resposta_4.text = arr_adm_perguntas[ordemPerguntas[index]][ordemRespostas[3]]
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
            else loadResultado(categoria, acertos)
            btn_conferir.isEnabled = false
        }

    }
}