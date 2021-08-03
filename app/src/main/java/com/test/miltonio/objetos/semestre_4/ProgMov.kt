package com.test.miltonio.objetos.semestre_4

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class ProgMov {
    val materia = Materia(
        31,
        R.string.categ_sem4_pdm,
        R.string.categ_sem4_pdm_prof,
        4,
        0,
        R.color.colorLrnj,
        R.drawable.simb4pdm,
        R.drawable.fnd4pdm,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem4_pdm_p1, 1,31,
                mutableListOf(
                    Resposta(R.string.sem4_pdm_p1r1, true, R.string.sem4_pdm_p1),
                    Resposta(R.string.sem4_pdm_p1r2, false, R.string.sem4_pdm_p1),
                    Resposta(R.string.sem4_pdm_p1r3, false, R.string.sem4_pdm_p1),
                    Resposta(R.string.sem4_pdm_p1r4, false, R.string.sem4_pdm_p1)
                )
            )
        )
    )
}
