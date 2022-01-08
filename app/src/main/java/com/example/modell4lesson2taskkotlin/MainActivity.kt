package com.example.modell4lesson2taskkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startButton = findViewById<Button>(R.id.btn_start)
        val intent = Intent(this@MainActivity,SecondActivity::class.java)
        startButton.setOnClickListener{
            startActivity(intent)
        }
    }
}