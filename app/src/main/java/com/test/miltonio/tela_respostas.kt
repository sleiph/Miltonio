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

        fun loadResultado(resul:String?){
            val intent = Intent(this, TelaResultado::class.java)
            intent.putExtra("resul", resul)
            startActivity(intent)
        }

        var progresso = 0
        var acertos = 0
        var resposta = 0
        var indiceGlobal = 0

        val resulIntent = intent
        val categoria = resulIntent.getStringExtra("resul")

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

        fun setCategoria(catg:String?){
            if (catg == "Administracao"){
                indiceGlobal = 0
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorAdm))
                img_fnd.setBackgroundResource(R.drawable.fndadm)
                arr_perguntas = arrayOf(
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
            }
            else if (catg == "Algoritmo"){
                indiceGlobal = 1
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorAlg))
                img_fnd.setBackgroundResource(R.drawable.fndalg)
                txt_pergunta.setTextColor(applicationContext.getColor(R.color.colorBnc))
                arr_perguntas = arrayOf(
                    resources.getStringArray(R.array.alg_1),
                    resources.getStringArray(R.array.alg_2),
                    resources.getStringArray(R.array.alg_3),
                    resources.getStringArray(R.array.alg_4),
                    resources.getStringArray(R.array.alg_5),
                    resources.getStringArray(R.array.alg_6),
                    resources.getStringArray(R.array.alg_7),
                    resources.getStringArray(R.array.alg_8),
                    resources.getStringArray(R.array.alg_9),
                    resources.getStringArray(R.array.alg_10)
                )
            }
            else if (catg == "Arquitetura"){
                indiceGlobal = 2
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorAoc))
                img_fnd.setBackgroundResource(R.drawable.fndaoc)
                txt_pergunta.setTextColor(applicationContext.getColor(R.color.colorBnc))
                arr_perguntas = arrayOf(
                    resources.getStringArray(R.array.aoc_1),
                    resources.getStringArray(R.array.aoc_2),
                    resources.getStringArray(R.array.aoc_3),
                    resources.getStringArray(R.array.aoc_4),
                    resources.getStringArray(R.array.aoc_5),
                    resources.getStringArray(R.array.aoc_6),
                    resources.getStringArray(R.array.aoc_7),
                    resources.getStringArray(R.array.aoc_8),
                    resources.getStringArray(R.array.aoc_9),
                    resources.getStringArray(R.array.aoc_10)
                )
            }
            else if (catg == "Ingles"){
                indiceGlobal = 3
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorEng))
                img_fnd.setBackgroundResource(R.drawable.fndeng)
                arr_perguntas = arrayOf(
                    resources.getStringArray(R.array.eng_1),
                    resources.getStringArray(R.array.eng_2),
                    resources.getStringArray(R.array.eng_3),
                    resources.getStringArray(R.array.eng_4),
                    resources.getStringArray(R.array.eng_5),
                    resources.getStringArray(R.array.eng_6),
                    resources.getStringArray(R.array.eng_7),
                    resources.getStringArray(R.array.eng_8),
                    resources.getStringArray(R.array.eng_9),
                    resources.getStringArray(R.array.eng_10)
                )
            }
            else if (catg == "Hardware"){
                indiceGlobal = 4
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorLhw))
                img_fnd.setBackgroundResource(R.drawable.fndlhw)
                arr_perguntas = arrayOf(
                    resources.getStringArray(R.array.lhw_1),
                    resources.getStringArray(R.array.lhw_2),
                    resources.getStringArray(R.array.lhw_3),
                    resources.getStringArray(R.array.lhw_4),
                    resources.getStringArray(R.array.lhw_5),
                    resources.getStringArray(R.array.lhw_6),
                    resources.getStringArray(R.array.lhw_7),
                    resources.getStringArray(R.array.lhw_8),
                    resources.getStringArray(R.array.lhw_9),
                    resources.getStringArray(R.array.lhw_10)
                )
            }
            else if (catg == "Matematica"){
                indiceGlobal = 5
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorMat))
                img_fnd.setBackgroundResource(R.drawable.fndmat)
                txt_pergunta.setTextColor(applicationContext.getColor(R.color.colorBnc))
                arr_perguntas = arrayOf(
                    resources.getStringArray(R.array.mat_1),
                    resources.getStringArray(R.array.mat_2),
                    resources.getStringArray(R.array.mat_3),
                    resources.getStringArray(R.array.mat_4),
                    resources.getStringArray(R.array.mat_5),
                    resources.getStringArray(R.array.mat_6),
                    resources.getStringArray(R.array.mat_7),
                    resources.getStringArray(R.array.mat_8),
                    resources.getStringArray(R.array.mat_9),
                    resources.getStringArray(R.array.mat_10)
                )
            }
            else{
                indiceGlobal = 6
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorPrg))
                img_fnd.setBackgroundResource(R.drawable.fndprg)
                txt_pergunta.setTextColor(applicationContext.getColor(R.color.colorBnc))
                arr_perguntas = arrayOf(
                    resources.getStringArray(R.array.prg_1),
                    resources.getStringArray(R.array.prg_2),
                    resources.getStringArray(R.array.prg_3),
                    resources.getStringArray(R.array.prg_4),
                    resources.getStringArray(R.array.prg_5),
                    resources.getStringArray(R.array.prg_6),
                    resources.getStringArray(R.array.prg_7),
                    resources.getStringArray(R.array.prg_8),
                    resources.getStringArray(R.array.prg_9),
                    resources.getStringArray(R.array.prg_10)
                )
            }
        }

        fun setCardsInativos(cards:Array<CardView>){
            for(card in cards) card.setCardBackgroundColor(applicationContext.getColor(R.color.card_respostas))
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
                MyApplication.Companion.globalPontuacao[indiceGlobal][1] = acertos * 10
                loadResultado(categoria)
            }
            btn_conferir.isEnabled = false
        }

    }
}