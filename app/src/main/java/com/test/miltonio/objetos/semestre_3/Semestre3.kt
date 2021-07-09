package com.test.miltonio.objetos.semestre_3

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia

class Semestre3 {

    val imagemHeader = R.drawable.appsocoronga

    fun getMaterias() : Array<Materia> {
        return arrayOf(
            Dados().materia,
            Sociedade().materia,
            Engenharia().materia,
            Estatistica().materia,
            Economia().materia,
            Ingles().materia,
            Interacao().materia,
            SistOp().materia
        )
    }

}