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

        val cor_fnd: RelativeLayout = findViewById<RelativeLayout>(R.id.cor_fnd)
        val img_fnd: RelativeLayout = findViewById<RelativeLayout>(R.id.img_fnd)

        val txt_comeco: TextView = findViewById<TextView>(R.id.comeco)
        val txt_resultado: TextView = findViewById<TextView>(R.id.resultado)
        val txt_meio: TextView = findViewById<TextView>(R.id.meio)
        val txt_categoria: TextView = findViewById<TextView>(R.id.categoria)

        val txt_mensagem: TextView = findViewById<TextView>(R.id.mensagem)
        val img_mensagem: ImageView = findViewById<ImageView>(R.id.img_mensagem)

        val btn_main: Button = findViewById<Button>(R.id.btn_main)

        val db_val = MyApplication.database?.categoriaDao()?.loadById(categoria)

        fun setCategoria(catg:Int){
            var escuro = false
            when (catg) {
                1 -> {
                    cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorTru))
                    img_fnd.setBackgroundResource(R.drawable.fndalg)
                    txt_categoria.text = getString(R.string.categ_tru)
                    escuro = true
                }
                2 -> {
                    cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorTrd))
                    img_fnd.setBackgroundResource(R.drawable.fndaoc)
                    txt_categoria.text = getString(R.string.categ_trd)
                    escuro = true
                }
                3 -> {
                    cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorQrt))
                    img_fnd.setBackgroundResource(R.drawable.fndeng)
                    txt_categoria.text = getString(R.string.categ_qrt)
                }
                4 -> {
                    cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorQnu))
                    img_fnd.setBackgroundResource(R.drawable.fndlhw)
                    txt_categoria.text = getString(R.string.categ_qnu)
                }
                5 -> {
                    cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorQnd))
                    img_fnd.setBackgroundResource(R.drawable.fndmat)
                    txt_categoria.text = getString(R.string.categ_qnd)
                    escuro = true
                }
                6 -> {
                    cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorSxt))
                    img_fnd.setBackgroundResource(R.drawable.fndprg)
                    txt_categoria.text = getString(R.string.categ_sxt)
                    escuro = true
                }
                else -> {
                    cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorSgd))
                    img_fnd.setBackgroundResource(R.drawable.fndadm)
                    txt_categoria.text = getString(R.string.categ_sgd)
                }
            }
            if (escuro){
                txt_comeco.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_resultado.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_meio.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_categoria.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_mensagem.setTextColor(applicationContext.getColor(R.color.colorBnc))
            }
        }
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

        setCategoria(categoria)
        if (db_val != null)
            setPontuacao(db_val.pontos)
        else
            setPontuacao(0)

        btn_main.setOnClickListener {
            loadMain()
        }
    }
}