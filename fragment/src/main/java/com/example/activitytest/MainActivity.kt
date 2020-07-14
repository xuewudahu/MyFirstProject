package com.example.activitytest

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.left_fragment.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            replaceFragment(Another())


        }
        replaceFragment(RightFragment())
    }

    fun replaceFragment(fragment: Fragment){
        //第二步，获取FragmentManager
        val fragmentManager = supportFragmentManager
        //第三步，开启一个事务
        val transaction = fragmentManager.beginTransaction()
        //第四步，向容器内添加或者替换Fragment，一般使用replace来代替，传递id和添加的Fragment实例
        transaction.replace(R.id.frame_layout,fragment)
        //第五步，提交事务
        transaction.addToBackStack(null)
        Toast.makeText(this,"you are laoguai",Toast.LENGTH_SHORT).show()
        transaction.commit()
    }
}
