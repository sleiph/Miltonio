package br.fatec.miltonio.datasource

import br.fatec.miltonio.modelo.Materia
import br.fatec.miltonio.modelo.Pergunta
import br.fatec.miltonio.modelo.Resposta
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
