package com.example.animations

import android.animation.AnimatorInflater
import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnticipateOvershootInterpolator
import android.widget.ImageView
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.animations.databinding.ActivityValueAnimationBinding
import com.example.animations.databinding.ActivityViewAnimationXmlBinding

class ValueAnimation : AppCompatActivity() {
    lateinit var binding: ActivityValueAnimationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityValueAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.xmlBtn.setOnClickListener {
            animateFromXml(binding.androidIconImg)
        }

        binding.valAnimBtn.setOnClickListener {
            animateImage(binding.androidIconImg)
        }

        binding.propValBtn.setOnClickListener {
            animateAlphaAndScaleImage(binding.androidIconImg)
        }
    }

    private fun animateFromXml(imageView: ImageView) {
        val animatorXml: ValueAnimator = AnimatorInflater.loadAnimator(
            this,
            R.animator.icon_value_animator
        ) as ValueAnimator
        animatorXml.addUpdateListener { animator: ValueAnimator ->
            imageView.alpha = (animator.animatedValue as Float)
        }
        animatorXml.start()
    }

    private fun animateAlphaAndScaleImage(imageView: ImageView) {
        // Комбинируем свойства для VAlueAnimator
        val alphaHolder: PropertyValuesHolder = PropertyValuesHolder.ofFloat("alpha", 0f, 1f)
        val scaleHolder: PropertyValuesHolder = PropertyValuesHolder.ofFloat("scale", 0.5f, 1f)

        ValueAnimator.ofPropertyValuesHolder(alphaHolder, scaleHolder)
            .apply {
                duration = 4000
                repeatMode = ValueAnimator.REVERSE
                repeatCount = ValueAnimator.INFINITE
                interpolator = AnticipateOvershootInterpolator()
                addUpdateListener { animator: ValueAnimator ->
                    val alpha = animator.getAnimatedValue("alpha") as Float
                    val scale = animator.getAnimatedValue("scale") as Float
                    imageView.alpha = alpha
                    imageView.scaleX = scale
                    imageView.scaleY = scale
                }
            }
            .start()
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