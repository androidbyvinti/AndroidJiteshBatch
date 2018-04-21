package com.bmpl.quizapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

    }

    fun buttonClicked(view : View){
        var intent = Intent(this, QuizActivity :: class.java)
        intent.putExtra("name", view.id)
        startActivity(intent)
    }
}
