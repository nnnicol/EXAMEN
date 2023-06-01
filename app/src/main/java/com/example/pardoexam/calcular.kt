package com.example.pardoexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class calcular : AppCompatActivity() {
    lateinit var et1 : EditText
    lateinit var et2 : EditText
    lateinit var btn_sumar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular)


        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        btn_sumar = findViewById(R.id.btn_sumar)


        btn_sumar.setOnClickListener(View.OnClickListener {
            val n1 = Integer.parseInt(et1.text.toString())
            val n2 = Integer.parseInt(et2.text.toString())
            val sumar = n1 + n2



            val intent = Intent(this, resultado::class.java)
            intent.putExtra("Result", sumar)
            startActivity(intent)
        })

    }
}
