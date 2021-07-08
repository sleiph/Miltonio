package com.test.miltonio.objetos

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class Semestre3 {

    private val dados = Materia(
        20,
        R.string.categ_sem3_esd,
        R.string.categ_sem3_esd_prof,
        3,
        0,
        R.color.colorVerdEsc,
        R.drawable.simb3esd,
        R.drawable.fnd3esd,
        false,
        mutableListOf(
            Pergunta(R.string.sem3_esd_p1, 1,20,
                mutableListOf(
                    Resposta(R.string.sem3_esd_p1r1, true, R.string.sem3_esd_p1),
                    Resposta(R.string.sem3_esd_p1r2, false, R.string.sem3_esd_p1),
                    Resposta(R.string.sem3_esd_p1r3, false, R.string.sem3_esd_p1),
                    Resposta(R.string.sem3_esd_p1r4, false, R.string.sem3_esd_p1)
                )
            ),
            Pergunta(R.string.sem3_esd_p2, 1,20,
                mutableListOf(
                    Resposta(R.string.sem3_esd_p2r1, true, R.string.sem3_esd_p2),
                    Resposta(R.string.sem3_esd_p2r2, false, R.string.sem3_esd_p2)
                )
            ),
            Pergunta(R.string.sem3_esd_p3, 1,20,
                mutableListOf(
                    Resposta(R.string.sem3_esd_p3r1, true, R.string.sem3_esd_p3),
                    Resposta(R.string.sem3_esd_p3r2, false, R.string.sem3_esd_p3),
                    Resposta(R.string.sem3_esd_p3r3, false, R.string.sem3_esd_p3),
                    Resposta(R.string.sem3_esd_p3r4, false, R.string.sem3_esd_p3)
                )
            ),
            Pergunta(R.string.sem3_esd_p4, 1,20,
                mutableListOf(
                    Resposta(R.string.sem3_esd_p4r1, true, R.string.sem3_esd_p4),
                    Resposta(R.string.sem3_esd_p4r2, false, R.string.sem3_esd_p4),
                    Resposta(R.string.sem3_esd_p4r3, false, R.string.sem3_esd_p4),
                    Resposta(R.string.sem3_esd_p4r4, false, R.string.sem3_esd_p4),
                    Resposta(R.string.sem3_esd_p4r5, false, R.string.sem3_esd_p4)
                )
            ),
            Pergunta(R.string.sem3_esd_p5, 1,20,
                mutableListOf(
                    Resposta(R.string.sem3_esd_p5r1, true, R.string.sem3_esd_p5),
                    Resposta(R.string.sem3_esd_p5r2, false, R.string.sem3_esd_p5),
                    Resposta(R.string.sem3_esd_p5r3, false, R.string.sem3_esd_p5),
                    Resposta(R.string.sem3_esd_p5r4, false, R.string.sem3_esd_p5),
                    Resposta(R.string.sem3_esd_p5r5, false, R.string.sem3_esd_p5)
                )
            ),
            Pergunta(R.string.sem3_esd_p6, 1,20,
                mutableListOf(
                    Resposta(R.string.sem3_esd_p6r1, true, R.string.sem3_esd_p6),
                    Resposta(R.string.sem3_esd_p6r2, false, R.string.sem3_esd_p6),
                    Resposta(R.string.sem3_esd_p6r3, false, R.string.sem3_esd_p6)
                )
            ),
            Pergunta(R.string.sem3_esd_p7, 1,20,
                mutableListOf(
                    Resposta(R.string.sem3_esd_p7r1, true, R.string.sem3_esd_p7),
                    Resposta(R.string.sem3_esd_p7r2, false, R.string.sem3_esd_p7),
                    Resposta(R.string.sem3_esd_p7r3, false, R.string.sem3_esd_p7),
                    Resposta(R.string.sem3_esd_p7r4, false, R.string.sem3_esd_p7)
                )
            ),
            Pergunta(R.string.sem3_esd_p8, 1,20,
                mutableListOf(
                    Resposta(R.string.sem3_esd_p8r1, true, R.string.sem3_esd_p8),
                    Resposta(R.string.sem3_esd_p8r2, false, R.string.sem3_esd_p8),
                    Resposta(R.string.sem3_esd_p8r3, false, R.string.sem3_esd_p8),
                    Resposta(R.string.sem3_esd_p8r4, false, R.string.sem3_esd_p8)
                )
            ),
            Pergunta(R.string.sem3_esd_p9, 1,20,
                mutableListOf(
                    Resposta(R.string.sem3_esd_p9r1, true, R.string.sem3_esd_p9),
                    Resposta(R.string.sem3_esd_p9r2, false, R.string.sem3_esd_p9),
                    Resposta(R.string.sem3_esd_p9r3, false, R.string.sem3_esd_p9),
                    Resposta(R.string.sem3_esd_p9r4, false, R.string.sem3_esd_p9)
                )
            ),
            Pergunta(R.string.sem3_esd_p10, 1,20,
                mutableListOf(
                    Resposta(R.string.sem3_esd_p10r1, true, R.string.sem3_esd_p10),
                    Resposta(R.string.sem3_esd_p10r2, false, R.string.sem3_esd_p10),
                    Resposta(R.string.sem3_esd_p10r3, false, R.string.sem3_esd_p10),
                    Resposta(R.string.sem3_esd_p10r4, false, R.string.sem3_esd_p10)
                )
            )
        )
    )

    private val sociedade = Materia(
        21,
        R.string.categ_sem3_sot,
        R.string.categ_sem3_sot_prof,
        3,
        0,
        R.color.colorLrnj,
        R.drawable.simb2com,
        R.drawable.fnd2com,
        false,
        mutableListOf(
            Pergunta(R.string.sem3_sot_p1, 1,21,
                mutableListOf(
                    Resposta(R.string.sem3_sot_p1r1, true, R.string.sem3_sot_p1),
                    Resposta(R.string.sem3_sot_p1r2, false, R.string.sem3_sot_p1),
                    Resposta(R.string.sem3_sot_p1r3, false, R.string.sem3_sot_p1),
                    Resposta(R.string.sem3_sot_p1r4, false, R.string.sem3_sot_p1),
                    Resposta(R.string.sem3_sot_p1r5, false, R.string.sem3_sot_p1)
                )
            ),
            Pergunta(R.string.sem3_sot_p2, 1,21,
                mutableListOf(
                    Resposta(R.string.sem3_sot_p2r1, true, R.string.sem3_sot_p2),
                    Resposta(R.string.sem3_sot_p2r2, false, R.string.sem3_sot_p2),
                    Resposta(R.string.sem3_sot_p2r3, false, R.string.sem3_sot_p2)
                )
            ),
            Pergunta(R.string.sem3_sot_p3, 1,21,
                mutableListOf(
                    Resposta(R.string.sem3_sot_p3r1, true, R.string.sem3_sot_p3),
                    Resposta(R.string.sem3_sot_p3r2, false, R.string.sem3_sot_p3),
                    Resposta(R.string.sem3_sot_p3r3, false, R.string.sem3_sot_p3)
                )
            ),
            Pergunta(R.string.sem3_sot_p4, 1,21,
                mutableListOf(
                    Resposta(R.string.sem3_sot_p4r1, true, R.string.sem3_sot_p4),
                    Resposta(R.string.sem3_sot_p4r2, false, R.string.sem3_sot_p4),
                    Resposta(R.string.sem3_sot_p4r3, false, R.string.sem3_sot_p4),
                    Resposta(R.string.sem3_sot_p4r4, false, R.string.sem3_sot_p4)
                )
            ),
            Pergunta(R.string.sem3_sot_p5, 1,21,
                mutableListOf(
                    Resposta(R.string.sem3_sot_p5r1, true, R.string.sem3_sot_p5),
                    Resposta(R.string.sem3_sot_p5r2, false, R.string.sem3_sot_p5),
                    Resposta(R.string.sem3_sot_p5r3, false, R.string.sem3_sot_p5)
                )
            ),
            Pergunta(R.string.sem3_sot_p6, 1,21,
                mutableListOf(
                    Resposta(R.string.sem3_sot_p6r1, true, R.string.sem3_sot_p6),
                    Resposta(R.string.sem3_sot_p6r2, false, R.string.sem3_sot_p6),
                    Resposta(R.string.sem3_sot_p6r3, false, R.string.sem3_sot_p6)
                )
            ),
            Pergunta(R.string.sem3_sot_p7, 1,21,
                mutableListOf(
                    Resposta(R.string.sem3_sot_p7r1, true, R.string.sem3_sot_p7),
                    Resposta(R.string.sem3_sot_p7r2, false, R.string.sem3_sot_p7),
                    Resposta(R.string.sem3_sot_p7r3, false, R.string.sem3_sot_p7)
                )
            ),
            Pergunta(R.string.sem3_sot_p8, 1,21,
                mutableListOf(
                    Resposta(R.string.sem3_sot_p8r1, true, R.string.sem3_sot_p8),
                    Resposta(R.string.sem3_sot_p8r2, false, R.string.sem3_sot_p8),
                    Resposta(R.string.sem3_sot_p8r3, false, R.string.sem3_sot_p8)
                )
            ),
            Pergunta(R.string.sem3_sot_p9, 1,21,
                mutableListOf(
                    Resposta(R.string.sem3_sot_p9r1, true, R.string.sem3_sot_p9),
                    Resposta(R.string.sem3_sot_p9r2, false, R.string.sem3_sot_p9),
                    Resposta(R.string.sem3_sot_p9r3, false, R.string.sem3_sot_p9),
                    Resposta(R.string.sem3_sot_p9r4, false, R.string.sem3_sot_p9),
                    Resposta(R.string.sem3_sot_p9r5, false, R.string.sem3_sot_p9)
                )
            ),
            Pergunta(R.string.sem3_sot_p10, 1,21,
                mutableListOf(
                    Resposta(R.string.sem3_sot_p10r1, true, R.string.sem3_sot_p10),
                    Resposta(R.string.sem3_sot_p10r2, false, R.string.sem3_sot_p10),
                    Resposta(R.string.sem3_sot_p10r3, false, R.string.sem3_sot_p10),
                    Resposta(R.string.sem3_sot_p10r4, false, R.string.sem3_sot_p10)
                )
            )
        )
    )

    private val engenharia = Materia(
        22,
        R.string.categ_sem3_es2,
        R.string.categ_sem3_es2_prof,
        3,
        0,
        R.color.colorRoxo,
        R.drawable.simb3es2,
        R.drawable.fnd2es1,
        false,
        mutableListOf(
            Pergunta(R.string.sem3_es2_p1, 1,22,
                mutableListOf(
                    Resposta(R.string.sem3_es2_p1r1, true, R.string.sem3_es2_p1),
                    Resposta(R.string.sem3_es2_p1r2, false, R.string.sem3_es2_p1),
                    Resposta(R.string.sem3_es2_p1r3, false, R.string.sem3_es2_p1),
                    Resposta(R.string.sem3_es2_p1r4, false, R.string.sem3_es2_p1)
                )
            ),
            Pergunta(R.string.sem3_es2_p2, 1,22,
                mutableListOf(
                    Resposta(R.string.sem3_es2_p2r1, true, R.string.sem3_es2_p2),
                    Resposta(R.string.sem3_es2_p2r2, false, R.string.sem3_es2_p2),
                    Resposta(R.string.sem3_es2_p2r3, false, R.string.sem3_es2_p2),
                    Resposta(R.string.sem3_es2_p2r4, false, R.string.sem3_es2_p2)
                )
            ),
            Pergunta(R.string.sem3_es2_p3, 1,22,
                mutableListOf(
                    Resposta(R.string.sem3_es2_p3r1, true, R.string.sem3_es2_p3),
                    Resposta(R.string.sem3_es2_p3r2, false, R.string.sem3_es2_p3),
                    Resposta(R.string.sem3_es2_p3r3, false, R.string.sem3_es2_p3),
                    Resposta(R.string.sem3_es2_p3r4, false, R.string.sem3_es2_p3)
                )
            ),
            Pergunta(R.string.sem3_es2_p4, 1,22,
                mutableListOf(
                    Resposta(R.string.sem3_es2_p4r1, true, R.string.sem3_es2_p4),
                    Resposta(R.string.sem3_es2_p4r2, false, R.string.sem3_es2_p4),
                    Resposta(R.string.sem3_es2_p4r3, false, R.string.sem3_es2_p4),
                    Resposta(R.string.sem3_es2_p4r4, false, R.string.sem3_es2_p4)
                )
            ),
            Pergunta(R.string.sem3_es2_p5, 1,22,
                mutableListOf(
                    Resposta(R.string.sem3_es2_p5r1, true, R.string.sem3_es2_p5),
                    Resposta(R.string.sem3_es2_p5r2, false, R.string.sem3_es2_p5),
                    Resposta(R.string.sem3_es2_p5r3, false, R.string.sem3_es2_p5)
                )
            ),
            Pergunta(R.string.sem3_es2_p6, 1,22,
                mutableListOf(
                    Resposta(R.string.sem3_es2_p6r1, true, R.string.sem3_es2_p6),
                    Resposta(R.string.sem3_es2_p6r2, false, R.string.sem3_es2_p6),
                    Resposta(R.string.sem3_es2_p6r3, false, R.string.sem3_es2_p6),
                    Resposta(R.string.sem3_es2_p6r4, false, R.string.sem3_es2_p6)
                )
            ),
            Pergunta(R.string.sem3_es2_p7, 1,22,
                mutableListOf(
                    Resposta(R.string.sem3_es2_p7r1, true, R.string.sem3_es2_p7),
                    Resposta(R.string.sem3_es2_p7r2, false, R.string.sem3_es2_p7),
                    Resposta(R.string.sem3_es2_p7r3, false, R.string.sem3_es2_p7),
                    Resposta(R.string.sem3_es2_p7r4, false, R.string.sem3_es2_p7),
                    Resposta(R.string.sem3_es2_p7r5, false, R.string.sem3_es2_p7)
                )
            ),
            Pergunta(R.string.sem3_es2_p8, 1,22,
                mutableListOf(
                    Resposta(R.string.sem3_es2_p8r1, true, R.string.sem3_es2_p8),
                    Resposta(R.string.sem3_es2_p8r2, false, R.string.sem3_es2_p8),
                    Resposta(R.string.sem3_es2_p8r3, false, R.string.sem3_es2_p8),
                    Resposta(R.string.sem3_es2_p8r4, false, R.string.sem3_es2_p8)
                )
            ),
            Pergunta(R.string.sem3_es2_p9, 1,22,
                mutableListOf(
                    Resposta(R.string.sem3_es2_p9r1, true, R.string.sem3_es2_p9),
                    Resposta(R.string.sem3_es2_p9r2, false, R.string.sem3_es2_p9),
                    Resposta(R.string.sem3_es2_p9r3, false, R.string.sem3_es2_p9),
                    Resposta(R.string.sem3_es2_p9r4, false, R.string.sem3_es2_p9),
                    Resposta(R.string.sem3_es2_p9r5, false, R.string.sem3_es2_p9)
                )
            ),
            Pergunta(R.string.sem3_es2_p10, 1,22,
                mutableListOf(
                    Resposta(R.string.sem3_es2_p10r1, true, R.string.sem3_es2_p10),
                    Resposta(R.string.sem3_es2_p10r2, false, R.string.sem3_es2_p10),
                    Resposta(R.string.sem3_es2_p10r3, false, R.string.sem3_es2_p10)
                )
            )
        )
    )

    private val estatistica = Materia(
        23,
        R.string.categ_sem3_eap,
        R.string.categ_sem3_eap_prof,
        3,
        0,
        R.color.colorCyan,
        R.drawable.simb3eap,
        R.drawable.fnd3eap,
        true,
        mutableListOf(
            Pergunta(R.string.sem3_eap_p1, 1,23,
                mutableListOf(
                    Resposta(R.string.sem3_eap_p1r1, true, R.string.sem3_eap_p1),
                    Resposta(R.string.sem3_eap_p1r2, false, R.string.sem3_eap_p1),
                    Resposta(R.string.sem3_eap_p1r3, false, R.string.sem3_eap_p1)
                )
            ),
            Pergunta(R.string.sem3_eap_p2, 1,23,
                mutableListOf(
                    Resposta(R.string.sem3_eap_p2r1, true, R.string.sem3_eap_p2),
                    Resposta(R.string.sem3_eap_p2r2, false, R.string.sem3_eap_p2),
                    Resposta(R.string.sem3_eap_p2r3, false, R.string.sem3_eap_p2)
                )
            ),
            Pergunta(R.string.sem3_eap_p3, 1,23,
                mutableListOf(
                    Resposta(R.string.sem3_eap_p3r1, true, R.string.sem3_eap_p3),
                    Resposta(R.string.sem3_eap_p3r2, false, R.string.sem3_eap_p3),
                    Resposta(R.string.sem3_eap_p3r3, false, R.string.sem3_eap_p3),
                    Resposta(R.string.sem3_eap_p3r4, false, R.string.sem3_eap_p3)
                )
            ),
            Pergunta(R.string.sem3_eap_p4, 1,23,
                mutableListOf(
                    Resposta(R.string.sem3_eap_p4r1, true, R.string.sem3_eap_p4),
                    Resposta(R.string.sem3_eap_p4r2, false, R.string.sem3_eap_p4),
                    Resposta(R.string.sem3_eap_p4r3, false, R.string.sem3_eap_p4)
                )
            ),
            Pergunta(R.string.sem3_eap_p5, 1,23,
                mutableListOf(
                    Resposta(R.string.sem3_eap_p5r1, true, R.string.sem3_eap_p5),
                    Resposta(R.string.sem3_eap_p5r2, false, R.string.sem3_eap_p5),
                    Resposta(R.string.sem3_eap_p5r3, false, R.string.sem3_eap_p5),
                    Resposta(R.string.sem3_eap_p5r4, false, R.string.sem3_eap_p5)
                )
            ),
            Pergunta(R.string.sem3_eap_p6, 1,23,
                mutableListOf(
                    Resposta(R.string.sem3_eap_p6r1, true, R.string.sem3_eap_p6),
                    Resposta(R.string.sem3_eap_p6r2, false, R.string.sem3_eap_p6),
                    Resposta(R.string.sem3_eap_p6r3, false, R.string.sem3_eap_p6),
                    Resposta(R.string.sem3_eap_p6r4, false, R.string.sem3_eap_p6)
                )
            ),
            Pergunta(R.string.sem3_eap_p7, 1,23,
                mutableListOf(
                    Resposta(R.string.sem3_eap_p7r1, true, R.string.sem3_eap_p7),
                    Resposta(R.string.sem3_eap_p7r2, false, R.string.sem3_eap_p7),
                    Resposta(R.string.sem3_eap_p7r3, false, R.string.sem3_eap_p7),
                    Resposta(R.string.sem3_eap_p7r4, false, R.string.sem3_eap_p7)
                )
            ),
            Pergunta(R.string.sem3_eap_p8, 1,23,
                mutableListOf(
                    Resposta(R.string.sem3_eap_p8r1, true, R.string.sem3_eap_p8),
                    Resposta(R.string.sem3_eap_p8r2, false, R.string.sem3_eap_p8),
                    Resposta(R.string.sem3_eap_p8r3, false, R.string.sem3_eap_p8)
                )
            ),
            Pergunta(R.string.sem3_eap_p9, 1,23,
                mutableListOf(
                    Resposta(R.string.sem3_eap_p9r1, true, R.string.sem3_eap_p9),
                    Resposta(R.string.sem3_eap_p9r2, false, R.string.sem3_eap_p9),
                    Resposta(R.string.sem3_eap_p9r3, false, R.string.sem3_eap_p9),
                    Resposta(R.string.sem3_eap_p9r4, false, R.string.sem3_eap_p9)
                )
            ),
            Pergunta(R.string.sem3_eap_p10, 1,23,
                mutableListOf(
                    Resposta(R.string.sem3_eap_p10r1, true, R.string.sem3_eap_p10),
                    Resposta(R.string.sem3_eap_p10r2, false, R.string.sem3_eap_p10),
                    Resposta(R.string.sem3_eap_p10r3, false, R.string.sem3_eap_p10),
                    Resposta(R.string.sem3_eap_p10r4, false, R.string.sem3_eap_p10)
                )
            )
        )
    )

    private val economia = Materia(
        24,
        R.string.categ_sem3_efi,
        R.string.categ_sem3_efi_prof,
        3,
        0,
        R.color.colorAmrl,
        R.drawable.simb2cnt,
        R.drawable.fnd2cnt,
        true,
        mutableListOf(
            Pergunta(R.string.sem3_efi_p1, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p1r1, true, R.string.sem3_efi_p1),
                    Resposta(R.string.sem3_efi_p1r2, false, R.string.sem3_efi_p1),
                    Resposta(R.string.sem3_efi_p1r3, false, R.string.sem3_efi_p1)
                )
            ),
            Pergunta(R.string.sem3_efi_p2, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p2r1, true, R.string.sem3_efi_p2),
                    Resposta(R.string.sem3_efi_p2r2, false, R.string.sem3_efi_p2),
                    Resposta(R.string.sem3_efi_p2r3, false, R.string.sem3_efi_p2)
                )
            ),
            Pergunta(R.string.sem3_efi_p3, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p3r1, true, R.string.sem3_efi_p3),
                    Resposta(R.string.sem3_efi_p3r2, false, R.string.sem3_efi_p3),
                    Resposta(R.string.sem3_efi_p3r3, false, R.string.sem3_efi_p3),
                    Resposta(R.string.sem3_efi_p3r4, false, R.string.sem3_efi_p3)
                )
            ),
            Pergunta(R.string.sem3_efi_p4, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p4r1, true, R.string.sem3_efi_p4),
                    Resposta(R.string.sem3_efi_p4r2, false, R.string.sem3_efi_p4)
                )
            ),
            Pergunta(R.string.sem3_efi_p5, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p5r1, true, R.string.sem3_efi_p5),
                    Resposta(R.string.sem3_efi_p5r2, false, R.string.sem3_efi_p5)
                )
            ),
            Pergunta(R.string.sem3_efi_p6, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p6r1, true, R.string.sem3_efi_p6),
                    Resposta(R.string.sem3_efi_p6r2, false, R.string.sem3_efi_p6),
                    Resposta(R.string.sem3_efi_p6r3, false, R.string.sem3_efi_p6)
                )
            ),
            Pergunta(R.string.sem3_efi_p7, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p7r1, true, R.string.sem3_efi_p7),
                    Resposta(R.string.sem3_efi_p7r2, false, R.string.sem3_efi_p7),
                    Resposta(R.string.sem3_efi_p7r3, false, R.string.sem3_efi_p7),
                    Resposta(R.string.sem3_efi_p7r4, false, R.string.sem3_efi_p7)
                )
            ),
            Pergunta(R.string.sem3_efi_p8, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p8r1, true, R.string.sem3_efi_p8),
                    Resposta(R.string.sem3_efi_p8r2, false, R.string.sem3_efi_p8),
                    Resposta(R.string.sem3_efi_p8r3, false, R.string.sem3_efi_p8)
                )
            ),
            Pergunta(R.string.sem3_efi_p9, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p9r1, true, R.string.sem3_efi_p9),
                    Resposta(R.string.sem3_efi_p9r2, false, R.string.sem3_efi_p9),
                    Resposta(R.string.sem3_efi_p9r3, false, R.string.sem3_efi_p9)
                )
            ),
            Pergunta(R.string.sem3_efi_p10, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p10r1, true, R.string.sem3_efi_p10),
                    Resposta(R.string.sem3_efi_p10r2, false, R.string.sem3_efi_p10),
                    Resposta(R.string.sem3_efi_p10r3, false, R.string.sem3_efi_p10),
                    Resposta(R.string.sem3_efi_p10r4, false, R.string.sem3_efi_p10)
                )
            )
        )
    )

    private val ingles = Materia(
        25,
        R.string.categ_sem3_eng,
        R.string.categ_sem3_eng_prof,
        3,
        0,
        R.color.colorMagt,
        R.drawable.simbeng,
        R.drawable.fndeng,
        false,
        mutableListOf(
            Pergunta(R.string.sem3_eng_p1, 1,25,
                mutableListOf(
                    Resposta(R.string.sem3_eng_p1r1, true, R.string.sem3_eng_p1),
                    Resposta(R.string.sem3_eng_p1r2, false, R.string.sem3_eng_p1),
                    Resposta(R.string.sem3_eng_p1r3, false, R.string.sem3_eng_p1),
                    Resposta(R.string.sem3_eng_p1r4, false, R.string.sem3_eng_p1)
                )
            ),
            Pergunta(R.string.sem3_eng_p2, 1,25,
                mutableListOf(
                    Resposta(R.string.sem3_eng_p2r1, true, R.string.sem3_eng_p2),
                    Resposta(R.string.sem3_eng_p2r2, false, R.string.sem3_eng_p2),
                    Resposta(R.string.sem3_eng_p2r3, false, R.string.sem3_eng_p2),
                    Resposta(R.string.sem3_eng_p2r4, false, R.string.sem3_eng_p2)
                )
            ),
            Pergunta(R.string.sem3_eng_p3, 1,25,
                mutableListOf(
                    Resposta(R.string.sem3_eng_p3r1, true, R.string.sem3_eng_p3),
                    Resposta(R.string.sem3_eng_p3r2, false, R.string.sem3_eng_p3),
                    Resposta(R.string.sem3_eng_p3r3, false, R.string.sem3_eng_p3)
                )
            ),
            Pergunta(R.string.sem3_eng_p4, 1,25,
                mutableListOf(
                    Resposta(R.string.sem3_eng_p4r1, true, R.string.sem3_eng_p4),
                    Resposta(R.string.sem3_eng_p4r2, false, R.string.sem3_eng_p4),
                    Resposta(R.string.sem3_eng_p4r3, false, R.string.sem3_eng_p4),
                    Resposta(R.string.sem3_eng_p4r4, false, R.string.sem3_eng_p4)
                )
            ),
            Pergunta(R.string.sem3_eng_p5, 1,25,
                mutableListOf(
                    Resposta(R.string.sem3_eng_p5r1, true, R.string.sem3_eng_p5),
                    Resposta(R.string.sem3_eng_p5r2, false, R.string.sem3_eng_p5),
                    Resposta(R.string.sem3_eng_p5r3, false, R.string.sem3_eng_p5),
                    Resposta(R.string.sem3_eng_p5r4, false, R.string.sem3_eng_p5)
                )
            ),
            Pergunta(R.string.sem3_eng_p6, 1,25,
                mutableListOf(
                    Resposta(R.string.sem3_eng_p6r1, true, R.string.sem3_eng_p6),
                    Resposta(R.string.sem3_eng_p6r2, false, R.string.sem3_eng_p6),
                    Resposta(R.string.sem3_eng_p6r3, false, R.string.sem3_eng_p6),
                    Resposta(R.string.sem3_eng_p6r4, false, R.string.sem3_eng_p6),
                    Resposta(R.string.sem3_eng_p6r5, false, R.string.sem3_eng_p6)
                )
            ),
            Pergunta(R.string.sem3_eng_p7, 1,25,
                mutableListOf(
                    Resposta(R.string.sem3_eng_p7r1, true, R.string.sem3_eng_p7),
                    Resposta(R.string.sem3_eng_p7r2, false, R.string.sem3_eng_p7),
                    Resposta(R.string.sem3_eng_p7r3, false, R.string.sem3_eng_p7),
                    Resposta(R.string.sem3_eng_p7r4, false, R.string.sem3_eng_p7),
                    Resposta(R.string.sem3_eng_p7r5, false, R.string.sem3_eng_p7)
                )
            ),
            Pergunta(R.string.sem3_eng_p8, 1,25,
                mutableListOf(
                    Resposta(R.string.sem3_eng_p8r1, true, R.string.sem3_eng_p8),
                    Resposta(R.string.sem3_eng_p8r2, false, R.string.sem3_eng_p8),
                    Resposta(R.string.sem3_eng_p8r3, false, R.string.sem3_eng_p8),
                    Resposta(R.string.sem3_eng_p8r4, false, R.string.sem3_eng_p8),
                    Resposta(R.string.sem3_eng_p8r5, false, R.string.sem3_eng_p8)
                )
            ),
            Pergunta(R.string.sem3_eng_p9, 1,25,
                mutableListOf(
                    Resposta(R.string.sem3_eng_p9r1, true, R.string.sem3_eng_p9),
                    Resposta(R.string.sem3_eng_p9r2, false, R.string.sem3_eng_p9),
                    Resposta(R.string.sem3_eng_p9r3, false, R.string.sem3_eng_p9),
                    Resposta(R.string.sem3_eng_p9r4, false, R.string.sem3_eng_p9)
                )
            ),
            Pergunta(R.string.sem3_eng_p10, 1,25,
                mutableListOf(
                    Resposta(R.string.sem3_eng_p10r1, true, R.string.sem3_eng_p10),
                    Resposta(R.string.sem3_eng_p10r2, false, R.string.sem3_eng_p10),
                    Resposta(R.string.sem3_eng_p10r3, false, R.string.sem3_eng_p10),
                    Resposta(R.string.sem3_eng_p10r4, false, R.string.sem3_eng_p10)
                )
            )
        )
    )

    private val interacao = Materia(
        26,
        R.string.categ_sem3_ihc,
        R.string.categ_sem3_ihc_prof,
        3,
        0,
        R.color.colorAzul,
        R.drawable.simb3ihc,
        R.drawable.fnd3ihc,
        false,
        mutableListOf(
            Pergunta(R.string.sem3_ihc_p1, 1,26,
                mutableListOf(
                    Resposta(R.string.sem3_ihc_p1r1, true, R.string.sem3_ihc_p1),
                    Resposta(R.string.sem3_ihc_p1r2, false, R.string.sem3_ihc_p1),
                    Resposta(R.string.sem3_ihc_p1r3, false, R.string.sem3_ihc_p1),
                    Resposta(R.string.sem3_ihc_p1r4, false, R.string.sem3_ihc_p1),
                    Resposta(R.string.sem3_ihc_p1r5, false, R.string.sem3_ihc_p1)
                )
            ),
            Pergunta(R.string.sem3_ihc_p2, 1,26,
                mutableListOf(
                    Resposta(R.string.sem3_ihc_p2r1, true, R.string.sem3_ihc_p2),
                    Resposta(R.string.sem3_ihc_p2r2, false, R.string.sem3_ihc_p2),
                    Resposta(R.string.sem3_ihc_p2r3, false, R.string.sem3_ihc_p2),
                    Resposta(R.string.sem3_ihc_p2r4, false, R.string.sem3_ihc_p2)
                )
            ),
            Pergunta(R.string.sem3_ihc_p3, 1,26,
                mutableListOf(
                    Resposta(R.string.sem3_ihc_p3r1, true, R.string.sem3_ihc_p3),
                    Resposta(R.string.sem3_ihc_p3r2, false, R.string.sem3_ihc_p3),
                    Resposta(R.string.sem3_ihc_p3r3, false, R.string.sem3_ihc_p3),
                    Resposta(R.string.sem3_ihc_p3r4, false, R.string.sem3_ihc_p3)
                )
            ),
            Pergunta(R.string.sem3_ihc_p4, 1,26,
                mutableListOf(
                    Resposta(R.string.sem3_ihc_p4r1, true, R.string.sem3_ihc_p4),
                    Resposta(R.string.sem3_ihc_p4r2, false, R.string.sem3_ihc_p4),
                    Resposta(R.string.sem3_ihc_p4r3, false, R.string.sem3_ihc_p4),
                    Resposta(R.string.sem3_ihc_p4r4, false, R.string.sem3_ihc_p4),
                    Resposta(R.string.sem3_ihc_p4r5, false, R.string.sem3_ihc_p4)
                )
            ),
            Pergunta(R.string.sem3_ihc_p5, 1,26,
                mutableListOf(
                    Resposta(R.string.sem3_ihc_p5r1, true, R.string.sem3_ihc_p5),
                    Resposta(R.string.sem3_ihc_p5r2, false, R.string.sem3_ihc_p5),
                    Resposta(R.string.sem3_ihc_p5r3, false, R.string.sem3_ihc_p5)
                )
            ),
            Pergunta(R.string.sem3_ihc_p6, 1,26,
                mutableListOf(
                    Resposta(R.string.sem3_ihc_p6r1, true, R.string.sem3_ihc_p6),
                    Resposta(R.string.sem3_ihc_p6r2, false, R.string.sem3_ihc_p6),
                    Resposta(R.string.sem3_ihc_p6r3, false, R.string.sem3_ihc_p6)
                )
            ),
            Pergunta(R.string.sem3_ihc_p7, 1,26,
                mutableListOf(
                    Resposta(R.string.sem3_ihc_p7r1, true, R.string.sem3_ihc_p7),
                    Resposta(R.string.sem3_ihc_p7r2, false, R.string.sem3_ihc_p7)
                )
            ),
            Pergunta(R.string.sem3_ihc_p8, 1,26,
                mutableListOf(
                    Resposta(R.string.sem3_ihc_p8r1, true, R.string.sem3_ihc_p8),
                    Resposta(R.string.sem3_ihc_p8r2, false, R.string.sem3_ihc_p8),
                    Resposta(R.string.sem3_ihc_p8r3, false, R.string.sem3_ihc_p8),
                    Resposta(R.string.sem3_ihc_p8r4, false, R.string.sem3_ihc_p8),
                    Resposta(R.string.sem3_ihc_p8r5, false, R.string.sem3_ihc_p8)
                )
            ),
            Pergunta(R.string.sem3_ihc_p9, 1,26,
                mutableListOf(
                    Resposta(R.string.sem3_ihc_p9r1, true, R.string.sem3_ihc_p9),
                    Resposta(R.string.sem3_ihc_p9r2, false, R.string.sem3_ihc_p9),
                    Resposta(R.string.sem3_ihc_p9r3, false, R.string.sem3_ihc_p9),
                    Resposta(R.string.sem3_ihc_p9r4, false, R.string.sem3_ihc_p9),
                    Resposta(R.string.sem3_ihc_p9r5, false, R.string.sem3_ihc_p9)
                )
            ),
            Pergunta(R.string.sem3_ihc_p10, 1,26,
                mutableListOf(
                    Resposta(R.string.sem3_ihc_p10r1, true, R.string.sem3_ihc_p10),
                    Resposta(R.string.sem3_ihc_p10r2, false, R.string.sem3_ihc_p10),
                    Resposta(R.string.sem3_ihc_p10r3, false, R.string.sem3_ihc_p10),
                    Resposta(R.string.sem3_ihc_p10r4, false, R.string.sem3_ihc_p10),
                    Resposta(R.string.sem3_ihc_p10r5, false, R.string.sem3_ihc_p10),
                    Resposta(R.string.sem3_ihc_p10r6, false, R.string.sem3_ihc_p10)
                )
            )
        )
    )

    private val sistOps = Materia(
        27,
        R.string.categ_sem3_so1,
        R.string.categ_sem3_so1_prof,
        3,
        0,
        R.color.colorRosa,
        R.drawable.simb3so1,
        R.drawable.fnd3so1,
        true,
        mutableListOf(
            Pergunta(R.string.sem3_so1_p1, 1,27,
                mutableListOf(
                    Resposta(R.string.sem3_so1_p1r1, true, R.string.sem3_so1_p1),
                    Resposta(R.string.sem3_so1_p1r2, false, R.string.sem3_so1_p1),
                    Resposta(R.string.sem3_so1_p1r3, false, R.string.sem3_so1_p1),
                    Resposta(R.string.sem3_so1_p1r4, false, R.string.sem3_so1_p1)
                )
            ),
            Pergunta(R.string.sem3_so1_p2, 1,27,
                mutableListOf(
                    Resposta(R.string.sem3_so1_p2r1, true, R.string.sem3_so1_p2),
                    Resposta(R.string.sem3_so1_p2r2, false, R.string.sem3_so1_p2),
                    Resposta(R.string.sem3_so1_p2r3, false, R.string.sem3_so1_p2),
                    Resposta(R.string.sem3_so1_p2r4, false, R.string.sem3_so1_p2)
                )
            ),
            Pergunta(R.string.sem3_so1_p3, 1,27,
                mutableListOf(
                    Resposta(R.string.sem3_so1_p3r1, true, R.string.sem3_so1_p3),
                    Resposta(R.string.sem3_so1_p3r2, false, R.string.sem3_so1_p3)
                )
            ),
            Pergunta(R.string.sem3_so1_p4, 1,27,
                mutableListOf(
                    Resposta(R.string.sem3_so1_p4r1, true, R.string.sem3_so1_p4),
                    Resposta(R.string.sem3_so1_p4r2, false, R.string.sem3_so1_p4)
                )
            ),
            Pergunta(R.string.sem3_so1_p5, 1,27,
                mutableListOf(
                    Resposta(R.string.sem3_so1_p5r1, true, R.string.sem3_so1_p5),
                    Resposta(R.string.sem3_so1_p5r2, false, R.string.sem3_so1_p5),
                    Resposta(R.string.sem3_so1_p5r3, false, R.string.sem3_so1_p5),
                    Resposta(R.string.sem3_so1_p5r4, false, R.string.sem3_so1_p5)
                )
            ),
            Pergunta(R.string.sem3_so1_p6, 1,27,
                mutableListOf(
                    Resposta(R.string.sem3_so1_p6r1, true, R.string.sem3_so1_p6),
                    Resposta(R.string.sem3_so1_p6r2, false, R.string.sem3_so1_p6),
                    Resposta(R.string.sem3_so1_p6r3, false, R.string.sem3_so1_p6),
                    Resposta(R.string.sem3_so1_p6r4, false, R.string.sem3_so1_p6)
                )
            ),
            Pergunta(R.string.sem3_so1_p7, 1,27,
                mutableListOf(
                    Resposta(R.string.sem3_so1_p7r1, true, R.string.sem3_so1_p7),
                    Resposta(R.string.sem3_so1_p7r2, false, R.string.sem3_so1_p7),
                    Resposta(R.string.sem3_so1_p7r3, false, R.string.sem3_so1_p7),
                    Resposta(R.string.sem3_so1_p7r4, false, R.string.sem3_so1_p7)
                )
            ),
            Pergunta(R.string.sem3_so1_p8, 1,27,
                mutableListOf(
                    Resposta(R.string.sem3_so1_p8r1, true, R.string.sem3_so1_p8),
                    Resposta(R.string.sem3_so1_p8r2, false, R.string.sem3_so1_p8),
                    Resposta(R.string.sem3_so1_p8r3, false, R.string.sem3_so1_p8),
                    Resposta(R.string.sem3_so1_p8r4, false, R.string.sem3_so1_p8)
                )
            ),
            Pergunta(R.string.sem3_so1_p9, 1,27,
                mutableListOf(
                    Resposta(R.string.sem3_so1_p9r1, true, R.string.sem3_so1_p9),
                    Resposta(R.string.sem3_so1_p9r2, false, R.string.sem3_so1_p9),
                    Resposta(R.string.sem3_so1_p9r3, false, R.string.sem3_so1_p9),
                    Resposta(R.string.sem3_so1_p9r4, false, R.string.sem3_so1_p9)
                )
            ),
            Pergunta(R.string.sem3_so1_p10, 1,27,
                mutableListOf(
                    Resposta(R.string.sem3_so1_p10r1, true, R.string.sem3_so1_p10),
                    Resposta(R.string.sem3_so1_p10r2, false, R.string.sem3_so1_p10),
                    Resposta(R.string.sem3_so1_p10r3, false, R.string.sem3_so1_p10),
                    Resposta(R.string.sem3_so1_p10r4, false, R.string.sem3_so1_p10)
                )
            )
        )
    )

    val imagemHeader = R.drawable.appsocoronga

    fun getMaterias() : Array<Materia> {
        return arrayOf(
            dados,
            sociedade,
            engenharia,
            estatistica,
            economia,
            ingles,
            interacao,
            sistOps
        )
    }

}