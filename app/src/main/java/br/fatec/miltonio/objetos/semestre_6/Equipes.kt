package br.fatec.miltonio.objetos.semestre_6

import br.fatec.miltonio.R
import br.fatec.miltonio.modelo.Materia
import br.fatec.miltonio.modelo.Pergunta
import br.fatec.miltonio.modelo.Resposta

class Equipes {
    val materia = Materia(
        57,
        R.string.categ_sem6_geq,
        R.string.categ_sem6_geq_prof,
        6,
        0,
        R.color.colorMagt,
        R.drawable.simbeng,
        R.drawable.fndeng,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem6_geq_p1, 1,57,
                mutableListOf(
                    Resposta(R.string.sem6_geq_p1r1, true, R.string.sem6_geq_p1),
                    Resposta(R.string.sem6_geq_p1r2, false, R.string.sem6_geq_p1),
                    Resposta(R.string.sem6_geq_p1r3, false, R.string.sem6_geq_p1),
                    Resposta(R.string.sem6_geq_p1r4, false, R.string.sem6_geq_p1)
                )
            )
        )
    )
}