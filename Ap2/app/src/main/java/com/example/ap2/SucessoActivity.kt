package com.example.ap2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SucessoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sucesso)

        // Botão para iniciar o quiz
        val btnIniciarQuiz: Button = findViewById(R.id.btnIniciarQuiz)
        btnIniciarQuiz.setOnClickListener {
        val intent = Intent(this, QuizActivity1::class.java)
            startActivity(intent)
        }

        // Botão para abrir o site do Cruzeiro
        val btnAbrirSite: Button = findViewById(R.id.btnAbrirSite)
        btnAbrirSite.setOnClickListener {
            val siteIntent = Intent(Intent.ACTION_VIEW)
            siteIntent.data = Uri.parse("https://www.cruzeiro.com.br")
            startActivity(siteIntent)
        }
    }
}
