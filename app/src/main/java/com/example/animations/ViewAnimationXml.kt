package com.example.animations

import android.os.Bundle
import android.view.animation.*
import androidx.appcompat.app.AppCompatActivity
import com.example.animations.databinding.ActivityViewAnimationXmlBinding

class ViewAnimationXml : AppCompatActivity() {
    lateinit var binding: ActivityViewAnimationXmlBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewAnimationXmlBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            xmlBtn.setOnClickListener {
                AnimationUtils.loadAnimation(this@ViewAnimationXml, R.anim.icon_view_animation)
                    .also { hyperspaceJumpAnimation ->
                        imageView2.startAnimation(hyperspaceJumpAnimation)
                    }
            }

            codeBtn.setOnClickListener {
                animateProgrammatically()
            }
        }
    }

    private fun animateProgrammatically() {
// create scale animation
        val scaleAnimation = ScaleAnimation(0.5f, 1f, 0.5f, 1f)
        scaleAnimation.repeatMode = Animation.REVERSE
        scaleAnimation.repeatCount = 10
        scaleAnimation.duration = 500
// create alpha animation
        val alphaAnimation = AlphaAnimation(0f, 1f)
        alphaAnimation.repeatMode = Animation.REVERSE
        alphaAnimation.repeatCount = 10
        alphaAnimation.duration = 500
// add animations to AnimationSet
        val animations = AnimationSet(false)
        animations.addAnimation(scaleAnimation)
        animations.addAnimation(alphaAnimation)

        binding.imageView2.startAnimation(animations)
    }
}