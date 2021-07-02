package com.test.miltonio.modelo

import com.test.miltonio.R

class Semestre3Materias {
    val sem3Array = arrayOf(
        Semestre3(
            0,
            0,
            R.color.colorVerdEsc,
            R.drawable.simb3esd,
            R.drawable.fnd3esd,
            false,
            R.string.categ_sem3_esd_prof,
            R.string.categ_sem3_esd,
            R.array.sem3_esd_perguntas
        ),
        Semestre3(
            1,
            0,
            R.color.colorLrnj,
            R.drawable.simb2com,
            R.drawable.fnd2com,
            false,
            R.string.categ_sem3_sot_prof,
            R.string.categ_sem3_sot,
            R.array.sem3_sot_perguntas
        ),
        Semestre3(
            2,
            0,
            R.color.colorRoxo,
            R.drawable.simb3es2,
            R.drawable.fnd2es1,
            false,
            R.string.categ_sem3_es2_prof,
            R.string.categ_sem3_es2,
            R.array.sem3_es2_perguntas
        ),
        Semestre3(
            3,
            0,
            R.color.colorCyan,
            R.drawable.simb3eap,
            R.drawable.fnd3eap,
            true,
            R.string.categ_sem3_eap_prof,
            R.string.categ_sem3_eap,
            R.array.sem3_eap_perguntas
        ),
        Semestre3(
            4,
            0,
            R.color.colorAmrl,
            R.drawable.simb2cnt,
            R.drawable.fnd2cnt,
            true,
            R.string.categ_sem3_efi_prof,
            R.string.categ_sem3_efi,
            R.array.sem3_efi_perguntas
        ),
        Semestre3(
            5,
            0,
            R.color.colorMagt,
            R.drawable.simbeng,
            R.drawable.fndeng,
            false,
            R.string.categ_sem3_eng_prof,
            R.string.categ_sem3_eng,
            R.array.sem3_eng_perguntas
        ),
        Semestre3(
            6,
            0,
            R.color.colorAzul,
            R.drawable.simb3ihc,
            R.drawable.fnd3ihc,
            false,
            R.string.categ_sem3_ihc_prof,
            R.string.categ_sem3_ihc,
            R.array.sem3_ihc_perguntas
        )
    )

    fun Semestre3Materias() {

    }

    fun getMaterias() : Array<Semestre3> {
        return sem3Array
    }
}