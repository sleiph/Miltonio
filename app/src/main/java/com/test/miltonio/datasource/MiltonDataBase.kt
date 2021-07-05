package com.test.miltonio.datasource

import com.test.miltonio.modelo.Materia
import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.Resposta
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 1,
    entities = [
        Materia :: class,
        Pergunta :: class,
        Resposta :: class
    ]
)
abstract class MiltonDataBase : RoomDatabase() {
    abstract fun MateriaDao(): MateriaDao
    abstract fun PerguntaDao(): PerguntaDao
    abstract fun RespostaDao(): RespostaDao
}
