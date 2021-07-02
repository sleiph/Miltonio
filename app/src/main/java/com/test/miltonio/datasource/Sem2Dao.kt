package com.test.miltonio.datasource

import com.test.miltonio.modelo.Semestre2
import androidx.room.*

@Dao
interface Sem2Dao {
    @Query("SELECT * from sem2_DB")
    fun getAll(): List<Semestre2>

    @Query("SELECT * FROM sem2_DB WHERE cid = (:catgId)")
    fun loadById(catgId: Int): Semestre2

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(categoria_insrt: Semestre2)

    @Update
    fun updateCatg(categoria_updt: Semestre2)

    /*
    @Delete
    fun delete(categoria_dlet: Sem2DB)

    @Query("DELETE FROM sem2_DB")
    fun deleteAll()
    */
}
