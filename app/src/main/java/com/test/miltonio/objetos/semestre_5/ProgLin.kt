package com.test.miltonio.objetos.semestre_5

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class ProgLin {
    val materia = Materia(
        49,
        R.string.categ_sem5_pli,
        R.string.categ_sem5_pli_prof,
        5,
        0,
        R.color.colorCyan,
        R.drawable.simb1mat,
        R.drawable.fnd1mat,
        true,
        mutableListOf(
            Pergunta(
                R.string.sem5_pli_p1, 1,49,
                mutableListOf(
                    Resposta(R.string.sem5_pli_p1r1, true, R.string.sem5_pli_p1),
                    Resposta(R.string.sem5_pli_p1r2, false, R.string.sem5_pli_p1),
                    Resposta(R.string.sem5_pli_p1r3, false, R.string.sem5_pli_p1),
                    Resposta(R.string.sem5_pli_p1r4, false, R.string.sem5_pli_p1)
                )
            )
        )
    )
}
