package com.example.cameraalbumtest.kotlin

import androidx.appcompat.widget.ResourceManagerInternal.get
import com.example.helloworld.getScore

fun main() {

val s=Get()
    s.a
    println(s.a)

}
class Get(){
    var a="boy"
        get() {
            return "gril"
        }
        set(vale) {
            when{
                vale.contains("boy")->field="fiel"
            }
        }
}