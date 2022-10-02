package br.fatec.miltonio.objetos.semestre_4

import br.fatec.miltonio.R
import br.fatec.miltonio.modelo.Materia
import br.fatec.miltonio.modelo.Pergunta
import br.fatec.miltonio.modelo.Resposta

class ProgMov {
    val materia = Materia(
        36,
        R.string.categ_sem4_pdm,
        R.string.categ_sem4_pdm_prof,
        6,
        0,
        R.color.colorLrnj,
        R.drawable.simb4pdm,
        R.drawable.fnd4pdm,
        false,
        mutableListOf(
            Pergunta(
                R.string.sem4_pdm_p1, 1,36,
                mutableListOf(
                    Resposta(R.string.sem4_pdm_p1r1, true, R.string.sem4_pdm_p1),
                    Resposta(R.string.sem4_pdm_p1r2, false, R.string.sem4_pdm_p1),
                    Resposta(R.string.sem4_pdm_p1r3, false, R.string.sem4_pdm_p1),
                    Resposta(R.string.sem4_pdm_p1r4, false, R.string.sem4_pdm_p1)
                )
            )
        )
    )
}
