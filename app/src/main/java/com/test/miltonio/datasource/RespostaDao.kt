package com.test.miltonio.datasource

import com.test.miltonio.modelo.Resposta
import androidx.room.*

@Dao
interface RespostaDao {
    @Query("SELECT * FROM respostas WHERE pergunta = (:id)")
    fun getByPerguntaId(id: Int): MutableList<Resposta>

    @Query("SELECT * FROM respostas WHERE id = (:id)")
    fun get(id: Int): Resposta

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(resposta: Resposta)

    @Update
    fun update(resposta: Resposta)

    @Delete
    fun delete(resposta: Resposta)

    @Query("DELETE FROM respostas")
    fun deleteAll()
}