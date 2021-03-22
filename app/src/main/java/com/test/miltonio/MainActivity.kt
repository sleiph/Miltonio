package com.test.miltonio

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.media.AudioManager
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

fun matarChildren(pai: GridLayout) {
    if (pai.childCount > 1)
        for (i in 1 until pai.childCount)
            pai.removeViewAt(1)
}

var semestre = 2 //Todo: acabar com as variáveis globais

class MainActivity : AppCompatActivity() {

    private fun loadRespostas(resul: Int) {
        val intent = Intent(this, TelaPerguntas::class.java)
        intent.putExtra("resul", resul)
        startActivity(intent)
    }

    private var isSonando = true

    @RequiresApi(Build.VERSION_CODES.M)
    private fun setSound(valor: Boolean) {
        val audiomanager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
        if (valor) {
            audiomanager.adjustStreamVolume(
                AudioManager.STREAM_MUSIC,
                AudioManager.ADJUST_MUTE,
                0
            )
            isSonando = false
        }
        else {
            audiomanager.adjustStreamVolume(
                AudioManager.STREAM_MUSIC,
                AudioManager.ADJUST_UNMUTE,
                0
            )
            isSonando = true
        }
    }

    private fun resetSemestre( semestre: Int ) {
        when(semestre) {
            0 ->
                for (categ in MyApplication.sem1Array)
                    MyApplication.sem1database?.Sem1Dao()?.updateCatg(categ)
            1 ->
                for (categ in MyApplication.sem2Array)
                    MyApplication.sem2database?.Sem2Dao()?.updateCatg(categ)
            2 ->
                for (categ in MyApplication.sem3Array)
                    MyApplication.sem3database?.Sem3Dao()?.updateCatg(categ)
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun desenhaSemestre( semestre: Int ) {
        val pontos: Array<Int> = Array(10) {0}
        val cores: Array<Int> = Array(10) {0}
        val simbolos: Array<Int> = Array(10) {0}
        val isPreto: Array<Boolean> = Array(10) {false}
        val professores: Array<Int> = Array(10) {0}
        val materias: Array<Int> = Array(10) {0}

        val logoAnimado = findViewById<ImageView>(R.id.logo_anima)
        val logoAnamido = findViewById<ImageView>(R.id.logo_animo)

        when(semestre) {
            0 -> {
                logoAnimado.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.appsomilton))
                logoAnamido.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.appsomilton))

                val dados = MyApplication.sem1database?.Sem1Dao()?.getAll()
                if (dados != null) {
                    val n = dados.size

                    for (i in 0 until n) {
                        pontos[i] = dados[i].pontos_db
                        cores[i] = dados[i].cor_db
                        simbolos[i] = dados[i].simb_db
                        isPreto[i] = dados[i].isPreto_db
                        professores[i] = dados[i].professor_db
                        materias[i] = dados[i].materia_db
                    }

                    montarCards(
                        n, pontos, 10,
                        cores, simbolos, isPreto,
                        professores, materias,
                        findViewById(R.id.cardParent)
                    )
                }
            }
            1 -> {
                logoAnimado.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.appsocoronga))
                logoAnamido.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.appsocoronga))

                val dados = MyApplication.sem2database?.Sem2Dao()?.getAll()
                if (dados != null) {
                    val n = dados.size

                    for (i in 0 until n) {
                        pontos[i] = dados[i].pontos_db
                        cores[i] = dados[i].cor_db
                        simbolos[i] = dados[i].simb_db
                        isPreto[i] = dados[i].isPreto_db
                        professores[i] = dados[i].professor_db
                        materias[i] = dados[i].materia_db
                    }

                    montarCards(
                        n, pontos, 20,
                        cores, simbolos, isPreto,
                        professores, materias,
                        findViewById(R.id.cardParent)
                    )
                }
            }
            2 -> {
                logoAnimado.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.appsomascara))
                logoAnamido.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.appsomascara))

                val dados = MyApplication.sem3database?.Sem3Dao()?.getAll()
                if (dados != null) {
                    val n = dados.size

                    for (i in 0 until n) {
                        pontos[i] = dados[i].pontos_db
                        cores[i] = dados[i].cor_db
                        simbolos[i] = dados[i].simb_db
                        isPreto[i] = dados[i].isPreto_db
                        professores[i] = dados[i].professor_db
                        materias[i] = dados[i].materia_db
                    }

                    montarCards(
                        n, pontos, 30,
                        cores, simbolos, isPreto,
                        professores, materias,
                        findViewById(R.id.cardParent)
                    )
                }
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun montarCards(
        n: Int, pontos: Array<Int>, cat: Int,
        cores: Array<Int>, simbolos: Array<Int>, isPreto: Array<Boolean>,
        professores: Array<Int>, materias: Array<Int>,
        pai: GridLayout
    ) {
        matarChildren(pai)

        for (i in 0 until n) {
            val cardLayout = CardMateria(this)
            val param = GridLayout.LayoutParams(
                GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f),
                if (i == n - 1 && n % 2 != 0)
                    GridLayout.spec(GridLayout.UNDEFINED, 2, 2f)
                else
                    GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f)
            )
            param.height = resources.getDimension(R.dimen.tamanho_cards).toInt()
            param.width = 0
            param.setMargins(resources.getDimension(R.dimen.margem_meia_margin).toInt())
            cardLayout.layoutParams = param
            cardLayout.setCardBack(getColor(cores[i]))
            cardLayout.setMateriaDrawable(
                ContextCompat.getDrawable(this, simbolos[i])
            )
            cardLayout.setProfessorText(
                getString(professores[i]),
                if (isPreto[i])
                    getColor(R.color.colorPrt)
                else
                    getColor(R.color.colorBnc)
            )
            cardLayout.setProgressoText(
                getString(
                    R.string.resultado_pontos,
                    pontos[i].toString()
                ),
                if (isPreto[i])
                    getColor(R.color.colorPrt)
                else
                    getColor(R.color.colorBnc)
            )
            cardLayout.setMateriaText(
                getString(materias[i]),
                if (isPreto[i])
                    getColor(R.color.colorPrt)
                else
                    getColor(R.color.colorBnc)
            )
            pai.addView(cardLayout)
            cardLayout.setOnClickListener {
                loadRespostas(i + cat)
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

        val audiomanager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
        isSonando = !audiomanager.isStreamMute(AudioManager.STREAM_MUSIC)

        val logoAnimado = findViewById<ImageView>(R.id.logo_anima)
        val logoAnamido = findViewById<ImageView>(R.id.logo_animo)
        val logoAnimadoBmp = BitmapFactory.decodeResource(resources, R.drawable.appsomilton)
        val angulo = 60
        val matrixAnima = Matrix()
        val matrixAnami = Matrix()

        logoAnimado.setOnClickListener {
            matrixAnima.postRotate(angulo.toFloat())
            val rodado = Bitmap.createBitmap(
                logoAnimadoBmp, 0, 0, logoAnimadoBmp.width, logoAnimadoBmp.height,
                matrixAnima, true
            )
            logoAnimado.setImageBitmap(rodado)
        }

        logoAnamido.setOnClickListener {
            matrixAnami.postRotate(-angulo.toFloat())
            val rodado = Bitmap.createBitmap(
                logoAnimadoBmp, 0, 0, logoAnimadoBmp.width, logoAnimadoBmp.height,
                matrixAnami, true
            )
            logoAnamido.setImageBitmap(rodado)
        }

        // resetSemestre(semestre)
        desenhaSemestre( semestre )
    }

    //Todo: Desenhar ícones do menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        val itemSemestre = menu?.findItem(R.id.menu_semestre)
        val spinner : Spinner = itemSemestre?.actionView as Spinner
        ArrayAdapter.createFromResource(
            this,
            R.array.menu_semestres,
            android.R.layout.simple_spinner_item
            //Todo: Fazer o spinner mais bonito
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
        spinner.setSelection(semestre)
        spinner.onItemSelectedListener = object : OnItemSelectedListener {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                semestre = position
                desenhaSemestre( semestre )
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                // sei la
            }
        }
        return true
    }
    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        val itemSom = menu.findItem(R.id.menu_sons)
        val itemNSom = menu.findItem(R.id.menu_Nsons)
        itemSom.isVisible = !isSonando
        itemNSom.isVisible = isSonando
        return true
    }
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.menu_semestre -> {
            true
        }
        R.id.menu_sons -> {
            setSound(false)
            invalidateOptionsMenu()
            //Todo: achar um jeito melhor de atualizar o menu
            true
        }
        R.id.menu_Nsons -> {
            setSound(true)
            invalidateOptionsMenu()
            true
        }
        R.id.menu_opcoes -> {
            val alertBuilder = AlertDialog.Builder(this)
            alertBuilder.setTitle(R.string.menu_config)
                .setMessage(R.string.alerta_mensagem)
                .setPositiveButton(R.string.alerta_positivo) { _: DialogInterface, _: Int ->
                    resetSemestre( semestre )
                    desenhaSemestre( semestre )
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

//Todo: Acessibilidade
    //Todo: Deixar o app usável em versões mais antigas do Android

//Todo: Design
    //Todo: Darkmode
    //Todo: Animações
    //Todo: Layout responsivo
    //Todo: Sons quando clica na cabecinha do Milton
    //Todo: Criar os fundos do 3 semestre
    //Todo: Quando o usuário mudar o semestre >> mudar as imagens do título
        //Todo: Semestre 2 == corona virus
    //Todo: Trocar esse verde escuro por um cinza escuro

//Todo: Performance
    //Todo: Diminuir repetição de código
