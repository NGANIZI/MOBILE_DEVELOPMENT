package com.example.eliteentebbe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class Mysplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysplash)

        val logo:ImageView=findViewById(R.id.imageView2)
        val title:TextView=findViewById(R.id.tvtitle)
        val progressBar:ProgressBar=findViewById(R.id.splashprogress)
        val version:TextView=findViewById(R.id.version)
        val top_anim:Animation=AnimationUtils.loadAnimation(this, R.anim.top)
        val bottom_anim:Animation=AnimationUtils.loadAnimation(this, R.anim.bottom)

        logo.startAnimation(top_anim)
        title.startAnimation(bottom_anim)
        progressBar.startAnimation(bottom_anim)
        version.startAnimation(bottom_anim)

        Handler().postDelayed({
            startActivity(Intent(this, Welcome::class.java))
                              finish() }

        ,3000)
    }
}