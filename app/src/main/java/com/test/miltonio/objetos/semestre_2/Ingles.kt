package com.test.miltonio.objetos.semestre_2

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class Ingles {
    val materia = Materia(
        12,
        R.string.categ_sem2_eng,
        R.string.categ_sem2_eng_prof,
        2,
        0,
        R.color.colorMagt,
        R.drawable.simbeng,
        R.drawable.fndeng,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem2_eng_p1, 1,12,
                mutableListOf(
                    Resposta(R.string.sem2_eng_p1r1, true, R.string.sem2_eng_p1),
                    Resposta(R.string.sem2_eng_p1r2, false, R.string.sem2_eng_p1)
                )
            ),
            Pergunta(
                R.string.sem2_eng_p2, 1,12,
                mutableListOf(
                    Resposta(R.string.sem2_eng_p2r1, true, R.string.sem2_eng_p2),
                    Resposta(R.string.sem2_eng_p2r2, false, R.string.sem2_eng_p2)
                )
            ),
            Pergunta(
                R.string.sem2_eng_p3, 1,12,
                mutableListOf(
                    Resposta(R.string.sem2_eng_p3r1, true, R.string.sem2_eng_p3),
                    Resposta(R.string.sem2_eng_p3r2, false, R.string.sem2_eng_p3)
                )
            ),
            Pergunta(
                R.string.sem2_eng_p4, 1,12,
                mutableListOf(
                    Resposta(R.string.sem2_eng_p4r1, true, R.string.sem2_eng_p4),
                    Resposta(R.string.sem2_eng_p4r2, false, R.string.sem2_eng_p4)
                )
            ),
            Pergunta(
                R.string.sem2_eng_p5, 1,12,
                mutableListOf(
                    Resposta(R.string.sem2_eng_p5r1, true, R.string.sem2_eng_p5),
                    Resposta(R.string.sem2_eng_p5r2, false, R.string.sem2_eng_p5),
                    Resposta(R.string.sem2_eng_p5r3, false, R.string.sem2_eng_p5),
                    Resposta(R.string.sem2_eng_p5r4, false, R.string.sem2_eng_p5)
                )
            ),
            Pergunta(
                R.string.sem2_eng_p6, 1,12,
                mutableListOf(
                    Resposta(R.string.sem2_eng_p6r1, true, R.string.sem2_eng_p6),
                    Resposta(R.string.sem2_eng_p6r2, false, R.string.sem2_eng_p6),
                    Resposta(R.string.sem2_eng_p6r3, false, R.string.sem2_eng_p6),
                    Resposta(R.string.sem2_eng_p6r4, false, R.string.sem2_eng_p6)
                )
            ),
            Pergunta(
                R.string.sem2_eng_p7, 1,12,
                mutableListOf(
                    Resposta(R.string.sem2_eng_p7r1, true, R.string.sem2_eng_p7),
                    Resposta(R.string.sem2_eng_p7r2, false, R.string.sem2_eng_p7),
                    Resposta(R.string.sem2_eng_p7r3, false, R.string.sem2_eng_p7),
                    Resposta(R.string.sem2_eng_p7r4, false, R.string.sem2_eng_p7)
                )
            )
        )
    )
}
