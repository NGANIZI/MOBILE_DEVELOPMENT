package com.example.eliteentebbe

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView

class Welcome : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)


        val title: TextView =findViewById(R.id.welcomehigh)
        val address:TextView=findViewById(R.id.welcomepo)

        val top_anim: Animation = AnimationUtils.loadAnimation(this, R.anim.top)
        val bottom_anim: Animation = AnimationUtils.loadAnimation(this, R.anim.bottom)

        title.startAnimation(top_anim)
        address.startAnimation(bottom_anim)


        Handler().postDelayed({
            startActivity(Intent(this, Login::class.java))
            finish() }

            ,1500)
    }
}