package com.test.miltonio.objetos.semestre_5

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class SisDist {
    val materia = Materia(
        47,
        R.string.categ_sem5_sdt,
        R.string.categ_sem5_sdt_prof,
        5,
        0,
        R.color.colorAmrl,
        R.drawable.simb4bdd,
        R.drawable.fnd4bdd,
        true,
        mutableListOf(
            Pergunta(
                R.string.sem5_sdt_p1, 1,47,
                mutableListOf(
                    Resposta(R.string.sem5_sdt_p1r1, true, R.string.sem5_sdt_p1),
                    Resposta(R.string.sem5_sdt_p1r2, false, R.string.sem5_sdt_p1),
                    Resposta(R.string.sem5_sdt_p1r3, false, R.string.sem5_sdt_p1),
                    Resposta(R.string.sem5_sdt_p1r4, false, R.string.sem5_sdt_p1)
                )
            )
        )
    )
}