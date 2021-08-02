package com.test.miltonio

import com.test.miltonio.datasource.MiltonDataBase
import com.test.miltonio.objetos.semestre_1.Semestre1
import com.test.miltonio.objetos.semestre_2.Semestre2
import com.test.miltonio.objetos.semestre_3.Semestre3
import com.test.miltonio.objetos.semestre_4.Semestre4
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
            this, MiltonDataBase::class.java, "miltonioDB"
        )
            .allowMainThreadQueries()
            .build()

        //populando os semestres
        val semestre1 = Semestre1()
        for (materia in semestre1.getMaterias()) {
            materiasdatabase?.MateriaDao()?.insert(materia)
            for (pergunta in materia.perguntas!!) {
                materiasdatabase?.PerguntaDao()?.insert(pergunta)
                for (resposta in pergunta.respostas) {
                    materiasdatabase?.RespostaDao()?.insert(resposta)
                }
            }
        }

        val semestre2 = Semestre2()
        for (materia in semestre2.getMaterias()) {
            materiasdatabase?.MateriaDao()?.insert(materia)
            for (pergunta in materia.perguntas!!) {
                materiasdatabase?.PerguntaDao()?.insert(pergunta)
                for (resposta in pergunta.respostas) {
                    materiasdatabase?.RespostaDao()?.insert(resposta)
                }
            }
        }

        val semestre3 = Semestre3()
        for (materia in semestre3.getMaterias()) {
            materiasdatabase?.MateriaDao()?.insert(materia)
            for (pergunta in materia.perguntas!!) {
                materiasdatabase?.PerguntaDao()?.insert(pergunta)
                for (resposta in pergunta.respostas) {
                    materiasdatabase?.RespostaDao()?.insert(resposta)
                }
            }
        }

        val semestre4 = Semestre4()
        for (materia in semestre4.getMaterias()) {
            materiasdatabase?.MateriaDao()?.insert(materia)
            for (pergunta in materia.perguntas!!) {
                materiasdatabase?.PerguntaDao()?.insert(pergunta)
                for (resposta in pergunta.respostas) {
                    materiasdatabase?.RespostaDao()?.insert(resposta)
                }
            }
        }
    }
}
