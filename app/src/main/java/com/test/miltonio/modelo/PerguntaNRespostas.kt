package com.test.miltonio.modelo

import androidx.room.Embedded
import androidx.room.Relation

data class PerguntaNRespostas(
    @Embedded
    val descricao: Pergunta,
    @Relation(
        parentColumn = "id",
        entityColumn = "pergunta"
    )
    val respostas: List<Resposta>
)
