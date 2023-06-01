package com.example.pardoexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.btn_siguiente)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, calcular::class.java)
            startActivity(intent)

        }
    }
 }



