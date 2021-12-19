package com.test.miltonio.objetos.semestre_5

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class Ingles {
    val materia = Materia(
        44,
        R.string.categ_sem5_eng,
        R.string.categ_sem5_eng_prof,
        5,
        0,
        R.color.colorMagt,
        R.drawable.simbeng,
        R.drawable.fndeng,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem5_eng_p1, 1,44,
                mutableListOf(
                    Resposta(R.string.sem5_eng_p1r1, true, R.string.sem5_eng_p1),
                    Resposta(R.string.sem5_eng_p1r2, false, R.string.sem5_eng_p1),
                    Resposta(R.string.sem5_eng_p1r3, false, R.string.sem5_eng_p1),
                    Resposta(R.string.sem5_eng_p1r4, false, R.string.sem5_eng_p1)
                )
            )
        )
    )
}
