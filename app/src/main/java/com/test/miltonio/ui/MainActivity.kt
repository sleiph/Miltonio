package com.test.miltonio.ui

import com.test.miltonio.R
import com.test.miltonio.MyApplication
import com.test.miltonio.modelo.Materia
import com.test.miltonio.objetos.semestre_1.Semestre1
import com.test.miltonio.objetos.semestre_2.Semestre2
import com.test.miltonio.objetos.semestre_3.Semestre3
import com.test.miltonio.objetos.semestre_4.Semestre4
import com.test.miltonio.ui.componentes.CardMateria
import com.test.miltonio.ui.componentes.Logo

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        fun matarChildren(pai: GridLayout) {
            if (pai.childCount > 1)
                for (i in 1 until pai.childCount)
                    pai.removeViewAt(1)
        }

        var semestre = 4
        var isSonando = true
    }
    
    private fun loadTelaPerguntas(id: Int) {
        val intent = Intent(this, TelaPerguntas::class.java)
        intent.putExtra("id", id)
        startActivity(intent)
    }

    // Todo: remover essa função quando terminar o app
    private fun debugSemestre(  ) {
        val semestre1 = Semestre1()
        for (materia in semestre1.getMaterias()) {
            MyApplication.materiasdatabase?.MateriaDao()?.update(materia)
            for (pergunta in materia.perguntas!!) {
                MyApplication.materiasdatabase?.PerguntaDao()?.update(pergunta)
                for (resposta in pergunta.respostas) {
                    MyApplication.materiasdatabase?.RespostaDao()?.update(resposta)
                }
            }
        }

        val semestre2 = Semestre2()
        for (materia in semestre2.getMaterias()) {
            MyApplication.materiasdatabase?.MateriaDao()?.update(materia)
            for (pergunta in materia.perguntas!!) {
                MyApplication.materiasdatabase?.PerguntaDao()?.update(pergunta)
                for (resposta in pergunta.respostas) {
                    MyApplication.materiasdatabase?.RespostaDao()?.update(resposta)
                }
            }
        }

        val semestre3 = Semestre3()
        for (materia in semestre3.getMaterias()) {
            MyApplication.materiasdatabase?.MateriaDao()?.update(materia)
            for (pergunta in materia.perguntas!!) {
                MyApplication.materiasdatabase?.PerguntaDao()?.update(pergunta)
                for (resposta in pergunta.respostas) {
                    MyApplication.materiasdatabase?.RespostaDao()?.update(resposta)
                }
            }
        }

        val semestre4 = Semestre4()
        for (materia in semestre4.getMaterias()) {
            MyApplication.materiasdatabase?.MateriaDao()?.update(materia)
            for (pergunta in materia.perguntas!!) {
                MyApplication.materiasdatabase?.PerguntaDao()?.update(pergunta)
                for (resposta in pergunta.respostas) {
                    MyApplication.materiasdatabase?.RespostaDao()?.update(resposta)
                }
            }
        }
    }
    
    private fun resetSemestre( semestre: Int ) {
        MyApplication.materiasdatabase?.MateriaDao()?.resetSemestre(semestre)
    }

    private fun montarSemestre(  ) {
        matarChildren( findViewById(R.id.cardParent) )

        val materias = MyApplication.materiasdatabase?.MateriaDao()?.getBySemestre(semestre)
        if (materias != null) {
            val pai: GridLayout = findViewById(R.id.cardParent)
            for (materia in materias) {
                val card: CardMateria = montarCard( materia )
                pai.addView( card )
            }
        }
    }

    private fun montarCard( materia: Materia ): CardMateria {
        val cardLayout = CardMateria(this)
        // passando as caracteristicas da materia pro card
        cardLayout.PopularCard(this, materia)

        cardLayout.setOnClickListener {
            loadTelaPerguntas(materia.id)
        }

        return cardLayout
    }

    private fun montarLogoTtl(  ) {
        val bitmap = when (semestre) {
            1 -> Semestre1().imagemHeader
            2 -> Semestre2().imagemHeader
            3 -> Semestre3().imagemHeader
            4 -> Semestre4().imagemHeader
            else -> Semestre1().imagemHeader
        }

        val logoLayout: Logo = findViewById(R.id.Logo)
        logoLayout.setImgLogo(bitmap)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //menu
        setSupportActionBar(findViewById(R.id.toolbarra_main))
        val actionBarra = supportActionBar
        actionBarra?.setDisplayShowTitleEnabled(false)
        actionBarra?.setDisplayShowHomeEnabled(false)

        debugSemestre()
        montarSemestre(  )
    }

    // Menu
    // Todo: Fazer o spinner mais bonito, desenhar ícones do menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        val itemSemestre = menu?.findItem(R.id.menu_semestre)

        // cria o spinner dos semestres
        val spinner = itemSemestre?.actionView as Spinner
        ArrayAdapter.createFromResource(
            this,
            R.array.menu_semestres,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
        spinner.setSelection(semestre-1)
        spinner.onItemSelectedListener = object : OnItemSelectedListener {
            // quando seleciona um semestre diferente
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                semestre = position+1
                montarLogoTtl()
                montarSemestre(  )
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                // sei la
            }
        }
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        // (re)cria o botão de ativar os sons
        val itemSom = menu.findItem(R.id.menu_sons)
        val itemNSom = menu.findItem(R.id.menu_Nsons)
        itemSom.isVisible = !isSonando
        itemNSom.isVisible = isSonando

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.menu_semestre -> {
            true
        }
        R.id.menu_sons -> {
            isSonando = true
            invalidateOptionsMenu()     //Todo: achar um jeito melhor de atualizar o menu
            true
        }
        R.id.menu_Nsons -> {
            isSonando = false
            invalidateOptionsMenu()
            true
        }
        R.id.menu_opcoes -> {
            val alertBuilder = AlertDialog.Builder(this)
            alertBuilder.setTitle(R.string.menu_config)
                .setMessage(R.string.alerta_mensagem)
                .setPositiveButton(R.string.alerta_positivo) { _: DialogInterface, _: Int ->
                    resetSemestre( semestre )
                    montarSemestre(  )
                }
                .setNegativeButton(R.string.alerta_negativo) { dialogInterface: DialogInterface, _: Int ->
                    dialogInterface.cancel()
                }
            val alertaDialogo = alertBuilder.create()
            alertaDialogo.show()
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}

//Todo: Funcionalidade
    //Todo: Usuários com senha

//Todo: Design
    //Todo: Darkmode
    //Todo: Animações
    //Todo: Layout responsivo
    //Todo: Sons quando clica na cabecinha do Milton
    //Todo: https://stackoverflow.com/questions/1700099/android-how-to-create-a-background-from-pattern

