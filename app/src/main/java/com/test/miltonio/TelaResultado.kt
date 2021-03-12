package com.test.miltonio

import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class TelaResultado : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_resultado)

        fun loadMain(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val resulIntent = intent.extras
        val categoria = resulIntent?.getIntArray("resul")

        val somBom = MediaPlayer.create(this, R.raw.tudo)
        val somRuim = MediaPlayer.create(this, R.raw.nada)

        val corFnd = findViewById<RelativeLayout>(R.id.cor_fnd)
        val imgFnd = findViewById<RelativeLayout>(R.id.img_fnd)

        val txtComeco = findViewById<TextView>(R.id.comeco)
        val txtResultado = findViewById<TextView>(R.id.resultado)
        val txtCategoria = findViewById<TextView>(R.id.categoria)

        val txtMensagem = findViewById<TextView>(R.id.mensagem)
        val imgMensagem = findViewById<ImageView>(R.id.img_mensagem)

        val btnMain = findViewById<Button>(R.id.btn_main)

        fun setPontuacao(pnts: Any) {
            txtResultado.text = getString(R.string.resultado_pontos, pnts)
            if (categoria?.get(1)!!.toInt() >= 60) {
                imgMensagem.setBackgroundResource(R.drawable.respostasnossas)
                txtMensagem.text = getString(R.string.resultado_msg_boa)
                somBom.start()
            }
            else {
                imgMensagem.setBackgroundResource(R.drawable.respostassuas)
                txtMensagem.text = getString(R.string.resultado_msg_ruim)
                somRuim.start()
            }
        }

        fun desenhaResultados (materia: Int, cor: Int, fundo: Int, isPreto: Boolean) {
            setPontuacao(categoria?.get(1)!!)
            corFnd.setBackgroundColor(getColor(cor))
            imgFnd.setBackgroundResource(fundo)
            txtCategoria.text =
                getString(R.string.resultado_categoria, getString(materia))
            if (!isPreto) {
                txtComeco.setTextColor(getColor(R.color.colorBnc))
                txtResultado.setTextColor(getColor(R.color.colorBnc))
                txtCategoria.setTextColor(getColor(R.color.colorBnc))
                txtMensagem.setTextColor(getColor(R.color.colorBnc))
            }
        }

        fun setSemestre(categ: Int?) {
            when(categ) {
                in 0 until 20 -> {
                    val dados = categ?.minus(10)?.let {
                        MyApplication.sem1database?.Sem1Dao()?.loadById(
                            it
                        )
                    }
                    if (dados != null) {
                        val materia = dados.materia_db
                        val cor = dados.cor_db
                        val fundo = dados.fundo_db
                        val isPreto = dados.isPreto_db

                        desenhaResultados(materia, cor, fundo, isPreto)
                    }
                }
                in 20 until 30 -> {
                    val dados = categ?.minus(20)?.let {
                        MyApplication.sem2database?.Sem2Dao()?.loadById(
                            it
                        )
                    }
                    if (dados != null) {
                        val materia = dados.materia_db
                        val cor = dados.cor_db
                        val fundo = dados.fundo_db
                        val isPreto = dados.isPreto_db

                        desenhaResultados(materia, cor, fundo, isPreto)
                    }
                }
                in 30 until 40 -> {
                    val dados = categ?.minus(30)?.let {
                        MyApplication.sem3database?.Sem3Dao()?.loadById(
                            it
                        )
                    }
                    if (dados != null) {
                        val materia = dados.materia_db
                        val cor = dados.cor_db
                        val fundo = dados.fundo_db
                        val isPreto = dados.isPreto_db

                        desenhaResultados(materia, cor, fundo, isPreto)
                    }
                }
            }
        }

        setSemestre(categoria?.get(0))

        btnMain.setOnClickListener {
            loadMain()
        }
    }
}

//Todo: High Scores
