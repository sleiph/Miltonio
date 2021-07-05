package com.test.miltonio

import com.test.miltonio.datasource.MiltonDataBase
import com.test.miltonio.objetos.Semestre1
import com.test.miltonio.objetos.Semestre2
import com.test.miltonio.objetos.Semestre3
import android.app.Application
import androidx.room.*

class MyApplication: Application() {

    companion object {
        var materiasdatabase: MiltonDataBase? = null

    }

    override fun onCreate() {
        super.onCreate()
        //Room
        materiasdatabase = Room.databaseBuilder(
            this, MiltonDataBase::class.java, "miltonDB"
        )
            .allowMainThreadQueries()
            .build()

        //populando os semestres
        val semestre1 = Semestre1()
        for (materia in semestre1.getMaterias())
            materiasdatabase?.MateriaDao()?.insert(materia)

        materiasdatabase?.MateriaDao()?.insert(semestre1.mat.materia)
        for (pergunta in semestre1.mat.perguntas) {
            materiasdatabase?.PerguntaDao()?.insert(pergunta.descricao)
            for (resposta in pergunta.respostas) {
                materiasdatabase?.RespostaDao()?.insert(resposta)
            }
        }

        val semestre2 = Semestre2()
        for (materia in semestre2.getMaterias())
            materiasdatabase?.MateriaDao()?.insert(materia)

        val semestre3 = Semestre3()
        for (materia in semestre3.getMaterias())
            materiasdatabase?.MateriaDao()?.insert(materia)
    }
}
