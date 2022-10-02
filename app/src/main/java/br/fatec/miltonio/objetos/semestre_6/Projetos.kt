package br.fatec.miltonio.objetos.semestre_6

import br.fatec.miltonio.R
import br.fatec.miltonio.modelo.Materia
import br.fatec.miltonio.modelo.Pergunta
import br.fatec.miltonio.modelo.Resposta

class Projetos {
    val materia = Materia(
        50,
        R.string.categ_sem6_gpj,
        R.string.categ_sem6_gpj_prof,
        6,
        0,
        R.color.colorRoxo,
        R.drawable.simb3es2,
        R.drawable.fnd2es1,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem6_gpj_p1, 1,50,
                mutableListOf(
                    Resposta(R.string.sem6_gpj_p1r1, true, R.string.sem6_gpj_p1),
                    Resposta(R.string.sem6_gpj_p1r2, false, R.string.sem6_gpj_p1),
                    Resposta(R.string.sem6_gpj_p1r3, false, R.string.sem6_gpj_p1),
                    Resposta(R.string.sem6_gpj_p1r4, false, R.string.sem6_gpj_p1),
                )
            )
        )
    )
}
