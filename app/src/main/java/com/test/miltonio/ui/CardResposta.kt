package com.test.miltonio.ui

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.test.miltonio.R

class CardResposta : CardView {

    private var _respostaString: String? = null // TODO: use a default from R.string...

    private var respostaTextView: TextView? = null

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
        inflate(context, R.layout.sample_card_resposta, this)

        val a = context.obtainStyledAttributes(
            attrs, R.styleable.CardResposta, defStyle, 0
        )

        _respostaString = a.getString(
            R.styleable.CardResposta_respostaTxt
        )

        a.recycle()

        respostaTextView = findViewById<View>(R.id.txt_resposta) as TextView

        setRespostaText(_respostaString)
    }

    fun getRespostaText(): CharSequence? {
        return respostaTextView?.getText()
    }

    fun setRespostaText(value: CharSequence?) {
        respostaTextView?.setText(value)
    }
}