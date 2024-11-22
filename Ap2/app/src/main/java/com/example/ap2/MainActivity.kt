package com.example.ap2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIniciarCadastro: Button = findViewById(R.id.btnIniciarCadastro)
        val btnLogin: Button = findViewById(R.id.btnLogin)
        val imageView: ImageView = findViewById(R.id.imageView)

        // Ao clicar no botão, abre a tela de cadastro
        btnIniciarCadastro.setOnClickListener {
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }

        // Ao clicar no botão de login, abre a tela de login
        btnLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}