package br.fatec.miltonio.objetos.semestre_5

import br.fatec.miltonio.R
import br.fatec.miltonio.modelo.Materia

class Semestre5 {

    val imagemHeader = R.drawable.appsomilton

    fun getMaterias() :Array<Materia> {
        return arrayOf(
            Redes().materia,
            ProjRedes().materia,
            LabEng().materia,
            ProgLin().materia,
            SisDist().materia,
            SegInfo().materia,
            Ingles().materia
        )
    }
}
