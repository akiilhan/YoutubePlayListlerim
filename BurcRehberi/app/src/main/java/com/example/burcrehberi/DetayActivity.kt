package com.example.burcrehberi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.palette.graphics.Palette
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detay.*
import kotlinx.android.synthetic.main.teksatir.*

class DetayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)

        var position = intent.extras?.get("tıklanılanOgePozisyon") as Int
        //yukarıda MainActivity'te oluşturduğumuz intent mektubunu, buraya gelip mektubu açıyoruz. ve oanki değeri
        // buradaki positiona atıyoruz.
        var TumBurcBilgileri = intent.extras?.get("tumBurcBilgileri") as ArrayList<Burc>
        Glide.with(this).load(TumBurcBilgileri.get(position).buyukburcresim).into(imgburcbuyukresim)
        tvburcozellikleri.setText(TumBurcBilgileri.get(position).burcGenel) // -> text olan burc bilgilerini pozisyonlara atadık.
         imgburcbuyukresim.setImageResource(TumBurcBilgileri.get(position).buyukburcresim)// -> image olan burc bilgilerini pozisyonlara atadık.

        setSupportActionBar(anim_toolbar)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true) // geri ok butonunu ekledik.

        collapsing_toolbar.title = TumBurcBilgileri.get(position).burcAdi

        var bitmap=BitmapFactory.decodeResource(resources,TumBurcBilgileri.get(position).buyukburcresim)
        Palette.from(bitmap).generate(object :Palette.PaletteAsyncListener{
            override fun onGenerated(palette: Palette?) {
                var mutedColor = palette?.getVibrantColor(R.attr.colorAccent)
                collapsing_toolbar.setContentScrimColor(mutedColor!!)
                window.statusBarColor= mutedColor
            }


        })

    }

    override fun onSupportNavigateUp(): Boolean { //-> Geri butonu işlevi için fonksyon

        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
