package com.test.miltonio.objetos.semestre_5

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class Redes {
    val materia = Materia(
        43,
        R.string.categ_sem5_rds,
        R.string.categ_sem5_rds_prof,
        5,
        0,
        R.color.colorAzul,
        R.drawable.simb3ihc,
        R.drawable.fnd3ihc,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem5_rds_p1, 1,43,
                mutableListOf(
                    Resposta(R.string.sem5_rds_p1r1, true, R.string.sem5_rds_p1),
                    Resposta(R.string.sem5_rds_p1r2, false, R.string.sem5_rds_p1),
                    Resposta(R.string.sem5_rds_p1r3, false, R.string.sem5_rds_p1),
                    Resposta(R.string.sem5_rds_p1r4, false, R.string.sem5_rds_p1)
                )
            ),
            Pergunta(
                R.string.sem5_rds_p2, 1,43,
                mutableListOf(
                    Resposta(R.string.sem5_rds_p2r1, true, R.string.sem5_rds_p2),
                    Resposta(R.string.sem5_rds_p2r2, false, R.string.sem5_rds_p2),
                    Resposta(R.string.sem5_rds_p2r3, false, R.string.sem5_rds_p2),
                    Resposta(R.string.sem5_rds_p2r4, false, R.string.sem5_rds_p2)
                )
            ),
            Pergunta(
                R.string.sem5_rds_p3, 1,43,
                mutableListOf(
                    Resposta(R.string.sem5_rds_p3r1, true, R.string.sem5_rds_p3),
                    Resposta(R.string.sem5_rds_p3r2, false, R.string.sem5_rds_p3),
                    Resposta(R.string.sem5_rds_p3r3, false, R.string.sem5_rds_p3),
                    Resposta(R.string.sem5_rds_p3r4, false, R.string.sem5_rds_p3)
                )
            ),
            Pergunta(
                R.string.sem5_rds_p4, 1,43,
                mutableListOf(
                    Resposta(R.string.sem5_rds_p4r1, true, R.string.sem5_rds_p4),
                    Resposta(R.string.sem5_rds_p4r2, false, R.string.sem5_rds_p4),
                    Resposta(R.string.sem5_rds_p4r3, false, R.string.sem5_rds_p4),
                    Resposta(R.string.sem5_rds_p4r4, false, R.string.sem5_rds_p4)
                )
            ),
            Pergunta(
                R.string.sem5_rds_p5, 1,43,
                mutableListOf(
                    Resposta(R.string.sem5_rds_p5r1, true, R.string.sem5_rds_p5),
                    Resposta(R.string.sem5_rds_p5r2, false, R.string.sem5_rds_p5),
                    Resposta(R.string.sem5_rds_p5r3, false, R.string.sem5_rds_p5),
                    Resposta(R.string.sem5_rds_p5r4, false, R.string.sem5_rds_p5)
                )
            ),
            Pergunta(
                R.string.sem5_rds_p6, 1,43,
                mutableListOf(
                    Resposta(R.string.sem5_rds_p6r1, true, R.string.sem5_rds_p6),
                    Resposta(R.string.sem5_rds_p6r2, false, R.string.sem5_rds_p6),
                    Resposta(R.string.sem5_rds_p6r3, false, R.string.sem5_rds_p6),
                    Resposta(R.string.sem5_rds_p6r4, false, R.string.sem5_rds_p6)
                )
            ),
            Pergunta(
                R.string.sem5_rds_p7, 1,43,
                mutableListOf(
                    Resposta(R.string.sem5_rds_p7r1, true, R.string.sem5_rds_p7),
                    Resposta(R.string.sem5_rds_p7r2, false, R.string.sem5_rds_p7),
                    Resposta(R.string.sem5_rds_p7r3, false, R.string.sem5_rds_p7),
                    Resposta(R.string.sem5_rds_p7r4, false, R.string.sem5_rds_p7)
                )
            )
        )
    )
}
