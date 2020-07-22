package com.example.helloworld
//定义接口使用interface修饰，类中的方法可以添加行为来作为默认值
interface Study {

    fun readBooks()

    fun doHomework() {
        println("do homework default implementation.")
    }

}