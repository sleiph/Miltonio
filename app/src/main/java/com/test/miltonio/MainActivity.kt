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

        val dbVal = MyApplication.database?.categoriaDao()?.getAll()

        if (dbVal != null) {
            for (i in dbVal.indices) {
                val cardLayout = CardMateria(this)
                val param = GridLayout.LayoutParams(
                    GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f),
                    if (i == dbVal.size-1 && dbVal.size%2!=0)
                        GridLayout.spec(GridLayout.UNDEFINED, 2, 2f)
                    else
                        GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f)
                )
                param.height = 420
                param.width = 0
                param.setMargins(25)
                cardLayout.layoutParams = param
                cardLayout.setCardBack(getColor(dbVal[i].cor_db))
                cardLayout.setMateriaDrawable(
                    ContextCompat.getDrawable(this, dbVal[i].simb_db)
                )
                cardLayout.setProfessorText(
                    getString(dbVal[i].professor_db),
                    if (dbVal[i].isPreto_db) getColor(R.color.colorPrt)
                    else getColor(R.color.colorBnc)
                )
                cardLayout.setProgressoText(
                    getString(
                        R.string.resultado_pontos,
                        dbVal[i].pontos_db.toString()
                    ),
                    if (dbVal[i].isPreto_db) getColor(R.color.colorPrt)
                    else getColor(R.color.colorBnc)
                )
                cardLayout.setMateriaText(
                    getString(dbVal[i].materia_db),
                    if (dbVal[i].isPreto_db) getColor(R.color.colorPrt)
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
//Todo: Usuários com senha
//Todo: Menu onde o usuário pode apagar o progresso, desligar o som, etc...
//Todo: Tilestyle background
//Todo: Mudar a fonte tipográfica do app
//Todo: Exibir na tela inicial a pontuação mais alta
//Todo: Fundos pro 2° semestre
//Todo: diminuir o contraste do fundo de segunda