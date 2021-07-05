package com.test.miltonio.objetos

import com.test.miltonio.R
import com.test.miltonio.modelo.Materia

class Semestre3 {
    val materiasSemestre = arrayOf(
        Materia(
            20,
            0,
            R.color.colorVerdEsc,
            R.drawable.simb3esd,
            R.drawable.fnd3esd,
            false,
            R.string.categ_sem3_esd_prof,
            R.string.categ_sem3_esd,
            3,
            R.array.sem3_esd_perguntas
        ),
        Materia(
            21,
            0,
            R.color.colorLrnj,
            R.drawable.simb2com,
            R.drawable.fnd2com,
            false,
            R.string.categ_sem3_sot_prof,
            R.string.categ_sem3_sot,
            3,
            R.array.sem3_sot_perguntas
        ),
        Materia(
            22,
            0,
            R.color.colorRoxo,
            R.drawable.simb3es2,
            R.drawable.fnd2es1,
            false,
            R.string.categ_sem3_es2_prof,
            R.string.categ_sem3_es2,
            3,
            R.array.sem3_es2_perguntas
        ),
        Materia(
            23,
            0,
            R.color.colorCyan,
            R.drawable.simb3eap,
            R.drawable.fnd3eap,
            true,
            R.string.categ_sem3_eap_prof,
            R.string.categ_sem3_eap,
            3,
            R.array.sem3_eap_perguntas
        ),
        Materia(
            24,
            0,
            R.color.colorAmrl,
            R.drawable.simb2cnt,
            R.drawable.fnd2cnt,
            true,
            R.string.categ_sem3_efi_prof,
            R.string.categ_sem3_efi,
            3,
            R.array.sem3_efi_perguntas
        ),
        Materia(
            25,
            0,
            R.color.colorMagt,
            R.drawable.simbeng,
            R.drawable.fndeng,
            false,
            R.string.categ_sem3_eng_prof,
            R.string.categ_sem3_eng,
            3,
            R.array.sem3_eng_perguntas
        ),
        Materia(
            26,
            0,
            R.color.colorAzul,
            R.drawable.simb3ihc,
            R.drawable.fnd3ihc,
            false,
            R.string.categ_sem3_ihc_prof,
            R.string.categ_sem3_ihc,
            3,
            R.array.sem3_ihc_perguntas
        ),
        Materia(
            27,
            0,
            R.color.colorRosa,
            R.drawable.simb3so1,
            R.drawable.fnd3so1,
            true,
            R.string.categ_sem3_so1_prof,
            R.string.categ_sem3_so1,
            3,
            R.array.sem3_so1_perguntas
        )
    )
    val imagemHeader = R.drawable.appsomascara

    fun getMaterias() : Array<Materia> {
        return materiasSemestre
    }

    fun getImageHeader() : Int {
        return imagemHeader
    }
}