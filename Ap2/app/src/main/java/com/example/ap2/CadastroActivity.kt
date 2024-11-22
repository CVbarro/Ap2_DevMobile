package com.example.ap2

import android.widget.Toast
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val nomeEditText: EditText = findViewById(R.id.nomeEditText)
        val emailEditText: EditText = findViewById(R.id.emailEditText)
        val senhaEditText: EditText = findViewById(R.id.senhaEditText)
        val sexoRadioGroup: RadioGroup = findViewById(R.id.sexoRadioGroup)
        val btnCadastrar: Button = findViewById(R.id.btnCadastrar)

        // Ao clicar no botão de cadastrar, salva as credenciais e redireciona para a tela de login
        btnCadastrar.setOnClickListener {
            val nome = nomeEditText.text.toString()
            val email = emailEditText.text.toString()
            val senha = senhaEditText.text.toString()

            val sexo = when (sexoRadioGroup.checkedRadioButtonId) {
                R.id.sexoMasculino -> "Masculino"
                R.id.sexoFeminino -> "Feminino"
                else -> "Indefinido"
            }

            if (nome.isEmpty()) {
                Toast.makeText(this, "Por favor, insira seu nome.", Toast.LENGTH_SHORT).show()
            } else {
                // Enviar os dados para a LoginActivity
                val intent = Intent(this, LoginActivity::class.java)
                intent.putExtra("nome", nome)
                intent.putExtra("sexo", sexo)
                startActivity(intent)
            }
            // Salva os dados no SharedPreferences
            val sharedPreferences = getSharedPreferences("user_data", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putString("email", email)
            editor.putString("senha", senha)
            editor.putString("nome", nome)
            editor.putString("sexo", sexo)
            editor.apply()

            // Redireciona para a tela de Login
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()  // Fecha a tela de cadastro após redirecionar
        }
    }
}