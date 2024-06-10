package com.example.imadpracticum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ViewingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewing_screen)
        val daysOfTheWeek = arrayListOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
        val display = findViewById<TextView>(R.id.textView16)
        var index = 0

        while (index < 6) {
            display.text = daysOfTheWeek [ index ]
            index++
        }

        display.text = daysOfTheWeek.toString()
    }
}