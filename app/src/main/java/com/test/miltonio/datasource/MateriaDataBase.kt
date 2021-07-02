package com.test.miltonio.datasource

import com.test.miltonio.modelo.Materia
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 1,
    entities = [
        Materia :: class
    ]
)
abstract class MateriaDataBase : RoomDatabase() {
    abstract fun MateriaDao(): MateriaDao
}
