package com.test.miltonio

import android.content.Intent
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.setMargins
import com.test.miltonio.ui.CardResposta

class TelaRespostas : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_respostas)

        fun loadResultado(resul:Int) {
            val intent = Intent(this, TelaResultado::class.java)
            intent.putExtra("resul", resul)
            startActivity(intent)
        }

        val resulIntent = intent
        val categoria = resulIntent.getIntExtra("resul", 0)

        val dbVal = MyApplication.database?.categoriaDao()?.loadById(categoria)

        var acertos = 0
        var resposta = 0
        var progresso = 0
        val qntPerguntas: Int

        var arrPerguntas : TypedArray? = null
        var ordemPerguntas: MutableList<Int> = mutableListOf()
        val respostaCards : MutableList<CardResposta> = mutableListOf()

        val fundoRespostaDrawable = ContextCompat.getDrawable(this, R.drawable.card_respostas_fundo)

        val corFundo = findViewById<RelativeLayout>(R.id.cor_fnd)
        val imgFundo = findViewById<RelativeLayout>(R.id.img_fnd)
        val progressoBarra = findViewById<ProgressBar>(R.id.progressoBarra)
        val gridPergunta = findViewById<GridLayout>(R.id.grid_pergunta)
        val txtPergunta = findViewById<TextView>(R.id.pergunta)
        val btnConferir = findViewById<Button>(R.id.btn_conferir)

        fun getPergunta(indice: Int){
            txtPergunta.text = arrPerguntas?.getTextArray(ordemPerguntas[indice])?.get(0)
            val qntRespostas = arrPerguntas?.getTextArray(ordemPerguntas[indice])?.size?.minus(1)
            val ordemRespostas: MutableList<Int> = (1..qntRespostas!!).toMutableList()
            ordemRespostas.shuffle()

            if (gridPergunta.childCount>1)
                for (i in 1 until gridPergunta.childCount)
                    gridPergunta.removeViewAt(1)
            respostaCards.clear()

            for (i in 0 until qntRespostas) {
                val cardLayout = CardResposta(this)
                val param = GridLayout.LayoutParams(
                    GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f),
                    GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f)
                )
                param.width = 0
                param.setMargins(20)
                cardLayout.layoutParams = param
                cardLayout.setRespostaText(
                    arrPerguntas?.getTextArray(ordemPerguntas[indice])?.get(ordemRespostas[i])
                )
                cardLayout.setRespostaDrawable(fundoRespostaDrawable)
                respostaCards.add(cardLayout)
                gridPergunta.addView(cardLayout)
                cardLayout.setOnClickListener {
                    resposta = ordemRespostas[i]
                    if (!btnConferir.isEnabled) btnConferir.isEnabled = true
                    //fundoRespostaDrawable?.setTint(getColor(R.color.colorBnc)) //Todo: Tentar usar Tints em vez de drawables diferentes
                    for (card in respostaCards)
                        card.setRespostaDrawable(fundoRespostaDrawable)
                    //fundoRespostaDrawable?.setTint(getColor(R.color.respostaCerta))
                    respostaCards.get(i).setRespostaDrawable(ContextCompat.getDrawable(this, R.drawable.card_respostas_selecionada))
                }
            }
        }

        if (dbVal != null) {
            corFundo.setBackgroundColor(getColor(dbVal.cor_db))
            imgFundo.setBackgroundResource(dbVal.fundo_db)
            if (dbVal.isPreto_db)
                txtPergunta.setTextColor(getColor(R.color.colorPrt))
            else
                txtPergunta.setTextColor(getColor(R.color.colorBnc))

            arrPerguntas = resources.obtainTypedArray(dbVal.arrayPerguntas_db)
            qntPerguntas = arrPerguntas.length()
            ordemPerguntas = (0 until (qntPerguntas-1)).toMutableList()
            ordemPerguntas.shuffle()
            getPergunta(progresso)
        }
        else {
            corFundo.setBackgroundColor(getColor(R.color.color_sgu))
            imgFundo.setBackgroundResource(R.drawable.fndsgu)
            arrPerguntas = resources.obtainTypedArray(R.array.sgu_perguntas)
            qntPerguntas = arrPerguntas.length()
            ordemPerguntas = (0 until (qntPerguntas-1)).toMutableList()
            ordemPerguntas.shuffle()
            getPergunta(progresso)
        }

        btnConferir.setOnClickListener {
            if (resposta == 1) {
                acertos += 1
                progressoBarra.progressTintList = ColorStateList.valueOf(Color.rgb(50,180,75))
            }
            else
                progressoBarra.progressTintList = ColorStateList.valueOf(Color.rgb(235,5,0))
            progresso += 1
            progressoBarra.progress = ((progresso.toDouble()/qntPerguntas.toDouble())*100).toInt()
            if (progresso < 10)
                getPergunta(progresso)
            else {
                arrPerguntas.recycle()
                if (dbVal != null) {
                    dbVal.pontos_db = acertos * 10
                    MyApplication.database?.categoriaDao()?.updateCatg(dbVal)
                }
                loadResultado(categoria)
            }
            btnConferir.isEnabled = false
        }

    }
}