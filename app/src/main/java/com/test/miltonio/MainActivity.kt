package com.test.miltonio

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.GridLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
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

        val db_val = MyApplication.database?.categoriaDao()?.getAll()

        if (db_val != null) {
            for (i in 0..db_val.size-1) {
                val cardLayout = CardMateria(this)
                val param = GridLayout.LayoutParams(
                    GridLayout.spec(
                        GridLayout.UNDEFINED, GridLayout.FILL, 1f
                    ),
                    GridLayout.spec(
                        GridLayout.UNDEFINED, GridLayout.FILL, 1f
                    )
                )
                param.height = 420
                param.width = 0
                cardLayout.setLayoutParams(param)
                cardLayout.setCardBack(getColor(R.color.color_sgu))
                cardLayout.setMateriaDrawable(getDrawable(R.drawable.simbadm))
                cardLayout.setProfessorText(getString(R.string.categ_sgu_prof), getColor(R.color.colorPrt))
                cardLayout.setProgressoText(
                    getString(
                        R.string.resultado_pontos,
                        db_val.get(i).pontos.toString()
                    ),
                    getColor(R.color.colorPrt)
                )
                cardLayout.setMateriaText(getString(R.string.categ_sgu), getColor(R.color.colorPrt))
                cardPapa.addView(cardLayout)
                cardLayout.setOnClickListener {
                    loadRespostas(i)
                }
            }
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