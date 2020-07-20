package com.example.cameraalbumtest

import java.lang.StringBuilder

class Run {
    val s: StringBuilder = StringBuilder("nihaoi")


        fun ren() {
            with(s) {
                println(length)
                toString()
            }
        }



}

fun main() {
    val r:Run=Run()
    r.ren()
    val result1 = getGenericType<String>()

    println(result1)
    val result2 = getGenericType<Int>()

}
fun gu(i: Int):Int {
    return 3
}
inline fun <reified T> getGenericType() = T::class.java
