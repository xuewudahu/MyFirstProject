package com.example.broadcasttest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
        lateinit var timeChangeReceiver: TimeChangeReceiver

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(timeChangeReceiver)
    }
    inner class TimeChangeReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            Toast.makeText(context, "Time has changed", Toast.LENGTH_SHORT).show()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intentfilter = IntentFilter()
        intentfilter.addAction("com.example.broadcasttest")
        timeChangeReceiver = TimeChangeReceiver()
        registerReceiver(timeChangeReceiver, intentfilter)
        button.setOnClickListener {
            //构建Intent对象并将要发送的广播传入
            val intent = Intent("com.example.broadcasttest")
            //intent的setPackage将当前程序的包名传入，packagename是getPackageName的语法糖写法
            //android8.0之后静态注册广播无法接受隐式的，这里一定要调用setPackage，指明发送给哪个app，从而使其成为显式的。
            intent.setPackage(packageName)
            //发送BroadCastReceiver
            sendBroadcast(intent)
        }
    }

}
