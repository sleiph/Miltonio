package br.fatec.miltonio.ui.componentes

import br.fatec.miltonio.R

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.TextView

import androidx.core.view.setMargins

class CardResposta : LinearLayout {

    private var _respostaString: String? = null
    private var _respostaTextColor: Int? = null
    private var respostaDrawable: Drawable? = null

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

        _respostaTextColor = a.getColor(
            R.styleable.CardResposta_respostaTextColor,
            0
        )

        if (a.hasValue(R.styleable.CardMateria_cardDrawable)) {
            respostaDrawable = a.getDrawable(
                R.styleable.CardResposta_respostaTextDrawable
            )
            respostaDrawable?.callback = this
        }

        a.recycle()

        respostaTextView = findViewById<View>(R.id.txt_resposta) as TextView

        val param = GridLayout.LayoutParams(
            GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f),
            GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f)
        )
        param.width = 0
        param.setMargins(resources.getDimension(R.dimen.margem_meia_margin).toInt())
        layoutParams = param
    }

    fun getRespostaText(): CharSequence? {
        return respostaTextView?.text
    }

    fun setRespostaText(value: CharSequence?) {
        respostaTextView?.text = value
    }

    fun setRespostaColor(value: Int) {
        this.setBackgroundColor(value)
    }

    fun setRespostaDrawable(value: Drawable?) {
        this.background = value
    }
}