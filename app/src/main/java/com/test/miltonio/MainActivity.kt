package com.test.miltonio

import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.room.Room
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteDatabase
import java.util.concurrent.Executors

//data class Categorias(val catg: String, var pnts: Int)
@Entity(tableName = "tabela_categorias")
class Categorias(
    @PrimaryKey val cid: Int,
    @ColumnInfo(name = "categoria") val categoria: String,
    @ColumnInfo(name = "pontos") val pontos: Int
)

@Dao
interface CategoriasDao {
    @Query("SELECT * from tabela_categorias")
    fun getAll(): List<Categorias>

    @Query("SELECT * FROM tabela_categorias WHERE cid IN (:catgIds)")
    fun loadAllByIds(catgIds: IntArray): List<Categorias>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(categoria: List<Categorias>)

    @Update(entity = Categorias::class)
    suspend fun updateCategory(categoria: Categorias)

    @Delete
    fun delete(user: Categorias)
}

@Database(entities = arrayOf(Categorias::class), version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun CategoriasDao(): CategoriasDao

    companion object {
        @Volatile private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, "tabela_categorias")
                .addCallback(object : RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        //pre-populate data
                        Executors.newSingleThreadExecutor().execute {
                            instance?.CategoriasDao()?.insert(DataGenerator.getCatgs())
                        }
                    }
                })
                .build()
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

        val db = Room.databaseBuilder(
            applicationContext, AppDatabase::class.java,"tabela_categorias"
        )
            .fallbackToDestructiveMigration()
            .fallbackToDestructiveMigrationOnDowngrade()
            .fallbackToDestructiveMigrationFrom(16, 17, 18, 19)
            .build()

        db.query("SELECT * FROM tabela_categorias", null)
        println("db")
        println(db.toString())
        println(db.query("SELECT * FROM tabela_categorias", null))

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
}

//Todo: Acessibilidade!!!
//Todo: Quantidade de perguntas adaptável
//Todo: Quantidade de respostas adaptável
//Todo: Menu onde o usuário pode apagar o progresso, desligar o som, etc...
//Todo: Animações
//Todo: Tilestyle background
//Todo: Layout responsivo
//Todo: Tamanho das caixas de resposta uniforme
//Todo: Música pra quando terminar os exercícios (diferente se vc fez uma pontuação melhor ou não)
//Todo: Se você errar a pergunta, ela volta no final (igual o Duolingo)
//Todo: High Scores
//Todo: Usuários com senha
//Todo: Exibir na tela inicial a pontuação mais alta
//Todo: Usar um banco de dados
//Todo: Mudar a fonte tipográfica do app