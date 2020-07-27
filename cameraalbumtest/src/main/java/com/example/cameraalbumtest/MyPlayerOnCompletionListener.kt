package com.example.cameraalbumtest

import android.media.MediaPlayer
import android.widget.Toast


class MyPlayerOnCompletionListener : MediaPlayer.OnCompletionListener {
    override fun onCompletion(p0: MediaPlayer?) {
        Toast.makeText(MyApplication.context , "播放完成了", Toast.LENGTH_SHORT).show();
    }
}