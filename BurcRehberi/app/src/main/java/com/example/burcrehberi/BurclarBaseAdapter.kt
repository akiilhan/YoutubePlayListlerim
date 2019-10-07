package com.example.burcrehberi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.teksatir.view.*

class BurclarBaseAdapter(context: Context, tumBurcBilgileri: ArrayList<Burc>) : BaseAdapter() {

    var tumBurc: ArrayList<Burc>
    var context: Context
    //yukarıda mainactivity'de bulunan tumBurc ve contex bilgilerini burada kullanmak için tekrar oluşturduk.


    init {
        this.tumBurc = tumBurcBilgileri
        this.context = context
    }

    override fun getView(p: Int, p1: View?, p2: ViewGroup?): View {
        var viewHolder: ViewHolder2
        var teksatirview = p1

        if (teksatirview == null) {

            var inflater = LayoutInflater.from(context)
            teksatirview = inflater.inflate(R.layout.teksatir, p2, false)
            // Null ise yani ilk defa oluşturulacaksa yukarıdakileri yap.
            viewHolder = ViewHolder2(teksatirview)
            teksatirview.tag = viewHolder
        } else {
            viewHolder = teksatirview.getTag() as ViewHolder2

        }


        viewHolder.burcResim.setImageResource(tumBurc.get(p).burcResmi)
        viewHolder.burcAdi.setText(tumBurc.get(p).burcAdi)
        viewHolder.burcTarih.setText(tumBurc.get(p).burcTarihi)
        return teksatirview!!

    }

    override fun getItem(p0: Int): Any {
        return tumBurc.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return tumBurc.size
    }
}


class ViewHolder2(teksatirview: View) {

    var burcResim: ImageView
    var burcAdi: TextView
    var burcTarih: TextView

    init {
        this.burcResim = teksatirview.imgburcsembol
        this.burcAdi = teksatirview.tvburcadi
        this.burcTarih = teksatirview.tvburctarih
    }

}
