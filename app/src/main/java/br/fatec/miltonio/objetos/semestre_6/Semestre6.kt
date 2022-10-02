package br.fatec.miltonio.objetos.semestre_6

import br.fatec.miltonio.R
import br.fatec.miltonio.modelo.Materia
import br.fatec.miltonio.objetos.semestre_4.Engenharia
import br.fatec.miltonio.objetos.semestre_4.ProgMov

class Semestre6 {
    val imagemHeader = R.drawable.appsomilton

    fun getMaterias() :Array<Materia> {
        return arrayOf(
            Projetos().materia,
            ProgMov().materia,
            Empreendedorismo().materia,
            Etica().materia,
            Governanca().materia,
            LabRedes().materia,
            Engenharia().materia,
            InteligenciaArtificial().materia,
            Ingles().materia,
            Equipes().materia
        )
    }
}