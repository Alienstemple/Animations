package com.example.animations

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.interpolator.view.animation.FastOutLinearInInterpolator
import com.example.animations.databinding.ActivityViewPropertyAnimationBinding

class ViewPropertyAnimation : AppCompatActivity() {

    lateinit var binding: ActivityViewPropertyAnimationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPropertyAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val exampleTextView: View = binding.tvHello

        binding.animateBtn.setOnClickListener {
            exampleTextView.animate()
                .alpha(0.6f)
                .translationY(200F)
                .translationXBy(10F)
                .scaleX(1.5f)
                .setDuration(250)
                .setInterpolator(FastOutLinearInInterpolator())
                .start()
        }
    }
}