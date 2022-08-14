package com.test.miltonio.objetos.semestre_6

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class Etica {
    val materia = Materia(
        52,
        R.string.categ_sem6_erp,
        R.string.categ_sem6_erp_prof,
        6,
        0,
        R.color.colorRosa,
        R.drawable.simb2com,
        R.drawable.fnd2com,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem6_erp_p1, 1,52,
                mutableListOf(
                    Resposta(R.string.sem6_erp_p1r1, true, R.string.sem6_erp_p1),
                    Resposta(R.string.sem6_erp_p1r2, false, R.string.sem6_erp_p1),
                    Resposta(R.string.sem6_erp_p1r3, false, R.string.sem6_erp_p1),
                    Resposta(R.string.sem6_erp_p1r4, false, R.string.sem6_erp_p1)
                )
            )
        )
    )
}