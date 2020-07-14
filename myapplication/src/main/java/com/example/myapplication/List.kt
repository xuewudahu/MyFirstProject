package com.example.myapplication

fun main(){
//    val list = ArrayList<String>()
//    list.add("Apple")
//    list.add("Banana")
//    list.add("Orange")
//    list.add("Pear")
    val list = listOf("Apple", "Banana", "Orange", "Pear")
    val list3 = mutableListOf("Apple", "Banana", "Orange", "Pear")
    list3.add("WaterMelon")
    for (fruit in list){
        println(fruit)
    }
    for (fruit in list3){
        println(fruit)
    }
}