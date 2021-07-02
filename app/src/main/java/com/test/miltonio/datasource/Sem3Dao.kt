package com.test.miltonio.datasource

import com.test.miltonio.modelo.Semestre3
import androidx.room.*

@Dao
interface Sem3Dao {
    @Query("SELECT * from sem3_DB")
    fun getAll(): List<Semestre3>

    @Query("SELECT * FROM sem3_DB WHERE cid = (:catgId)")
    fun loadById(catgId: Int): Semestre3

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(categoria_insrt: Semestre3)

    @Update
    fun updateCatg(categoria_updt: Semestre3)

    @Delete
    fun delete(categoria_dlet: Semestre3)

    @Query("DELETE FROM sem3_DB")
    fun deleteAll()

}
