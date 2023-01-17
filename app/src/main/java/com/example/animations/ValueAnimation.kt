package com.example.animations

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnticipateOvershootInterpolator
import android.widget.ImageView
import com.example.animations.databinding.ActivityValueAnimationBinding
import com.example.animations.databinding.ActivityViewAnimationXmlBinding

class ValueAnimation : AppCompatActivity() {
    lateinit var binding: ActivityValueAnimationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityValueAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        animateImage(binding.androidIconImg)
    }

    private fun animateImage(imageView: ImageView) {
        ValueAnimator.ofFloat(0.5f, 1f)
            .apply {
                duration = 4000
                repeatMode = ValueAnimator.REVERSE
                repeatCount = ValueAnimator.INFINITE
                interpolator = AnticipateOvershootInterpolator()
                addUpdateListener { animator: ValueAnimator ->
                    val scale = animator.animatedValue as Float
                    imageView.scaleX = scale
                    imageView.scaleY = scale
                }
            }
            .start()
    }
}