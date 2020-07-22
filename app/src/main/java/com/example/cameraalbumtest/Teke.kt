package com.example.cameraalbumtest

import java.util.logging.Handler


import java.io.File
import java.nio.file.Files.write


fun main() {
    val savaPath="E:\\新建文件夹 (2)\\11.txt"
    var codeDir="E:\\MyProject"
    File("E:\\MyProject").bufferedWriter().use { writer ->
        File(codeDir).walk().filter { it.isFile }.forEach {

            writer.run {
                write(it.readText())
                write("\r\n")
                flush()
            }
        }
        println(File("E:\\MyProject").readLines().size)
    }
}



