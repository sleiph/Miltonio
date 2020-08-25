package com.test.miltonio

import android.app.Application
import androidx.room.*

@Entity(tableName = "categorias_DB")
data class Categorias_DB(
    @PrimaryKey val cid: Int,
    @ColumnInfo(name = "pontos") var pontos_db: Int,
    @ColumnInfo(name = "cor") var cor_db: Int,
    @ColumnInfo(name = "simbolo") var simb_db: Int,
    @ColumnInfo(name = "fundo") var fundo_db: Int,
    @ColumnInfo(name = "corTexto") var isPreto_db: Boolean,
    @ColumnInfo(name = "professor") var professor_db: Int,
    @ColumnInfo(name = "materia") var materia_db: Int,
    @ColumnInfo(name = "perguntas") var arrayPerguntas_db: Int
)

@Dao
interface CategoriasDao {
    @Query("SELECT * from categorias_DB")
    fun getAll(): List<Categorias_DB>

    @Query("SELECT * FROM categorias_DB WHERE cid = (:catgId)")
    fun loadById(catgId: Int): Categorias_DB

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(categoria_insrt: Categorias_DB)

    @Update
    fun updateCatg(categoria_updt: Categorias_DB)

    @Delete
    fun delete(categoria_dlet: Categorias_DB)

    /*
    @Query("DELETE FROM categorias_DB")
    fun deleteAll()
    */
}

@Database(version = 1, entities = arrayOf(Categorias_DB::class))
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
        database = Room.databaseBuilder(this, AppDataBase::class.java, "categorias-DB")
            .allowMainThreadQueries()
            .build()

        val catgInit = arrayOf(
            Categorias_DB(
                0, 0,
                R.color.color_sgu, R.drawable.simbsgu, R.drawable.fndsgu, true,
                R.string.categ_sgu_prof, R.string.categ_sgu,
                R.array.sgu_perguntas
            ),
            Categorias_DB(
                1, 0,
                R.color.color_tru, R.drawable.simbtru, R.drawable.fndtru, false,
                R.string.categ_tru_prof, R.string.categ_tru,
                R.array.tru_perguntas
            ),
            Categorias_DB(
                2,0,
                R.color.color_trd, R.drawable.simbtrd, R.drawable.fndtrd, false,
                R.string.categ_trd_prof, R.string.categ_trd,
                R.array.trd_perguntas
            ),
            Categorias_DB(
                3, 0,
                R.color.color_qru, R.drawable.simbqru, R.drawable.fndqru, true,
                R.string.categ_qru_prof, R.string.categ_qru,
                R.array.qru_perguntas
            ),
            Categorias_DB(
                4,0,
                R.color.color_qrd, R.drawable.simbqrd, R.drawable.fndqrd, true,
                R.string.categ_qrd_prof, R.string.categ_qrd,
                R.array.qrd_perguntas
            ),
            Categorias_DB(
                5, 0,
                R.color.color_qnu, R.drawable.simbqnu, R.drawable.fndqnu, false,
                R.string.categ_qnu_prof, R.string.categ_qnu,
                R.array.qnu_perguntas
            ),
            Categorias_DB(
                6, 0,
                R.color.color_sxu, R.drawable.simbsxu, R.drawable.fndsxu, false,
                R.string.categ_sxu_prof, R.string.categ_sxu,
                R.array.sxu_perguntas
            )
        )
        for (categ in catgInit)
            database?.categoriaDao()?.insert(categ)
    }
}