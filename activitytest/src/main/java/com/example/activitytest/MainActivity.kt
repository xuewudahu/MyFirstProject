package com.example.activitytest

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {
            val tempData = savedInstanceState.getString("data_key")
            if (tempData != null) {
                Log.d("WEWE", tempData)
            }
        }
        button1.setOnClickListener{
            Toast.makeText(this,"you are laoguai",Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener{
            val intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener{
            val intent=Intent("com.example.activitytest.ACTION_START")
            startActivity(intent)
        }
        button4.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.baidu.com")
            startActivity(intent)
        }
        imageView.setOnClickListener{
            imageView.setImageResource(R.drawable.w)
        }
    }




    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this,"dsfa",Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this,"dfs dsfa",Toast.LENGTH_SHORT).show()
        }
        return true
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
    override fun onStart() {
        super.onStart()
        Log.d("tag","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("tag","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("tag","onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("tag","onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("tag","onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("tag","onStop")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        val tempData="Something u just typed"
        outState?.putString("data_key",tempData)
    }


}