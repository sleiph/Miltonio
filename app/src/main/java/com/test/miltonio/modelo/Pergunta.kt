package com.test.miltonio.modelo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "perguntas",
    foreignKeys = [ForeignKey(
        entity = Materia::class,
        parentColumns = arrayOf("cid"),
        childColumns = arrayOf("materia"),
        onDelete = ForeignKey.CASCADE
    )]
)
data class Pergunta(
    @PrimaryKey
    val id: Int,
    @ColumnInfo(name = "qntCertas") var qntCertas: Int,
    @ColumnInfo(index = true)
    val materia: Int
)
