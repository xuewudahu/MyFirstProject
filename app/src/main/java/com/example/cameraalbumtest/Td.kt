package com.example.cameraalbumtest

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Td {
    var content=""
    fun html()="\n\t\t<td>$content <\td>"
}

fun main() {
    val start=System.currentTimeMillis()
    runBlocking {
        repeat(100000) {
            launch {
                println(".")

            }
        }
    }
    val end=System.currentTimeMillis()
    print(end-start)
}