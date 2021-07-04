package com.test.miltonio.modelo

import com.test.miltonio.R

class Semestre1 {
    val materiasSemestre = arrayOf(
        Materia(
            0,
            0,
            R.color.colorCyan,
            R.drawable.simb1mat,
            R.drawable.fnd1mat,
            true,
            R.string.categ_sem1_mat_prof,
            R.string.categ_sem1_mat,
            1,
            R.array.sem1_mat_perguntas
        ),
        Materia(
            1,
            0,
            R.color.colorRoxo,
            R.drawable.simb1alg,
            R.drawable.fnd1alg,
            false,
            R.string.categ_sem1_alg_prof,
            R.string.categ_sem1_alg,
            1,
            R.array.sem1_alg_perguntas
        ),
        Materia(
            2,
            0,
            R.color.colorMagt,
            R.drawable.simbeng,
            R.drawable.fndeng,
            false,
            R.string.categ_sem1_eng_prof,
            R.string.categ_sem1_eng,
            1,
            R.array.sem1_eng_perguntas
        ),
        Materia(
            3,
            0,
            R.color.colorAzul,
            R.drawable.simb1aoc,
            R.drawable.fnd1aoc,
            false,
            R.string.categ_sem1_aoc_prof,
            R.string.categ_sem1_aoc,
            1,
            R.array.sem1_aoc_perguntas
        ),
        Materia(
            4,
            0,
            R.color.colorLrnj,
            R.drawable.simb1lhw,
            R.drawable.fnd1lhw,
            true,
            R.string.categ_sem1_lhw_prof,
            R.string.categ_sem1_lhw,
            1,
            R.array.sem1_lhw_perguntas
        ),
        Materia(
            5,
            0,
            R.color.colorAmrl,
            R.drawable.simb1adm,
            R.drawable.fnd1adm,
            true,
            R.string.categ_sem1_adm_prof,
            R.string.categ_sem1_adm,
            1,
            R.array.sem1_adm_perguntas
        ),
        Materia(
            6,
            0,
            R.color.colorVerdEsc,
            R.drawable.simb1prg,
            R.drawable.fnd1prg,
            false,
            R.string.categ_sem1_prg_prof,
            R.string.categ_sem1_prg,
            1,
            R.array.sem1_prg_perguntas
        )
    )

    val imagemHeader = R.drawable.appsomilton

    fun getMaterias() :Array<Materia> {
        return materiasSemestre
    }

    fun getImageHeader() : Int {
        return imagemHeader
    }
}