package com.example.sevenwonders

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var TumHarikalar: ArrayList<Harikalar>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        veriKaynagi()

        var myAdapter=HarikaBaseAdapter(this,TumHarikalar)
        listViewHarika.adapter=myAdapter
    }

    private fun veriKaynagi() {

        TumHarikalar = ArrayList(8)
        var harikaAdi=resources.getStringArray(R.array.harikaAdi)
        var harikaYili=resources.getStringArray(R.array.harikaYili)
        var harikaResmi= arrayOf(R.drawable.colosseum,R.drawable.cairocitadel,R.drawable.christtheredeemer,
            R.drawable.greatwallofchina,R.drawable.leaningtowerofpisa,R.drawable.pyramids,R.drawable.stonehenge,R.drawable.tajmahal)

        for (i in 0..7){

            var ArrayaAranacak= Harikalar(harikaAdi[i],harikaYili[i],harikaResmi[i])
            TumHarikalar.add(ArrayaAranacak)
        }

    }


}
