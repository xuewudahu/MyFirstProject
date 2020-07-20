package com.example.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //步骤一：获取NotificationManager实例
        val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        //步骤二：建立通知渠道
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            val channel = NotificationChannel("normal","Normal",NotificationManager.IMPORTANCE_DEFAULT)
            manager.createNotificationChannel(channel)
        }
        //步骤三：点击事件里完成通知的创建工作

        val intent = Intent(this, MainActivity2::class.java)
        val pi = PendingIntent.getActivity(this, 0, intent, 0)

        send_Notice.setOnClickListener {
            //build方法之前连缀任意多的方法创建一个丰富的Notification对象，基本设置包括：
            //setContentTitle标题内容；setContentText文本内容；setSmallIcon设置通知的小图标，纯alpha图层；setLargeIcon大图标
            val notification = NotificationCompat.Builder(this,"normal")
                .setContentIntent(pi)
                .setAutoCancel(true)
                .setContentTitle("This is content title")
                .setContentText("This is content text")
                .setSmallIcon(R.drawable.small_icon)
                .setLargeIcon(BitmapFactory.decodeResource(resources,R.drawable.large_icon))
                .build()
            //让通知显示出来，一个是id，一个是notification对象。
            manager.notify(1,notification)
        }



    }
}
