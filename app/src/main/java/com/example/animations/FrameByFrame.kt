package com.example.animations

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.animations.databinding.ActivityFrameByFrameBinding

class FrameByFrame : AppCompatActivity() {

    lateinit var frameBinding: ActivityFrameByFrameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate() called with: savedInstanceState = $savedInstanceState")

        frameBinding = ActivityFrameByFrameBinding.inflate(layoutInflater)
        setContentView(frameBinding.root)
        frameBinding.imageView
        val frameAnimation = frameBinding.imageView.drawable as AnimationDrawable?
        Log.d("FBF", "onCreate() ${frameAnimation.toString()}")
        frameAnimation?.start()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState() called with: savedInstanceState = $savedInstanceState")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    companion object {
        private const val TAG = "ActivLC-2"
    }
}