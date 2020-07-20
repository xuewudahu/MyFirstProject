package com.example.cameraalbumtest

class BookStore<out T:Book> {
    fun getBook(): T {
        TODO()
    }
}

fun dsa() {
    val eduBookStore:BookStore<EduBook> = BookStore<EduBook>()
    val bookStore:BookStore<Book> =  eduBookStore

    val book :Book= bookStore.getBook()
    val book1 :Book= eduBookStore.getBook()
    val eduBook:EduBook=eduBookStore.getBook()
   // val eduBook1:EduBook=bookStore.getBook()
}