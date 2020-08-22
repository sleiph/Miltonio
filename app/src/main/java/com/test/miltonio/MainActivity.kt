package com.test.miltonio

import android.content.Intent
import android.os.Bundle
import android.widget.GridLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun loadRespostas(resul: Int){
            val intent = Intent(this, TelaRespostas::class.java)
            intent.putExtra("resul", resul)
            startActivity(intent)
        }

        val textos = arrayOf(
            findViewById<TextView>(R.id.txt_progresso),
            findViewById<TextView>(R.id.txt_progresso_tru),
            findViewById<TextView>(R.id.txt_progresso_trd),
            findViewById<TextView>(R.id.txt_progresso_qru),
            findViewById<TextView>(R.id.txt_progresso_qrd),
            findViewById<TextView>(R.id.txt_progresso_qnu),
            findViewById<TextView>(R.id.txt_progresso_sxu)
        )

        val cardPapa = findViewById<GridLayout>(R.id.cardParent)

        val cardAdm = findViewById<CardView>(R.id.card_sgu)
        val cardAlg = findViewById<CardView>(R.id.card_tru)
        val cardAoc = findViewById<CardView>(R.id.card_trd)
        val cardEng = findViewById<CardView>(R.id.card_qru)
        val cardLhw = findViewById<CardView>(R.id.card_qrd)
        val cardMat = findViewById<CardView>(R.id.card_qnu)
        val cardPrg = findViewById<CardView>(R.id.card_sxu)

        cardAdm.setOnClickListener {
            loadRespostas(0)
        }
        cardAlg.setOnClickListener {
            loadRespostas(1)
        }
        cardAoc.setOnClickListener {
            loadRespostas(2)
        }
        cardEng.setOnClickListener {
            loadRespostas(3)
        }
        cardLhw.setOnClickListener {
            loadRespostas(4)
        }
        cardMat.setOnClickListener {
            loadRespostas(5)
        }
        cardPrg.setOnClickListener {
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