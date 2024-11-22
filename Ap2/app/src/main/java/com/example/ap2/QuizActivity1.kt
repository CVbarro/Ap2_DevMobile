package com.example.ap2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class QuizActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz1)

        val radioGroup: RadioGroup = findViewById(R.id.radioGroupPergunta1)
        val btnProxima: Button = findViewById(R.id.btnProxima)

        btnProxima.setOnClickListener {
            val selectedId = radioGroup.checkedRadioButtonId
            val selectedRadioButton: RadioButton = findViewById(selectedId)

            // Passa a resposta selecionada para a próxima tela
            val resposta1 = selectedRadioButton.text.toString()

            val intent = Intent(this, QuizActivity2::class.java)
            intent.putExtra("resposta1", resposta1)
            startActivity(intent)
        }
    }
}
