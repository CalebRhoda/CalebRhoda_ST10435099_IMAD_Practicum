package com.example.imadpracticum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startButton = findViewById<Button>(R.id.button)
        val quitButton = findViewById<Button>(R.id.button2)

        startButton.setOnClickListener {
            val intent = Intent(this, InputScreen::class.java)
            startActivity(intent)
        }

        quitButton.setOnClickListener {
            finish()
        }

    }
}