package br.fatec.miltonio.objetos.semestre_4

import br.fatec.miltonio.R
import br.fatec.miltonio.modelo.Materia

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
