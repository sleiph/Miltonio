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

        val semestre1materias = Semestre1()
        for (materia in semestre1materias.getMaterias())
            materiasdatabase?.MateriaDao()?.insert(materia)

        val semestre2materias = Semestre2()
        for (materia in semestre2materias.getMaterias())
            materiasdatabase?.MateriaDao()?.insert(materia)

        val semestre3materias = Semestre3()
        for (materia in semestre3materias.getMaterias())
            materiasdatabase?.MateriaDao()?.insert(materia)
    }
}
