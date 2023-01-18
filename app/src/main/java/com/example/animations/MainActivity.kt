package com.example.animations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityOptionsCompat
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

        binding.viewPropertyAnimationBtn.setOnClickListener {
            intent = Intent(this, ViewPropertyAnimation::class.java)
            startActivity(intent)
        }

        binding.sceneAnimationBtn.setOnClickListener {
            intent = Intent(this, SceneAnimation::class.java)
            startActivity(intent)
        }

        binding.sharedTransitionAnimationBtn.setOnClickListener {
            intent = Intent(this, SharedTransitionActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                binding.horseImg,
                "share_horse")
            startActivity(intent, options.toBundle())
        }
    }
}