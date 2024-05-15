package com.example.tmpapp1

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val lostArray = arrayOf(10000, 2300)
    val earnArray = arrayOf(15000, 300)
    val resultArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val names = resources.getStringArray(R.array.names)
        for ((index, name) in names.withIndex()) {
            resultArray.add("Имя: $name - прибыль = ${earnArray[index] - lostArray[index]}")
            Log.d("MyLog", "Статистика -/- ${resultArray[index]}")
        }
    }
}
