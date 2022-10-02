package br.fatec.miltonio.objetos.semestre_3

import br.fatec.miltonio.R
import br.fatec.miltonio.modelo.Materia
import br.fatec.miltonio.modelo.Pergunta
import br.fatec.miltonio.modelo.Resposta

class Economia {
    val materia = Materia(
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
            Pergunta(
                R.string.sem3_efi_p1, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p1r1, true, R.string.sem3_efi_p1),
                    Resposta(R.string.sem3_efi_p1r2, false, R.string.sem3_efi_p1),
                    Resposta(R.string.sem3_efi_p1r3, false, R.string.sem3_efi_p1)
                )
            ),
            Pergunta(
                R.string.sem3_efi_p2, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p2r1, true, R.string.sem3_efi_p2),
                    Resposta(R.string.sem3_efi_p2r2, false, R.string.sem3_efi_p2),
                    Resposta(R.string.sem3_efi_p2r3, false, R.string.sem3_efi_p2)
                )
            ),
            Pergunta(
                R.string.sem3_efi_p3, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p3r1, true, R.string.sem3_efi_p3),
                    Resposta(R.string.sem3_efi_p3r2, false, R.string.sem3_efi_p3),
                    Resposta(R.string.sem3_efi_p3r3, false, R.string.sem3_efi_p3),
                    Resposta(R.string.sem3_efi_p3r4, false, R.string.sem3_efi_p3)
                )
            ),
            Pergunta(
                R.string.sem3_efi_p4, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p4r1, true, R.string.sem3_efi_p4),
                    Resposta(R.string.sem3_efi_p4r2, false, R.string.sem3_efi_p4)
                )
            ),
            Pergunta(
                R.string.sem3_efi_p5, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p5r1, true, R.string.sem3_efi_p5),
                    Resposta(R.string.sem3_efi_p5r2, false, R.string.sem3_efi_p5)
                )
            ),
            Pergunta(
                R.string.sem3_efi_p6, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p6r1, true, R.string.sem3_efi_p6),
                    Resposta(R.string.sem3_efi_p6r2, false, R.string.sem3_efi_p6),
                    Resposta(R.string.sem3_efi_p6r3, false, R.string.sem3_efi_p6)
                )
            ),
            Pergunta(
                R.string.sem3_efi_p7, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p7r1, true, R.string.sem3_efi_p7),
                    Resposta(R.string.sem3_efi_p7r2, false, R.string.sem3_efi_p7),
                    Resposta(R.string.sem3_efi_p7r3, false, R.string.sem3_efi_p7),
                    Resposta(R.string.sem3_efi_p7r4, false, R.string.sem3_efi_p7)
                )
            ),
            Pergunta(
                R.string.sem3_efi_p8, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p8r1, true, R.string.sem3_efi_p8),
                    Resposta(R.string.sem3_efi_p8r2, false, R.string.sem3_efi_p8),
                    Resposta(R.string.sem3_efi_p8r3, false, R.string.sem3_efi_p8)
                )
            ),
            Pergunta(
                R.string.sem3_efi_p9, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p9r1, true, R.string.sem3_efi_p9),
                    Resposta(R.string.sem3_efi_p9r2, false, R.string.sem3_efi_p9),
                    Resposta(R.string.sem3_efi_p9r3, false, R.string.sem3_efi_p9)
                )
            ),
            Pergunta(
                R.string.sem3_efi_p10, 1,24,
                mutableListOf(
                    Resposta(R.string.sem3_efi_p10r1, true, R.string.sem3_efi_p10),
                    Resposta(R.string.sem3_efi_p10r2, false, R.string.sem3_efi_p10),
                    Resposta(R.string.sem3_efi_p10r3, false, R.string.sem3_efi_p10),
                    Resposta(R.string.sem3_efi_p10r4, false, R.string.sem3_efi_p10)
                )
            )
        )
    )
}
