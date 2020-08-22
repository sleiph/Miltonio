package com.test.miltonio

import android.app.Application
import androidx.room.*

@Entity(tableName = "tabela_categorias")
data class Categorias(
    @PrimaryKey val cid: Int,
    @ColumnInfo(name = "categoria") var nome_categoria: String,
    @ColumnInfo(name = "pontos") var pontos: Int
)

@Dao
interface CategoriasDao {
    @Query("SELECT * from tabela_categorias")
    fun getAll(): List<Categorias>

    @Query("SELECT * FROM tabela_categorias WHERE cid = (:catgId)")
    fun loadById(catgId: Int): Categorias

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(categoria_isrt: Categorias)

    @Update
    fun updateCatg(categoria_updt: Categorias)

    @Delete
    fun delete(categoria_dlet: Categorias)

    /*
    @Query("DELETE FROM tabela_categorias")
    fun deleteAll()
    */
}

@Database(version = 1, entities = arrayOf(Categorias::class))
abstract class AppDataBase : RoomDatabase() {
    abstract fun categoriaDao(): CategoriasDao
}

class MyApplication: Application() {

    companion object {
        var database: AppDataBase? = null
    }

    override fun onCreate() {
        super.onCreate()
        //Room
        database = Room.databaseBuilder(this, AppDataBase::class.java, "my-db")
            .allowMainThreadQueries()
            .build()

        val catgInit = arrayOf(
            Categorias(0, "Calculo", 0),
            Categorias(1, "Programacao", 0),
            Categorias(2, "Ingles", 0),
            Categorias(3, "Contabilidade", 0),
            Categorias(4, "Sistemas", 0),
            Categorias(5, "Comunicacao", 0),
            Categorias(6, "Software", 0)
        )
        for (categ in catgInit)
            database?.categoriaDao()?.insert(categ)
    }
}