package com.example.cameraalbumtest

import java.io.*
import java.lang.RuntimeException

class Test {
    var rows=0
    fun main() {
        val file=File("E:\\MyProject")
        getFilesmain(file)
    }
    fun getFilesmain(file: File) {
        if (!file.exists()) {
            throw RuntimeException("地址不对")
        }
        val files=file.listFiles()
        for (f in files) {
            if (f.isDirectory && f.name == "main") {
                getFiles(f)
            } else if (f.isDirectory){
                getFilesmain(f)
            }
        }
    }
     fun getFiles(file: File) {
        val fileout=File("E:\\新建文件夹 (2)\\11.txt")
        val files=file.listFiles()
        for (f in files) {
                if (f.isFile && (f.name.endsWith(".kt"))) {
                    print(f.name)
                    getRows(f,fileout)
                } else if (f.isDirectory) {
                    getFiles(f)
                }


        }
    }
//    fun getRows(file: File,fileout:File) {
//
//        val bis=BufferedReader(FileReader(file))
//        val bus=BufferedWriter(FileWriter(fileout,true))
//        var row=0
//        var line:String?
//        do {
//            line=bis.readLine()
//            if (line!=null) {
//                row++
//                bus.write(line)
//                bus.flush()
//            } else {
//                break
//            }
//        } while (true)
//        rows+=row
//        println("---->这个文件有$row 行")
//    }
    fun getRows(file: File,fileout:File) {
        var row=0
        BufferedReader(FileReader(file)).use {
        var line: String
        while (true) {
            line = it.readLine() ?: break
            row++
            BufferedWriter(FileWriter(fileout,true)).use {
               it.write(line)
               it.flush() }
        }
    }
        rows+=row
        println("---->这个文件有$row 行")
    }
}

fun main() {
    val tow=Test()
    tow.main()
    val rows=tow.rows
    println("所有文件总共有$rows 行 ")
}

