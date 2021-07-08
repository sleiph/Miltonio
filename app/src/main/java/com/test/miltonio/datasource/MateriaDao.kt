package com.test.miltonio.datasource

import com.test.miltonio.modelo.Materia
import androidx.room.*

@Dao
interface MateriaDao {
    @Query("SELECT * from materias")
    fun getAll(): List<Materia>

    @Query("SELECT * FROM materias WHERE semestre = (:semestre)")
    fun getBySemestre(semestre: Int): List<Materia>

    @Query("SELECT * FROM materias WHERE id = (:id)")
    fun get(id: Int): Materia

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(materia: Materia)

    @Update
    fun update(materia: Materia)

    @Query("UPDATE materias SET pontos = 0 WHERE semestre = (:semestre)")
    fun resetSemestre(semestre: Int)

    @Delete
    fun delete(materia: Materia)

    @Query("DELETE FROM materias")
    fun deleteAll()
}
