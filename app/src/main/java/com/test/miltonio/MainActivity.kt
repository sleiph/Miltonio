package com.test.miltonio

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.GridLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.test.miltonio.ui.CardMateria

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun loadRespostas(resul: Int){
            val intent = Intent(this, TelaRespostas::class.java)
            intent.putExtra("resul", resul)
            startActivity(intent)
        }

        val cardPapa = findViewById<GridLayout>(R.id.cardParent)

        val cardSgu = findViewById<CardView>(R.id.card_sgu)
        val cardTru = findViewById<CardView>(R.id.card_tru)
        val cardTrd = findViewById<CardView>(R.id.card_trd)
        val cardQru = findViewById<CardView>(R.id.card_qru)
        val cardQrd = findViewById<CardView>(R.id.card_qrd)
        val cardQnu = findViewById<CardView>(R.id.card_qnu)
        val cardSxu = findViewById<CardView>(R.id.card_sxu)

        val cardLayout = CardMateria(this)
        cardLayout.setProfessorText(getString(R.string.categ_sgu_prof), getColor(R.color.colorPrt))
        cardLayout.setProgressoText(getString(R.string.resultado_pontos), getColor(R.color.colorPrt))
        cardLayout.setMateriaText(getString(R.string.categ_sgu_prof), getColor(R.color.colorPrt))
        cardLayout.setMateriaDrawable(getDrawable(R.drawable.simbadm))
        cardSgu.addView(cardLayout)

        val textos = arrayOf(
            findViewById<TextView>(R.id.txt_progresso_trd),
            findViewById<TextView>(R.id.txt_progresso_trd),
            findViewById<TextView>(R.id.txt_progresso_trd),
            findViewById<TextView>(R.id.txt_progresso_qru),
            findViewById<TextView>(R.id.txt_progresso_qrd),
            findViewById<TextView>(R.id.txt_progresso_qnu),
            findViewById<TextView>(R.id.txt_progresso_sxu)
        )

        cardSgu.setOnClickListener {
            loadRespostas(0)
        }
        cardTru.setOnClickListener {
            loadRespostas(1)
        }
        cardTrd.setOnClickListener {
            loadRespostas(2)
        }
        cardQru.setOnClickListener {
            loadRespostas(3)
        }
        cardQrd.setOnClickListener {
            loadRespostas(4)
        }
        cardQnu.setOnClickListener {
            loadRespostas(5)
        }
        cardSxu.setOnClickListener {
            loadRespostas(6)
        }

        val db_val = MyApplication.database?.categoriaDao()?.getAll()

        if (db_val != null) {
            for (i in 0..db_val.size-1)
                textos[i].setText(
                    getString(
                        R.string.resultado_pontos,
                        db_val.get(i).pontos.toString()
                    )
                )
        }
    }
}

//Todo: Acessibilidade!!!
//Todo: Quantidade de perguntas adaptável
//Todo: Quantidade de respostas adaptável
//Todo: Menu onde o usuário pode apagar o progresso, desligar o som, etc...
//Todo: Animações
//Todo: Tilestyle background
//Todo: Layout responsivo
//Todo: Mudar a fonte tipográfica do app
//Todo: Tamanho das caixas de resposta uniforme
//Todo: Música pra quando terminar os exercícios (diferente se vc fez uma pontuação melhor ou não)
//Todo: Se você errar a pergunta, ela volta no final (igual o Duolingo)
//Todo: High Scores
//Todo: Usuários com senha
//Todo: Exibir na tela inicial a pontuação mais alta
//Todo: Tirar os prefixos das matérias (adm, algo, aoc...) pra facilitar reaproveitamento
//Todo: Pra cada categoria no banco de dados adicionar automaticamente um card da matéria