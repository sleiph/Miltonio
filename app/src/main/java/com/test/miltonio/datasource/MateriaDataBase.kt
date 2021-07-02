package com.test.miltonio.datasource

import com.test.miltonio.modelo.Semestre1
import com.test.miltonio.modelo.Semestre2
import com.test.miltonio.modelo.Semestre3
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 1,
    entities = [
        Semestre1 :: class,
        Semestre2 :: class,
        Semestre3 :: class
    ]
)
abstract class MateriaDataBase : RoomDatabase() {
    abstract fun Sem1Dao(): Sem1Dao
    abstract fun Sem2Dao(): Sem2Dao
    abstract fun Sem3Dao(): Sem3Dao
}
