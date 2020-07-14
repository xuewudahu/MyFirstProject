package com.example.myapplication

class Student(val sno: String="4345", val grade: Int=34, name: String="zhangsan", age: Int=39) : Person(name, age),Study {
    init {
        println("sno is " + sno)
        println("grade is " + grade)
    }

    override fun readBooks() {
        TODO("Not yet implemented")
    }

    override fun doHomeWork() {
        TODO("Not yet implemented")
    }
}

fun main() {
    //有默认值时，参数可以不写全，不写的按照默认值计算
    val student1 = Student()
    val student2 = Student("Tom",20)
    val student3 = Student("a123", 5, "Jack", 19)
}