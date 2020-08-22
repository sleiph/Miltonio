package com.test.miltonio.ui

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.StyleableRes
import com.test.miltonio.R


class CartaTexto : LinearLayout {

    @StyleableRes
    var index0 = 0
    @StyleableRes
    var index1 = 1
    @StyleableRes
    var index2 = 2

    private var professorTexto: TextView? = null
    private var progressoTexto: TextView? = null
    private var materiaTexto: TextView? = null

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context, attrs)
    }

    private fun init(context: Context, attrs: AttributeSet) {
        inflate(context, R.layout.componente_carta_texto, this)
        val sets = intArrayOf(R.attr.professorTexto, R.attr.pontuacaoTexto, R.attr.materiaTexto)
        val typedArray = context.obtainStyledAttributes(attrs, sets)
        val professor = typedArray.getText(index0)
        val progresso = typedArray.getText(index1)
        val materia = typedArray.getText(index2)
        typedArray.recycle()
        initComponents()
        setProfessorTexto(professor)
        setProgressoTexto(progresso)
        setMateriaTexto(materia)
    }

    private fun initComponents() {
        professorTexto = findViewById<View>(R.id.txt_professor) as TextView
        progressoTexto = findViewById<View>(R.id.txt_progresso) as TextView
        materiaTexto = findViewById<View>(R.id.txt_materia) as TextView
    }

    fun getProfessorTexto(): CharSequence? {
        return professorTexto!!.text
    }

    fun setProfessorTexto(value: CharSequence?) {
        professorTexto!!.text = value
    }

    fun getProgressoTexto(): CharSequence? {
        return progressoTexto!!.text
    }

    fun setProgressoTexto(value: CharSequence?) {
        progressoTexto!!.text = value
    }

    fun getMateriaTexto(value: CharSequence?) {
        progressoTexto!!.text = value
    }

    fun setMateriaTexto(value: CharSequence?) {
        materiaTexto!!.text = value
    }
}
