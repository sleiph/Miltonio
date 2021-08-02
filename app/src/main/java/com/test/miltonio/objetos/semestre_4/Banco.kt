package com.test.miltonio.objetos.semestre_4

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class Banco {
    val materia = Materia(
        33,
        R.string.categ_sem4_bdd,
        R.string.categ_sem4_bdd_prof,
        4,
        0,
        R.color.colorAmrl,
        R.drawable.simb1lhw,
        R.drawable.fnd1lhw,
        true,
        mutableListOf(
            Pergunta(
                R.string.sem4_bdd_p1, 1,33,
                mutableListOf(
                    Resposta(R.string.sem4_bdd_p1r1, true, R.string.sem4_bdd_p1),
                    Resposta(R.string.sem4_bdd_p1r2, false, R.string.sem4_bdd_p1),
                    Resposta(R.string.sem4_bdd_p1r3, false, R.string.sem4_bdd_p1),
                    Resposta(R.string.sem4_bdd_p1r4, false, R.string.sem4_bdd_p1)
                )
            )
        )
    )
}
