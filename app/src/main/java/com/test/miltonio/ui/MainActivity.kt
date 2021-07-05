package com.test.miltonio.ui

import com.test.miltonio.R
import com.test.miltonio.MyApplication
import com.test.miltonio.ui.componentes.CardMateria
import com.test.miltonio.modelo.Materia
import com.test.miltonio.objetos.Semestre1
import com.test.miltonio.objetos.Semestre2
import com.test.miltonio.objetos.Semestre3

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

fun matarChildren(pai: GridLayout) {
    if (pai.childCount > 1)
        for (i in 1 until pai.childCount)
            pai.removeViewAt(1)
}

var semestre = 3 //Todo: acabar com as variáveis globais

class MainActivity : AppCompatActivity() {
    
    private fun loadTelaPerguntas(id: Int) {
        val intent = Intent(this, TelaPerguntas::class.java)
        intent.putExtra("id", id)
        startActivity(intent)
    }
    
    private var isSonando = true

    @RequiresApi(Build.VERSION_CODES.M)
    private fun setSound(valor: Boolean) {      //Todo: mutar os sons só do aplicativo -_-
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

    // Todo: remover essa função quando terminar o app
    private fun debugSemestre(  ) {
        val semestre1 = Semestre1()
        for (materia in semestre1.getMaterias())
            MyApplication.materiasdatabase?.MateriaDao()?.updateCatg(materia)

        val semestre2 = Semestre2()
        for (materia in semestre2.getMaterias())
            MyApplication.materiasdatabase?.MateriaDao()?.updateCatg(materia)

        val semestre3 = Semestre3()
        for (materia in semestre3.getMaterias())
            MyApplication.materiasdatabase?.MateriaDao()?.updateCatg(materia)
    }
    
    private fun resetSemestre( semestre: Int ) {
        MyApplication.materiasdatabase?.MateriaDao()?.resetSemestre(semestre)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun montarSemestre( semestre: Int ) {

        val logoAnimado = findViewById<ImageView>(R.id.logo_anima)
        val logoAnamido = findViewById<ImageView>(R.id.logo_animo)

        when(semestre) {
            2 -> {
                logoAnimado.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.appsocoronga))
                logoAnamido.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.appsocoronga))
            }
            3 -> {
                logoAnimado.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.appsomascara))
                logoAnamido.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.appsomascara))
            }
            else -> {
                logoAnimado.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.appsomilton))
                logoAnamido.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.appsomilton))
            }
        }

        matarChildren( findViewById(R.id.cardParent) )

        val materias = MyApplication.materiasdatabase?.MateriaDao()?.loadBySemestre(semestre)
        if (materias != null) {
            for (materia in materias) {
                montarCard( materia, findViewById(R.id.cardParent) )
            }
        }

    }

    private fun montarCard( materia: Materia, pai: GridLayout ) {

        val cardLayout = CardMateria(this)
        val param = GridLayout.LayoutParams(
            GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f),
            GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f)
        )
        param.height = resources.getDimension(R.dimen.tamanho_cards).toInt()
        param.width = 0
        param.setMargins(resources.getDimension(R.dimen.margem_meia_margin).toInt())
        cardLayout.layoutParams = param
        cardLayout.setCardBack( ContextCompat.getColor(this, materia.cor_db) )
        cardLayout.setMateriaDrawable(
            ContextCompat.getDrawable(this, materia.simb_db)
        )
        cardLayout.setProfessorText(
            getString(materia.professor_db),
            if (materia.isPreto_db)
                ContextCompat.getColor(this, R.color.colorPrt)
            else
                ContextCompat.getColor(this, R.color.colorBnc)
        )
        cardLayout.setProgressoText(
            getString(
                R.string.resultado_pontos,
                materia.pontos_db.toString()
            ),
            if (materia.isPreto_db)
                ContextCompat.getColor(this, R.color.colorPrt)
            else
                ContextCompat.getColor(this, R.color.colorBnc)
        )
        cardLayout.setMateriaText(
            getString(materia.materia_db),
            if (materia.isPreto_db)
                ContextCompat.getColor(this, R.color.colorPrt)
            else
                ContextCompat.getColor(this, R.color.colorBnc)
        )

        pai.addView(cardLayout)

        cardLayout.setOnClickListener {
            loadTelaPerguntas(materia.cid)
        }
    }

    private fun setHeader() {
        val bitmaps = intArrayOf( R.drawable.appsomilton, R.drawable.appsocoronga, R.drawable.appsomascara )
        val logoAnimado = findViewById<ImageView>(R.id.logo_anima)
        val logoAnamido = findViewById<ImageView>(R.id.logo_animo)
        val angulo = 60
        val matrixAnima = Matrix()
        val matrixAnami = Matrix()

        logoAnimado.setOnClickListener {
            val logoAnimadoBmp = BitmapFactory.decodeResource(resources, bitmaps[semestre-1])
            matrixAnima.postRotate(angulo.toFloat())
            val rodado = Bitmap.createBitmap(
                logoAnimadoBmp, 0, 0, logoAnimadoBmp.width, logoAnimadoBmp.height,
                matrixAnima, true
            )
            logoAnimado.setImageBitmap(rodado)
        }

        logoAnamido.setOnClickListener {
            val logoAnimadoBmp = BitmapFactory.decodeResource(resources, bitmaps[semestre-1])
            matrixAnami.postRotate(-angulo.toFloat())
            val rodado = Bitmap.createBitmap(
                logoAnimadoBmp, 0, 0, logoAnimadoBmp.width, logoAnimadoBmp.height,
                matrixAnami, true
            )
            logoAnamido.setImageBitmap(rodado)
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

        setHeader()

        //debugSemestre()
        montarSemestre( semestre )
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
        spinner.setSelection(semestre-1)
        spinner.onItemSelectedListener = object : OnItemSelectedListener {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                semestre = position+1
                montarSemestre( semestre )
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
                    montarSemestre( semestre )
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
    //Todo: Trocar esse verde escuro por um cinza escuro
    //Todo: https://stackoverflow.com/questions/1700099/android-how-to-create-a-background-from-pattern

//Todo: Performance
    //Todo: Diminuir repetição de código
