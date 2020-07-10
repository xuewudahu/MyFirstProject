package com.example.cameraalbumtest

import java.io.*
import java.lang.RuntimeException

class Test {
    var rows=0
    fun main() {
        val file=File("E:\\MyProject")
        getFiles(file)
    }
    public fun getFiles(file: File) {
        val fileout=File("E:\\新建文件夹 (2)\\11.txt")
        if (!file.exists()) {
            throw RuntimeException("地址不对")
        }
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
    public fun getRows(file: File,fileout:File) {

        val bis=BufferedReader(FileReader(file))
        val bus=BufferedWriter(FileWriter(fileout,true))
        var row=0
        var line:String?
        do {
            line=bis.readLine()
            if (line!=null) {
                row++
                bus.write(line)
                bus.flush()
            } else {
                break
            }
        } while (true)
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

