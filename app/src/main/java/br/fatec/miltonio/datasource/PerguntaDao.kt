package br.fatec.miltonio.datasource

import br.fatec.miltonio.modelo.Pergunta
import androidx.room.*

@Dao
interface PerguntaDao {
    @Query("SELECT * FROM perguntas WHERE materia = (:id)")
    fun getByMateriaId(id: Int): MutableList<Pergunta>

    @Query("SELECT * FROM perguntas WHERE id = (:id)")
    fun get(id: Int): Pergunta

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(pergunta: Pergunta)

    @Update
    fun update(pergunta: Pergunta)

    @Delete
    fun delete(pergunta: Pergunta)

    @Query("DELETE FROM perguntas")
    fun deleteAll()
}
