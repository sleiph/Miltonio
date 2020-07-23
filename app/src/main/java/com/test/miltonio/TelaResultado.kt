package com.test.miltonio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class TelaResultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_resultado)

        fun loadMain(resul:Int){
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("resul", resul)
            startActivity(intent)
        }

        val resulIntent = intent
        val resultado = resulIntent.getIntExtra("resul", 0) * 10

    }
}