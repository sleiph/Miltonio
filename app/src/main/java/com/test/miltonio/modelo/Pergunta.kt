package com.test.miltonio.modelo

import androidx.room.*

@Entity(tableName = "perguntas",
    foreignKeys = [ForeignKey(
        entity = Materia::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("materia"),
        onDelete = ForeignKey.CASCADE
    )]
)
data class Pergunta(
    @PrimaryKey
    val id: Int,
    @ColumnInfo(name = "qntCertas")
    var qntCertas: Int,
    @ColumnInfo(index = true)
    val materia: Int
) {
    @Ignore
    var respostas: MutableList<Resposta> = mutableListOf()

    constructor(
        id: Int,
        qntCertas: Int,
        materia: Int,
        respostas: MutableList<Resposta>
    ) : this(id, qntCertas, materia) {
        this.respostas = respostas
    }
}
