package com.test.miltonio.objetos.semestre_1

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia

class Semestre1 {

    val imagemHeader = R.drawable.appsomilton

    fun getMaterias() :Array<Materia> {
        return arrayOf(
            Matematica().materia,
            Algorismos().materia,
            Ingles().materia,
            Arquitetura().materia,
            Hardware().materia,
            Administracao().materia,
            Programacao().materia
        )
    }

}