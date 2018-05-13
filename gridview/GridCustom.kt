package com.bmpl.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide

//LayoutInflater -->
class GridCustom(mainActivity: MainActivity, images : Array<String>) : BaseAdapter() {

    var images = images

    var activity = mainActivity

    var layoutInflater : LayoutInflater = mainActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as
            LayoutInflater

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view = layoutInflater.inflate(R.layout.custom_grid, null)

        var imageView = view.findViewById<ImageView>(R.id.imageView)

        Glide.with(activity)
                .load(images[p0])
                .into(imageView)

        //imageView.setImageResource(images[p0])
        return view
    }

    override fun getItem(p0: Int): Any {
        return images[p0]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        // total no. of views which should be rendered on the screen
        return images.size
    }

}