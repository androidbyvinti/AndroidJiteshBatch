package com.bmpl.purbleplace

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class SpalshActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh)

        var handler = Handler()

        handler.postDelayed(Runnable {
            startActivity(Intent(this, MenuActivity :: class.java))
            finish()
        }
        , 3000)

    }
}
