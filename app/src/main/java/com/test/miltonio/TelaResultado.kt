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
import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.InputStreamReader

class TelaResultado : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_resultado)

        fun loadMain(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        fun readFromFile(fileName: String): String {

            var ret = ""

            try {
                val inputStream = assets.open(fileName)
                val inputStreamReader = InputStreamReader(inputStream)
                val bufferedReader = BufferedReader(inputStreamReader)
                var receiveString: String? = ""
                val stringBuilder = StringBuilder()

                while (bufferedReader.readLine().also({ receiveString = it }) != null) {
                    stringBuilder.append(receiveString)
                }

                inputStream.close()
                ret = stringBuilder.toString()
            }
            catch (e: FileNotFoundException) {
                e.printStackTrace()
            }
            catch (e: Exception) {
                e.printStackTrace()
            }

            return ret

        }

        val dados = readFromFile( "dados.txt").split(",")

        val resulIntent = intent
        val categoria = resulIntent.getIntExtra("resul", 0)

        val cor_fnd: RelativeLayout = findViewById(R.id.cor_fnd) as RelativeLayout
        val img_fnd: RelativeLayout = findViewById(R.id.img_fnd) as RelativeLayout

        val txt_comeco: TextView = findViewById(R.id.comeco) as TextView
        val txt_resultado: TextView = findViewById(R.id.resultado) as TextView
        val txt_meio: TextView = findViewById(R.id.meio) as TextView
        val txt_categoria: TextView = findViewById(R.id.categoria) as TextView

        val txt_mensagem: TextView = findViewById(R.id.mensagem) as TextView
        val img_mensagem: ImageView = findViewById(R.id.img_mensagem) as ImageView

        val btn_main: Button = findViewById(R.id.btn_main) as Button

        fun setCategoria(catg:Int){
            var escuro = false
            when (catg) {
                1 -> {
                    cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorAlg))
                    img_fnd.setBackgroundResource(R.drawable.fndalg)
                    txt_categoria.setText(getString(R.string.categ_alg))
                    escuro = true
                }
                2 -> {
                    cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorAoc))
                    img_fnd.setBackgroundResource(R.drawable.fndaoc)
                    txt_categoria.setText(getString(R.string.categ_aoc))
                    escuro = true
                }
                3 -> {
                    cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorEng))
                    img_fnd.setBackgroundResource(R.drawable.fndeng)
                    txt_categoria.setText(getString(R.string.categ_eng))
                }
                4 -> {
                    cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorLhw))
                    img_fnd.setBackgroundResource(R.drawable.fndlhw)
                    txt_categoria.setText(getString(R.string.categ_lhw))
                }
                5 -> {
                    cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorMat))
                    img_fnd.setBackgroundResource(R.drawable.fndmat)
                    txt_categoria.setText(getString(R.string.categ_mat))
                    escuro = true
                }
                6 -> {
                    cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorPrg))
                    img_fnd.setBackgroundResource(R.drawable.fndprg)
                    txt_categoria.setText(getString(R.string.categ_prg))
                    escuro = true
                }
                else -> {
                    cor_fnd.setBackgroundColor(applicationContext.getColor(R.color.colorAdm))
                    img_fnd.setBackgroundResource(R.drawable.fndadm)
                    txt_categoria.setText(getString(R.string.categ_adm))
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
        setPontuacao(dados.get(categoria))

        btn_main.setOnClickListener {
            loadMain()
        }
    }
}