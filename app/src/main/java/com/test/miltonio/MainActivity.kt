package com.test.miltonio

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MyApplication: Application() {
    companion object {
        var globalPontuacao = listOf(
            mutableListOf("Administracao", 0),
            mutableListOf("Algoritmo", 0),
            mutableListOf("Arquitetura", 0),
            mutableListOf("Ingles", 0),
            mutableListOf("Hardware", 0),
            mutableListOf("Matematica", 0),
            mutableListOf("Programacao", 0)
        )
    }
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun loadRespostas(resul:String){
            val intent = Intent(this, tela_respostas::class.java)
            intent.putExtra("resul", resul)
            startActivity(intent)
        }

        val textos = arrayOf(
            findViewById<TextView>(R.id.txt_progresso_adm) as TextView,
            findViewById<TextView>(R.id.txt_progresso_alg) as TextView,
            findViewById<TextView>(R.id.txt_progresso_aoc) as TextView,
            findViewById<TextView>(R.id.txt_progresso_eng) as TextView,
            findViewById<TextView>(R.id.txt_progresso_lhw) as TextView,
            findViewById<TextView>(R.id.txt_progresso_mat) as TextView,
            findViewById<TextView>(R.id.txt_progresso_prg) as TextView
        )

        val cardAdm = findViewById<CardView>(R.id.CardViewAdm)
        val cardAlg = findViewById<CardView>(R.id.CardViewAlg)
        val cardAoc = findViewById<CardView>(R.id.CardViewAoc)
        val cardEng = findViewById<CardView>(R.id.CardViewEng)
        val cardLhw = findViewById<CardView>(R.id.CardViewLhw)
        val cardMat = findViewById<CardView>(R.id.CardViewMat)
        val cardPrg = findViewById<CardView>(R.id.CardViewPrg)

        fun setPontos() {
            for (i in 0..6)
                textos[i].setText(getString(R.string.resultado_pontos, MyApplication.Companion.globalPontuacao[i][1]))
        }

        setPontos()

        cardAdm.setOnClickListener {
            loadRespostas(MyApplication.Companion.globalPontuacao[0][0].toString())
        }
        cardAlg.setOnClickListener {
            loadRespostas(MyApplication.Companion.globalPontuacao[1][0].toString())
        }
        cardAoc.setOnClickListener {
            loadRespostas(MyApplication.Companion.globalPontuacao[2][0].toString())
        }
        cardEng.setOnClickListener {
            loadRespostas(MyApplication.Companion.globalPontuacao[3][0].toString())
        }
        cardLhw.setOnClickListener {
            loadRespostas(MyApplication.Companion.globalPontuacao[4][0].toString())
        }
        cardMat.setOnClickListener {
            loadRespostas(MyApplication.Companion.globalPontuacao[5][0].toString())
        }
        cardPrg.setOnClickListener {
            loadRespostas(MyApplication.Companion.globalPontuacao[6][0].toString())
        }

    }
}