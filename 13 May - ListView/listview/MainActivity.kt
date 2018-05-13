package com.bmpl.listview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var androidVersions = arrayOf("Cupcake", "Donut", "Eclair",
                                    "Froyo", "GingerBread", "HoneyComb",
                                    "Ice-Cream Sandwich", "JellyBean",
                                    "Kitkat", "Lollipop", "Marshmallow",
                                    "Nougat", "Oreo", "P")

    var imagesArray = arrayOf(R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ArrayAdapter

        //listView.adapter = ArrayAdapter(this, R.layout.custom_layout, androidVersions)

        //listView.adapter = CustomAdatper(this, imagesArray, androidVersions)

        listView.setOnItemClickListener { adapterView, view, i, l ->

            Toast.makeText(this, "You clicked on ${androidVersions[i]}", Toast.LENGTH_SHORT).show()
        }

    }
}
