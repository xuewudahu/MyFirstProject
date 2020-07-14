package com.example.myapplication
//集合的函数式API
fun main() {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "WaterMelon", "Grape")
    val maxLengthFruit = list.maxBy { it.length }
    val newList = list.map { it.toUpperCase() }
    val newList2 = list.filter { it.length <= 5 }.map { it.toUpperCase() }
    println(maxLengthFruit)
    println(newList)
    println(newList2)
}