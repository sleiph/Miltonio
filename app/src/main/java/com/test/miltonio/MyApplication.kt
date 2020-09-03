package com.test.miltonio

import android.app.Application
import androidx.room.*

@Entity(tableName = "sem1_DB")
data class Sem1DB(
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
interface Sem1Dao {
    @Query("SELECT * from sem1_DB")
    fun getAll(): List<Sem1DB>

    @Query("SELECT * FROM sem1_DB WHERE cid = (:catgId)")
    fun loadById(catgId: Int): Sem1DB

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(categoria_insrt: Sem1DB)

    @Update
    fun updateCatg(categoria_updt: Sem1DB)

    @Delete
    fun delete(categoria_dlet: Sem1DB)

    /*
    @Query("DELETE FROM Sem1_DB")
    fun deleteAll()
    */
}
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

@Database(version = 1, entities = [Sem1DB::class])
abstract class Sem1DataBase : RoomDatabase() {
    abstract fun sem1Dao(): Sem1Dao
}
@Database(version = 1, entities = arrayOf(Categorias_DB::class))
abstract class AppDataBase : RoomDatabase() {
    abstract fun categoriaDao(): CategoriasDao
}

class MyApplication: Application() {

    companion object {
        var sem1database: Sem1DataBase? = null
        var database: AppDataBase? = null
    }

    override fun onCreate() {
        super.onCreate()
        //Room
        sem1database = Room.databaseBuilder(this, Sem1DataBase::class.java, "sem1_DB")
            .allowMainThreadQueries()
            .build()
        database = Room.databaseBuilder(this, AppDataBase::class.java, "categorias-DB")
            .allowMainThreadQueries()
            .build()

        val sem1Init = arrayOf(
            Sem1DB(
                0,
                0,
                R.color.colorCyan,
                R.drawable.simbmat,
                R.drawable.fndmat,
                true,
                R.string.categ_sem1_mat_prof,
                R.string.categ_sem1_mat,
                R.array.sem1_mat_perguntas
            ),
            Sem1DB(
                1,
                0,
                R.color.colorRoxo,
                R.drawable.simbalg,
                R.drawable.fndalg,
                false,
                R.string.categ_sem1_alg_prof,
                R.string.categ_sem1_alg,
                R.array.sem1_alg_perguntas
            ),
            Sem1DB(
                2,
                0,
                R.color.colorMagt,
                R.drawable.simbeng,
                R.drawable.fndeng,
                false,
                R.string.categ_sem1_eng_prof,
                R.string.categ_sem1_eng,
                R.array.sem1_eng_perguntas
            ),
            Sem1DB(
                3,
                0,
                R.color.colorAzul,
                R.drawable.simbaoc,
                R.drawable.fndaoc,
                false,
                R.string.categ_sem1_aoc_prof,
                R.string.categ_sem1_aoc,
                R.array.sem1_aoc_perguntas
            ),
            Sem1DB(
                4,
                0,
                R.color.colorLrnj,
                R.drawable.simblhw,
                R.drawable.fndlhw,
                true,
                R.string.categ_sem1_lhw_prof,
                R.string.categ_sem1_lhw,
                R.array.sem1_lhw_perguntas
            ),
            Sem1DB(
                5,
                0,
                R.color.colorAmrl,
                R.drawable.simbadm,
                R.drawable.fndadm,
                true,
                R.string.categ_sem1_adm_prof,
                R.string.categ_sem1_adm,
                R.array.sem1_adm_perguntas
            ),
            Sem1DB(
                6,
                0,
                R.color.colorVerdEsc,
                R.drawable.simbprg,
                R.drawable.fndprg,
                false,
                R.string.categ_sem1_prg_prof,
                R.string.categ_sem1_prg,
                R.array.sem1_prg_perguntas
            )
        )
        for (categ in sem1Init)
            sem1database?.sem1Dao()?.insert(categ)

        val catgInit = arrayOf(
            Categorias_DB(
                0,
                0,
                R.color.colorCyan,
                R.drawable.simbmat,
                R.drawable.fndmat,
                true,
                R.string.categ_sem2_cal_prof,
                R.string.categ_sem2_cal,
                R.array.sem2_cal_perguntas
            ),
            Categorias_DB(
                1,
                0,
                R.color.colorRoxo,
                R.drawable.simbalg,
                R.drawable.fndalg,
                false,
                R.string.categ_sem2_lnp_prof,
                R.string.categ_sem2_lnp,
                R.array.sem2_lnp_perguntas
            ),
            Categorias_DB(
                2,
                0,
                R.color.colorMagt,
                R.drawable.simbeng,
                R.drawable.fndeng,
                false,
                R.string.categ_sem2_eng_prof,
                R.string.categ_sem2_eng,
                R.array.sem2_eng_perguntas
            ),
            Categorias_DB(
                3,
                0,
                R.color.colorAmrl,
                R.drawable.simbadm,
                R.drawable.fndadm,
                true,
                R.string.categ_sem2_cnt_prof,
                R.string.categ_sem2_cnt,
                R.array.sem2_cnt_perguntas
            ),
            Categorias_DB(
                4,
                0,
                R.color.colorLrnj,
                R.drawable.simblhw,
                R.drawable.fndlhw,
                true,
                R.string.categ_sem2_sis_prof,
                R.string.categ_sem2_sis,
                R.array.sem2_sis_perguntas
            ),
            Categorias_DB(
                5,
                0,
                R.color.colorAzul,
                R.drawable.simbaoc,
                R.drawable.fndaoc,
                false,
                R.string.categ_sem2_com_prof,
                R.string.categ_sem2_com,
                R.array.sem2_com_perguntas
            ),
            Categorias_DB(
                6,
                0,
                R.color.colorVerdEsc,
                R.drawable.simbprg,
                R.drawable.fndprg,
                false,
                R.string.categ_sem2_ens_prof,
                R.string.categ_sem2_ens,
                R.array.sem2_ens_perguntas
            )
        )
        for (categ in catgInit)
            database?.categoriaDao()?.insert(categ)
    }
}