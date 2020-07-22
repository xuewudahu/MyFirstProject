package com.example.helloworld

import android.content.Intent
import java.lang.StringBuilder

fun main() {
//    val student = Student("Jack", 19)
//    doStudy(student)

//    val cellphone1 = Cellphone("Samsung", 1299.99)
//    val cellphone2 = Cellphone("Samsung", 1299.99)
//    println(cellphone1)
//    println("cellphone1 equals cellphone2 " + (cellphone1 == cellphone2))

//    Singleton.singletonTest()

//    val list = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape")
//    list.add("Watermelon")
//    for (fruit in list) {
//        println(fruit)
//    }

//    val set = setOf("Apple", "Banana", "Orange", "Pear", "Grape")
//    for (fruit in set) {
//        println(fruit)
//    }


//    val map = mapOf("Apple" to 1, "Banana" to 2, "Orange" to 3, "Pear" to 4, "Grape" to 5)
//    for ((fruit, number) in map) {
//        println("fruit is " + fruit + ", number is " + number)
//    }

//    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
//    val anyResult = list.any { it.length <= 5 }
//    val allResult = list.all { it.length <= 5 }

//    Thread {
//        println("Thread is running")
//    }.start()

//    doStudy(null)

//    val brand = "Samsung"
//    val price = 1299.99
//    println("Cellphone(brand=$brand, price=$price)")

//    printParams(str = "world")



}
//if函数有返回值，只包括if或者when语句的可以省略{}，使用=来连接，函数也可以省略返回值
fun biggerValue(num1: Int, num2: Int) = if (num1 > num2) num1 else num2
//when语句可以使用参数名来判断得出结果，其中when之后不需要添加name，else不可省略
fun getScore(name: String) = when {
    name.startsWith("Tom") -> 86
    name == "Jim" -> 77
    name == "Jack" -> 95
    name == "Lily" -> 100
    else -> 0
}
//一般的when语句，使用when（name）的方式
fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}
//可能为空时在类型后添加？。之后调用参数的方法和变量时需要使用？.的方式
fun getTextLength(text: String?) = text?.length ?: 0

var study: Study? = null
//let关键字与判空语句结合，结构体类的方法就可以使用it.的方式来调用。
fun doStudy() {
    study?.let {
        it.readBooks()
        it.doHomework()
    }
}
//字符串内嵌表达式的方式使用$加变量的方式来定义
fun printParams(num: Int = 100, str: String) {
    println("num is $num , str is $str")
}
//使用了集合的函数式API，就是使用了高阶函数，定义了一个扩展函数。
fun list() {
    val list= listOf<String>("apple","banana","orange")
    val max=list.maxBy { it.length }
    println(max)
}

//java的函数式API
//接口在一个类中得到了实现，那么这个类就可以在以这个类为参数的类中
// Thread（Runnable runnabale）其中一个类dog实现了Runnable接口，那么就可以Threa（dog（））
fun thread() {
    Thread(object :Runnable{
        override fun run(){
            println("gd fd")
        }
    })
}
fun thread1() {
    Thread{
        println("sfs dfa ")
    }
}