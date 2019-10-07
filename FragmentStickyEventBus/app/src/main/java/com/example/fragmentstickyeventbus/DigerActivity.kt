package com.example.fragmentstickyeventbus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe

class DigerActivity: AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diger)
        //var intent=intent
        //var position = intent.extras?.get("TiklanilanPozisyonGonder") as Int



    }

    @Subscribe(sticky = true)
    fun onPositionEvent(event: PositionEvent){
        var fragmentAciklamasi=supportFragmentManager.findFragmentById(R.id.fragmentAciklama) as fragmentAciklama
        fragmentAciklamasi.konuAciklama(event.getposition())
        var pozisyon = event.getposition()



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