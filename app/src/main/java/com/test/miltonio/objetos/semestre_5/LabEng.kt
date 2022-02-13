package com.test.miltonio.objetos.semestre_5

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class LabEng {
    val materia = Materia(
        45,
        R.string.categ_sem5_les,
        R.string.categ_sem5_les_prof,
        5,
        0,
        R.color.colorVerdEsc,
        R.drawable.simb3esd,
        R.drawable.fnd3esd,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem5_les_p1, 1,45,
                mutableListOf(
                    Resposta(R.string.sem5_les_p1r1, true, R.string.sem5_les_p1),
                    Resposta(R.string.sem5_les_p1r2, false, R.string.sem5_les_p1),
                    Resposta(R.string.sem5_les_p1r3, false, R.string.sem5_les_p1),
                    Resposta(R.string.sem5_les_p1r4, false, R.string.sem5_les_p1)
                )
            )
        )
    )
}
