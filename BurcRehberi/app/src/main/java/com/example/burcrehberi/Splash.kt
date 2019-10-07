package com.example.burcrehberi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var logoDundurAnimation=AnimationUtils.loadAnimation(this,R.anim.logodondur)
        imglogo.animation=logoDundurAnimation






    }

    override fun onResume() {
        object :CountDownTimer(5000,1000){
            override fun onFinish() {
                var intent=Intent(this@Splash,MainActivity::class.java)
                startActivity(intent)
            }

            override fun onTick(p0: Long) {
            }


        }.start()
        super.onResume()
    }
}
