package br.fatec.miltonio.objetos.semestre_2

import br.fatec.miltonio.R
import br.fatec.miltonio.modelo.Materia
import br.fatec.miltonio.modelo.Pergunta
import br.fatec.miltonio.modelo.Resposta

class Calculo {
    val materia = Materia(
        10,
        R.string.categ_sem2_cal,
        R.string.categ_sem2_cal_prof,
        2,
        0,
        R.color.colorCyan,
        R.drawable.simb1mat,
        R.drawable.fnd1mat,
        true,
        mutableListOf(
            Pergunta(
                R.string.sem2_cal_p1, 1,10,
                mutableListOf(
                    Resposta(R.string.sem2_cal_p1r1, true, R.string.sem2_cal_p1),
                    Resposta(R.string.sem2_cal_p1r2, false, R.string.sem2_cal_p1),
                    Resposta(R.string.sem2_cal_p1r3, false, R.string.sem2_cal_p1)
                )
            ),
            Pergunta(
                R.string.sem2_cal_p2, 1,10,
                mutableListOf(
                    Resposta(R.string.sem2_cal_p2r1, true, R.string.sem2_cal_p2),
                    Resposta(R.string.sem2_cal_p2r2, false, R.string.sem2_cal_p2)
                )
            ),
            Pergunta(
                R.string.sem2_cal_p3, 1,10,
                mutableListOf(
                    Resposta(R.string.sem2_cal_p3r1, true, R.string.sem2_cal_p3),
                    Resposta(R.string.sem2_cal_p3r2, false, R.string.sem2_cal_p3)
                )
            ),
            Pergunta(
                R.string.sem2_cal_p4, 1,10,
                mutableListOf(
                    Resposta(R.string.sem2_cal_p4r1, true, R.string.sem2_cal_p4),
                    Resposta(R.string.sem2_cal_p4r2, false, R.string.sem2_cal_p4),
                    Resposta(R.string.sem2_cal_p4r3, false, R.string.sem2_cal_p4),
                    Resposta(R.string.sem2_cal_p4r4, false, R.string.sem2_cal_p4)
                )
            ),
            Pergunta(
                R.string.sem2_cal_p5, 1,10,
                mutableListOf(
                    Resposta(R.string.sem2_cal_p5r1, true, R.string.sem2_cal_p5),
                    Resposta(R.string.sem2_cal_p5r2, false, R.string.sem2_cal_p5)
                )
            ),
            Pergunta(
                R.string.sem2_cal_p6, 1,10,
                mutableListOf(
                    Resposta(R.string.sem2_cal_p6r1, true, R.string.sem2_cal_p6),
                    Resposta(R.string.sem2_cal_p6r2, false, R.string.sem2_cal_p6),
                    Resposta(R.string.sem2_cal_p6r3, false, R.string.sem2_cal_p6),
                    Resposta(R.string.sem2_cal_p6r4, false, R.string.sem2_cal_p6)
                )
            ),
            Pergunta(
                R.string.sem2_cal_p7, 1,10,
                mutableListOf(
                    Resposta(R.string.sem2_cal_p7r1, true, R.string.sem2_cal_p7),
                    Resposta(R.string.sem2_cal_p7r2, false, R.string.sem2_cal_p7),
                    Resposta(R.string.sem2_cal_p7r3, false, R.string.sem2_cal_p7),
                    Resposta(R.string.sem2_cal_p7r4, false, R.string.sem2_cal_p7),
                    Resposta(R.string.sem2_cal_p7r5, false, R.string.sem2_cal_p7)
                )
            ),
            Pergunta(
                R.string.sem2_cal_p8, 1,10,
                mutableListOf(
                    Resposta(R.string.sem2_cal_p8r1, true, R.string.sem2_cal_p8),
                    Resposta(R.string.sem2_cal_p8r2, false, R.string.sem2_cal_p8),
                    Resposta(R.string.sem2_cal_p8r3, false, R.string.sem2_cal_p8),
                    Resposta(R.string.sem2_cal_p8r4, false, R.string.sem2_cal_p8)
                )
            ),
            Pergunta(
                R.string.sem2_cal_p9, 1,10,
                mutableListOf(
                    Resposta(R.string.sem2_cal_p9r1, true, R.string.sem2_cal_p9),
                    Resposta(R.string.sem2_cal_p9r2, false, R.string.sem2_cal_p9),
                    Resposta(R.string.sem2_cal_p9r3, false, R.string.sem2_cal_p9),
                    Resposta(R.string.sem2_cal_p9r4, false, R.string.sem2_cal_p9)
                )
            ),
            Pergunta(
                R.string.sem2_cal_p10, 1,10,
                mutableListOf(
                    Resposta(R.string.sem2_cal_p10r1, true, R.string.sem2_cal_p10),
                    Resposta(R.string.sem2_cal_p10r2, false, R.string.sem2_cal_p10),
                    Resposta(R.string.sem2_cal_p10r3, false, R.string.sem2_cal_p10),
                    Resposta(R.string.sem2_cal_p10r4, false, R.string.sem2_cal_p10),
                    Resposta(R.string.sem2_cal_p10r5, false, R.string.sem2_cal_p10)
                )
            ),
            Pergunta(
                R.string.sem2_cal_p11, 1,10,
                mutableListOf(
                    Resposta(R.string.sem2_cal_p11r1, true, R.string.sem2_cal_p11),
                    Resposta(R.string.sem2_cal_p11r2, false, R.string.sem2_cal_p11)
                )
            ),
            Pergunta(
                R.string.sem2_cal_p12, 1,10,
                mutableListOf(
                    Resposta(R.string.sem2_cal_p12r1, true, R.string.sem2_cal_p12),
                    Resposta(R.string.sem2_cal_p12r2, false, R.string.sem2_cal_p12),
                    Resposta(R.string.sem2_cal_p12r3, false, R.string.sem2_cal_p12),
                    Resposta(R.string.sem2_cal_p12r4, false, R.string.sem2_cal_p12)
                )
            )
        )
    )
}
