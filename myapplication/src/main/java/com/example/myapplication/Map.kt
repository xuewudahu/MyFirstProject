package com.example.myapplication

fun main() {
    val map = HashMap<String, Int>()
    map["Apple"] = 1
    map["Banana"] = 2
    map["Orange"] = 3
    val num = map["Apple"]
    val map1 = mapOf("Apple" to 1, "Banana" to 2, "Pear" to 3)
    for ((fruit, number) in map1) {
        println("fruit is " + fruit + ",number is " + number)
    }
}