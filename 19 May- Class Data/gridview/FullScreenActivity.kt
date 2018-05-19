package com.bmpl.gridview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_full_screen.*

class FullScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_screen)

        var intent = intent

        var mainActivity = MainActivity()

        var position = intent.getIntExtra("position", 0)

        //fullImageView.setImageResource(mainActivity.imagesArray[position])

        var title = mainActivity.titleArray[position]

        Glide.with(this)
                .load(mainActivity.imagesArray[position])
                .into(fullImageView)

    }
}