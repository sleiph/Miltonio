package br.fatec.miltonio.objetos.semestre_2

import br.fatec.miltonio.R
import br.fatec.miltonio.modelo.Materia

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