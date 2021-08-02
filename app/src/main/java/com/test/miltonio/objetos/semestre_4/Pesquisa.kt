package com.test.miltonio.objetos.semestre_4

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class Pesquisa {
    val materia = Materia(
        35,
        R.string.categ_sem4_mpc,
        R.string.categ_sem4_mpc_prof,
        4,
        0,
        R.color.colorAzul,
        R.drawable.simb1aoc,
        R.drawable.fnd1aoc,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem4_mpc_p1, 1,35,
                mutableListOf(
                    Resposta(R.string.sem4_mpc_p1r1, true, R.string.sem4_mpc_p1),
                    Resposta(R.string.sem4_mpc_p1r2, false, R.string.sem4_mpc_p1),
                    Resposta(R.string.sem4_mpc_p1r3, false, R.string.sem4_mpc_p1),
                    Resposta(R.string.sem4_mpc_p1r4, false, R.string.sem4_mpc_p1)
                )
            )
        )
    )
}
