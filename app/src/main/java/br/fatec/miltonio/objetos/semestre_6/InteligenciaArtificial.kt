package br.fatec.miltonio.objetos.semestre_6

import br.fatec.miltonio.R
import br.fatec.miltonio.modelo.Materia
import br.fatec.miltonio.modelo.Pergunta
import br.fatec.miltonio.modelo.Resposta

class InteligenciaArtificial {
    val materia = Materia(
        55,
        R.string.categ_sem6_iia,
        R.string.categ_sem6_iia_prof,
        6,
        0,
        R.color.colorVerdEsc,
        R.drawable.simb2lnp,
        R.drawable.fnd2lnp,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem6_iia_p1, 1,55,
                mutableListOf(
                    Resposta(R.string.sem6_iia_p1r1, true, R.string.sem6_iia_p1),
                    Resposta(R.string.sem6_iia_p1r2, false, R.string.sem6_iia_p1),
                    Resposta(R.string.sem6_iia_p1r3, false, R.string.sem6_iia_p1),
                    Resposta(R.string.sem6_iia_p1r4, false, R.string.sem6_iia_p1)
                )
            )
        )
    )
}