package com.test.miltonio.objetos.semestre_2

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia

class Semestre2 {

    val imagemHeader = R.drawable.appsocoronga

    fun getMaterias() : Array<Materia> {
        return arrayOf(
            Calculo().materia,
            LingProg().materia,
            Ingles().materia,
            Contabilidade().materia,
            Sistemas().materia,
            Comunicacao().materia,
            Engenharia().materia
        )
    }

}