package com.example.activitytest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val t=intent.getStringExtra("ni")
        Toast.makeText(this,"sdf$t dfa",Toast.LENGTH_LONG).show()

        button1.setOnClickListener {
            intent = Intent()
            intent.putExtra("wwww","aaaaa")
            setResult(Activity.RESULT_OK,intent)
            finish()

        }

    }
    override fun onBackPressed() {
        val intent = Intent()
        intent.putExtra("wwww", "Hello FirstActivity")
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}