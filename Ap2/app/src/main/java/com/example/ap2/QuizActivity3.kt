package com.example.ap2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class QuizActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz3)

        val radioGroup: RadioGroup = findViewById(R.id.radioGroupPergunta3)
        val btnFinalizar: Button = findViewById(R.id.btnFinalizar)

        // Recupera respostas anteriores
        val resposta1 = intent.getStringExtra("resposta1")
        val resposta2 = intent.getStringExtra("resposta2")

        btnFinalizar.setOnClickListener {
            val selectedId = radioGroup.checkedRadioButtonId
            val selectedRadioButton: RadioButton = findViewById(selectedId)
            val resposta3 = selectedRadioButton.text.toString()

            // Determina o jogador com base nas respostas
            val jogador = when {
                resposta1 == "Atacante" && resposta2 == "Criativo" && resposta3 == "Determinado" -> "Montillo"
                resposta1 == "Meio-campo" && resposta2 == "Equilibrado" && resposta3 == "Criativo" -> "Thiago Neves"
                resposta1 == "Defensor" && resposta2 == "Defensivo" && resposta3 == "Calmo" -> "Dedé"
                resposta1 == "Goleiro" && resposta2 == "Equilibrado" && resposta3 == "Focado" -> "Fábio"
                resposta1 == "Atacante" && resposta2 == "Ofensivo" && resposta3 == "Determinado" -> "Fred"
                resposta1 == "Meio-campo" && resposta2 == "Criativo" && resposta3 == "Criativo" -> "Alex"
                resposta1 == "Defensor" && resposta2 == "Defensivo" && resposta3 == "Focado" -> "Cris"
                resposta1 == "Goleiro" && resposta2 == "Defensivo" && resposta3 == "Calmo" -> "Dida"
                resposta1 == "Atacante" && resposta2 == "Equilibrado" && resposta3 == "Criativo" -> "Marcelo Moreno"
                resposta1 == "Meio-campo" && resposta2 == "Ofensivo" && resposta3 == "Determinado" -> "Ricardinho"
                else -> "Desconhecido"
            }

            // Inicia a tela de resultados e envia o jogador identificado
            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("jogador", jogador)
            startActivity(intent)
        }
    }
}
