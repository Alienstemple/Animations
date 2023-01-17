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

        lottieBinding.lottieAnim.playAnimation()
    }
}