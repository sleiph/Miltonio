package com.test.miltonio

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.GridLayout
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.setMargins
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
                    GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f),
                    if (i == db_val.size-1 && db_val.size%2!=0) GridLayout.spec(GridLayout.UNDEFINED, 2, 2f)
                    else GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f)
                )
                param.height = 420
                param.width = 0
                param.setMargins(25)
                cardLayout.setLayoutParams(param)
                cardLayout.setCardBack(getColor(db_val.get(i).cor_db))
                cardLayout.setMateriaDrawable(ContextCompat.getDrawable(this, db_val.get(i).simb_db))
                cardLayout.setProfessorText(
                    getString(db_val.get(i).professor_db),
                    if (db_val.get(i).isPreto_db) getColor(R.color.colorPrt)
                    else getColor(R.color.colorBnc)
                )
                cardLayout.setProgressoText(
                    getString(
                        R.string.resultado_pontos,
                        db_val.get(i).pontos_db.toString()
                    ),
                    if (db_val.get(i).isPreto_db) getColor(R.color.colorPrt)
                    else getColor(R.color.colorBnc)
                )
                cardLayout.setMateriaText(
                    getString(db_val.get(i).materia_db),
                    if (db_val.get(i).isPreto_db) getColor(R.color.colorPrt)
                    else getColor(R.color.colorBnc)
                )
                cardPapa.addView(cardLayout)
                cardLayout.setOnClickListener {
                    loadRespostas(i)
                }
            }
        }
    }
}

//Todo: Acessibilidade!!!
//Todo: Animações
//Todo: Layout responsivo
//Todo: High Scores
//Todo: Usuários com senha
//Todo: Se você errar a pergunta, ela volta no final (igual o Duolingo)
//Todo: Menu onde o usuário pode apagar o progresso, desligar o som, etc...
//Todo: Tilestyle background
//Todo: Mudar a fonte tipográfica do app
//Todo: Exibir na tela inicial a pontuação mais alta
//Todo: Música pra quando terminar os exercícios (diferente se vc fez uma pontuação melhor ou não)
//Todo: Sons
//Todo: Tamanho das caixas de resposta uniforme
//Todo: Quantidade de perguntas adaptável
//Todo: Quantidade de respostas adaptável