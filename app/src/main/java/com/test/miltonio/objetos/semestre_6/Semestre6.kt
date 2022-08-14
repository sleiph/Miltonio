package com.test.miltonio.objetos.semestre_6

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.objetos.semestre_4.Engenharia
import com.test.miltonio.objetos.semestre_4.ProgMov

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