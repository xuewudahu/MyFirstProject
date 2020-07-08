package com.example.myapplication

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.title.view.*
import java.security.AccessControlContext

class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.title,this)
        titleBack.setOnClickListener {
            val activity=context as Activity
            activity.finish()}
    }

}