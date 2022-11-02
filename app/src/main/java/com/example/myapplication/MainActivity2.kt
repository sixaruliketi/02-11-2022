package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var increaseButton : Button
    lateinit var numberTextView : TextView
    lateinit var nextPageID : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        increaseButton = findViewById(R.id.increaseButton)
        numberTextView = findViewById(R.id.numberTextView)
        nextPageID = findViewById(R.id.nextPageID)


        increaseButton.setOnClickListener {
            var number = numberTextView.text.toString().toInt()
            number++
            numberTextView.text = number.toString()

        }

        nextPageID.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))

        }


    }
}