package com.test.miltonio.modelo

import com.test.miltonio.R

class Semestre1Materias {
    val sem1Array = arrayOf(
        Semestre1(
            0,
            0,
            R.color.colorCyan,
            R.drawable.simb1mat,
            R.drawable.fnd1mat,
            true,
            R.string.categ_sem1_mat_prof,
            R.string.categ_sem1_mat,
            R.array.sem1_mat_perguntas
        ),
        Semestre1(
            1,
            0,
            R.color.colorRoxo,
            R.drawable.simb1alg,
            R.drawable.fnd1alg,
            false,
            R.string.categ_sem1_alg_prof,
            R.string.categ_sem1_alg,
            R.array.sem1_alg_perguntas
        ),
        Semestre1(
            2,
            0,
            R.color.colorMagt,
            R.drawable.simbeng,
            R.drawable.fndeng,
            false,
            R.string.categ_sem1_eng_prof,
            R.string.categ_sem1_eng,
            R.array.sem1_eng_perguntas
        ),
        Semestre1(
            3,
            0,
            R.color.colorAzul,
            R.drawable.simb1aoc,
            R.drawable.fnd1aoc,
            false,
            R.string.categ_sem1_aoc_prof,
            R.string.categ_sem1_aoc,
            R.array.sem1_aoc_perguntas
        ),
        Semestre1(
            4,
            0,
            R.color.colorLrnj,
            R.drawable.simb1lhw,
            R.drawable.fnd1lhw,
            true,
            R.string.categ_sem1_lhw_prof,
            R.string.categ_sem1_lhw,
            R.array.sem1_lhw_perguntas
        ),
        Semestre1(
            5,
            0,
            R.color.colorAmrl,
            R.drawable.simb1adm,
            R.drawable.fnd1adm,
            true,
            R.string.categ_sem1_adm_prof,
            R.string.categ_sem1_adm,
            R.array.sem1_adm_perguntas
        ),
        Semestre1(
            6,
            0,
            R.color.colorVerdEsc,
            R.drawable.simb1prg,
            R.drawable.fnd1prg,
            false,
            R.string.categ_sem1_prg_prof,
            R.string.categ_sem1_prg,
            R.array.sem1_prg_perguntas
        )
    )

    fun Semestre1Materias() {

    }

    fun getMaterias() :Array<Semestre1> {
        return sem1Array
    }
}