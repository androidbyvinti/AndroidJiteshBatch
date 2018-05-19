package com.bmpl.gridview

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var imagesArray = arrayOf(
            "https://wallpaperbrowse.com/media/images/4643298-images.jpg",
            "https://i.guim.co.uk/img/media/fc7a858579afcb5962d62c4b7d82af580b176c43/1412_933_5948_3569/master/5948.jpg?w=300&q=55&auto=format&usm=12&fit=max&s=a80195271df2d0fe1c65a8ae980cb4e8",
            "http://jasmijnyoga.com/wp-content/uploads/2018/01/vogelbescherming-news-1.jpeg",
            "http://www.bajiroo.com/wp-content/uploads/2015/08/amazing-wonderful-macro-photography-of-nature-pics-pictures-images-photos-13.jpg",
            "https://img-download.pchome.net/download/1k0/xi/3g/odkyct-z45.jpg",
            "http://rozanehonline.com/fa/rozanehgroup/ordibehesht92/ghatreh/Picture26.jpg",
            "http://www.uniwallpaper.com/static/images/butterfly-wallpaper.jpeg",
            "https://images.freeimages.com/images/small-previews/2fe/butterfly-1390152.jpg",
            "https://ak.picdn.net/assets/cms/14c40a5a7a7f50788cf9e346071ab49ad1201b12-17d705f0349ed08f5387b39c7644054a59affe52-LOHP_vector_module_shutterstock_307324316-min.jpg",
            "https://images.vexels.com/media/users/1925/71784/preview2/36168ed40ef96a7acdd7d13e86ba2a4e-colorful-cubes-crystallized-3d-background.jpg")

    var titleArray = arrayOf("Pic 1", "Pic 1","Pic 1",
                                "Pic 1", "Pic 1", "Pic 1",
                                "Pic 1", "Pic 1", "Pic 1",
                                "Pic 1")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView.adapter = GridCustom(this, imagesArray,  titleArray)


        // url fetch


        gridView.setOnItemClickListener { adapterView, view, i, l ->

            var intent = Intent(this, FullScreenActivity :: class.java)

            intent.putExtra("position", i)
            startActivity(intent)

        }
    }
}
