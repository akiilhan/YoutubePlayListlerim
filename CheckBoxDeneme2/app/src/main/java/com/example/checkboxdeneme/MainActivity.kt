package com.example.checkboxdeneme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    val poundTokilo:Double = 0.4535
    val kiloToPound:Double = 2.20462
    val jupiterPound:Double = 2.34
    val saturnPound:Double = 1.06
    val marsPound:Double = 0.38


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var userkg =kilogram.text

        checkJupiter.setOnClickListener(this)

    }

    



}












