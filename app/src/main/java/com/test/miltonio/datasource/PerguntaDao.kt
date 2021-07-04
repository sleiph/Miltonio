package com.test.miltonio.datasource

import com.test.miltonio.modelo.Pergunta
import com.test.miltonio.modelo.MateriaNPerguntas
import androidx.room.*

@Dao
interface PerguntaDao {
    @Query("SELECT * FROM perguntas WHERE materia = (:cid)")
    fun loadByMateriaId(cid: Int): MateriaNPerguntas

    @Query("SELECT * FROM perguntas WHERE id = (:id)")
    fun loadById(id: Int): Pergunta

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(pergunta: Pergunta)

    @Update
    fun update(pergunta: Pergunta)

    @Delete
    fun delete(pergunta: Pergunta)

    @Query("DELETE FROM perguntas")
    fun deleteAll()
}
