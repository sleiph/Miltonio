package com.test.miltonio.objetos.semestre_5

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia

class Semestre5 {

    val imagemHeader = R.drawable.appsomilton

    fun getMaterias() :Array<Materia> {
        return arrayOf(
            ProgMov().materia,
            Engenharia().materia,
            Ingles().materia
        )
    }
}
