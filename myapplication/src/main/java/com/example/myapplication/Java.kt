package com.example.myapplication


fun doStudy(study: Study?) {
    study?.readBooks()
    study?.doHomeWork()
}
fun main() {
    val a:String?="2"
    val b:Int?=3
    val c = a ?: b
    println(c)
}



//fun getTextLength(text: String?): Int {
//    if (text != null) {
//        return text.length
//    }
//    return 0
//}
//调用length字段需使用?.操作符，进而判断是不是为零。
fun getTextLength1(text: String?) = text?.length ?: 0


//fun doStudy1(study: Study?) {
//    //?.表示对象不为空时调用let函数
//    //let函数会将study本身作为参数传递至Lambda表达式中，此时对象不为空，可以放心调用。
//    study?.let { stu ->
//        stu.readBooks()
//        stu.doHomeWork()
//    }
//}
fun doStudy1(study: Study?) {
    study?.let {
        it.readBooks()
        it.doHomeWork()
    }
}