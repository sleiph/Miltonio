package com.test.miltonio

import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.room.Room
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.android.synthetic.main.activity_tela_resultado.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

//data class Categorias(val catg: String, var pnts: Int)
@Entity(tableName = "tabela_categorias")
data class Categorias(
    @PrimaryKey val cid: Int,
    @ColumnInfo(name = "categoria") val categoria_db: String,
    @ColumnInfo(name = "pontos") val pontos: Int
)

@Dao
interface CategoriasDao {
    @Query("SELECT * from tabela_categorias")
    fun getAll(): List<Categorias>

    @Query("SELECT * FROM tabela_categorias WHERE cid IN (:catgIds)")
    fun loadAllByIds(catgIds: IntArray): List<Categorias>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(categoria_inst: Categorias)

    @Update(entity = Categorias::class)
    suspend fun updateCategory(categoria_updt: Categorias)

    @Delete
    fun delete(user: Categorias)

    @Query("DELETE FROM tabela_categorias")
    suspend fun deleteAll()
}

@Database(entities = arrayOf(Categorias::class), version = 1)
//@Database(entities = arrayOf(Categorias::class), version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun CategoriasDao(): CategoriasDao

    private class CategoriasDatabaseCallback(
        private val scope: CoroutineScope
    ): RoomDatabase.Callback() {
        override fun onOpen(db: SupportSQLiteDatabase) {
            super.onOpen(db)
            INSTANCE?.let { database ->
                scope.launch {
                    var categoriasDao = database.CategoriasDao()

                    categoriasDao.deleteAll()

                    var categoria_entrada = Categorias(0, "Cálculo", 0)
                    categoriasDao.insert(categoria_entrada)
                    categoria_entrada = Categorias(1, "Algoritmo", 0)
                    categoriasDao.insert(categoria_entrada)
                    categoria_entrada = Categorias(2, "Arquitetura", 0)
                    categoriasDao.insert(categoria_entrada)
                    categoria_entrada = Categorias(3, "Inglês", 0)
                    categoriasDao.insert(categoria_entrada)
                    categoria_entrada = Categorias(4, "Hardware", 0)
                    categoriasDao.insert(categoria_entrada)
                    categoria_entrada = Categorias(5, "Matematica", 0)
                    categoriasDao.insert(categoria_entrada)
                    categoria_entrada = Categorias(6, "Programação", 0)
                    categoriasDao.insert(categoria_entrada)
                }

            }
        }
    }

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(
            context: Context,
            scope: CoroutineScope
        ): AppDatabase {
            return  INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "tabela_categorias"
                )
                    .addCallback(CategoriasDatabaseCallback(scope))
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}

class DataGenerator {

    companion object {
        fun getCatgs(): List<Categorias>{
            return listOf(
                Categorias(0, "Adm", 0),
                Categorias(1, "Alg", 0),
                Categorias(2, "Aoc", 0)
            )
        }
    }

}

class MyApplication: Application() {
    companion object {
        var globalPontuacao = listOf(
            mutableListOf("Administracao", 0),
            mutableListOf("Algoritmo", 0),
            mutableListOf("Arquitetura", 0),
            mutableListOf("Ingles", 0),
            mutableListOf("Hardware", 0),
            mutableListOf("Matematica", 0),
            mutableListOf("Programacao", 0)
        )
    }
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun loadRespostas(resul:Int){
            val intent = Intent(this, tela_respostas::class.java)
            intent.putExtra("resul", resul)
            startActivity(intent)
        }

        /*fun readFromFile(fileName: String): String {

            var ret = ""

            try {
                val inputStream = assets.open(fileName)
                val inputStreamReader = InputStreamReader(inputStream)
                val bufferedReader = BufferedReader(inputStreamReader)
                var receiveString: String? = ""
                val stringBuilder = StringBuilder()

                while (bufferedReader.readLine().also({ receiveString = it }) != null) {
                    stringBuilder.append(receiveString)
                }

                inputStream.close()
                ret = stringBuilder.toString()
            }
            catch (e: FileNotFoundException) {
                e.printStackTrace()
            }
            catch (e: Exception) {
                e.printStackTrace()
            }

            return ret

        }

        val dados = readFromFile( "dados.txt").split(",")*/

        /*val db = Room.databaseBuilder(
            applicationContext, AppDatabase::class.java,"tabela_categorias"
        )
            .fallbackToDestructiveMigration()
            .fallbackToDestructiveMigrationOnDowngrade()
            .fallbackToDestructiveMigrationFrom(16, 17, 18, 19)
            .build()

        val reply_db = Intent()
        setResult(Activity.RESULT_CANCELED, reply_db)
        finish()*/

        println("db")
        //println(reply_db.toString())
        println("db")

        val textos = arrayOf(
            findViewById<TextView>(R.id.txt_progresso_adm) as TextView,
            findViewById<TextView>(R.id.txt_progresso_alg) as TextView,
            findViewById<TextView>(R.id.txt_progresso_aoc) as TextView,
            findViewById<TextView>(R.id.txt_progresso_eng) as TextView,
            findViewById<TextView>(R.id.txt_progresso_lhw) as TextView,
            findViewById<TextView>(R.id.txt_progresso_mat) as TextView,
            findViewById<TextView>(R.id.txt_progresso_prg) as TextView
        )

        val cardAdm = findViewById<CardView>(R.id.CardViewAdm)
        val cardAlg = findViewById<CardView>(R.id.CardViewAlg)
        val cardAoc = findViewById<CardView>(R.id.CardViewAoc)
        val cardEng = findViewById<CardView>(R.id.CardViewEng)
        val cardLhw = findViewById<CardView>(R.id.CardViewLhw)
        val cardMat = findViewById<CardView>(R.id.CardViewMat)
        val cardPrg = findViewById<CardView>(R.id.CardViewPrg)

        for (i in 0..6)
            //textos[i].setText(getString(R.string.resultado_pontos, dados.get(i)))
            textos[i].setText(getString(R.string.resultado_pontos, "0"))

        cardAdm.setOnClickListener {
            loadRespostas(0)
        }
        cardAlg.setOnClickListener {
            loadRespostas(1)
        }
        cardAoc.setOnClickListener {
            loadRespostas(2)
        }
        cardEng.setOnClickListener {
            loadRespostas(3)
        }
        cardLhw.setOnClickListener {
            loadRespostas(4)
        }
        cardMat.setOnClickListener {
            loadRespostas(5)
        }
        cardPrg.setOnClickListener {
            loadRespostas(6)
        }

    }

    companion object {
        const val EXTRA_REPLY = "com.example.android.wordlistsql.REPLY"
    }
}

//Todo: Acessibilidade!!!
//Todo: Quantidade de perguntas adaptável
//Todo: Quantidade de respostas adaptável
//Todo: Menu onde o usuário pode apagar o progresso, desligar o som, etc...
//Todo: Animações
//Todo: Tilestyle background
//Todo: Layout responsivo
//Todo: Mudar a fonte tipográfica do app
//Todo: Tamanho das caixas de resposta uniforme
//Todo: Música pra quando terminar os exercícios (diferente se vc fez uma pontuação melhor ou não)
//Todo: Se você errar a pergunta, ela volta no final (igual o Duolingo)
//Todo: High Scores
//Todo: Usuários com senha
//Todo: Exibir na tela inicial a pontuação mais alta
//Todo: Usar um banco de dados
//Todo: Tirar os prefixos das matérias (adm, algo, aoc...) pra facilitar reaproveitamento
//Todo: Pra cada categoria no banco de dados adicionar automaticamente um card da matéria