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
        val categoria = resulIntent.getStringExtra("resul")

        var indiceGlobal = 0

        val cor_fnd: RelativeLayout = findViewById(R.id.cor_fnd) as RelativeLayout
        val img_fnd: RelativeLayout = findViewById(R.id.img_fnd) as RelativeLayout

        val txt_comeco: TextView = findViewById(R.id.comeco) as TextView
        val txt_resultado: TextView = findViewById(R.id.resultado) as TextView
        val txt_meio: TextView = findViewById(R.id.meio) as TextView
        val txt_categoria: TextView = findViewById(R.id.categoria) as TextView

        val txt_mensagem: TextView = findViewById(R.id.mensagem) as TextView
        val img_mensagem: ImageView = findViewById(R.id.img_mensagem) as ImageView

        val btn_main: Button = findViewById(R.id.btn_main) as Button

        fun setCategoria(catg:String?){
            if (catg == "Administracao"){
                indiceGlobal = 0
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorAdm))
                img_fnd.setBackgroundResource(R.drawable.fndadm)
                txt_categoria.setText(getString(R.string.categ_adm))
            }
            else if (catg == "Algoritmo"){
                indiceGlobal = 1
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorAlg))
                img_fnd.setBackgroundResource(R.drawable.fndalg)
                txt_categoria.setText(getString(R.string.categ_alg))
                txt_comeco.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_resultado.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_meio.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_categoria.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_mensagem.setTextColor(applicationContext.getColor(R.color.colorBnc))
            }
            else if (catg == "Arquitetura"){
                indiceGlobal = 2
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorAoc))
                img_fnd.setBackgroundResource(R.drawable.fndaoc)
                txt_categoria.setText(getString(R.string.categ_aoc))
                txt_comeco.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_resultado.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_meio.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_categoria.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_mensagem.setTextColor(applicationContext.getColor(R.color.colorBnc))
            }
            else if (catg == "Ingles"){
                indiceGlobal = 3
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorEng))
                img_fnd.setBackgroundResource(R.drawable.fndeng)
                txt_categoria.setText(getString(R.string.categ_eng))
            }
            else if (catg == "Hardware"){
                indiceGlobal = 4
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorLhw))
                img_fnd.setBackgroundResource(R.drawable.fndlhw)
                txt_categoria.setText(getString(R.string.categ_lhw))
            }
            else if (catg == "Matematica"){
                indiceGlobal = 5
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorMat))
                img_fnd.setBackgroundResource(R.drawable.fndmat)
                txt_categoria.setText(getString(R.string.categ_mat))
                txt_comeco.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_resultado.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_meio.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_categoria.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_mensagem.setTextColor(applicationContext.getColor(R.color.colorBnc))
            }
            else{
                indiceGlobal = 6
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorPrg))
                img_fnd.setBackgroundResource(R.drawable.fndprg)
                txt_categoria.setText(getString(R.string.categ_prg))
                txt_comeco.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_resultado.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_meio.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_categoria.setTextColor(applicationContext.getColor(R.color.colorBnc))
                txt_mensagem.setTextColor(applicationContext.getColor(R.color.colorBnc))
            }
        }
        fun setPontuacao(pnts: Any){
            txt_resultado.setText(getString(R.string.resultado_pontos, pnts))
            if (pnts.toString().toInt() >= 60) {
                img_mensagem.setBackgroundResource(R.drawable.respostasnossas)
                txt_mensagem.setText(getString(R.string.resultado_msg_boa))
            }
            else{
                img_mensagem.setBackgroundResource(R.drawable.respostassuas)
                txt_mensagem.setText(getString(R.string.resultado_msg_ruim))
            }
        }

        setCategoria(categoria)
        setPontuacao(MyApplication.Companion.globalPontuacao[indiceGlobal][1])

        btn_main.setOnClickListener {
            loadMain()
        }
    }
}