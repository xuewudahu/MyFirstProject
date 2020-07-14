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
}