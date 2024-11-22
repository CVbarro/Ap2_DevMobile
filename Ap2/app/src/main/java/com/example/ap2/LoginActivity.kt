package com.example.ap2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailEditText: EditText = findViewById(R.id.emailEditText)
        val senhaEditText: EditText = findViewById(R.id.senhaEditText)
        val btnLogin: Button = findViewById(R.id.btnLogin)

        // Ao clicar no botão de login, verifica as credenciais
        btnLogin.setOnClickListener {
            val email = emailEditText.text.toString()
            val senha = senhaEditText.text.toString()

            // Verifica se os dados de login estão corretos
            val sharedPreferences = getSharedPreferences("user_data", Context.MODE_PRIVATE)
            val storedEmail = sharedPreferences.getString("email", "")
            val storedSenha = sharedPreferences.getString("senha", "")

            if (email == storedEmail && senha == storedSenha) {
                // Login bem-sucedido, redireciona para a tela de sucesso
                val intent = Intent(this, SucessoActivity::class.java)
                intent.putExtra("email", email)
                startActivity(intent)
            } else {
                // Senha ou email incorretos
                Toast.makeText(this, "Email ou senha incorretos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
