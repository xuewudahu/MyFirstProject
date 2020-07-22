package com.example.activitylifecycletest


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
//一个Activity就是一个 界面，可以实现界面的跳转，界面之间传递数据，每一个界面都有生命周期，每个界面都需要在Androidmanifest.xml中配置
//都需要加载布局，都会继承AppCompatActivity类，还可以设置activity的主题如对话窗口（在AndroidManifest.xml配置），启动模式设置（在AndroidManifest.xml配置）
class MainActivity : AppCompatActivity() {
    private val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate")
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {
            val tempData = savedInstanceState.getString("data_key")
            if (tempData != null) {
                Log.d(tag, tempData)
            }
        }
        startNormalActivity.setOnClickListener {
            val intent = Intent(this, NormalActivity::class.java)
            val s=Lazy()
            println(s.p)
            startActivity(intent)
        }
        startDialogActivity.setOnClickListener {
            val intent = Intent(this, DialogActivity::class.java);
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestroy")
    }
//由不可见状态到可见状态
    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "onRestart")
    }
//Activity被回收之后可以保存数据（进入停止状态后可能被系统回收）
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val tempData = "Something you just typed"
        outState.putString("data_key", tempData)
    }
}
