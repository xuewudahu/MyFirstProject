package com.example.cameraalbumtest

import java.util.ArrayList

fun hello(double: Double, vararg ints: Int, string: String) {
    println(double)
    ints.forEach(::println)
    println(string)
}
fun main() {

    val array = intArrayOf(1, 2, 3, 4, 5)

    hello(3.0, *array, string = "hello")

}

