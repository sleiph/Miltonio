package com.test.miltonio.modelo

import androidx.room.Embedded
import androidx.room.Relation

data class PerguntaNRespostas(
    @Embedded
    val pergunta: Pergunta,
    @Relation(
        parentColumn = "id",
        entityColumn = "pergunta"
    )
    val perguntas: List<Resposta>
)
