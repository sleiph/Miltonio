package com.test.miltonio.ui

import com.test.miltonio.MyApplication
import com.test.miltonio.R
import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class TelaResultado : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_resultado)

        fun loadMain() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //pegando o intent da tela anterior
        val resulIntent = intent
        val id = resulIntent.getIntExtra("id", 0)
        val materia = MyApplication.materiasdatabase?.MateriaDao()?.loadById(id)

        //declarando os elementos do layout
        val somBom = MediaPlayer.create(this, R.raw.tudo)
        val somRuim = MediaPlayer.create(this, R.raw.nada)
        val corFnd = findViewById<RelativeLayout>(R.id.cor_fnd)
        val imgFnd = findViewById<RelativeLayout>(R.id.img_fnd)
        val txtComeco = findViewById<TextView>(R.id.comeco)
        val txtResultado = findViewById<TextView>(R.id.resultado)
        val txtCategoria = findViewById<TextView>(R.id.categoria)
        val txtMensagem = findViewById<TextView>(R.id.mensagem)
        val btnMain = findViewById<Button>(R.id.btn_main)

        if (materia != null) {
            txtResultado.text =
                getString(R.string.resultado_pontos, materia.pontos_db.toString())

            if (materia.pontos_db >= 60) {
                val drawable =
                    ContextCompat.getDrawable(this, R.drawable.mensagem_resultado_bom)
                txtMensagem.text = getString(R.string.resultado_msg_boa)
                txtMensagem.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null)
                somBom.start()
            } else {
                val drawable =
                    ContextCompat.getDrawable(this, R.drawable.mensagem_resultado_ruim)
                txtMensagem.text = getString(R.string.resultado_msg_ruim)
                txtMensagem.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null)
                somRuim.start()
            }

            corFnd.setBackgroundColor(getColor(materia.cor_db))
            imgFnd.setBackgroundResource(materia.fundo_db)
            txtCategoria.text =
                getString(R.string.resultado_categoria, getString(materia.materia_db))
            if (!materia.isPreto_db) {
                txtComeco.setTextColor(getColor(R.color.colorBnc))
                txtResultado.setTextColor(getColor(R.color.colorBnc))
                txtCategoria.setTextColor(getColor(R.color.colorBnc))
                txtMensagem.setTextColor(getColor(R.color.colorBnc))
            }
        }

        btnMain.setOnClickListener {
            loadMain()
        }
    }
}

//Todo: High Scores
//Todo: achar um jeito de centralizar o drawable na textview de mensagem
//Todo: ou criar um widget de verdade