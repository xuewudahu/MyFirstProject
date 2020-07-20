package com.example.cameraalbumtest

class MySet<T>(val helpSet: HashSet<T>) : Set<T>by helpSet {



}

fun main() {
    val s=HashSet<Int>()
    s.add(3)
    s.add(23)
    val m=MySet<Int>(s)
    println(m.size)
    m.contains(3)
}