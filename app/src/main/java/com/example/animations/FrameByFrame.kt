package com.example.animations

import android.graphics.drawable.AnimatedImageDrawable
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.animations.databinding.ActivityFrameByFrameBinding
import kotlin.math.log

class FrameByFrame : AppCompatActivity() {

    lateinit var frameBinding: ActivityFrameByFrameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        frameBinding = ActivityFrameByFrameBinding.inflate(layoutInflater)
        setContentView(frameBinding.root)
        frameBinding.imageView
        val frameAnimation = frameBinding.imageView.drawable as AnimationDrawable?  // FIXME null
        Log.d("FBF", "onCreate() ${frameAnimation.toString()}")
        frameAnimation?.start()
        // TODO add button,  isRunning
    }

    override fun onStart() {
        super.onStart()
//        frameAnimation.start()
    }

    override fun onStop() {
        super.onStop()
//        frameAnimation.stop()
    }
}