package br.fatec.miltonio.objetos.semestre_5

import br.fatec.miltonio.R
import br.fatec.miltonio.modelo.Materia
import br.fatec.miltonio.modelo.Pergunta
import br.fatec.miltonio.modelo.Resposta

class ProgLin {
    val materia = Materia(
        49,
        R.string.categ_sem5_pli,
        R.string.categ_sem5_pli_prof,
        5,
        0,
        R.color.colorCyan,
        R.drawable.simb1mat,
        R.drawable.fnd1mat,
        true,
        mutableListOf(
            Pergunta(
                R.string.sem5_pli_p1, 1,49,
                mutableListOf(
                    Resposta(R.string.sem5_pli_p1r1, true, R.string.sem5_pli_p1),
                    Resposta(R.string.sem5_pli_p1r2, false, R.string.sem5_pli_p1)
                )
            ),
            Pergunta(
                R.string.sem5_pli_p2, 1,49,
                mutableListOf(
                    Resposta(R.string.sem5_pli_p2r1, true, R.string.sem5_pli_p2),
                    Resposta(R.string.sem5_pli_p2r2, false, R.string.sem5_pli_p2),
                    Resposta(R.string.sem5_pli_p2r3, false, R.string.sem5_pli_p2),
                    Resposta(R.string.sem5_pli_p2r4, false, R.string.sem5_pli_p2)
                )
            ),
            Pergunta(
                R.string.sem5_pli_p3, 1,49,
                mutableListOf(
                    Resposta(R.string.sem5_pli_p3r1, true, R.string.sem5_pli_p3),
                    Resposta(R.string.sem5_pli_p3r2, false, R.string.sem5_pli_p3),
                    Resposta(R.string.sem5_pli_p3r3, false, R.string.sem5_pli_p3),
                    Resposta(R.string.sem5_pli_p3r4, false, R.string.sem5_pli_p3)
                )
            ),
            Pergunta(
                R.string.sem5_pli_p4, 1,49,
                mutableListOf(
                    Resposta(R.string.sem5_pli_p4r1, true, R.string.sem5_pli_p4),
                    Resposta(R.string.sem5_pli_p4r2, false, R.string.sem5_pli_p4),
                    Resposta(R.string.sem5_pli_p4r3, false, R.string.sem5_pli_p4),
                    Resposta(R.string.sem5_pli_p4r4, false, R.string.sem5_pli_p4)
                )
            ),
            Pergunta(
                R.string.sem5_pli_p5, 1,49,
                mutableListOf(
                    Resposta(R.string.sem5_pli_p5r1, true, R.string.sem5_pli_p5),
                    Resposta(R.string.sem5_pli_p5r2, false, R.string.sem5_pli_p5),
                    Resposta(R.string.sem5_pli_p5r3, false, R.string.sem5_pli_p5),
                    Resposta(R.string.sem5_pli_p5r4, false, R.string.sem5_pli_p5)
                )
            ),
            Pergunta(
                R.string.sem5_pli_p6, 1,49,
                mutableListOf(
                    Resposta(R.string.sem5_pli_p6r1, true, R.string.sem5_pli_p6),
                    Resposta(R.string.sem5_pli_p6r2, false, R.string.sem5_pli_p6),
                    Resposta(R.string.sem5_pli_p6r3, false, R.string.sem5_pli_p6)
                )
            ),
            Pergunta(
                R.string.sem5_pli_p7, 1,49,
                mutableListOf(
                    Resposta(R.string.sem5_pli_p7r1, true, R.string.sem5_pli_p7),
                    Resposta(R.string.sem5_pli_p7r2, false, R.string.sem5_pli_p7)
                )
            ),
            Pergunta(
                R.string.sem5_pli_p8, 1,49,
                mutableListOf(
                    Resposta(R.string.sem5_pli_p8r1, true, R.string.sem5_pli_p8),
                    Resposta(R.string.sem5_pli_p8r2, false, R.string.sem5_pli_p8)
                )
            ),
            Pergunta(
                R.string.sem5_pli_p9, 1,49,
                mutableListOf(
                    Resposta(R.string.sem5_pli_p9r1, true, R.string.sem5_pli_p9),
                    Resposta(R.string.sem5_pli_p9r2, false, R.string.sem5_pli_p9),
                    Resposta(R.string.sem5_pli_p9r3, false, R.string.sem5_pli_p9)
                )
            ),
            Pergunta(
                R.string.sem5_pli_p10, 1,49,
                mutableListOf(
                    Resposta(R.string.sem5_pli_p10r1, true, R.string.sem5_pli_p10),
                    Resposta(R.string.sem5_pli_p10r2, false, R.string.sem5_pli_p10)
                )
            )
        )
    )
}
