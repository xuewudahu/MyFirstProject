package com.example.cameraalbumtest

import android.app.Application
import android.content.Context

class MyApplication :Application() {
    companion object{
        @SuppressWarnings("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}