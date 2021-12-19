package com.test.miltonio.objetos.semestre_4

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia

class Semestre4 {

    val imagemHeader = R.drawable.appsorenato

    fun getMaterias() :Array<Materia> {
        return arrayOf(
            SistOp().materia,
            ProgObj().materia,
            Banco().materia,
            Ingles().materia,
            Pesquisa().materia
        )
    }
}
