package com.example.helloworld

class Student(val sno: String = "", val grade: Int = 0, name: String = "", age: Int = 0) : Person(name, age), Study {
    override fun readBooks() {
        println(name + " is reading.")
    }
    //如果父类中的方法可以重写，子类与父类方法一致就必须加override
    //如果父类方法不可以重写，子类和父类方法一致就会出错

}