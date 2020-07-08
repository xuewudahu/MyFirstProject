package com.example.activitytest

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
}