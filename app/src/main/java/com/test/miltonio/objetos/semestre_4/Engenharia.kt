package com.test.miltonio.objetos.semestre_4

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class Engenharia {
    val materia = Materia(
        37,
        R.string.categ_sem4_es3,
        R.string.categ_sem4_es3_prof,
        6,
        0,
        R.color.colorRoxo,
        R.drawable.simb3es2,
        R.drawable.fnd2es1,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem4_es3_p1, 1,37,
                mutableListOf(
                    Resposta(R.string.sem4_es3_p1r1, true, R.string.sem4_es3_p1),
                    Resposta(R.string.sem4_es3_p1r2, false, R.string.sem4_es3_p1),
                    Resposta(R.string.sem4_es3_p1r3, false, R.string.sem4_es3_p1),
                    Resposta(R.string.sem4_es3_p1r4, false, R.string.sem4_es3_p1)
                )
            )
        )
    )
}
