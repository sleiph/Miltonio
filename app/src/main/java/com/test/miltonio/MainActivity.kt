package com.test.miltonio

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.setMargins
import com.test.miltonio.ui.CardMateria

fun MatarChildren(pai :GridLayout) {
    if (pai.childCount > 1)
        for (i in 1 until pai.childCount)
            pai.removeViewAt(1)
}

class MainActivity : AppCompatActivity() {

    private fun loadRespostas(resul: Int){
        val intent = Intent(this, TelaRespostas::class.java)
        intent.putExtra("resul", resul)
        startActivity(intent)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun DesenharCards(dados :List<Categorias_DB>?, pai :GridLayout) {
        MatarChildren(pai)

        if (dados != null) {
            for (i in dados.indices) {
                val cardLayout = CardMateria(this)
                val param = GridLayout.LayoutParams(
                    GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f),
                    if (i == dados.size - 1 && dados.size % 2 != 0)
                        GridLayout.spec(GridLayout.UNDEFINED, 2, 2f)
                    else
                        GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f)
                )
                param.height = resources.getDimension(R.dimen.tamanho_cards).toInt()
                param.width = 0
                param.setMargins(resources.getDimension(R.dimen.margem_meia_margin).toInt())
                cardLayout.layoutParams = param
                cardLayout.setCardBack(getColor(dados[i].cor_db))
                cardLayout.setMateriaDrawable(
                    ContextCompat.getDrawable(this, dados[i].simb_db)
                )
                cardLayout.setProfessorText(
                    getString(dados[i].professor_db),
                    if (dados[i].isPreto_db) getColor(R.color.colorPrt)
                    else getColor(R.color.colorBnc)
                )
                cardLayout.setProgressoText(
                    getString(
                        R.string.resultado_pontos,
                        dados[i].pontos_db.toString()
                    ),
                    if (dados[i].isPreto_db) getColor(R.color.colorPrt)
                    else getColor(R.color.colorBnc)
                )
                cardLayout.setMateriaText(
                    getString(dados[i].materia_db),
                    if (dados[i].isPreto_db) getColor(R.color.colorPrt)
                    else getColor(R.color.colorBnc)
                )
                pai.addView(cardLayout)
                cardLayout.setOnClickListener {
                    loadRespostas(i+20)
                }
            }
        }
    }
    @RequiresApi(Build.VERSION_CODES.M)
    private fun DesenharCardsSem1(dados :List<Sem1DB>?, pai :GridLayout) {
        MatarChildren(pai)

        if (dados != null) {
            for (i in dados.indices) {
                val cardLayout = CardMateria(this)
                val param = GridLayout.LayoutParams(
                    GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f),
                    if (i == dados.size - 1 && dados.size % 2 != 0)
                        GridLayout.spec(GridLayout.UNDEFINED, 2, 2f)
                    else
                        GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f)
                )
                param.height = resources.getDimension(R.dimen.tamanho_cards).toInt()
                param.width = 0
                param.setMargins(resources.getDimension(R.dimen.margem_meia_margin).toInt())
                cardLayout.layoutParams = param
                cardLayout.setCardBack(getColor(dados[i].cor_db))
                cardLayout.setMateriaDrawable(
                    ContextCompat.getDrawable(this, dados[i].simb_db)
                )
                cardLayout.setProfessorText(
                    getString(dados[i].professor_db),
                    if (dados[i].isPreto_db) getColor(R.color.colorPrt)
                    else getColor(R.color.colorBnc)
                )
                cardLayout.setProgressoText(
                    getString(
                        R.string.resultado_pontos,
                        dados[i].pontos_db.toString()
                    ),
                    if (dados[i].isPreto_db) getColor(R.color.colorPrt)
                    else getColor(R.color.colorBnc)
                )
                cardLayout.setMateriaText(
                    getString(dados[i].materia_db),
                    if (dados[i].isPreto_db) getColor(R.color.colorPrt)
                    else getColor(R.color.colorBnc)
                )
                pai.addView(cardLayout)
                cardLayout.setOnClickListener {
                    loadRespostas(i+10)
                }
            }
        }
    }


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbarra_main))

        val actionBarra = supportActionBar
        actionBarra?.setDisplayShowTitleEnabled(false)
        actionBarra?.setDisplayShowHomeEnabled(false)

        val dbVal = MyApplication.database?.categoriaDao()?.getAll()
        val gridCards = findViewById<GridLayout>(R.id.cardParent)

        DesenharCards(dbVal, gridCards)
    }

    //Todo: Desenhar ícones do menu
    //Todo: Menu onde o usuário pode apagar o progresso, desligar o som, etc...
    //Todo: Escolha de semestre no menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        val itemSemestre = menu?.findItem(R.id.menu_semestre)
        val spinner : Spinner = itemSemestre?.actionView as Spinner
        ArrayAdapter.createFromResource(
            this,
            R.array.menu_semestres,
            android.R.layout.simple_spinner_item //Todo: Fazer o spinner mais bonito
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
        spinner.setSelection(1)
        spinner.onItemSelectedListener = object : OnItemSelectedListener {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                when(position) {
                    0 -> DesenharCardsSem1(MyApplication.sem1database?.sem1Dao()?.getAll(), findViewById(R.id.cardParent))
                    1 -> DesenharCards(MyApplication.database?.categoriaDao()?.getAll(), findViewById(R.id.cardParent))
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                // sei la
            }
        }
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.menu_semestre -> {
            true
        }
        R.id.menu_perfil -> {
            println(true)
            true
        }
        R.id.menu_opcoes -> {
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}

//Todo: Acessibilidade!!!
//Todo: Animações
//Todo: Título do app interativo
//Todo: Layout responsivo
//Todo: Usuários com senha
//Todo: Mudar a fonte tipográfica do app
//Todo: Exibir na tela inicial a pontuação mais alta
//Todo: Tirar a barra de status
//Todo: Fundos pro 2° semestre