package com.bmpl.quizapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Handler --> predefined class --> thread --> manage switching work
        // MainThread --> this app
        // UIThread --> Front-end

        var handler = Handler()
        // handler --> postDelayed(Runnable, long delayMilliseconds)
        // Runnable interface --> void run() -->

//        var run = Runnable {
//
//        }

        handler.postDelayed(Runnable {
            var intent = Intent(this, SecondActivity :: class.java) //
            startActivity(intent)
            finish()    // predefined method -->Callback Activity

        }, 4000)

    }
}