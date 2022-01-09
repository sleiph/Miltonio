package com.test.miltonio.ui.componentes

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.TextView

import androidx.core.content.ContextCompat
import androidx.core.view.setMargins

class CardMateria : LinearLayout {

    private var _professorString: String? = null
    private var _progressoString: String? = null
    private var _materiaString: String? = null
    private var _cardTextColor: Int? = null
    private var _cardBackColor: Int? = null
    private var cardDrawable: Drawable? = null

    private val cardMae = this
    private var layoutMae: LinearLayout? = null
    private var professorTextView: TextView? = null
    private var progressoTextView: TextView? = null
    private var materiaTextView: TextView? = null

    constructor(context: Context) : super(context) {
        init(null, 0)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        init(attrs, defStyle)
    }

    private fun init(attrs: AttributeSet?, defStyle: Int) {
        inflate(context, R.layout.sample_card_materia, this)
        // Load attributes
        val a = context.obtainStyledAttributes(
            attrs, R.styleable.CardMateria, defStyle, 0
        )

        _professorString = a.getString(
            R.styleable.CardMateria_professorString
        )
        _progressoString = a.getString(
            R.styleable.CardMateria_progressoString
        )
        _materiaString = a.getString(
            R.styleable.CardMateria_materiaString
        )
        _cardTextColor = a.getColor(
            R.styleable.CardMateria_cardTextColor,
            0
        )
        _cardBackColor = a.getColor(
            R.styleable.CardMateria_cardBackColor,
            0
        )

        if (a.hasValue(R.styleable.CardMateria_cardDrawable)) {
            cardDrawable = a.getDrawable(
                R.styleable.CardMateria_cardDrawable
            )
            cardDrawable?.callback = this
        }

        a.recycle()

        initComponents()

    }

    private fun initComponents() {
        layoutMae = findViewById<View>(R.id.layout_mae) as LinearLayout
        professorTextView = findViewById<View>(R.id.txt_professor) as TextView
        progressoTextView = findViewById<View>(R.id.txt_progresso) as TextView
        materiaTextView = findViewById<View>(R.id.txt_materia) as TextView

        val param = GridLayout.LayoutParams(
            GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f),
            GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f)
        )
        param.height = resources.getDimension(R.dimen.tamanho_cards).toInt()
        param.width = 0
        param.setMargins(resources.getDimension(R.dimen.margem_meia_margin).toInt())
        this.layoutParams = param
    }

    fun PopularCard(context: Context, materia: Materia) {
        setCardBack( ContextCompat.getColor(context, materia.cor) )
        setMateriaDrawable(
            ContextCompat.getDrawable(context, materia.imgSimbolo)
        )
        setProfessorText(
            resources.getString(materia.professor),
            if (materia.isPreto)
                ContextCompat.getColor(context, R.color.colorPrt)
            else
                ContextCompat.getColor(context, R.color.colorBnc)
        )
        setProgressoText(
            resources.getString(
                R.string.resultado_pontos,
                materia.pontos.toString()
            ),
            if (materia.isPreto)
                ContextCompat.getColor(context, R.color.colorPrt)
            else
                ContextCompat.getColor(context, R.color.colorBnc)
        )
        setMateriaText(
            resources.getString(materia.nome),
            if (materia.isPreto)
                ContextCompat.getColor(context, R.color.colorPrt)
            else
                ContextCompat.getColor(context, R.color.colorBnc)
        )
    }

    fun getProfessorText(): CharSequence? {
        return professorTextView?.text
    }

    fun setProfessorText(value: CharSequence?, color: Int) {
        professorTextView?.text = value
        professorTextView?.setTextColor(color)
    }

    fun getProgressoText(): CharSequence? {
        return progressoTextView?.text
    }

    fun setProgressoText(value: CharSequence?, color: Int) {
        progressoTextView?.text = value
        progressoTextView?.setTextColor(color)
    }

    fun getMateriaText(): CharSequence? {
        return materiaTextView?.text
    }

    fun setMateriaText(value: CharSequence?, color: Int) {
        materiaTextView?.text = value
        materiaTextView?.setTextColor(color)
    }

    fun setMateriaDrawable(value: Drawable?) {
        layoutMae?.background = value
    }

    fun setCardBack(value: Int) {
        cardMae.setBackgroundColor(value)
    }
}