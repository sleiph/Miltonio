package com.test.miltonio

import com.test.miltonio.datasource.MateriaDataBase
import com.test.miltonio.modelo.Semestre1
import com.test.miltonio.modelo.Semestre2
import com.test.miltonio.modelo.Semestre3
import android.app.Application
import androidx.room.*

class MyApplication: Application() {

    companion object {
        var materiasdatabase: MateriaDataBase? = null

    }

    override fun onCreate() {
        super.onCreate()
        //Room
        materiasdatabase = Room.databaseBuilder(
            this, MateriaDataBase::class.java, "miltaoDB"
        )
            .allowMainThreadQueries()
            .build()

        //populando os semestres
        val semestre1 = Semestre1()
        for (materia in semestre1.getMaterias())
            materiasdatabase?.MateriaDao()?.insert(materia)

        val semestre2 = Semestre2()
        for (materia in semestre2.getMaterias())
            materiasdatabase?.MateriaDao()?.insert(materia)

        val semestre3 = Semestre3()
        for (materia in semestre3.getMaterias())
            materiasdatabase?.MateriaDao()?.insert(materia)
    }
}
