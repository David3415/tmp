package com.example.tmpapp1

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.tmpapp1.databinding.ActivityMainBinding

import android.view.View

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val bad = 0..3
    val normal = 4..6
    val nice = 7..9
    val excellent = 10

    val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")

    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val niceArray = ArrayList<String>()
    val excellentArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //var arrays = resources.getStringArray(R.array.names)


        // val range2 = 'a'..'z'
        for (c in bad)badArray.add(nameArray[c])
        for (c in normal)normalArray.add(normalArray[c])

            Log.d("MyLog", "Плохие оценки: Ученик: -  ${badArray[c]}")
        }

    }
}


