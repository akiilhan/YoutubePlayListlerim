package com.example.calisma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.CheckBox
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {


    val KILO_TO_POUND: Double = 2.2045
    val POUND_TO_KILO: Double = 0.4535
    val MARS: Double = 0.38 //pound
    val VENUS: Double = 0.91
    val URANUS: Double = 0.92
    val SATURN: Double = 1.06
    val JUPITER: Double = 2.34


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cbjupiter.setOnClickListener(this)
        cbvenus.setOnClickListener(this)
        cbmars.setOnClickListener(this)


        Glide.with(this).load(R.drawable.planet3).into(photo)
        //tvsonuc.text = savedInstanceState?.getString("sonuc")
        //var kullaniciKilo = etkilo.toString()

        /* btnHesapla.setOnClickListener{
             Log.e("deneme", "buton calıstı")

             var kullaniciAgirlikPound =kiloToPound(kullaniciKilo.toString().toDouble())
             var marstakiagirlikpound = kullaniciAgirlikPound*MARS
             var marstakiagirlikKilo = poundToKilo(marstakiagirlikpound)

             tvsonuc.text = marstakiagirlikKilo.toString()

         }*/

    }

    fun kiloToPound(kilo: Double): Double {

        return kilo * KILO_TO_POUND
    }

    override fun onSaveInstanceState(outState: Bundle) {
      outState?.putString("sonuc", tvsonuc.text.toString())

    }

    fun poundToKilo(pound: Double): Double {

        return pound * POUND_TO_KILO
    }

    override fun onClick(p0: View?) {

        p0 as CheckBox
        val checked: Boolean = p0.isChecked


        if (!TextUtils.isEmpty(etkilo.text.toString())) {

            var kullaniciAgirlikKilo = etkilo.text.toString()
            var kullanıcıagirlikPound = kiloToPound(kullaniciAgirlikKilo.toDouble())
            when (p0.id) {

                R.id.cbjupiter -> {

                    if (checked) {
                        cbmars.isChecked = false
                        cbvenus.isChecked = false
                        var jupiterPound = kullanıcıagirlikPound * JUPITER
                        hesaplaAgirlıkKilo(jupiterPound.toDouble())

                    }

                }
                R.id.cbvenus -> {

                    if (checked) {
                        cbmars.isChecked = false
                        cbjupiter.isChecked = false

                        var venusPound = kullanıcıagirlikPound * VENUS
                        hesaplaAgirlıkKilo(venusPound.toDouble())
                    }


                }

                R.id.cbmars -> {
                    if (checked) {
                        cbjupiter.isChecked = false
                        cbvenus.isChecked = false

                        var marspound = kullanıcıagirlikPound * MARS
                        hesaplaAgirlıkKilo(marspound.toDouble())
                        Log.e("mars", "mars hesapladı")

                    }
                }
            }

        }


    }

    fun hesaplaAgirlıkKilo(pound: Double) {

        var sonucToKilo = poundToKilo(pound)
        Log.e("deneme2", "$sonucToKilo")

        tvsonuc.text = sonucToKilo.toString().toDouble().formatla(2) + " KG"
    }

    fun Double.formatla(kactaneRakam:Int) = java.lang.String.format("%.${kactaneRakam}f",this)
}


