package com.example.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animations.databinding.ActivityLottieBinding

class Lottie : AppCompatActivity() {
    lateinit var lottieBinding: ActivityLottieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lottieBinding = ActivityLottieBinding.inflate(layoutInflater)
        setContentView(lottieBinding.root)
    }

    override fun onStart() {
        super.onStart()
        lottieBinding.lottieAnim.playAnimation()
    }

    override fun onStop() {
        super.onStop()
        lottieBinding.lottieAnim.cancelAnimation()
    }
}