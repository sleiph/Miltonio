package com.test.miltonio.modelo

import com.test.miltonio.R

class Semestre2Materias {
    val sem2Array = arrayOf(
        Semestre2(
            0,
            0,
            R.color.colorCyan,
            R.drawable.simb1mat,
            R.drawable.fnd1mat,
            true,
            R.string.categ_sem2_cal_prof,
            R.string.categ_sem2_cal,
            R.array.sem2_cal_perguntas
        ),
        Semestre2(
            1,
            0,
            R.color.colorVerdEsc,
            R.drawable.simb2lnp,
            R.drawable.fnd2lnp,
            false,
            R.string.categ_sem2_lnp_prof,
            R.string.categ_sem2_lnp,
            R.array.sem2_lnp_perguntas
        ),
        Semestre2(
            2,
            0,
            R.color.colorMagt,
            R.drawable.simbeng,
            R.drawable.fndeng,
            false,
            R.string.categ_sem2_eng_prof,
            R.string.categ_sem2_eng,
            R.array.sem2_eng_perguntas
        ),
        Semestre2(
            3,
            0,
            R.color.colorAmrl,
            R.drawable.simb2cnt,
            R.drawable.fnd2cnt,
            true,
            R.string.categ_sem2_cnt_prof,
            R.string.categ_sem2_cnt,
            R.array.sem2_cnt_perguntas
        ),
        Semestre2(
            4,
            0,
            R.color.colorAzul,
            R.drawable.simb2sis,
            R.drawable.fnd2sis,
            false,
            R.string.categ_sem2_sis_prof,
            R.string.categ_sem2_sis,
            R.array.sem2_sis_perguntas
        ),
        Semestre2(
            5,
            0,
            R.color.colorLrnj,
            R.drawable.simb2com,
            R.drawable.fnd2com,
            false,
            R.string.categ_sem2_com_prof,
            R.string.categ_sem2_com,
            R.array.sem2_com_perguntas
        ),
        Semestre2(
            6,
            0,
            R.color.colorRoxo,
            R.drawable.simb2es1,
            R.drawable.fnd2es1,
            false,
            R.string.categ_sem2_es1_prof,
            R.string.categ_sem2_es1,
            R.array.sem2_es1_perguntas
        )
    )

    fun Semestre2Materias() {

    }

    fun getMaterias() : Array<Semestre2> {
        return sem2Array
    }
}