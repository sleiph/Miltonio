package com.test.miltonio.objetos.semestre_5

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class LabRedes {
    val materia = Materia(
        46,
        R.string.categ_sem5_prc,
        R.string.categ_sem5_prc_prof,
        5,
        0,
        R.color.colorCyan,
        R.drawable.simb3eap,
        R.drawable.fnd3eap,
        true,
        mutableListOf(
            Pergunta(
                R.string.sem5_prc_p1, 1,46,
                mutableListOf(
                    Resposta(R.string.sem5_prc_p1r1, true, R.string.sem5_prc_p1),
                    Resposta(R.string.sem5_prc_p1r2, false, R.string.sem5_prc_p1),
                    Resposta(R.string.sem5_prc_p1r3, false, R.string.sem5_prc_p1),
                    Resposta(R.string.sem5_prc_p1r4, false, R.string.sem5_prc_p1)
                )
            )
        )
    )
}
