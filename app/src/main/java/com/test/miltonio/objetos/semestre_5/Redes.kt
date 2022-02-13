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
            )
        )
    )
}
