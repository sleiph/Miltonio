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

        fun loadMain(catg:Int, pnts:Int){
            val intent = Intent(this, MainActivity::class.java)
            intent.putIntegerArrayListExtra("resul", arrayListOf(catg, pnts))
            startActivity(intent)
        }

        val resulIntent = intent
        val resultado = resulIntent.getIntegerArrayListExtra("resul")
        val categoria = (resultado?.get(0) ?: 1)
        val pontos = (resultado?.get(1) ?: 0) * 10

        val cor_fnd: RelativeLayout = findViewById(R.id.cor_fnd) as RelativeLayout
        val img_fnd: RelativeLayout = findViewById(R.id.img_fnd) as RelativeLayout
        val txt_resultado: TextView = findViewById(R.id.resultado) as TextView
        val txt_categoria: TextView = findViewById(R.id.categoria) as TextView
        val txt_mensagem: TextView = findViewById(R.id.mensagem) as TextView
        val img_mensagem: ImageView = findViewById(R.id.img_mensagem) as ImageView
        val btn_main: Button = findViewById(R.id.btn_main) as Button

        fun setCategoria(catg:Int){
            if (catg == 1){
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorAdm))
                img_fnd.setBackgroundResource(R.drawable.fndadm)
                txt_categoria.setText(getString(R.string.categ_adm))
            }
            else if (catg == 2){
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorAlg))
                img_fnd.setBackgroundResource(R.drawable.fndalg)
                txt_categoria.setText(getString(R.string.categ_alg))
            }
            else if (catg == 3){
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorAoc))
                img_fnd.setBackgroundResource(R.drawable.fndaoc)
                txt_categoria.setText(getString(R.string.categ_aoc))
            }
            else if (catg == 4){
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorEng))
                img_fnd.setBackgroundResource(R.drawable.fndeng)
                txt_categoria.setText(getString(R.string.categ_eng))
            }
            else if (catg == 5){
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorLhw))
                img_fnd.setBackgroundResource(R.drawable.fndlhw)
                txt_categoria.setText(getString(R.string.categ_lhw))
            }
            else if (catg == 6){
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorMat))
                img_fnd.setBackgroundResource(R.drawable.fndmat)
                txt_categoria.setText(getString(R.string.categ_mat))
            }
            else{
                cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorPrg))
                img_fnd.setBackgroundResource(R.drawable.fndprg)
                txt_categoria.setText(getString(R.string.categ_prg))
            }
        }
        fun setPontuacao(pnts:Int){
            txt_resultado.setText(getString(R.string.resultado_pontos, pontos))
            if (pontos >= 60) {
                img_mensagem.setBackgroundResource(R.drawable.respostasnossas)
                txt_mensagem.setText(getString(R.string.resultado_msg_boa))
            }
            else{
                img_mensagem.setBackgroundResource(R.drawable.respostassuas)
                txt_mensagem.setText(getString(R.string.resultado_msg_ruim))
            }
        }

        setCategoria(categoria)
        setPontuacao(pontos)

        btn_main.setOnClickListener {
            loadMain(categoria, pontos)
        }
    }
}