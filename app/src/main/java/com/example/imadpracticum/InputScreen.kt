package com.example.imadpracticum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner



open class InputScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_screen)
        val daysOfTheWeek = arrayListOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
        val minTemp = ArrayList<String>()
        val maxTemp = ArrayList<String>()
        val weatherCondition = mutableListOf<String>()
        val dayInput = findViewById<EditText>(R.id.addDay)
        val minTempInput = findViewById<EditText>(R.id.addMinTemp)
        val maxTempInput = findViewById<EditText>(R.id.addMaxTemp)
        val submitButton = findViewById<Button>(R.id.submitbutton)
        val weatherConditionInput = findViewById<EditText>(R.id.addWeather)
        val nextButton = findViewById<Button>(R.id.button4)
        var index = 0


        while (index < 6) {
        submitButton.setOnClickListener {
            val input1 = dayInput.text.toString().trim()
            val input2 = minTempInput.text.toString().trim()
            val input3 = maxTempInput.text.toString().trim()
            val input4 = weatherConditionInput.text.toString().trim()
            if (input1.isNotEmpty() or input2.isNotEmpty() or input3.isNotEmpty() or input4.isNotEmpty()) {
                minTemp.add(input2)
                maxTemp.add(input3)
                weatherCondition.add(input4)
                minTempInput.text.clear()
                println(minTemp[0])
            index++
            }
        }
        nextButton.setOnClickListener {
            val intent = Intent(this, ViewingScreen::class.java)
            startActivity(intent)
        }
    }
}





