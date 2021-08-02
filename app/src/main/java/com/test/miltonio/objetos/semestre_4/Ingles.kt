package com.test.miltonio.objetos.semestre_4

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class Ingles {
    val materia = Materia(
        34,
        R.string.categ_sem4_eng,
        R.string.categ_sem4_eng_prof,
        4,
        0,
        R.color.colorMagt,
        R.drawable.simbeng,
        R.drawable.fndeng,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem4_eng_p1, 1,34,
                mutableListOf(
                    Resposta(R.string.sem4_eng_p1r1, true, R.string.sem4_eng_p1),
                    Resposta(R.string.sem4_eng_p1r2, false, R.string.sem4_eng_p1),
                    Resposta(R.string.sem4_eng_p1r3, false, R.string.sem4_eng_p1),
                    Resposta(R.string.sem4_eng_p1r4, false, R.string.sem4_eng_p1)
                )
            )
        )
    )
}
