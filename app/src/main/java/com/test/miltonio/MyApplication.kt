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
@Entity(tableName = "sem2_DB")
data class Sem2DB(
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
@Entity(tableName = "sem3_DB")
data class Sem3DB(
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

    /*
    @Delete
    fun delete(categoria_dlet: Sem1DB)

    @Query("DELETE FROM sem1_DB")
    fun deleteAll()
    */
}
@Dao
interface Sem2Dao {
    @Query("SELECT * from sem2_DB")
    fun getAll(): List<Sem2DB>

    @Query("SELECT * FROM sem2_DB WHERE cid = (:catgId)")
    fun loadById(catgId: Int): Sem2DB

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(categoria_insrt: Sem2DB)

    @Update
    fun updateCatg(categoria_updt: Sem2DB)

    /*
    @Delete
    fun delete(categoria_dlet: Sem2DB)

    @Query("DELETE FROM sem2_DB")
    fun deleteAll()
    */
}
@Dao
interface Sem3Dao {
    @Query("SELECT * from sem3_DB")
    fun getAll(): List<Sem3DB>

    @Query("SELECT * FROM sem3_DB WHERE cid = (:catgId)")
    fun loadById(catgId: Int): Sem3DB

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(categoria_insrt: Sem3DB)

    @Update
    fun updateCatg(categoria_updt: Sem3DB)

    /*
    @Delete
    fun delete(categoria_dlet: Sem3DB)

    @Query("DELETE FROM sem3_DB")
    fun deleteAll()
    */
}

@Database(version = 1, entities = [Sem1DB::class])
abstract class Sem1DataBase : RoomDatabase() {
    abstract fun Sem1Dao(): Sem1Dao
}
@Database(version = 1, entities = [Sem2DB::class])
abstract class Sem2DataBase : RoomDatabase() {
    abstract fun Sem2Dao(): Sem2Dao
}
@Database(version = 1, entities = [Sem3DB::class])
abstract class Sem3DataBase : RoomDatabase() {
    abstract fun Sem3Dao(): Sem3Dao
}

class MyApplication: Application() {

    companion object {
        var sem1database: Sem1DataBase? = null
        var sem2database: Sem2DataBase? = null
        var sem3database: Sem3DataBase? = null

        val sem1Array = arrayOf(
            Sem1DB(
                0,
                0,
                R.color.colorCyan,
                R.drawable.simb1mat,
                R.drawable.fnd1mat,
                true,
                R.string.categ_sem1_mat_prof,
                R.string.categ_sem1_mat,
                R.array.sem1_mat_perguntas
            ),
            Sem1DB(
                1,
                0,
                R.color.colorRoxo,
                R.drawable.simb1alg,
                R.drawable.fnd1alg,
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
                R.drawable.simb1aoc,
                R.drawable.fnd1aoc,
                false,
                R.string.categ_sem1_aoc_prof,
                R.string.categ_sem1_aoc,
                R.array.sem1_aoc_perguntas
            ),
            Sem1DB(
                4,
                0,
                R.color.colorLrnj,
                R.drawable.simb1lhw,
                R.drawable.fnd1lhw,
                true,
                R.string.categ_sem1_lhw_prof,
                R.string.categ_sem1_lhw,
                R.array.sem1_lhw_perguntas
            ),
            Sem1DB(
                5,
                0,
                R.color.colorAmrl,
                R.drawable.simb1adm,
                R.drawable.fnd1adm,
                true,
                R.string.categ_sem1_adm_prof,
                R.string.categ_sem1_adm,
                R.array.sem1_adm_perguntas
            ),
            Sem1DB(
                6,
                0,
                R.color.colorVerdEsc,
                R.drawable.simb1prg,
                R.drawable.fnd1prg,
                false,
                R.string.categ_sem1_prg_prof,
                R.string.categ_sem1_prg,
                R.array.sem1_prg_perguntas
            )
        )

        val sem2Array = arrayOf(
            Sem2DB(
                0,
                0,
                R.color.colorCyan,
                R.drawable.simb1mat,
                R.drawable.fnd1mat,
                true,
                R.string.categ_sem2_cal_prof,
                R.string.categ_sem2_cal,
                R.array.sem2_cal_perguntas
            ),
            Sem2DB(
                1,
                0,
                R.color.colorVerdEsc,
                R.drawable.simb2lnp,
                R.drawable.fnd2lnp,
                false,
                R.string.categ_sem2_lnp_prof,
                R.string.categ_sem2_lnp,
                R.array.sem2_lnp_perguntas
            ),
            Sem2DB(
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
            Sem2DB(
                3,
                0,
                R.color.colorAmrl,
                R.drawable.simb2cnt,
                R.drawable.fnd2cnt,
                true,
                R.string.categ_sem2_cnt_prof,
                R.string.categ_sem2_cnt,
                R.array.sem2_cnt_perguntas
            ),
            Sem2DB(
                4,
                0,
                R.color.colorAzul,
                R.drawable.simb2sis,
                R.drawable.fnd2sis,
                false,
                R.string.categ_sem2_sis_prof,
                R.string.categ_sem2_sis,
                R.array.sem2_sis_perguntas
            ),
            Sem2DB(
                5,
                0,
                R.color.colorLrnj,
                R.drawable.simb2com,
                R.drawable.fnd2com,
                false,
                R.string.categ_sem2_com_prof,
                R.string.categ_sem2_com,
                R.array.sem2_com_perguntas
            ),
            Sem2DB(
                6,
                0,
                R.color.colorRoxo,
                R.drawable.simb2es1,
                R.drawable.fnd2es1,
                false,
                R.string.categ_sem2_es1_prof,
                R.string.categ_sem2_es1,
                R.array.sem2_es1_perguntas
            )
        )

        val sem3Array = arrayOf(
            Sem3DB(
                0,
                0,
                R.color.colorVerdEsc,
                R.drawable.simb3esd,
                R.drawable.fnd3esd,
                false,
                R.string.categ_sem3_esd_prof,
                R.string.categ_sem3_esd,
                R.array.sem3_esd_perguntas
            ),
            Sem3DB(
                1,
                0,
                R.color.colorLrnj,
                R.drawable.simb2com,
                R.drawable.fnd2com,
                false,
                R.string.categ_sem3_sot_prof,
                R.string.categ_sem3_sot,
                R.array.sem3_sot_perguntas
            ),
            Sem3DB(
                2,
                0,
                R.color.colorRoxo,
                R.drawable.simb3es2,
                R.drawable.fnd2es1,
                false,
                R.string.categ_sem3_es2_prof,
                R.string.categ_sem3_es2,
                R.array.sem3_es2_perguntas
            ),
            Sem3DB(
                3,
                0,
                R.color.colorCyan,
                R.drawable.simb3eap,
                R.drawable.fnd3eap,
                true,
                R.string.categ_sem3_eap_prof,
                R.string.categ_sem3_eap,
                R.array.sem3_eap_perguntas
            ),
            Sem3DB(
                4,
                0,
                R.color.colorAmrl,
                R.drawable.simb2cnt,
                R.drawable.fnd2cnt,
                true,
                R.string.categ_sem3_efi_prof,
                R.string.categ_sem3_efi,
                R.array.sem3_efi_perguntas
            ),
            Sem3DB(
                5,
                0,
                R.color.colorMagt,
                R.drawable.simbeng,
                R.drawable.fndeng,
                false,
                R.string.categ_sem3_eng_prof,
                R.string.categ_sem3_eng,
                R.array.sem3_eng_perguntas
            ),
            Sem3DB(
                6,
                0,
                R.color.colorAzul,
                R.drawable.simb2sis,
                R.drawable.fnd2sis,
                false,
                R.string.categ_sem3_ihc_prof,
                R.string.categ_sem3_ihc,
                R.array.sem3_ihc_perguntas
            )
        )
    }

    override fun onCreate() {
        super.onCreate()
        //Room
        sem1database = Room.databaseBuilder(this, Sem1DataBase::class.java, "sem1-DB")
            .allowMainThreadQueries()
            .build()
        sem2database = Room.databaseBuilder(this, Sem2DataBase::class.java, "sem2-DB")
            .allowMainThreadQueries()
            .build()
        sem3database = Room.databaseBuilder(this, Sem3DataBase::class.java, "sem3-DB")
            .allowMainThreadQueries()
            .build()

        for (categ in sem1Array)
            sem1database?.Sem1Dao()?.insert(categ)

        for (categ in sem2Array)
            sem2database?.Sem2Dao()?.insert(categ)

        for (categ in sem3Array)
            sem3database?.Sem3Dao()?.insert(categ)
    }
}
