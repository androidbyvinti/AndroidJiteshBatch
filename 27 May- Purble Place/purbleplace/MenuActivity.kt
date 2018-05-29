package com.bmpl.purbleplace

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var moveAnimation = AnimationUtils.loadAnimation(this, R.anim.move_buttons)

        playImage.startAnimation(AnimationUtils.loadAnimation(this, R.anim.playbtn_animation))
        settingImage.startAnimation(AnimationUtils.loadAnimation(this, R.anim.move_buttons))


        exitImage.startAnimation(AnimationUtils.loadAnimation(this, R.anim.exitbtn_animation))

    }
}