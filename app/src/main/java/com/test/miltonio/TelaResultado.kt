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

        val db_val = MyApplication.database?.categoriaDao()?.loadById(categoria)

        val cor_fnd: RelativeLayout = findViewById<RelativeLayout>(R.id.cor_fnd)
        val img_fnd: RelativeLayout = findViewById<RelativeLayout>(R.id.img_fnd)

        val txt_comeco: TextView = findViewById<TextView>(R.id.comeco)
        val txt_resultado: TextView = findViewById<TextView>(R.id.resultado)
        val txt_meio: TextView = findViewById<TextView>(R.id.meio)
        val txt_categoria: TextView = findViewById<TextView>(R.id.categoria)

        val txt_mensagem: TextView = findViewById<TextView>(R.id.mensagem)
        val img_mensagem: ImageView = findViewById<ImageView>(R.id.img_mensagem)

        val btn_main: Button = findViewById<Button>(R.id.btn_main)

        fun setPontuacao(pnts: Any){
            txt_resultado.text = getString(R.string.resultado_pontos, pnts)
            if (pnts.toString().toInt() >= 60) {
                img_mensagem.setBackgroundResource(R.drawable.respostasnossas)
                txt_mensagem.text = getString(R.string.resultado_msg_boa)
            }
            else{
                img_mensagem.setBackgroundResource(R.drawable.respostassuas)
                txt_mensagem.text = getString(R.string.resultado_msg_ruim)
            }
        }

        if (db_val != null) {
            setPontuacao(db_val.pontos_db)
            cor_fnd.setBackgroundColor(getColor(db_val.cor_db))
            img_fnd.setBackgroundResource(db_val.fundo_db)
            txt_categoria.text = getString(db_val.materia_db)
            if (db_val.isPreto_db) {
                txt_comeco.setTextColor(getColor(R.color.colorBnc))
                txt_resultado.setTextColor(getColor(R.color.colorBnc))
                txt_meio.setTextColor(getColor(R.color.colorBnc))
                txt_categoria.setTextColor(getColor(R.color.colorBnc))
                txt_mensagem.setTextColor(getColor(R.color.colorBnc))
            }
        }
        else {
            setPontuacao(0)
            cor_fnd.setBackgroundColor(getColor(R.color.color_sgu))
            img_fnd.setBackgroundResource(R.drawable.fndsgu)
            txt_categoria.text = getString(R.string.categ_sgu)
        }

        btn_main.setOnClickListener {
            loadMain()
        }
    }
}