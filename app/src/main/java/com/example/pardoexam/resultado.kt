package com.example.pardoexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class resultado : AppCompatActivity() {

    private lateinit var txt_resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        txt_resultado = findViewById(R.id.txt_resultado)

        val result = intent.getIntExtra("Result", 0)
        txt_resultado.text = "El resultado es: $result"


    }
}
