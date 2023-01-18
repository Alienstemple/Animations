package com.example.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Scene
import android.transition.Transition
import android.transition.TransitionInflater
import android.transition.TransitionManager
import android.view.View
import com.example.animations.databinding.ActivitySceneAnimationBinding
import com.example.animations.databinding.ActivityViewPropertyAnimationBinding

class SceneAnimation : AppCompatActivity() {
    lateinit var binding: ActivitySceneAnimationBinding
    private var transitionMgr: Transition?=null
    private var scene1: Scene? = null
    private var scene2: Scene? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySceneAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)


        transitionMgr = TransitionInflater.from(this)
            .inflateTransition(R.transition.scene_transition)

        scene1 = Scene.getSceneForLayout(
            binding.root,  // Root работает! id RelativeLayout не нужен!
            R.layout.first_scene, this
        )

        scene2 = Scene.getSceneForLayout(
            binding.root,
            R.layout.second_scene, this
        )

        scene1?.enter()
    }

    fun onClickToSecond(view: View) {
        TransitionManager.go(scene2, transitionMgr)
    }

    fun onClickToFirst(view: View) {
        TransitionManager.go(scene1, transitionMgr)
    }
}