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
        R.drawable.simb4mpc,
        R.drawable.fnd4mpc,
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
            ),
            Pergunta(
                R.string.sem4_mpc_p2, 1,35,
                mutableListOf(
                    Resposta(R.string.sem4_mpc_p2r1, true, R.string.sem4_mpc_p2),
                    Resposta(R.string.sem4_mpc_p2r2, false, R.string.sem4_mpc_p2),
                    Resposta(R.string.sem4_mpc_p2r3, false, R.string.sem4_mpc_p2),
                    Resposta(R.string.sem4_mpc_p2r4, false, R.string.sem4_mpc_p2)
                )
            ),
            Pergunta(
                R.string.sem4_mpc_p3, 1,35,
                mutableListOf(
                    Resposta(R.string.sem4_mpc_p3r1, true, R.string.sem4_mpc_p3),
                    Resposta(R.string.sem4_mpc_p3r2, false, R.string.sem4_mpc_p3),
                    Resposta(R.string.sem4_mpc_p3r3, false, R.string.sem4_mpc_p3),
                    Resposta(R.string.sem4_mpc_p3r4, false, R.string.sem4_mpc_p3)
                )
            )
        )
    )
}
