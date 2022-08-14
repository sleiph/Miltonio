package com.test.miltonio.objetos.semestre_6

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta

class Empreendedorismo {
    val materia = Materia(
        51,
        R.string.categ_sem6_emp,
        R.string.categ_sem6_emp_prof,
        6,
        0,
        R.color.colorAmrl,
        R.drawable.simb1adm,
        R.drawable.fnd1adm,
        true,
        mutableListOf(
            Pergunta(
                R.string.sem6_emp_p1, 1,51,
                mutableListOf(
                    Resposta(R.string.sem6_emp_p1r1, true, R.string.sem6_emp_p1),
                    Resposta(R.string.sem6_emp_p1r2, false, R.string.sem6_emp_p1),
                    Resposta(R.string.sem6_emp_p1r3, false, R.string.sem6_emp_p1),
                    Resposta(R.string.sem6_emp_p1r4, false, R.string.sem6_emp_p1)
                )
            )
        )
    )
}