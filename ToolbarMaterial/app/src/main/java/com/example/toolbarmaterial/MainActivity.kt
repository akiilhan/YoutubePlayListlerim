package com.example.toolbarmaterial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.mytoolbar)
        //setActionBar(toolbar)
       //actionBar?.setTitle("Merhaba")
        //actionBar?.setSubtitle("Alt Baslık")
        toolbar.setTitle("merhaba")
        toolbar.setSubtitle("AltBaşlık")
        toolbar.inflateMenu(R.menu.menu_main)
        toolbar.setOnMenuItemClickListener(object : Toolbar.OnMenuItemClickListener {
            override fun onMenuItemClick(item: MenuItem?): Boolean {
              return true
            }
        })








    }




}
