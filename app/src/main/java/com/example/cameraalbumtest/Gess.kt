package com.example.cameraalbumtest

sealed class Gess {
    companion object {
        @JvmStatic
        fun jing() {
            println("静态方法")
        }
    }
    fun ha() {
        println("hahah")
    }
}
//静态方法：在伴生类中添加@JvmStatic注解或者时顶层方法
fun main() {
    Gess.jing()
    cos { ming() }
    sdf()
    example{ print(it)}
}
//region
fun cos(block: () -> Unit) {
    println("df")
    block()
    println("sd")
}
//endregion
fun ming() {
    println("天赋")
}
fun sdf() {
    val l= listOf("d","d","s")
    l.forEach { println(it) }

}
fun example(func: (Int)-> Unit) {

}
