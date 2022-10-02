package br.fatec.miltonio.objetos.semestre_3

import br.fatec.miltonio.R
import br.fatec.miltonio.modelo.Materia

class Semestre3 {

    val imagemHeader = R.drawable.appsomascara

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