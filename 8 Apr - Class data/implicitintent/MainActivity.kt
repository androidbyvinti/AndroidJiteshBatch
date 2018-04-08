package com.bmpl.implicitintent

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendButton.setOnClickListener{
            // Implicit Intent --> action , data --> MIME types
            // src, destination

            try {
                    var intent = Intent()
                    intent.action = Intent.ACTION_SEND
                    // key, value
                    intent.type = "text/plain"
                    //intent.`package` = "com.whatsapp"
                    intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("abc@gmail.com", "xyz@gmail.com"))    // multiple recepit
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Subject")
                    intent.putExtra(Intent.EXTRA_TEXT, "this is my data")
                    startActivity(Intent.createChooser(intent, "Select AnyOne"))       // --> ActivityManager --> Android OS --> List --> Exception  --> Managers
                    // ActivityNotFoundException
            }
            catch (e : ActivityNotFoundException){
                Toast.makeText(this, "No app to handle request", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
