package com.test.miltonio.objetos.semestre_5

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class SegInfo {
    val materia = Materia(
        48,
        R.string.categ_sem5_sgi,
        R.string.categ_sem5_sgi_prof,
        5,
        0,
        R.color.colorRosa,
        R.drawable.simb3so1,
        R.drawable.fnd3so1,
        true,
        mutableListOf(
            Pergunta(
                R.string.sem5_sgi_p1, 1,48,
                mutableListOf(
                    Resposta(R.string.sem5_sgi_p1r1, true, R.string.sem5_sgi_p1),
                    Resposta(R.string.sem5_sgi_p1r2, false, R.string.sem5_sgi_p1),
                    Resposta(R.string.sem5_sgi_p1r3, false, R.string.sem5_sgi_p1),
                    Resposta(R.string.sem5_sgi_p1r4, false, R.string.sem5_sgi_p1),
                    Resposta(R.string.sem5_sgi_p1r5, false, R.string.sem5_sgi_p1),
                    Resposta(R.string.sem5_sgi_p1r6, false, R.string.sem5_sgi_p1)
                )
            )
        )
    )
}
