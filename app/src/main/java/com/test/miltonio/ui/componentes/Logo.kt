package com.test.miltonio.ui.componentes

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.core.content.ContextCompat
import com.test.miltonio.R

class Logo : RelativeLayout {

    private val angulo: Int = 60
    private val matrixAnimo: Matrix = Matrix()
    private val matrixAnima: Matrix = Matrix()

    private var imgLogo: Int = R.drawable.appsomilton

    private var logoAnima: ImageView? = null
    private var logoAnimo: ImageView? = null

    constructor(context: Context) : super(context) {
        init(context,null, 0)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context, attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        init(context, attrs, defStyle)
    }

    private fun init(context: Context, attrs: AttributeSet?, defStyle: Int) {
        inflate(context, R.layout.sample_logo, this)
        // Load attributes
        val a = context.obtainStyledAttributes(
            attrs, R.styleable.Logo, defStyle, 0
        )

        imgLogo = R.styleable.Logo_imgLogo

        a.recycle()
        initComponents()

        //setImgLogo(imgLogo)
    }

    private fun initComponents() {
        logoAnimo = findViewById(R.id.logo_animo)
        logoAnima = findViewById(R.id.logo_anima)
    }

    fun getImgLogo(): Int {
        return imgLogo
    }

    fun setImgLogo(value: Int) {
        imgLogo = value
        setBitmap(context, logoAnima, matrixAnima)
        setBitmap(context, logoAnimo, matrixAnimo)
    }

    private fun setBitmap(context: Context, view: ImageView?, matrix: Matrix) {

        view?.setOnClickListener {
            val logoAnimoBmp = BitmapFactory.decodeResource(resources, imgLogo)
            matrix.postRotate(angulo.toFloat())
            val rodado = Bitmap.createBitmap(
                logoAnimoBmp, 0, 0, logoAnimoBmp.width, logoAnimoBmp.height,
                matrix, true
            )
            view.setImageBitmap(rodado)
        }

        view?.setImageDrawable(ContextCompat.getDrawable(context, imgLogo))
    }
}