package com.test.miltonio.objetos.semestre_4

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class ProgObj {
    val materia = Materia(
        32,
        R.string.categ_sem4_poo,
        R.string.categ_sem4_poo_prof,
        4,
        0,
        R.color.colorVerdEsc,
        R.drawable.simb2lnp,
        R.drawable.fnd2lnp,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem4_poo_p1, 1,32,
                mutableListOf(
                    Resposta(R.string.sem4_poo_p1r1, true, R.string.sem4_poo_p1),
                    Resposta(R.string.sem4_poo_p1r2, false, R.string.sem4_poo_p1)
                )
            ),
            Pergunta(
                R.string.sem4_poo_p2, 1,32,
                mutableListOf(
                    Resposta(R.string.sem4_poo_p2r1, true, R.string.sem4_poo_p2),
                    Resposta(R.string.sem4_poo_p2r2, false, R.string.sem4_poo_p2),
                    Resposta(R.string.sem4_poo_p2r3, false, R.string.sem4_poo_p2),
                    Resposta(R.string.sem4_poo_p2r4, false, R.string.sem4_poo_p2)
                )
            ),
            Pergunta(
                R.string.sem4_poo_p3, 1,32,
                mutableListOf(
                    Resposta(R.string.sem4_poo_p3r1, true, R.string.sem4_poo_p3),
                    Resposta(R.string.sem4_poo_p3r2, false, R.string.sem4_poo_p3),
                    Resposta(R.string.sem4_poo_p3r3, false, R.string.sem4_poo_p3),
                    Resposta(R.string.sem4_poo_p3r4, false, R.string.sem4_poo_p3),
                    Resposta(R.string.sem4_poo_p3r5, false, R.string.sem4_poo_p3),
                    Resposta(R.string.sem4_poo_p3r6, false, R.string.sem4_poo_p3)
                )
            ),
            Pergunta(
                R.string.sem4_poo_p4, 1,32,
                mutableListOf(
                    Resposta(R.string.sem4_poo_p4r1, true, R.string.sem4_poo_p4),
                    Resposta(R.string.sem4_poo_p4r2, false, R.string.sem4_poo_p4),
                    Resposta(R.string.sem4_poo_p4r3, false, R.string.sem4_poo_p4),
                    Resposta(R.string.sem4_poo_p4r4, false, R.string.sem4_poo_p4)
                )
            ),
            Pergunta(
                R.string.sem4_poo_p5, 1,32,
                mutableListOf(
                    Resposta(R.string.sem4_poo_p5r1, true, R.string.sem4_poo_p5),
                    Resposta(R.string.sem4_poo_p5r2, false, R.string.sem4_poo_p5),
                    Resposta(R.string.sem4_poo_p5r3, false, R.string.sem4_poo_p5),
                    Resposta(R.string.sem4_poo_p5r4, false, R.string.sem4_poo_p5)
                )
            ),
            Pergunta(
                R.string.sem4_poo_p6, 1,32,
                mutableListOf(
                    Resposta(R.string.sem4_poo_p6r1, true, R.string.sem4_poo_p6),
                    Resposta(R.string.sem4_poo_p6r2, false, R.string.sem4_poo_p6),
                    Resposta(R.string.sem4_poo_p6r3, false, R.string.sem4_poo_p6),
                    Resposta(R.string.sem4_poo_p6r4, false, R.string.sem4_poo_p6)
                )
            ),
            Pergunta(
                R.string.sem4_poo_p7, 1,32,
                mutableListOf(
                    Resposta(R.string.sem4_poo_p7r1, true, R.string.sem4_poo_p7),
                    Resposta(R.string.sem4_poo_p7r2, false, R.string.sem4_poo_p7),
                    Resposta(R.string.sem4_poo_p7r3, false, R.string.sem4_poo_p7),
                    Resposta(R.string.sem4_poo_p7r4, false, R.string.sem4_poo_p7)
                )
            )
        )
    )
}
