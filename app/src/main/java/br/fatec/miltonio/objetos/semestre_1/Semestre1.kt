package br.fatec.miltonio.objetos.semestre_1

import br.fatec.miltonio.R
import br.fatec.miltonio.modelo.Materia

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