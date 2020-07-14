package com.example.myapplication

import kotlin.math.max
fun main() {
    val a = 10
    var b: Int = 10
    b = b * 10
    println("the larger is:"+largerNumber(a,b))
}
//fun largerNumber(num1: Int, num2: Int): Int {
//    return max(num1, num2)
//}
//fun largerNumber(num1: Int, num2: Int) = max(num1, num2)

//fun largerNumber(num1: Int, num2: Int): Int {
//    var value = if (num1 > num2) {
//        num1
//    } else {
//        num2
//    }
//    return value
//}

fun largerNumber(num1: Int, num2: Int) = if (num1 > num2) num1 else num2