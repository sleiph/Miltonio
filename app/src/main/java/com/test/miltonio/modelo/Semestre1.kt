package com.test.miltonio.modelo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sem1_DB")
data class Semestre1(
    @PrimaryKey val cid: Int,
    @ColumnInfo(name = "pontos") var pontos_db: Int,
    @ColumnInfo(name = "cor") var cor_db: Int,
    @ColumnInfo(name = "simbolo") var simb_db: Int,
    @ColumnInfo(name = "fundo") var fundo_db: Int,
    @ColumnInfo(name = "corTexto") var isPreto_db: Boolean,
    @ColumnInfo(name = "professor") var professor_db: Int,
    @ColumnInfo(name = "materia") var materia_db: Int,
    @ColumnInfo(name = "perguntas") var arrayPerguntas_db: Int
)
