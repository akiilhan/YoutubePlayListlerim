package com.example.burcrehberi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var tumBurc: ArrayList<Burc> // Sınıfın her yerinden erişebilmem için yukarı tanımladım.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        veriKaynagiHazirla()


        // arrays.xml tanımladığımız burc isimlerini ve tarihlerini buraya getirdik.
// yukarıda resimleri tek tek eklemek yerine array oluşturup içine yazdık.


        //
        var myArrayAdapter = BurclarBaseAdapter(this, tumBurc)
        listBurclar.adapter = myArrayAdapter
        //burası BurcArrayAdapter Kısmı
        //var myArrayAdapter =
        //  BurcArrayAdapter(this, R.layout.teksatir, R.id.tvburcadi, burcisimleri, burcTarihleri,burcresim*/)
        //listBurclar.adapter = myArrayAdapter


        listBurclar.setOnItemClickListener { adapterView,view, i, l ->

            var intent = Intent(this@MainActivity, DetayActivity::class.java)
            intent.putExtra("tıklanılanOgePozisyon", i) //aktiviteye tıkladığımda o aktivitenin pozisyonunu gönderen mektup.
            // Bu mektubu DetayAktivity'de açıyoruz.(Detay aktivity'e bak)

            intent.putExtra("tumBurcBilgileri", tumBurc) // -> Burada da tumburcları içeren mektubu gönderdik.(Dikkat et Burc sınıfını
              //serializable olarak tanımladık.(Burc sınıfı dosyası içinde)
            startActivity(intent)

            //Yukarıda artık yeni bir aktiviteye tıkladığımda yeni bir aktiviteye gidiyor.


        }


    }

    private fun veriKaynagiHazirla() {

        tumBurc = ArrayList<Burc>(12)
        var burcisimleri = resources.getStringArray(R.array.burcisim)
        var burcTarihleri = resources.getStringArray(R.array.burcTarih)
        var burcresim = arrayOf(
            R.drawable.koc, R.drawable.boga, R.drawable.ikizler, R.drawable.yengec,
            R.drawable.aslan, R.drawable.basak, R.drawable.terazi, R.drawable.akrep, R.drawable.yay,
            R.drawable.oglak, R.drawable.kova, R.drawable.balik
        )
        var burcResimBuyuk = arrayOf(
            R.drawable.koc2, R.drawable.boga2, R.drawable.ikizler2, R.drawable.yengec2,
            R.drawable.aslan2, R.drawable.basak2, R.drawable.terazi2, R.drawable.akrep2, R.drawable.yay2,
            R.drawable.oglak2, R.drawable.kova2, R.drawable.balik2
        )
        var burcGenelOzellik = resources.getStringArray(R.array.burcGenelOzellikler)

        for (i in 0..11) {

            var ArrayaAtanacakBurclar =
                Burc(burcisimleri[i], burcTarihleri[i], burcresim[i], burcResimBuyuk[i], burcGenelOzellik[i])
            //yukarıda burcları arraya atadık.
            tumBurc.add(ArrayaAtanacakBurclar)

            // yukarıda olusturulan arrayi "tumBurc'a atadık.
        }
    }
}

