package com.example.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.animations.databinding.ActivityFrameByFrameBinding
import com.example.animations.databinding.ActivityViewAnimationXmlBinding

class ViewAnimationXml : AppCompatActivity() {
    lateinit var binding: ActivityViewAnimationXmlBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewAnimationXmlBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val hyperspaceJumpAnimation: Animation =
            AnimationUtils.loadAnimation(this, R.anim.icon_view_animation)
        binding.imageView2.startAnimation(hyperspaceJumpAnimation)
    }
}