package com.test.miltonio.datasource

import com.test.miltonio.modelo.Materia
import androidx.room.*

@Dao
interface MateriaDao {
    @Query("SELECT * from materias")
    fun getAll(): List<Materia>

    @Query("SELECT * FROM materias WHERE semestre = (:semestre)")
    fun loadBySemestre(semestre: Int): List<Materia>

    @Query("SELECT * FROM materias WHERE cid = (:catgId)")
    fun loadById(catgId: Int): Materia

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(categoria_insrt: Materia)

    @Update
    fun updateCatg(categoria_updt: Materia)

    @Query("UPDATE materias SET pontos = 0 WHERE semestre = (:semestre)")
    fun resetSemestre(semestre: Int)

    @Delete
    fun delete(categoria_dlet: Materia)

    @Query("DELETE FROM materias")
    fun deleteAll()
}
