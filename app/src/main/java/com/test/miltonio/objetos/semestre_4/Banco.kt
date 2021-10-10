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
            ),
            Pergunta(
                R.string.sem4_bdd_p6, 1,33,
                mutableListOf(
                    Resposta(R.string.sem4_bdd_p6r1, true, R.string.sem4_bdd_p6),
                    Resposta(R.string.sem4_bdd_p6r2, false, R.string.sem4_bdd_p6),
                    Resposta(R.string.sem4_bdd_p6r3, false, R.string.sem4_bdd_p6)
                )
            ),
            Pergunta(
                R.string.sem4_bdd_p7, 1,33,
                mutableListOf(
                    Resposta(R.string.sem4_bdd_p7r1, true, R.string.sem4_bdd_p7),
                    Resposta(R.string.sem4_bdd_p7r2, false, R.string.sem4_bdd_p7),
                    Resposta(R.string.sem4_bdd_p7r3, false, R.string.sem4_bdd_p7)
                )
            ),
            Pergunta(
                R.string.sem4_bdd_p8, 1,33,
                mutableListOf(
                    Resposta(R.string.sem4_bdd_p8r1, true, R.string.sem4_bdd_p8),
                    Resposta(R.string.sem4_bdd_p8r2, false, R.string.sem4_bdd_p8),
                    Resposta(R.string.sem4_bdd_p8r3, false, R.string.sem4_bdd_p8)
                )
            ),
            Pergunta(
                R.string.sem4_bdd_p9, 1,33,
                mutableListOf(
                    Resposta(R.string.sem4_bdd_p9r1, true, R.string.sem4_bdd_p9),
                    Resposta(R.string.sem4_bdd_p9r2, false, R.string.sem4_bdd_p9),
                    Resposta(R.string.sem4_bdd_p9r3, false, R.string.sem4_bdd_p9)
                )
            ),
            Pergunta(
                R.string.sem4_bdd_p10, 1,33,
                mutableListOf(
                    Resposta(R.string.sem4_bdd_p10r1, true, R.string.sem4_bdd_p10),
                    Resposta(R.string.sem4_bdd_p10r2, false, R.string.sem4_bdd_p10),
                    Resposta(R.string.sem4_bdd_p10r3, false, R.string.sem4_bdd_p10),
                    Resposta(R.string.sem4_bdd_p10r4, false, R.string.sem4_bdd_p10)
                )
            )
        )
    )
}
