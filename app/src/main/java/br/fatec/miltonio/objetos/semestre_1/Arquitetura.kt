package br.fatec.miltonio.objetos.semestre_1

import br.fatec.miltonio.R
import br.fatec.miltonio.modelo.Materia
import br.fatec.miltonio.modelo.Pergunta
import br.fatec.miltonio.modelo.Resposta

class Arquitetura {
    val materia = Materia(
        3,
        R.string.categ_sem1_aoc,
        R.string.categ_sem1_aoc_prof,
        1,
        0,
        R.color.colorAzul,
        R.drawable.simb1aoc,
        R.drawable.fnd1aoc,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem1_aoc_p1,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p1r1, true, R.string.sem1_aoc_p1),
                    Resposta(R.string.sem1_aoc_p1r2, false, R.string.sem1_aoc_p1),
                    Resposta(R.string.sem1_aoc_p1r3, false, R.string.sem1_aoc_p1),
                    Resposta(R.string.sem1_aoc_p1r4, false, R.string.sem1_aoc_p1)
                )
            ),
            Pergunta(
                R.string.sem1_aoc_p2,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p2r1, true, R.string.sem1_aoc_p2),
                    Resposta(R.string.sem1_aoc_p2r2, false, R.string.sem1_aoc_p2),
                    Resposta(R.string.sem1_aoc_p2r3, false, R.string.sem1_aoc_p2),
                    Resposta(R.string.sem1_aoc_p2r4, false, R.string.sem1_aoc_p2)
                )
            ),
            Pergunta(
                R.string.sem1_aoc_p3,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p3r1, true, R.string.sem1_aoc_p3),
                    Resposta(R.string.sem1_aoc_p3r2, false, R.string.sem1_aoc_p3),
                    Resposta(R.string.sem1_aoc_p3r3, false, R.string.sem1_aoc_p3),
                    Resposta(R.string.sem1_aoc_p3r4, false, R.string.sem1_aoc_p3)
                )
            ),
            Pergunta(
                R.string.sem1_aoc_p4,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p4r1, true, R.string.sem1_aoc_p4),
                    Resposta(R.string.sem1_aoc_p4r2, false, R.string.sem1_aoc_p4),
                    Resposta(R.string.sem1_aoc_p4r3, false, R.string.sem1_aoc_p4),
                    Resposta(R.string.sem1_aoc_p4r4, false, R.string.sem1_aoc_p4)
                )
            ),
            Pergunta(
                R.string.sem1_aoc_p5,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p5r1, true, R.string.sem1_aoc_p5),
                    Resposta(R.string.sem1_aoc_p5r2, false, R.string.sem1_aoc_p5),
                    Resposta(R.string.sem1_aoc_p5r3, false, R.string.sem1_aoc_p5),
                    Resposta(R.string.sem1_aoc_p5r4, false, R.string.sem1_aoc_p5)
                )
            ),
            Pergunta(
                R.string.sem1_aoc_p6,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p6r1, true, R.string.sem1_aoc_p6),
                    Resposta(R.string.sem1_aoc_p6r2, false, R.string.sem1_aoc_p6),
                    Resposta(R.string.sem1_aoc_p6r3, false, R.string.sem1_aoc_p6),
                    Resposta(R.string.sem1_aoc_p6r4, false, R.string.sem1_aoc_p6)
                )
            ),
            Pergunta(
                R.string.sem1_aoc_p7,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p7r1, true, R.string.sem1_aoc_p7),
                    Resposta(R.string.sem1_aoc_p7r2, false, R.string.sem1_aoc_p7),
                    Resposta(R.string.sem1_aoc_p7r3, false, R.string.sem1_aoc_p7),
                    Resposta(R.string.sem1_aoc_p7r4, false, R.string.sem1_aoc_p7)
                )
            ),
            Pergunta(
                R.string.sem1_aoc_p8,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p8r1, true, R.string.sem1_aoc_p8),
                    Resposta(R.string.sem1_aoc_p8r2, false, R.string.sem1_aoc_p8),
                    Resposta(R.string.sem1_aoc_p8r3, false, R.string.sem1_aoc_p8),
                    Resposta(R.string.sem1_aoc_p8r4, false, R.string.sem1_aoc_p8)
                )
            ),
            Pergunta(
                R.string.sem1_aoc_p9,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p9r1, true, R.string.sem1_aoc_p9),
                    Resposta(R.string.sem1_aoc_p9r2, false, R.string.sem1_aoc_p9),
                    Resposta(R.string.sem1_aoc_p9r3, false, R.string.sem1_aoc_p9),
                    Resposta(R.string.sem1_aoc_p9r4, false, R.string.sem1_aoc_p9)
                )
            ),
            Pergunta(
                R.string.sem1_aoc_p10,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p10r1, true, R.string.sem1_aoc_p10),
                    Resposta(R.string.sem1_aoc_p10r2, false, R.string.sem1_aoc_p10),
                    Resposta(R.string.sem1_aoc_p10r3, false, R.string.sem1_aoc_p10),
                    Resposta(R.string.sem1_aoc_p10r4, false, R.string.sem1_aoc_p10)
                )
            )
        )
    )
}