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

    private fun loadRespostas(resul: Int){
        val intent = Intent(this, TelaRespostas::class.java)
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
                    MyApplication.sem1database?.sem1Dao()?.updateCatg(categ)
            1 ->
                for (categ in MyApplication.catgArray)
                    MyApplication.database?.categoriaDao()?.updateCatg(categ)
            2 ->
                for (categ in MyApplication.sem3Array)
                    MyApplication.sem3database?.sem3Dao()?.updateCatg(categ)
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun desenhaSemestre( semestre: Int ) {
        when(semestre) {
            0 -> desenharCardsSem1(
                MyApplication.sem1database?.sem1Dao()?.getAll(), findViewById(
                    R.id.cardParent
                )
            )
            1 -> desenharCards(
                MyApplication.database?.categoriaDao()?.getAll(), findViewById(
                    R.id.cardParent
                )
            )
            2 -> desenharCardsSem3(
                MyApplication.sem3database?.sem3Dao()?.getAll(), findViewById(
                    R.id.cardParent
                )
            )
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun desenharCardsSem1(dados: List<Sem1DB>?, pai: GridLayout) {
        matarChildren(pai)

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
                    loadRespostas(i + 10)
                }
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun desenharCards(dados: List<Categorias_DB>?, pai: GridLayout) {
        matarChildren(pai)

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
                    loadRespostas(i + 20)
                }
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun desenharCardsSem3(dados: List<Sem3DB>?, pai: GridLayout) {
        matarChildren(pai)

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
                    loadRespostas(i + 30)
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

//Todo: Performance
    //Todo: Diminuir repetição de código
