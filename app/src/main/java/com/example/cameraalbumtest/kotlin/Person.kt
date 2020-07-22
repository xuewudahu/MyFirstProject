package com.example.helloworld
//使用open来修饰类和方法就可以继承和重写
open class Person(val name: String, val age: Int) {

   fun eat() {
        println(name + " is eating. He is " + age + " years old.")
    }

}