package com.example.cameraalbumtest

class Tr {
    private val childer=ArrayList<Td>()
    fun td(block:Td.()->String) {
        val td=Td()
        td.content=td.block()
        childer.add(td)

    }

}

fun main() {
    val tr=Tr()
    tr.td { html() }
    tr.td { "334" }
    tr.td { "s434" }
    print(tr)
}