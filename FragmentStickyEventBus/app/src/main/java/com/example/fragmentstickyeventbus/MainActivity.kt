package com.example.fragmentstickyeventbus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }



    @Subscribe
    fun onPosition(event: PositionEvent) {

        var pozisyon = event.getposition()

        var fragmentAciklama =
            supportFragmentManager.findFragmentById(R.id.fragmentAciklamaLand) as? fragmentAciklama
        if (fragmentAciklama != null && fragmentAciklama.isVisible) {
            //Landscape mod için burası calısır

            fragmentAciklama.konuAciklama(pozisyon)
        } else {

//portrait Mode
            var intent = Intent(this, DigerActivity::class.java)

            startActivity(intent)
        }


    }

    override fun onStart() {
        EventBus.getDefault().register(this)
        super.onStart()
    }

    override fun onStop() {
        EventBus.getDefault().unregister(this)
        super.onStop()
    }
}