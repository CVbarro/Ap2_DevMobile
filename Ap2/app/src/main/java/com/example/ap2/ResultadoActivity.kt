package com.example.ap2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val imageViewJogador: ImageView = findViewById(R.id.imageViewJogador)
        val textViewResultado: TextView = findViewById(R.id.textViewResultado)
        val btnVoltar: Button = findViewById(R.id.btnVoltar)

        // Recupera o jogador do intent
        val jogador = intent.getStringExtra("jogador")

        // Exibe o nome e a imagem do jogador baseado no resultado
        when (jogador) {
            "Montillo" -> {
                textViewResultado.text = "Você seria o jogador: Montillo"
                imageViewJogador.setImageResource(R.drawable.montillo)
            }
            "Thiago Neves" -> {
                textViewResultado.text = "Você seria o jogador: Thiago Neves"
                imageViewJogador.setImageResource(R.drawable.thiago_neves)
            }
            "Dedé" -> {
                textViewResultado.text = "Você seria o jogador: Dedé"
                imageViewJogador.setImageResource(R.drawable.dede)
            }
            "Fábio" -> {
                textViewResultado.text = "Você seria o jogador: Fábio"
                imageViewJogador.setImageResource(R.drawable.fabio)
            }
            "Fred" -> {
                textViewResultado.text = "Você seria o jogador: Fred"
                imageViewJogador.setImageResource(R.drawable.fred)
            }
            "Alex" -> {
                textViewResultado.text = "Você seria o jogador: Alex"
                imageViewJogador.setImageResource(R.drawable.alex)
            }
            "Cris" -> {
                textViewResultado.text = "Você seria o jogador: Cris"
                imageViewJogador.setImageResource(R.drawable.cris)
            }
            "Dida" -> {
                textViewResultado.text = "Você seria o jogador: Dida"
                imageViewJogador.setImageResource(R.drawable.dida)
            }
            "Marcelo Moreno" -> {
                textViewResultado.text = "Você seria o jogador: Marcelo Moreno"
                imageViewJogador.setImageResource(R.drawable.marcelo_moreno)
            }
            "Ricardinho" -> {
                textViewResultado.text = "Você seria o jogador: Ricardinho"
                imageViewJogador.setImageResource(R.drawable.ricardinho)
            }
            else -> {
                textViewResultado.text = "Você seria um jogador desconhecido"
                imageViewJogador.setImageResource(R.drawable.default_player)
            }
        }

        // Configura o botão para voltar à tela inicial do quiz
        btnVoltar.setOnClickListener {
            val intent = Intent(this, SucessoActivity::class.java)
            startActivity(intent)
            finish() // Fecha a tela atual para evitar pilha de atividades desnecessária
        }
    }
}
