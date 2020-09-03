package com.test.miltonio

import android.content.Intent
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

        val resulIntent = intent
        val categoria = resulIntent.getIntExtra("resul", 0)

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
            if (pnts.toString().toInt() >= 60) {
                imgMensagem.setBackgroundResource(R.drawable.respostasnossas)
                txtMensagem.text = getString(R.string.resultado_msg_boa)
            }
            else {
                imgMensagem.setBackgroundResource(R.drawable.respostassuas)
                txtMensagem.text = getString(R.string.resultado_msg_ruim)
            }
        }

        fun setMateria1(dados :Sem1DB?) {
            if (dados != null) {
                setPontuacao(dados.pontos_db)
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
        fun setMateria2(dados :Categorias_DB?) {
            if (dados != null) {
                setPontuacao(dados.pontos_db)
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

        if (categoria < 20)
            setMateria1 (MyApplication.sem1database?.sem1Dao()?.loadById(categoria-10))
        else
            setMateria2 (MyApplication.database?.categoriaDao()?.loadById(categoria-20))

        btnMain.setOnClickListener {
            loadMain()
        }
    }
}

//Todo: High Scores
//Todo: Música pra quando terminar os exercícios (diferente se vc fez uma pontuação melhor ou não)