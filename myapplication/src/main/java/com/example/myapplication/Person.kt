package com.example.myapplication

//不加open不能继承
open class Person(val name: String, val age: Int) {

    fun eat() {
        println(name + " is eating. He is " + age + " years old")
    }
    operator fun plus(p: Person): Person {
        val e=name+p.name
        val s=age+p.age
        return Person(e,s)
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }

}

fun main() {
    val a:Person= Person("d",3)
    val r:Person=Person("d3",32)
    val c=a+r
    println(c)
}