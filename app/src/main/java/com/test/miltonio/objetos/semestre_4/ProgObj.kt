package com.test.miltonio.objetos.semestre_4

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class ProgObj {
    val materia = Materia(
        32,
        R.string.categ_sem4_poo,
        R.string.categ_sem4_poo_prof,
        4,
        0,
        R.color.colorVerdEsc,
        R.drawable.simb2lnp,
        R.drawable.fnd2lnp,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem4_poo_p1, 1,32,
                mutableListOf(
                    Resposta(R.string.sem4_poo_p1r1, true, R.string.sem4_poo_p1),
                    Resposta(R.string.sem4_poo_p1r2, false, R.string.sem4_poo_p1),
                    Resposta(R.string.sem4_poo_p1r3, false, R.string.sem4_poo_p1),
                    Resposta(R.string.sem4_poo_p1r4, false, R.string.sem4_poo_p1)
                )
            )
        )
    )
}
