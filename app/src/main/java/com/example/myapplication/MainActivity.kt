package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.viewmodel.CreationExtras

class MainActivity : AppCompatActivity() {

    lateinit var passwordID : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        passwordID = findViewById(R.id.passwordTextView)

    }

    fun onClick(view: View) {
        if (view is TextView){
            if (passwordID.length() == 0){
                passwordID.text = view.text.toString()
            } else {
                var result = passwordID.text.toString() + view.text.toString()
                passwordID.text = result
            }
        }

    }
}