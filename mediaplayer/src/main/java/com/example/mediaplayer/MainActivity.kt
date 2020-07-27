package com.example.mediaplayer


import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.os.Environment

import android.view.View
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity


class LocalVideoActivity : AppCompatActivity() {
    private var videoView: VideoView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //本地的视频  需要在手机SD卡根目录添加一个 fl1234.mp4 视频
        val videoUrl1 =
            Environment.getExternalStorageDirectory().path + "/fl1234.mp4"

        //网络视频
        val videoUrl2: String = Utils.videoUrl
        val uri = Uri.parse(videoUrl2)
        videoView =
            findViewById<View>(R.id.videoView) as VideoView

        //设置视频控制器
        videoView!!.setMediaController(MediaController(this))

        //播放完成回调
        videoView!!.setOnCompletionListener(MyPlayerOnCompletionListener())

        //设置视频路径
        videoView!!.setVideoURI(uri)

        //开始播放视频
        videoView!!.start()
    }

    internal inner class MyPlayerOnCompletionListener :
        MediaPlayer.OnCompletionListener {
        override fun onCompletion(mp: MediaPlayer) {
            Toast.makeText(
                this@LocalVideoActivity,
                "播放完成了",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
