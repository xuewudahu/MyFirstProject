package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val url = URL("https://www.baidu.com")
        val connection = url.openConnection() as HttpURLConnection

    }
}
