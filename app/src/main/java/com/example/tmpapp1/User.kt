package com.example.tmpapp1

import kotlin.math.pow
import kotlin.math.sqrt

class User(){//var str1: String, var str2: String) {

fun calc(str1: String, str2: String): String {
    val a: Double
    val b: Double
    a = str1.toDouble()
    b = str2.toDouble()

    return sqrt((a.pow(2) + b.pow(2))).toString()
}
}