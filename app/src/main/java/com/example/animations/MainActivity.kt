package com.example.animations

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.app.ActivityOptionsCompat
import com.example.animations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate() called with: savedInstanceState = $savedInstanceState")
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

        binding.activityOpeningBtn.setOnClickListener {
            val options = ActivityOptions.makeScaleUpAnimation(it, 0, 0, it.width, it.height)
            startActivity(Intent(this, ActivityOpeningAnimation::class.java), options.toBundle())

        }
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

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    companion object {
        private const val TAG = "ActivLC"
    }
}