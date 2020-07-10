package com.example.listviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val fruitList=ArrayList<Fruit>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFruits()
        val adapter=FruitAdapter(this,R.layout.fruit_item,fruitList)
        listView.adapter = adapter
        listView.setOnItemClickListener{ parent,view,position,id->
            val fruit = fruitList[position]
            Toast.makeText(this,fruit.name,Toast.LENGTH_SHORT).show()
        }
    }
    private fun initFruits() {
        repeat(2) {
            fruitList.add(Fruit("1",R.drawable.apple_pic))
            fruitList.add(Fruit("2",R.drawable.banana_pic))
            fruitList.add(Fruit("3",R.drawable.cherry_pic))
            fruitList.add(Fruit("4",R.drawable.grape_pic))
            fruitList.add(Fruit("5",R.drawable.orange_pic))
            fruitList.add(Fruit("6",R.drawable.pear_pic))
            fruitList.add(Fruit("7",R.drawable.pineapple_pic))
            fruitList.add(Fruit("8",R.drawable.strawberry_pic))
            fruitList.add(Fruit("9",R.drawable.watermelon_pic))
        }
    }
}


