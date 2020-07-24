package com.test.miltonio

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

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun loadRespostas(catg:Int){
            val intent = Intent(this, tela_respostas::class.java)
            intent.putExtra("catg", catg)
            startActivity(intent)
        }

        val resulIntent = intent
        val resultado = resulIntent.getIntegerArrayListExtra("resul")
        val categoria = (resultado?.get(0) ?: 1)
        val pontos = (resultado?.get(1) ?: 0)

        val txt_progresso_adm = findViewById<TextView>(R.id.txt_progresso_adm) as TextView
        val txt_progresso_alg = findViewById<TextView>(R.id.txt_progresso_alg) as TextView
        val txt_progresso_aoc = findViewById<TextView>(R.id.txt_progresso_aoc) as TextView
        val txt_progresso_eng = findViewById<TextView>(R.id.txt_progresso_eng) as TextView
        val txt_progresso_lhw = findViewById<TextView>(R.id.txt_progresso_lhw) as TextView
        val txt_progresso_mat = findViewById<TextView>(R.id.txt_progresso_mat) as TextView
        val txt_progresso_prg = findViewById<TextView>(R.id.txt_progresso_prg) as TextView

        val cardAdm = findViewById<CardView>(R.id.CardViewAdm)
        val cardAlg = findViewById<CardView>(R.id.CardViewAlg)
        val cardAoc = findViewById<CardView>(R.id.CardViewAoc)
        val cardEng = findViewById<CardView>(R.id.CardViewEng)
        val cardLhw = findViewById<CardView>(R.id.CardViewLhw)
        val cardMat = findViewById<CardView>(R.id.CardViewMat)
        val cardPrg = findViewById<CardView>(R.id.CardViewPrg)

        fun setPontosZero(textos:Array<TextView>) {
            for (texto in textos)
                texto.setText(getString(R.string.resultado_pontos, 0))
        }

        fun setPontos(catg:Int, pnts:Int){
            if (catg == 1) {
                txt_progresso_adm.setText(getString(R.string.resultado_pontos, pnts))
                setPontosZero(
                    arrayOf(
                        txt_progresso_alg, txt_progresso_aoc, txt_progresso_eng, txt_progresso_lhw, txt_progresso_mat, txt_progresso_prg
                    )
                )
            }
            else if (catg == 2) {
                txt_progresso_alg.setText(getString(R.string.resultado_pontos, pnts))
                setPontosZero(
                    arrayOf(
                        txt_progresso_adm, txt_progresso_aoc, txt_progresso_eng, txt_progresso_lhw, txt_progresso_mat, txt_progresso_prg
                    )
                )
            }
            else if (catg == 3) {
                txt_progresso_aoc.setText(getString(R.string.resultado_pontos, pnts))
                setPontosZero(
                    arrayOf(
                        txt_progresso_adm, txt_progresso_alg, txt_progresso_eng, txt_progresso_lhw, txt_progresso_mat, txt_progresso_prg
                    )
                )
            }
            else if (catg == 4) {
                txt_progresso_eng.setText(getString(R.string.resultado_pontos, pnts))
                setPontosZero(
                    arrayOf(
                        txt_progresso_adm, txt_progresso_alg, txt_progresso_aoc, txt_progresso_lhw, txt_progresso_mat, txt_progresso_prg
                    )
                )
            }
            else if (catg == 5) {
                txt_progresso_lhw.setText(getString(R.string.resultado_pontos, pnts))
                setPontosZero(
                    arrayOf(
                        txt_progresso_adm, txt_progresso_alg, txt_progresso_aoc, txt_progresso_eng, txt_progresso_mat, txt_progresso_prg
                    )
                )
            }
            else if (catg == 6){
                txt_progresso_mat.setText(getString(R.string.resultado_pontos, pnts))
                setPontosZero(
                    arrayOf(
                        txt_progresso_adm, txt_progresso_alg, txt_progresso_aoc, txt_progresso_eng, txt_progresso_lhw, txt_progresso_prg
                    )
                )
            }
            else{
                txt_progresso_prg.setText(getString(R.string.resultado_pontos, pnts))
                setPontosZero(
                    arrayOf(
                        txt_progresso_adm, txt_progresso_alg, txt_progresso_aoc, txt_progresso_eng, txt_progresso_lhw, txt_progresso_mat
                    )
                )
            }
        }

        setPontos(categoria, pontos)

        cardAdm.setOnClickListener {
            loadRespostas(1)
        }
        cardAlg.setOnClickListener {
            loadRespostas(2)
        }
        cardAoc.setOnClickListener {
            loadRespostas(3)
        }
        cardEng.setOnClickListener {
            loadRespostas(4)
        }
        cardLhw.setOnClickListener {
            loadRespostas(5)
        }
        cardMat.setOnClickListener {
            loadRespostas(6)
        }
        cardPrg.setOnClickListener {
            loadRespostas(7)
        }

    }
}