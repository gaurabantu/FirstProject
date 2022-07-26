package com.pharma.viotic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler


class SplashActivity : AppCompatActivity() {
    val SPLASH_TIME :Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed(Runnable { //Do any action here. Now we are moving to next page
            val mySuperIntent = Intent(this@SplashActivity, ImageSlide::class.java)
            startActivity(mySuperIntent)

            finish()
        }, SPLASH_TIME)
    }
}