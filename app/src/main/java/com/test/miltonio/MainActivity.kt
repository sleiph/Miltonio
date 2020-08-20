package com.test.miltonio

import android.app.Application
import android.content.Intent
import android.content.res.TypedArray
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
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

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun loadRespostas(resul: Int){
            val intent = Intent(this, TelaRespostas::class.java)
            intent.putExtra("resul", resul)
            startActivity(intent)
        }

        val textos = arrayOf(
            findViewById<TextView>(R.id.txt_progresso_sgu),
            findViewById<TextView>(R.id.txt_progresso_tru),
            findViewById<TextView>(R.id.txt_progresso_trd),
            findViewById<TextView>(R.id.txt_progresso_qru),
            findViewById<TextView>(R.id.txt_progresso_qrd),
            findViewById<TextView>(R.id.txt_progresso_qnu),
            findViewById<TextView>(R.id.txt_progresso_sxu)
        )

        val cardAdm = findViewById<CardView>(R.id.card_sgu)
        val cardAlg = findViewById<CardView>(R.id.card_tru)
        val cardAoc = findViewById<CardView>(R.id.card_trd)
        val cardEng = findViewById<CardView>(R.id.card_qru)
        val cardLhw = findViewById<CardView>(R.id.card_qrd)
        val cardMat = findViewById<CardView>(R.id.card_qnu)
        val cardPrg = findViewById<CardView>(R.id.card_sxu)

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

        val db_val = MyApplication.database?.categoriaDao()?.getAll()

        if (db_val != null) {
            for (i in 0..db_val.size-1)
                textos[i].setText(
                    getString(
                        R.string.resultado_pontos,
                        db_val.get(i).pontos.toString()
                    )
                )
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
//Todo: Mudar a fonte tipográfica do app
//Todo: Tamanho das caixas de resposta uniforme
//Todo: Música pra quando terminar os exercícios (diferente se vc fez uma pontuação melhor ou não)
//Todo: Se você errar a pergunta, ela volta no final (igual o Duolingo)
//Todo: High Scores
//Todo: Usuários com senha
//Todo: Exibir na tela inicial a pontuação mais alta
//Todo: Tirar os prefixos das matérias (adm, algo, aoc...) pra facilitar reaproveitamento
//Todo: Pra cada categoria no banco de dados adicionar automaticamente um card da matéria