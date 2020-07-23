package com.test.miltonio

import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    private fun loadRespostas(){
        val intent = Intent(this, tela_respostas::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardAdm = findViewById<CardView>(R.id.CardViewAdm)
        val cardAlg = findViewById<CardView>(R.id.CardViewAlg)
        val cardAoc = findViewById<CardView>(R.id.CardViewAoc)
        val cardEng = findViewById<CardView>(R.id.CardViewEng)
        val cardLhw = findViewById<CardView>(R.id.CardViewLhw)
        val cardMat = findViewById<CardView>(R.id.CardViewMat)
        val cardPrg = findViewById<CardView>(R.id.CardViewPrg)

        cardAdm.setOnClickListener {
            loadRespostas()
        }
        cardAlg.setOnClickListener {
            loadRespostas()
        }
        cardAoc.setOnClickListener {
            loadRespostas()
        }
        cardEng.setOnClickListener {
            loadRespostas()
        }
        cardLhw.setOnClickListener {
            loadRespostas()
        }
        cardMat.setOnClickListener {
            loadRespostas()
        }
        cardPrg.setOnClickListener {
            loadRespostas()
        }

        //val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        // val appBarConfiguration = AppBarConfiguration(setOf(
        //         R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        // setupActionBarWithNavController(navController, appBarConfiguration)
    }
}