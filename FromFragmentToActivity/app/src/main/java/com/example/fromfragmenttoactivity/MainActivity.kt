package com.example.fromfragmenttoactivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView


class MainActivity : AppCompatActivity(),MyListener {
     override lateinit var sonuc: TextView



    // lateinit var sonuc: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         sonuc=findViewById(R.id.tvSonuc)
    }

     override fun sayilariTopla(sayi1: Int, sayi2: Int) {

        var toplam= sayi1+sayi2
         sonuc.text = "SONUC: " +toplam
         Log.e("aki","sonuc: $sonuc.")


    }
}
