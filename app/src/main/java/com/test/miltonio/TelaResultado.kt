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

        fun setMateria1(dados :Sem1DB?) {
            if (dados != null) {
                setPontuacao(categoria?.get(1)!!)
                corFnd.setBackgroundColor(getColor(dados.cor_db))
                imgFnd.setBackgroundResource(dados.fundo_db)
                txtCategoria.text =
                    getString(R.string.resultado_categoria, getString(dados.materia_db))
                if (!dados.isPreto_db) {
                    txtComeco.setTextColor(getColor(R.color.colorBnc))
                    txtResultado.setTextColor(getColor(R.color.colorBnc))
                    txtCategoria.setTextColor(getColor(R.color.colorBnc))
                    txtMensagem.setTextColor(getColor(R.color.colorBnc))
                }
            }
        }
        fun setMateria2(dados :Sem2DB?) {
            if (dados != null) {
                setPontuacao(categoria?.get(1)!!)
                corFnd.setBackgroundColor(getColor(dados.cor_db))
                imgFnd.setBackgroundResource(dados.fundo_db)
                txtCategoria.text =
                    getString(R.string.resultado_categoria, getString(dados.materia_db))
                if (!dados.isPreto_db) {
                    txtComeco.setTextColor(getColor(R.color.colorBnc))
                    txtResultado.setTextColor(getColor(R.color.colorBnc))
                    txtCategoria.setTextColor(getColor(R.color.colorBnc))
                    txtMensagem.setTextColor(getColor(R.color.colorBnc))
                }
            }
        }
        fun setMateria3(dados :Sem3DB?) {
            if (dados != null) {
                setPontuacao(categoria?.get(1)!!)
                corFnd.setBackgroundColor(getColor(dados.cor_db))
                imgFnd.setBackgroundResource(dados.fundo_db)
                txtCategoria.text =
                    getString(R.string.resultado_categoria, getString(dados.materia_db))
                if (!dados.isPreto_db) {
                    txtComeco.setTextColor(getColor(R.color.colorBnc))
                    txtResultado.setTextColor(getColor(R.color.colorBnc))
                    txtCategoria.setTextColor(getColor(R.color.colorBnc))
                    txtMensagem.setTextColor(getColor(R.color.colorBnc))
                }
            }
        }

        if (categoria?.get(0)!! < 20)
            setMateria1 (MyApplication.sem1database?.Sem1Dao()?.loadById(categoria[0] -10))
        else if (categoria?.get(0)!! < 30)
            setMateria2 (MyApplication.sem2database?.Sem2Dao()?.loadById(categoria[0] -20))
        else
            setMateria3 (MyApplication.sem3database?.Sem3Dao()?.loadById(categoria[0] -30))

        btnMain.setOnClickListener {
            loadMain()
        }
    }
}

//Todo: High Scores
