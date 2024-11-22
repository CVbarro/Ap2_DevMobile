package com.example.ap2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class QuizActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz2)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroupPergunta2)
        val btnProxima: Button = findViewById(R.id.btnProxima)

        val resposta1 = intent.getStringExtra("resposta1")

        btnProxima.setOnClickListener {
            val selectedId = radioGroup.checkedRadioButtonId
            val selectedRadioButton: RadioButton = findViewById(selectedId)

            // Passa a resposta selecionada e a resposta1 para a próxima tela
            val resposta2 = selectedRadioButton.text.toString()

            val intent = Intent(this, QuizActivity3::class.java)
            intent.putExtra("resposta1", resposta1)
            intent.putExtra("resposta2", resposta2)
            startActivity(intent)
        }
    }
}
