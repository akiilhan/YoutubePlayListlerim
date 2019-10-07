 package com.example.layoutinflationkonuanlatm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var inflater = LayoutInflater.from(this)
        /**Yukarıda bir "inflater" isimli inflater oluşturduk.*/
       // var yeniview = inflater.inflate(R.layout.layout_text_view, null)
        /** Yukarıda "yenidersview" adında variable oluşturup, layoutun içindeki
         * "layout_text_view"'i inflate et dedik. (Yani o layoutu java koduna çevirdik.)
         * Yalnız şuan bir yere atamadığımız için programı çalıştırdığımızda görünmeyecek. */

        //iceridekiLayout.addView(yeniview)
        /**Yukarıda ytaptığım şey, dönüştürdüğüm "yeniview" olan javca kodunu, "rootLayout" olarak oluşturduğum
         * frame layoutun içine koy.
         * Aslında layout_text_view içindeki xml kodlarını, kopyalayıp, "root_layout"'un içine yapıştırmam
         * ile aynı şey. Biz bunu dinamik olarak yapıyoruz.
         *
         * Ama sorun şu ki, içine koyduğum zaman yeniview'in yükseklik,genişlik değerleri yerine
         * "rootlayout"'un yükseklik,genişlik değerlerini alıyor.
         * EKLENİLEN KÖK LAYOUTUN ÖZELLİKLERİNİ ALIYOR.*/
        //Log.e("inflation","MESAJ " + yeniview.parent) //rootlayout
        //Log.e("inflation","MESAJ "+ yeniview.layoutParams) //framelayout
        //var yeniview = inflater.inflate(R.layout.layout_text_view,iceridekiLayout,true)
var yeniview = inflater.inflate(R.layout.layout_text_view,iceridekiLayout,false)
        //yukarıda diyorum ki,içeridekilayout'a atama ama onun genişlik, yükseklik değerlerini kullan.
        iceridekiLayout.addView(yeniview)


    }
}
