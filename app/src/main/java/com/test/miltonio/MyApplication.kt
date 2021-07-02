package com.test.miltonio

import com.test.miltonio.datasource.MateriaDataBase
import com.test.miltonio.modelo.Semestre1Materias
import com.test.miltonio.modelo.Semestre2Materias
import com.test.miltonio.modelo.Semestre3Materias
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
            this, MateriaDataBase::class.java, "materias"
        )
            .allowMainThreadQueries()
            .build()

        var semestre1materias = Semestre1Materias()
        for (materia in semestre1materias.getMaterias())
            materiasdatabase?.Sem1Dao()?.insert(materia)

        var semestre2materias = Semestre2Materias()
        for (materia in semestre2materias.getMaterias())
            materiasdatabase?.Sem2Dao()?.insert(materia)

        var semestre3materias = Semestre3Materias()
        for (materia in semestre3materias.getMaterias())
            materiasdatabase?.Sem3Dao()?.insert(materia)
    }
}
