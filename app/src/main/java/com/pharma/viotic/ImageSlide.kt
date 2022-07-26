package com.pharma.viotic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.pharma.viotic.adaptor.SliderAdapterExample
import kotlinx.android.synthetic.main.activity_image_slide.*
import kotlinx.android.synthetic.main.activity_image_slide.view.*
class ImageSlide : AppCompatActivity() {

    val numbers = intArrayOf(
        R.drawable.v02,
        R.drawable.v03,
        R.drawable.v04,
        R.drawable.v05,
        R.drawable.v06,
        R.drawable.v07,
        R.drawable.v08,
        R.drawable.v09,
        R.drawable.v10,
        R.drawable.v11,
        R.drawable.v12,
        R.drawable.v13,
        R.drawable.v14,
        R.drawable.v15)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_slide)
        val toolbar1 : Toolbar =findViewById(R.id.toolbar)
        setSupportActionBar(toolbar1)
        supportActionBar!!.setTitle("Viotic Pharmaceuticals")
        var adapter : SliderAdapterExample =SliderAdapterExample(ImageSlide@this,numbers);
        imageSlider.setSliderAdapter(adapter)
    }
}