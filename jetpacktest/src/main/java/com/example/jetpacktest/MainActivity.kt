package com.example.jetpacktest



import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.edit
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.observe

import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {


    lateinit var viewModel: MainViewModel
    lateinit var sp: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            sp = getPreferences(Context.MODE_PRIVATE)
            val countReserved = sp.getInt("count_reserved", 0)
            viewModel = ViewModelProviders.of(this, MainViewModelFactory(countReserved)).get(MainViewModel::class.java)
            plusOneBtn.setOnClickListener {
                viewModel.counter++
                refreshCounter()
            }
            clearBtn.setOnClickListener {
                viewModel.counter = 0
                refreshCounter()
            }
            refreshCounter()
    }

    override fun onPause() {
        super.onPause()
        sp.edit {
            putInt("count_reserved", viewModel.counter)
            println("sdfsadfasdfasdfasdfsa")
            println(sp.getInt("count_reserved",5))
        }
    }
    private fun refreshCounter() {
        infoText.text=viewModel.counter.toString()
    }
}

