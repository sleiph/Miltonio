package com.test.miltonio.objetos.semestre_4

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class SistOp {
    val materia = Materia(
        30,
        R.string.categ_sem4_so2,
        R.string.categ_sem4_so2_prof,
        4,
        0,
        R.color.colorRosa,
        R.drawable.simb3so1,
        R.drawable.fnd3so1,
        true,
        mutableListOf(
            Pergunta(
                R.string.sem4_so2_p1, 1,30,
                mutableListOf(
                    Resposta(R.string.sem4_so2_p1r1, true, R.string.sem4_so2_p1),
                    Resposta(R.string.sem4_so2_p1r2, false, R.string.sem4_so2_p1),
                    Resposta(R.string.sem4_so2_p1r3, false, R.string.sem4_so2_p1),
                    Resposta(R.string.sem4_so2_p1r4, false, R.string.sem4_so2_p1)
                )
            )
        )
    )
}
