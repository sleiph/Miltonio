package com.test.miltonio.datasource

import com.test.miltonio.modelo.Semestre1
import androidx.room.*

@Dao
interface Sem1Dao {
    @Query("SELECT * from sem1_DB")
    fun getAll(): List<Semestre1>

    @Query("SELECT * FROM sem1_DB WHERE cid = (:catgId)")
    fun loadById(catgId: Int): Semestre1

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(categoria_insrt: Semestre1)

    @Update
    fun updateCatg(categoria_updt: Semestre1)

    @Delete
    fun delete(categoria_dlet: Semestre1)

    @Query("DELETE FROM sem1_DB")
    fun deleteAll()
}
