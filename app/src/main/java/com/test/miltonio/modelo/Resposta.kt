package com.test.miltonio.modelo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "respostas",
    foreignKeys = [ForeignKey(
        entity = Pergunta::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("pergunta"),
        onDelete = ForeignKey.CASCADE
    )]
)
data class Resposta(
    @PrimaryKey
    val id: Int,
    @ColumnInfo(name = "isCerta") var tipo: Boolean,
    @ColumnInfo(index = true)
    val pergunta: Int
)
