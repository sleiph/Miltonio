package com.test.miltonio.objetos.semestre_6

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class LabRedes {
    val materia = Materia(
        54,
        R.string.categ_sem6_lrd,
        R.string.categ_sem6_lrd_prof,
        6,
        0,
        R.color.colorCyan,
        R.drawable.simb3eap,
        R.drawable.fnd3eap,
        true,
        mutableListOf(
            Pergunta(
                R.string.sem6_lrd_p1, 1,54,
                mutableListOf(
                    Resposta(R.string.sem6_lrd_p1r1, true, R.string.sem6_lrd_p1),
                    Resposta(R.string.sem6_lrd_p1r2, false, R.string.sem6_lrd_p1),
                    Resposta(R.string.sem6_lrd_p1r3, false, R.string.sem6_lrd_p1),
                    Resposta(R.string.sem6_lrd_p1r4, false, R.string.sem6_lrd_p1)
                )
            )
        )
    )
}