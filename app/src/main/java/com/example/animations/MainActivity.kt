package com.example.animations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.frameByFrameBtn.setOnClickListener {
            intent = Intent(this, FrameByFrame::class.java)
            startActivity(intent)
        }

        binding.viewFromXml.setOnClickListener {
            intent = Intent(this, ViewAnimationXml::class.java)
            startActivity(intent)
        }

        binding.lottieBtn.setOnClickListener {
            intent = Intent(this, Lottie::class.java)
            startActivity(intent)
        }

        binding.valueAnimationBtn.setOnClickListener {
            intent = Intent(this, ValueAnimation::class.java)
            startActivity(intent)
        }
    }
}