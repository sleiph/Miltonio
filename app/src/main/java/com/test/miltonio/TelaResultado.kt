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

        val dbVal = MyApplication.database?.categoriaDao()?.loadById(categoria)

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

        if (dbVal != null) {
            setPontuacao(dbVal.pontos_db)
            corFnd.setBackgroundColor(getColor(dbVal.cor_db))
            imgFnd.setBackgroundResource(dbVal.fundo_db)
            txtCategoria.text = getString(R.string.resultado_categoria, getString(dbVal.materia_db))
            if (!dbVal.isPreto_db) {
                txtComeco.setTextColor(getColor(R.color.colorBnc))
                txtResultado.setTextColor(getColor(R.color.colorBnc))
                txtCategoria.setTextColor(getColor(R.color.colorBnc))
                txtMensagem.setTextColor(getColor(R.color.colorBnc))
            }
        }
        else {
            setPontuacao(0)
            corFnd.setBackgroundColor(getColor(R.color.color_sgu))
            imgFnd.setBackgroundResource(R.drawable.fndsgu)
            txtCategoria.text = getString(R.string.resultado_categoria, getString(R.string.categ_sgu))
        }

        btnMain.setOnClickListener {
            loadMain()
        }
    }
}

//Todo: High Scores
//Todo: Música pra quando terminar os exercícios (diferente se vc fez uma pontuação melhor ou não)