package com.test.miltonio.objetos

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia

class Semestre2 {
    val materiasSemestre = arrayOf(
        Materia(
            10,
            0,
            R.color.colorCyan,
            R.drawable.simb1mat,
            R.drawable.fnd1mat,
            true,
            R.string.categ_sem2_cal_prof,
            R.string.categ_sem2_cal,
            2,
            R.array.sem2_cal_perguntas
        ),
        Materia(
            11,
            0,
            R.color.colorVerdEsc,
            R.drawable.simb2lnp,
            R.drawable.fnd2lnp,
            false,
            R.string.categ_sem2_lnp_prof,
            R.string.categ_sem2_lnp,
            2,
            R.array.sem2_lnp_perguntas
        ),
        Materia(
            12,
            0,
            R.color.colorMagt,
            R.drawable.simbeng,
            R.drawable.fndeng,
            false,
            R.string.categ_sem2_eng_prof,
            R.string.categ_sem2_eng,
            2,
            R.array.sem2_eng_perguntas
        ),
        Materia(
            13,
            0,
            R.color.colorAmrl,
            R.drawable.simb2cnt,
            R.drawable.fnd2cnt,
            true,
            R.string.categ_sem2_cnt_prof,
            R.string.categ_sem2_cnt,
            2,
            R.array.sem2_cnt_perguntas
        ),
        Materia(
            14,
            0,
            R.color.colorAzul,
            R.drawable.simb2sis,
            R.drawable.fnd2sis,
            false,
            R.string.categ_sem2_sis_prof,
            R.string.categ_sem2_sis,
            2,
            R.array.sem2_sis_perguntas
        ),
        Materia(
            15,
            0,
            R.color.colorLrnj,
            R.drawable.simb2com,
            R.drawable.fnd2com,
            false,
            R.string.categ_sem2_com_prof,
            R.string.categ_sem2_com,
            2,
            R.array.sem2_com_perguntas
        ),
        Materia(
            16,
            0,
            R.color.colorRoxo,
            R.drawable.simb2es1,
            R.drawable.fnd2es1,
            false,
            R.string.categ_sem2_es1_prof,
            R.string.categ_sem2_es1,
            2,
            R.array.sem2_es1_perguntas
        )
    )

    val imagemHeader = R.drawable.appsocoronga

    fun getMaterias() : Array<Materia> {
        return materiasSemestre
    }

    fun getImageHeader() : Int {
        return imagemHeader
    }
}