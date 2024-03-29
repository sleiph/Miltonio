package br.fatec.miltonio.objetos.semestre_5

import br.fatec.miltonio.R
import br.fatec.miltonio.modelo.Materia
import br.fatec.miltonio.modelo.Pergunta
import br.fatec.miltonio.modelo.Resposta

class ProjRedes {
    val materia = Materia(
        46,
        R.string.categ_sem5_prc,
        R.string.categ_sem5_prc_prof,
        5,
        0,
        R.color.colorCyan,
        R.drawable.simb3eap,
        R.drawable.fnd3eap,
        true,
        mutableListOf(
            Pergunta(
                R.string.sem5_prc_p1, 1,46,
                mutableListOf(
                    Resposta(R.string.sem5_prc_p1r1, true, R.string.sem5_prc_p1),
                    Resposta(R.string.sem5_prc_p1r2, false, R.string.sem5_prc_p1),
                    Resposta(R.string.sem5_prc_p1r3, false, R.string.sem5_prc_p1),
                    Resposta(R.string.sem5_prc_p1r4, false, R.string.sem5_prc_p1)
                )
            ),
            Pergunta(
                R.string.sem5_prc_p2, 1,46,
                mutableListOf(
                    Resposta(R.string.sem5_prc_p2r1, true, R.string.sem5_prc_p2),
                    Resposta(R.string.sem5_prc_p2r2, false, R.string.sem5_prc_p2)
                )
            ),
            Pergunta(
                R.string.sem5_prc_p3, 1,46,
                mutableListOf(
                    Resposta(R.string.sem5_prc_p3r1, true, R.string.sem5_prc_p3),
                    Resposta(R.string.sem5_prc_p3r2, false, R.string.sem5_prc_p3),
                    Resposta(R.string.sem5_prc_p3r3, false, R.string.sem5_prc_p3)
                )
            ),
            Pergunta(
                R.string.sem5_prc_p4, 1,46,
                mutableListOf(
                    Resposta(R.string.sem5_prc_p4r1, true, R.string.sem5_prc_p4),
                    Resposta(R.string.sem5_prc_p4r2, false, R.string.sem5_prc_p4),
                    Resposta(R.string.sem5_prc_p4r3, false, R.string.sem5_prc_p4),
                    Resposta(R.string.sem5_prc_p4r4, false, R.string.sem5_prc_p4)
                )
            ),
            Pergunta(
                R.string.sem5_prc_p5, 1,46,
                mutableListOf(
                    Resposta(R.string.sem5_prc_p5r1, true, R.string.sem5_prc_p5),
                    Resposta(R.string.sem5_prc_p5r2, false, R.string.sem5_prc_p5)
                )
            ),
            Pergunta(
                R.string.sem5_prc_p6, 1,46,
                mutableListOf(
                    Resposta(R.string.sem5_prc_p6r1, true, R.string.sem5_prc_p6),
                    Resposta(R.string.sem5_prc_p6r2, false, R.string.sem5_prc_p6)
                )
            ),
            Pergunta(
                R.string.sem5_prc_p7, 1,46,
                mutableListOf(
                    Resposta(R.string.sem5_prc_p7r1, true, R.string.sem5_prc_p7),
                    Resposta(R.string.sem5_prc_p7r2, false, R.string.sem5_prc_p7),
                    Resposta(R.string.sem5_prc_p7r3, false, R.string.sem5_prc_p7),
                    Resposta(R.string.sem5_prc_p7r4, false, R.string.sem5_prc_p7)
                )
            ),
            Pergunta(
                R.string.sem5_prc_p8, 1,46,
                mutableListOf(
                    Resposta(R.string.sem5_prc_p8r1, true, R.string.sem5_prc_p8),
                    Resposta(R.string.sem5_prc_p8r2, false, R.string.sem5_prc_p8),
                    Resposta(R.string.sem5_prc_p8r3, false, R.string.sem5_prc_p8),
                    Resposta(R.string.sem5_prc_p8r4, false, R.string.sem5_prc_p8)
                )
            ),
            Pergunta(
                R.string.sem5_prc_p9, 1,46,
                mutableListOf(
                    Resposta(R.string.sem5_prc_p9r1, true, R.string.sem5_prc_p9),
                    Resposta(R.string.sem5_prc_p9r2, false, R.string.sem5_prc_p9),
                    Resposta(R.string.sem5_prc_p9r3, false, R.string.sem5_prc_p9),
                    Resposta(R.string.sem5_prc_p9r4, false, R.string.sem5_prc_p9)
                )
            ),
            Pergunta(
                R.string.sem5_prc_p10, 1,46,
                mutableListOf(
                    Resposta(R.string.sem5_prc_p10r1, true, R.string.sem5_prc_p10),
                    Resposta(R.string.sem5_prc_p10r2, false, R.string.sem5_prc_p10)
                )
            )
        )
    )
}
