package com.example.activitytest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class LeftFragment : Fragment() {
//第一个传入的参数resourse是你想要加载的布局资源。第二个传入的参数是指当前载入的视图要将要放入在层级结构中的根视图。
// 如果传入了第三个参数attachToRoot，那么它会决定视图在载入完成后是否附加到传入的根视图中去。
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.left_fragment, container, false)
    }

}