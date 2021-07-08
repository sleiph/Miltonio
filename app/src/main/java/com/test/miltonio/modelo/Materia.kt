package com.test.miltonio.modelo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "materias")
data class Materia(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "nome") var nome: Int,
    @ColumnInfo(name = "professor") var professor: Int,
    @ColumnInfo(name = "semestre") var semestre: Int,
    @ColumnInfo(name = "pontos") var pontos: Int,
    @ColumnInfo(name = "cor") var cor: Int,
    @ColumnInfo(name = "simbolo") var imgSimbolo: Int,
    @ColumnInfo(name = "fundo") var imgFundo: Int,
    @ColumnInfo(name = "is_preto") var isPreto: Boolean
) {
    @Ignore
    var perguntas: MutableList<Pergunta>? = mutableListOf()

    constructor(
        id: Int,
        nome: Int,
        professor: Int,
        semestre: Int,
        pontos: Int,
        cor: Int,
        imgSimbolo: Int,
        imgFundo: Int,
        isPreto: Boolean,
        perguntas: MutableList<Pergunta>
    ) : this( id, nome, professor, semestre, pontos, cor, imgSimbolo, imgFundo, isPreto ) {
        this.perguntas = perguntas
    }
}
