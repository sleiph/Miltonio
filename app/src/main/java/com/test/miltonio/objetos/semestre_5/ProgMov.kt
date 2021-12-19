package com.test.miltonio.objetos.semestre_5

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class ProgMov {
    val materia = Materia(
        41,
        R.string.categ_sem5_pdm,
        R.string.categ_sem5_pdm_prof,
        5,
        0,
        R.color.colorLrnj,
        R.drawable.simb4pdm,
        R.drawable.fnd4pdm,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem5_pdm_p1, 1,41,
                mutableListOf(
                    Resposta(R.string.sem5_pdm_p1r1, true, R.string.sem5_pdm_p1),
                    Resposta(R.string.sem5_pdm_p1r2, false, R.string.sem5_pdm_p1),
                    Resposta(R.string.sem5_pdm_p1r3, false, R.string.sem5_pdm_p1),
                    Resposta(R.string.sem5_pdm_p1r4, false, R.string.sem5_pdm_p1)
                )
            )
        )
    )
}
