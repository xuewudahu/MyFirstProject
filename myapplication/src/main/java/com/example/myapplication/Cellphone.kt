package com.example.myapplication

data class cellphone1(val brand: String, val price: Double)
fun main() {
    val cellphone_1 = cellphone1("Sumsung", 1299.99)
    val cellphone_2 = cellphone1("Sumsung", 1299.99)
    println(cellphone_1)
    println("cellphone1 equals cellphone2? " + (cellphone_1 == cellphone_2))
}