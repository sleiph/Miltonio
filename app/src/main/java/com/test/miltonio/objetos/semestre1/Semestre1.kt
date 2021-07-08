package com.test.miltonio.objetos.semestre1

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class Semestre1 {

    private val algorismos = Materia(
        1,
        R.string.categ_sem1_alg,
        R.string.categ_sem1_alg_prof,
        1,
        0,
        R.color.colorRoxo,
        R.drawable.simb1alg,
        R.drawable.fnd1alg,
        false,
        mutableListOf(
            Pergunta(R.string.sem1_alg_p1,1,1,
                mutableListOf(
                    Resposta(R.string.sem1_alg_p1r1, true, R.string.sem1_alg_p1),
                    Resposta(R.string.sem1_alg_p1r2, false, R.string.sem1_alg_p1),
                    Resposta(R.string.sem1_alg_p1r3, false, R.string.sem1_alg_p1),
                    Resposta(R.string.sem1_alg_p1r4, false, R.string.sem1_alg_p1)
                )
            ),
            Pergunta(R.string.sem1_alg_p2,1,1,
                mutableListOf(
                    Resposta(R.string.sem1_alg_p2r1, true, R.string.sem1_alg_p2),
                    Resposta(R.string.sem1_alg_p2r2, false, R.string.sem1_alg_p2),
                    Resposta(R.string.sem1_alg_p2r3, false, R.string.sem1_alg_p2),
                    Resposta(R.string.sem1_alg_p2r4, false, R.string.sem1_alg_p2)
                )
            ),
            Pergunta(R.string.sem1_alg_p3,1,1,
                mutableListOf(
                    Resposta(R.string.sem1_alg_p3r1, true, R.string.sem1_alg_p3),
                    Resposta(R.string.sem1_alg_p3r2, false, R.string.sem1_alg_p3),
                    Resposta(R.string.sem1_alg_p3r3, false, R.string.sem1_alg_p3),
                    Resposta(R.string.sem1_alg_p3r4, false, R.string.sem1_alg_p3)
                )
            ),
            Pergunta(R.string.sem1_alg_p4,1,1,
                mutableListOf(
                    Resposta(R.string.sem1_alg_p4r1, true, R.string.sem1_alg_p4),
                    Resposta(R.string.sem1_alg_p4r2, false, R.string.sem1_alg_p4),
                    Resposta(R.string.sem1_alg_p4r3, false, R.string.sem1_alg_p4),
                    Resposta(R.string.sem1_alg_p4r4, false, R.string.sem1_alg_p4)
                )
            ),
            Pergunta(R.string.sem1_alg_p5,1,1,
                mutableListOf(
                    Resposta(R.string.sem1_alg_p5r1, true, R.string.sem1_alg_p5),
                    Resposta(R.string.sem1_alg_p5r2, false, R.string.sem1_alg_p5),
                    Resposta(R.string.sem1_alg_p5r3, false, R.string.sem1_alg_p5),
                    Resposta(R.string.sem1_alg_p5r4, false, R.string.sem1_alg_p5)
                )
            ),
            Pergunta(R.string.sem1_alg_p6,1,1,
                mutableListOf(
                    Resposta(R.string.sem1_alg_p6r1, true, R.string.sem1_alg_p6),
                    Resposta(R.string.sem1_alg_p6r2, false, R.string.sem1_alg_p6),
                    Resposta(R.string.sem1_alg_p6r3, false, R.string.sem1_alg_p6),
                    Resposta(R.string.sem1_alg_p6r4, false, R.string.sem1_alg_p6)
                )
            ),
            Pergunta(R.string.sem1_alg_p7,1,1,
                mutableListOf(
                    Resposta(R.string.sem1_alg_p7r1, true, R.string.sem1_alg_p7),
                    Resposta(R.string.sem1_alg_p7r2, false, R.string.sem1_alg_p7),
                    Resposta(R.string.sem1_alg_p7r3, false, R.string.sem1_alg_p7),
                    Resposta(R.string.sem1_alg_p7r4, false, R.string.sem1_alg_p7)
                )
            ),
            Pergunta(R.string.sem1_alg_p8,1,1,
                mutableListOf(
                    Resposta(R.string.sem1_alg_p8r1, true, R.string.sem1_alg_p8),
                    Resposta(R.string.sem1_alg_p8r2, false, R.string.sem1_alg_p8),
                    Resposta(R.string.sem1_alg_p8r3, false, R.string.sem1_alg_p8),
                    Resposta(R.string.sem1_alg_p8r4, false, R.string.sem1_alg_p8)
                )
            ),
            Pergunta(R.string.sem1_alg_p9,1,1,
                mutableListOf(
                    Resposta(R.string.sem1_alg_p9r1, true, R.string.sem1_alg_p9),
                    Resposta(R.string.sem1_alg_p9r2, false, R.string.sem1_alg_p9),
                    Resposta(R.string.sem1_alg_p9r3, false, R.string.sem1_alg_p9),
                    Resposta(R.string.sem1_alg_p9r4, false, R.string.sem1_alg_p9)
                )
            ),
            Pergunta(R.string.sem1_alg_p10,1,1,
                mutableListOf(
                    Resposta(R.string.sem1_alg_p10r1, true, R.string.sem1_alg_p10),
                    Resposta(R.string.sem1_alg_p10r2, false, R.string.sem1_alg_p10),
                    Resposta(R.string.sem1_alg_p10r3, false, R.string.sem1_alg_p10),
                    Resposta(R.string.sem1_alg_p10r4, false, R.string.sem1_alg_p10)
                )
            )
        )
    )

    private val ingles = Materia(
        2,
        R.string.categ_sem1_eng,
        R.string.categ_sem1_eng_prof,
        1,
        0,
        R.color.colorMagt,
        R.drawable.simbeng,
        R.drawable.fndeng,
        false,
        mutableListOf(
            Pergunta(R.string.sem1_eng_p1,1,2,
                mutableListOf(
                    Resposta(R.string.sem1_eng_p1r1, true, R.string.sem1_eng_p1),
                    Resposta(R.string.sem1_eng_p1r2, false, R.string.sem1_eng_p1),
                    Resposta(R.string.sem1_eng_p1r3, false, R.string.sem1_eng_p1),
                    Resposta(R.string.sem1_eng_p1r4, false, R.string.sem1_eng_p1)
                )
            ),
            Pergunta(R.string.sem1_eng_p2,1,2,
                mutableListOf(
                    Resposta(R.string.sem1_eng_p2r1, true, R.string.sem1_eng_p2),
                    Resposta(R.string.sem1_eng_p2r2, false, R.string.sem1_eng_p2),
                    Resposta(R.string.sem1_eng_p2r3, false, R.string.sem1_eng_p2),
                    Resposta(R.string.sem1_eng_p2r4, false, R.string.sem1_eng_p2)
                )
            ),
            Pergunta(R.string.sem1_eng_p3,1,2,
                mutableListOf(
                    Resposta(R.string.sem1_eng_p3r1, true, R.string.sem1_eng_p3),
                    Resposta(R.string.sem1_eng_p3r2, false, R.string.sem1_eng_p3),
                    Resposta(R.string.sem1_eng_p3r3, false, R.string.sem1_eng_p3),
                    Resposta(R.string.sem1_eng_p3r4, false, R.string.sem1_eng_p3)
                )
            ),
            Pergunta(R.string.sem1_eng_p4,1,2,
                mutableListOf(
                    Resposta(R.string.sem1_eng_p4r1, true, R.string.sem1_eng_p4),
                    Resposta(R.string.sem1_eng_p4r2, false, R.string.sem1_eng_p4),
                    Resposta(R.string.sem1_eng_p4r3, false, R.string.sem1_eng_p4),
                    Resposta(R.string.sem1_eng_p4r4, false, R.string.sem1_eng_p4)
                )
            ),
            Pergunta(R.string.sem1_eng_p5,1,2,
                mutableListOf(
                    Resposta(R.string.sem1_eng_p5r1, true, R.string.sem1_eng_p5),
                    Resposta(R.string.sem1_eng_p5r2, false, R.string.sem1_eng_p5),
                    Resposta(R.string.sem1_eng_p5r3, false, R.string.sem1_eng_p5),
                    Resposta(R.string.sem1_eng_p5r4, false, R.string.sem1_eng_p5)
                )
            ),
            Pergunta(R.string.sem1_eng_p6,1,2,
                mutableListOf(
                    Resposta(R.string.sem1_eng_p6r1, true, R.string.sem1_eng_p6),
                    Resposta(R.string.sem1_eng_p6r2, false, R.string.sem1_eng_p6),
                    Resposta(R.string.sem1_eng_p6r3, false, R.string.sem1_eng_p6),
                    Resposta(R.string.sem1_eng_p6r4, false, R.string.sem1_eng_p6)
                )
            ),
            Pergunta(R.string.sem1_eng_p7,1,2,
                mutableListOf(
                    Resposta(R.string.sem1_eng_p7r1, true, R.string.sem1_eng_p7),
                    Resposta(R.string.sem1_eng_p7r2, false, R.string.sem1_eng_p7),
                    Resposta(R.string.sem1_eng_p7r3, false, R.string.sem1_eng_p7),
                    Resposta(R.string.sem1_eng_p7r4, false, R.string.sem1_eng_p7)
                )
            ),
            Pergunta(R.string.sem1_eng_p8,1,2,
                mutableListOf(
                    Resposta(R.string.sem1_eng_p8r1, true, R.string.sem1_eng_p8),
                    Resposta(R.string.sem1_eng_p8r2, false, R.string.sem1_eng_p8),
                    Resposta(R.string.sem1_eng_p8r3, false, R.string.sem1_eng_p8),
                    Resposta(R.string.sem1_eng_p8r4, false, R.string.sem1_eng_p8)
                )
            ),
            Pergunta(R.string.sem1_eng_p9,1,2,
                mutableListOf(
                    Resposta(R.string.sem1_eng_p9r1, true, R.string.sem1_eng_p9),
                    Resposta(R.string.sem1_eng_p9r2, false, R.string.sem1_eng_p9),
                    Resposta(R.string.sem1_eng_p9r3, false, R.string.sem1_eng_p9),
                    Resposta(R.string.sem1_eng_p9r4, false, R.string.sem1_eng_p9)
                )
            ),
            Pergunta(R.string.sem1_eng_p10,1,2,
                mutableListOf(
                    Resposta(R.string.sem1_eng_p10r1, true, R.string.sem1_eng_p10),
                    Resposta(R.string.sem1_eng_p10r2, false, R.string.sem1_eng_p10),
                    Resposta(R.string.sem1_eng_p10r3, false, R.string.sem1_eng_p10),
                    Resposta(R.string.sem1_eng_p10r4, false, R.string.sem1_eng_p10)
                )
            )
        )
    )

    private val arquitetura = Materia(
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
            Pergunta(R.string.sem1_aoc_p1,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p1r1, true, R.string.sem1_aoc_p1),
                    Resposta(R.string.sem1_aoc_p1r2, false, R.string.sem1_aoc_p1),
                    Resposta(R.string.sem1_aoc_p1r3, false, R.string.sem1_aoc_p1),
                    Resposta(R.string.sem1_aoc_p1r4, false, R.string.sem1_aoc_p1)
                )
            ),
            Pergunta(R.string.sem1_aoc_p2,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p2r1, true, R.string.sem1_aoc_p2),
                    Resposta(R.string.sem1_aoc_p2r2, false, R.string.sem1_aoc_p2),
                    Resposta(R.string.sem1_aoc_p2r3, false, R.string.sem1_aoc_p2),
                    Resposta(R.string.sem1_aoc_p2r4, false, R.string.sem1_aoc_p2)
                )
            ),
            Pergunta(R.string.sem1_aoc_p3,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p3r1, true, R.string.sem1_aoc_p3),
                    Resposta(R.string.sem1_aoc_p3r2, false, R.string.sem1_aoc_p3),
                    Resposta(R.string.sem1_aoc_p3r3, false, R.string.sem1_aoc_p3),
                    Resposta(R.string.sem1_aoc_p3r4, false, R.string.sem1_aoc_p3)
                )
            ),
            Pergunta(R.string.sem1_aoc_p4,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p4r1, true, R.string.sem1_aoc_p4),
                    Resposta(R.string.sem1_aoc_p4r2, false, R.string.sem1_aoc_p4),
                    Resposta(R.string.sem1_aoc_p4r3, false, R.string.sem1_aoc_p4),
                    Resposta(R.string.sem1_aoc_p4r4, false, R.string.sem1_aoc_p4)
                )
            ),
            Pergunta(R.string.sem1_aoc_p5,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p5r1, true, R.string.sem1_aoc_p5),
                    Resposta(R.string.sem1_aoc_p5r2, false, R.string.sem1_aoc_p5),
                    Resposta(R.string.sem1_aoc_p5r3, false, R.string.sem1_aoc_p5),
                    Resposta(R.string.sem1_aoc_p5r4, false, R.string.sem1_aoc_p5)
                )
            ),
            Pergunta(R.string.sem1_aoc_p6,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p6r1, true, R.string.sem1_aoc_p6),
                    Resposta(R.string.sem1_aoc_p6r2, false, R.string.sem1_aoc_p6),
                    Resposta(R.string.sem1_aoc_p6r3, false, R.string.sem1_aoc_p6),
                    Resposta(R.string.sem1_aoc_p6r4, false, R.string.sem1_aoc_p6)
                )
            ),
            Pergunta(R.string.sem1_aoc_p7,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p7r1, true, R.string.sem1_aoc_p7),
                    Resposta(R.string.sem1_aoc_p7r2, false, R.string.sem1_aoc_p7),
                    Resposta(R.string.sem1_aoc_p7r3, false, R.string.sem1_aoc_p7),
                    Resposta(R.string.sem1_aoc_p7r4, false, R.string.sem1_aoc_p7)
                )
            ),
            Pergunta(R.string.sem1_aoc_p8,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p8r1, true, R.string.sem1_aoc_p8),
                    Resposta(R.string.sem1_aoc_p8r2, false, R.string.sem1_aoc_p8),
                    Resposta(R.string.sem1_aoc_p8r3, false, R.string.sem1_aoc_p8),
                    Resposta(R.string.sem1_aoc_p8r4, false, R.string.sem1_aoc_p8)
                )
            ),
            Pergunta(R.string.sem1_aoc_p9,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p9r1, true, R.string.sem1_aoc_p9),
                    Resposta(R.string.sem1_aoc_p9r2, false, R.string.sem1_aoc_p9),
                    Resposta(R.string.sem1_aoc_p9r3, false, R.string.sem1_aoc_p9),
                    Resposta(R.string.sem1_aoc_p9r4, false, R.string.sem1_aoc_p9)
                )
            ),
            Pergunta(R.string.sem1_aoc_p10,1,3,
                mutableListOf(
                    Resposta(R.string.sem1_aoc_p10r1, true, R.string.sem1_aoc_p10),
                    Resposta(R.string.sem1_aoc_p10r2, false, R.string.sem1_aoc_p10),
                    Resposta(R.string.sem1_aoc_p10r3, false, R.string.sem1_aoc_p10),
                    Resposta(R.string.sem1_aoc_p10r4, false, R.string.sem1_aoc_p10)
                )
            )
        )
    )

    private val hardware = Materia(
        4,
        R.string.categ_sem1_lhw,
        R.string.categ_sem1_lhw_prof,
        1,
        0,
        R.color.colorLrnj,
        R.drawable.simb1lhw,
        R.drawable.fnd1lhw,
        true,
        mutableListOf(
            Pergunta(R.string.sem1_lhw_p1,1,4,
                mutableListOf(
                    Resposta(R.string.sem1_lhw_p1r1, true, R.string.sem1_lhw_p1),
                    Resposta(R.string.sem1_lhw_p1r2, false, R.string.sem1_lhw_p1),
                    Resposta(R.string.sem1_lhw_p1r3, false, R.string.sem1_lhw_p1),
                    Resposta(R.string.sem1_lhw_p1r4, false, R.string.sem1_lhw_p1)
                )
            ),
            Pergunta(R.string.sem1_lhw_p2,1,4,
                mutableListOf(
                    Resposta(R.string.sem1_lhw_p2r1, true, R.string.sem1_lhw_p2),
                    Resposta(R.string.sem1_lhw_p2r2, false, R.string.sem1_lhw_p2),
                    Resposta(R.string.sem1_lhw_p2r3, false, R.string.sem1_lhw_p2),
                    Resposta(R.string.sem1_lhw_p2r4, false, R.string.sem1_lhw_p2)
                )
            ),
            Pergunta(R.string.sem1_lhw_p3,1,4,
                mutableListOf(
                    Resposta(R.string.sem1_lhw_p3r1, true, R.string.sem1_lhw_p3),
                    Resposta(R.string.sem1_lhw_p3r2, false, R.string.sem1_lhw_p3),
                    Resposta(R.string.sem1_lhw_p3r3, false, R.string.sem1_lhw_p3),
                    Resposta(R.string.sem1_lhw_p3r4, false, R.string.sem1_lhw_p3)
                )
            ),
            Pergunta(R.string.sem1_lhw_p4,1,4,
                mutableListOf(
                    Resposta(R.string.sem1_lhw_p4r1, true, R.string.sem1_lhw_p4),
                    Resposta(R.string.sem1_lhw_p4r2, false, R.string.sem1_lhw_p4),
                    Resposta(R.string.sem1_lhw_p4r3, false, R.string.sem1_lhw_p4),
                    Resposta(R.string.sem1_lhw_p4r4, false, R.string.sem1_lhw_p4)
                )
            ),
            Pergunta(R.string.sem1_lhw_p5,1,4,
                mutableListOf(
                    Resposta(R.string.sem1_lhw_p5r1, true, R.string.sem1_lhw_p5),
                    Resposta(R.string.sem1_lhw_p5r2, false, R.string.sem1_lhw_p5),
                    Resposta(R.string.sem1_lhw_p5r3, false, R.string.sem1_lhw_p5),
                    Resposta(R.string.sem1_lhw_p5r4, false, R.string.sem1_lhw_p5)
                )
            ),
            Pergunta(R.string.sem1_lhw_p6,1,4,
                mutableListOf(
                    Resposta(R.string.sem1_lhw_p6r1, true, R.string.sem1_lhw_p6),
                    Resposta(R.string.sem1_lhw_p6r2, false, R.string.sem1_lhw_p6),
                    Resposta(R.string.sem1_lhw_p6r3, false, R.string.sem1_lhw_p6),
                    Resposta(R.string.sem1_lhw_p6r4, false, R.string.sem1_lhw_p6)
                )
            ),
            Pergunta(R.string.sem1_lhw_p7,1,4,
                mutableListOf(
                    Resposta(R.string.sem1_lhw_p7r1, true, R.string.sem1_lhw_p7),
                    Resposta(R.string.sem1_lhw_p7r2, false, R.string.sem1_lhw_p7),
                    Resposta(R.string.sem1_lhw_p7r3, false, R.string.sem1_lhw_p7),
                    Resposta(R.string.sem1_lhw_p7r4, false, R.string.sem1_lhw_p7)
                )
            ),
            Pergunta(R.string.sem1_lhw_p8,1,4,
                mutableListOf(
                    Resposta(R.string.sem1_lhw_p8r1, true, R.string.sem1_lhw_p8),
                    Resposta(R.string.sem1_lhw_p8r2, false, R.string.sem1_lhw_p8),
                    Resposta(R.string.sem1_lhw_p8r3, false, R.string.sem1_lhw_p8),
                    Resposta(R.string.sem1_lhw_p8r4, false, R.string.sem1_lhw_p8)
                )
            ),
            Pergunta(R.string.sem1_lhw_p9,1,4,
                mutableListOf(
                    Resposta(R.string.sem1_lhw_p9r1, true, R.string.sem1_lhw_p9),
                    Resposta(R.string.sem1_lhw_p9r2, false, R.string.sem1_lhw_p9),
                    Resposta(R.string.sem1_lhw_p9r3, false, R.string.sem1_lhw_p9),
                    Resposta(R.string.sem1_lhw_p9r4, false, R.string.sem1_lhw_p9)
                )
            ),
            Pergunta(R.string.sem1_lhw_p10,1,4,
                mutableListOf(
                    Resposta(R.string.sem1_lhw_p10r1, true, R.string.sem1_lhw_p10),
                    Resposta(R.string.sem1_lhw_p10r2, false, R.string.sem1_lhw_p10),
                    Resposta(R.string.sem1_lhw_p10r3, false, R.string.sem1_lhw_p10),
                    Resposta(R.string.sem1_lhw_p10r4, false, R.string.sem1_lhw_p10)
                )
            )
        )
    )

    private val administracao = Materia(
        5,
        R.string.categ_sem1_adm,
        R.string.categ_sem1_adm_prof,
        1,
        0,
        R.color.colorAmrl,
        R.drawable.simb1adm,
        R.drawable.fnd1adm,
        true,
        mutableListOf(
            Pergunta(R.string.sem1_adm_p1,1,5,
                mutableListOf(
                    Resposta(R.string.sem1_adm_p1r1, true, R.string.sem1_adm_p1),
                    Resposta(R.string.sem1_adm_p1r2, false, R.string.sem1_adm_p1),
                    Resposta(R.string.sem1_adm_p1r3, false, R.string.sem1_adm_p1),
                    Resposta(R.string.sem1_adm_p1r4, false, R.string.sem1_adm_p1)
                )
            ),
            Pergunta(R.string.sem1_adm_p2,1,5,
                mutableListOf(
                    Resposta(R.string.sem1_adm_p2r1, true, R.string.sem1_adm_p2),
                    Resposta(R.string.sem1_adm_p2r2, false, R.string.sem1_adm_p2),
                    Resposta(R.string.sem1_adm_p2r3, false, R.string.sem1_adm_p2),
                    Resposta(R.string.sem1_adm_p2r4, false, R.string.sem1_adm_p2)
                )
            ),
            Pergunta(R.string.sem1_adm_p3,1,5,
                mutableListOf(
                    Resposta(R.string.sem1_adm_p3r1, true, R.string.sem1_adm_p3),
                    Resposta(R.string.sem1_adm_p3r2, false, R.string.sem1_adm_p3),
                    Resposta(R.string.sem1_adm_p3r3, false, R.string.sem1_adm_p3),
                    Resposta(R.string.sem1_adm_p3r4, false, R.string.sem1_adm_p3)
                )
            ),
            Pergunta(R.string.sem1_adm_p4,1,5,
                mutableListOf(
                    Resposta(R.string.sem1_adm_p4r1, true, R.string.sem1_adm_p4),
                    Resposta(R.string.sem1_adm_p4r2, false, R.string.sem1_adm_p4),
                    Resposta(R.string.sem1_adm_p4r3, false, R.string.sem1_adm_p4),
                    Resposta(R.string.sem1_adm_p4r4, false, R.string.sem1_adm_p4)
                )
            ),
            Pergunta(R.string.sem1_adm_p5,1,5,
                mutableListOf(
                    Resposta(R.string.sem1_adm_p5r1, true, R.string.sem1_adm_p5),
                    Resposta(R.string.sem1_adm_p5r2, false, R.string.sem1_adm_p5),
                    Resposta(R.string.sem1_adm_p5r3, false, R.string.sem1_adm_p5),
                    Resposta(R.string.sem1_adm_p5r4, false, R.string.sem1_adm_p5)
                )
            ),
            Pergunta(R.string.sem1_adm_p6,1,5,
                mutableListOf(
                    Resposta(R.string.sem1_adm_p6r1, true, R.string.sem1_adm_p6),
                    Resposta(R.string.sem1_adm_p6r2, false, R.string.sem1_adm_p6),
                    Resposta(R.string.sem1_adm_p6r3, false, R.string.sem1_adm_p6),
                    Resposta(R.string.sem1_adm_p6r4, false, R.string.sem1_adm_p6)
                )
            ),
            Pergunta(R.string.sem1_adm_p7,1,5,
                mutableListOf(
                    Resposta(R.string.sem1_adm_p7r1, true, R.string.sem1_adm_p7),
                    Resposta(R.string.sem1_adm_p7r2, false, R.string.sem1_adm_p7),
                    Resposta(R.string.sem1_adm_p7r3, false, R.string.sem1_adm_p7),
                    Resposta(R.string.sem1_adm_p7r4, false, R.string.sem1_adm_p7)
                )
            ),
            Pergunta(R.string.sem1_adm_p8,1,5,
                mutableListOf(
                    Resposta(R.string.sem1_adm_p8r1, true, R.string.sem1_adm_p8),
                    Resposta(R.string.sem1_adm_p8r2, false, R.string.sem1_adm_p8),
                    Resposta(R.string.sem1_adm_p8r3, false, R.string.sem1_adm_p8),
                    Resposta(R.string.sem1_adm_p8r4, false, R.string.sem1_adm_p8)
                )
            ),
            Pergunta(R.string.sem1_adm_p9,1,5,
                mutableListOf(
                    Resposta(R.string.sem1_adm_p9r1, true, R.string.sem1_adm_p9),
                    Resposta(R.string.sem1_adm_p9r2, false, R.string.sem1_adm_p9),
                    Resposta(R.string.sem1_adm_p9r3, false, R.string.sem1_adm_p9),
                    Resposta(R.string.sem1_adm_p9r4, false, R.string.sem1_adm_p9)
                )
            ),
            Pergunta(R.string.sem1_adm_p10,1,5,
                mutableListOf(
                    Resposta(R.string.sem1_adm_p10r1, true, R.string.sem1_adm_p10),
                    Resposta(R.string.sem1_adm_p10r2, false, R.string.sem1_adm_p10),
                    Resposta(R.string.sem1_adm_p10r3, false, R.string.sem1_adm_p10),
                    Resposta(R.string.sem1_adm_p10r4, false, R.string.sem1_adm_p10)
                )
            )
        )
    )

    private val programacao = Materia(
        6,
        R.string.categ_sem1_prg,
        R.string.categ_sem1_prg_prof,
        1,
        0,
        R.color.colorVerdEsc,
        R.drawable.simb1prg,
        R.drawable.fnd1prg,
        false,
        mutableListOf(
            Pergunta(R.string.sem1_prg_p1,1,6,
                mutableListOf(
                    Resposta(R.string.sem1_prg_p1r1, true, R.string.sem1_prg_p1),
                    Resposta(R.string.sem1_prg_p1r2, false, R.string.sem1_prg_p1),
                    Resposta(R.string.sem1_prg_p1r3, false, R.string.sem1_prg_p1),
                    Resposta(R.string.sem1_prg_p1r4, false, R.string.sem1_prg_p1)
                )
            ),
            Pergunta(R.string.sem1_prg_p2,1,6,
                mutableListOf(
                    Resposta(R.string.sem1_prg_p2r1, true, R.string.sem1_prg_p2),
                    Resposta(R.string.sem1_prg_p2r2, false, R.string.sem1_prg_p2),
                    Resposta(R.string.sem1_prg_p2r3, false, R.string.sem1_prg_p2),
                    Resposta(R.string.sem1_prg_p2r4, false, R.string.sem1_prg_p2)
                )
            ),
            Pergunta(R.string.sem1_prg_p3,1,6,
                mutableListOf(
                    Resposta(R.string.sem1_prg_p3r1, true, R.string.sem1_prg_p3),
                    Resposta(R.string.sem1_prg_p3r2, false, R.string.sem1_prg_p3),
                    Resposta(R.string.sem1_prg_p3r3, false, R.string.sem1_prg_p3),
                    Resposta(R.string.sem1_prg_p3r4, false, R.string.sem1_prg_p3)
                )
            ),
            Pergunta(R.string.sem1_prg_p4,1,6,
                mutableListOf(
                    Resposta(R.string.sem1_prg_p4r1, true, R.string.sem1_prg_p4),
                    Resposta(R.string.sem1_prg_p4r2, false, R.string.sem1_prg_p4),
                    Resposta(R.string.sem1_prg_p4r3, false, R.string.sem1_prg_p4),
                    Resposta(R.string.sem1_prg_p4r4, false, R.string.sem1_prg_p4)
                )
            ),
            Pergunta(R.string.sem1_prg_p5,1,6,
                mutableListOf(
                    Resposta(R.string.sem1_prg_p5r1, true, R.string.sem1_prg_p5),
                    Resposta(R.string.sem1_prg_p5r2, false, R.string.sem1_prg_p5),
                    Resposta(R.string.sem1_prg_p5r3, false, R.string.sem1_prg_p5),
                    Resposta(R.string.sem1_prg_p5r4, false, R.string.sem1_prg_p5)
                )
            ),
            Pergunta(R.string.sem1_prg_p6,1,6,
                mutableListOf(
                    Resposta(R.string.sem1_prg_p6r1, true, R.string.sem1_prg_p6),
                    Resposta(R.string.sem1_prg_p6r2, false, R.string.sem1_prg_p6),
                    Resposta(R.string.sem1_prg_p6r3, false, R.string.sem1_prg_p6),
                    Resposta(R.string.sem1_prg_p6r4, false, R.string.sem1_prg_p6)
                )
            ),
            Pergunta(R.string.sem1_prg_p7,1,6,
                mutableListOf(
                    Resposta(R.string.sem1_prg_p7r1, true, R.string.sem1_prg_p7),
                    Resposta(R.string.sem1_prg_p7r2, false, R.string.sem1_prg_p7),
                    Resposta(R.string.sem1_prg_p7r3, false, R.string.sem1_prg_p7),
                    Resposta(R.string.sem1_prg_p7r4, false, R.string.sem1_prg_p7)
                )
            ),
            Pergunta(R.string.sem1_prg_p8,1,6,
                mutableListOf(
                    Resposta(R.string.sem1_prg_p8r1, true, R.string.sem1_prg_p8),
                    Resposta(R.string.sem1_prg_p8r2, false, R.string.sem1_prg_p8),
                    Resposta(R.string.sem1_prg_p8r3, false, R.string.sem1_prg_p8),
                    Resposta(R.string.sem1_prg_p8r4, false, R.string.sem1_prg_p8)
                )
            ),
            Pergunta(R.string.sem1_prg_p9,1,6,
                mutableListOf(
                    Resposta(R.string.sem1_prg_p9r1, true, R.string.sem1_prg_p9),
                    Resposta(R.string.sem1_prg_p9r2, false, R.string.sem1_prg_p9),
                    Resposta(R.string.sem1_prg_p9r3, false, R.string.sem1_prg_p9),
                    Resposta(R.string.sem1_prg_p9r4, false, R.string.sem1_prg_p9)
                )
            ),
            Pergunta(R.string.sem1_prg_p10,1,6,
                mutableListOf(
                    Resposta(R.string.sem1_prg_p10r1, true, R.string.sem1_prg_p10),
                    Resposta(R.string.sem1_prg_p10r2, false, R.string.sem1_prg_p10),
                    Resposta(R.string.sem1_prg_p10r3, false, R.string.sem1_prg_p10),
                    Resposta(R.string.sem1_prg_p10r4, false, R.string.sem1_prg_p10)
                )
            )
        )
    )

    val imagemHeader = R.drawable.appsomilton

    fun getMaterias() :Array<Materia> {
        return arrayOf(
            Mat().materia,
            algorismos,
            ingles,
            arquitetura,
            hardware,
            administracao,
            programacao
        )
    }

}