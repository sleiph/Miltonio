package com.test.miltonio.modelo

import androidx.room.Embedded
import androidx.room.Relation

data class MateriaNPerguntas(
    @Embedded
    val materia: Materia,
    @Relation(
        parentColumn = "cid",
        entityColumn = "materia"
    )
    val perguntas: List<Pergunta>
)
