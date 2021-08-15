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
        R.drawable.simb4bdd,
        R.drawable.fnd4bdd,
        true,
        mutableListOf(
            Pergunta(
                R.string.sem4_bdd_p1, 1,33,
                mutableListOf(
                    Resposta(R.string.sem4_bdd_p1r1, true, R.string.sem4_bdd_p1),
                    Resposta(R.string.sem4_bdd_p1r2, false, R.string.sem4_bdd_p1),
                    Resposta(R.string.sem4_bdd_p1r3, false, R.string.sem4_bdd_p1)
                )
            ),
            Pergunta(
                R.string.sem4_bdd_p2, 1,33,
                mutableListOf(
                    Resposta(R.string.sem4_bdd_p2r1, true, R.string.sem4_bdd_p2),
                    Resposta(R.string.sem4_bdd_p2r2, false, R.string.sem4_bdd_p2)
                )
            ),
            Pergunta(
                R.string.sem4_bdd_p3, 1,33,
                mutableListOf(
                    Resposta(R.string.sem4_bdd_p3r1, true, R.string.sem4_bdd_p3),
                    Resposta(R.string.sem4_bdd_p3r2, false, R.string.sem4_bdd_p3),
                    Resposta(R.string.sem4_bdd_p3r3, false, R.string.sem4_bdd_p3)
                )
            ),
            Pergunta(
                R.string.sem4_bdd_p4, 1,33,
                mutableListOf(
                    Resposta(R.string.sem4_bdd_p4r1, true, R.string.sem4_bdd_p4),
                    Resposta(R.string.sem4_bdd_p4r2, false, R.string.sem4_bdd_p4),
                    Resposta(R.string.sem4_bdd_p4r3, false, R.string.sem4_bdd_p4)
                )
            ),
            Pergunta(
                R.string.sem4_bdd_p5, 1,33,
                mutableListOf(
                    Resposta(R.string.sem4_bdd_p5r1, true, R.string.sem4_bdd_p5),
                    Resposta(R.string.sem4_bdd_p5r2, false, R.string.sem4_bdd_p5),
                    Resposta(R.string.sem4_bdd_p5r3, false, R.string.sem4_bdd_p5)
                )
            )
        )
    )
}
