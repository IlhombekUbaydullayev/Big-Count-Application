package com.example.modell4lesson2taskkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val plusButton = findViewById<Button>(R.id.btn_plus)
        val coutTextView = findViewById<TextView>(R.id.tv_count)
        val resetButton = findViewById<Button>(R.id.btn_reset)
        val bigCountTextView = findViewById<TextView>(R.id.big_count)
        var  count = 0;
        var bigCount = 0
        plusButton.setOnClickListener{
            count++
            coutTextView.text = count.toString()
            if (count==33){
                bigCount++
                bigCountTextView.text = bigCount.toString()
                count = 0
            }
        }
        resetButton.setOnClickListener{
            count = 0
            bigCount = 0
            coutTextView.text = count.toString()
            bigCountTextView.text = bigCount.toString()
        }
    }
}