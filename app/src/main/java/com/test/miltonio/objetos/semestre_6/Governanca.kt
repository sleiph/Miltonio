package com.test.miltonio.objetos.semestre_6

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class Governanca {
    val materia = Materia(
        53,
        R.string.categ_sem6_ggt,
        R.string.categ_sem6_ggt_prof,
        6,
        0,
        R.color.colorAzul,
        R.drawable.simb3eap,
        R.drawable.fnd3eap,
        true,
        mutableListOf(
            Pergunta(
                R.string.sem6_ggt_p1, 1,53,
                mutableListOf(
                    Resposta(R.string.sem6_ggt_p1r1, true, R.string.sem6_ggt_p1),
                    Resposta(R.string.sem6_ggt_p1r2, false, R.string.sem6_ggt_p1),
                    Resposta(R.string.sem6_ggt_p1r3, false, R.string.sem6_ggt_p1),
                    Resposta(R.string.sem6_ggt_p1r4, false, R.string.sem6_ggt_p1)
                )
            )
        )
    )
}