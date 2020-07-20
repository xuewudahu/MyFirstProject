package com.example.cameraalbumtest



fun main() {
    val str="kotloin"
    println(str.first())
    println(str[0])
    println(str.get(0))
    println(str.first { it=='o' })
    println(str.last { it=='o' })
    println(str.indexOfLast { it=='o' })
    for (fi in IntRange(0, 3)) {
        println(fi)
    }
    val sum={x:Int,y:Int->x+y}
    println(sum(2,3))
    val k=Ke(3)

    fun test(a : Int , b : (num1 : Int , num2 : Int) -> Int) : Int{
        return a + b.invoke(3,5)

    }
    val func= fun( t:Int) {
        if (t > 3) {
            println("dsfsa")
        }

    }
    val d=IntArray(9){it+4}
    for (f in d) {
        println("sdfsasdf$f")
    }
    println("sdfsadf$d")
    func(3)
    val fes:(Function1)->Unit= fun(j: Function1) {
        if (j > 4) {
            println("dfsa")
        }
    }

}


interface Function1 {
    fun invok(p:Int)
    operator fun compareTo(i: Int): Int {
     return 2
    }
}
class Ke(age:Int){


}