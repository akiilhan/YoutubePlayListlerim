package com.example.sevenwonders

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.teksatir.view.*

class HarikaBaseAdapter(context: Context, tumBurcBilgiler: ArrayList<Harikalar>) : BaseAdapter() {

    var TumHarikalar: ArrayList<Harikalar>
    var context: Context
    init {
        this.TumHarikalar = tumBurcBilgiler
        this.context = context
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup): View {
        var viewHolder:ViewHolder
        var teksatir=p1



        if (teksatir==null){
            var inflater = LayoutInflater.from(context)
            teksatir = inflater.inflate(R.layout.teksatir, p2, false)
            viewHolder = ViewHolder(teksatir)
            teksatir.tag = viewHolder
        }else{
            viewHolder = teksatir.getTag() as ViewHolder
        }

        viewHolder.harikaAd.setText(TumHarikalar.get(p0).harikaAdi)
        viewHolder.HarikaYil.setText(TumHarikalar.get(p0).harikaYili)
        viewHolder.harikaResim.setImageResource(TumHarikalar.get(p0).harikaResmi)

        return teksatir!!

    }

    override fun getItem(p0: Int): Any {
        return TumHarikalar.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return TumHarikalar.size
    }


}
class ViewHolder(teksatir:View) {

    var harikaResim: ImageView
    var harikaAd: TextView
    var HarikaYil: TextView

    init {
        this.harikaAd = teksatir.tvHarikaAdi
        this.harikaResim = teksatir.imgSembol
        this.HarikaYil = teksatir.tvHarikayili
    }
}


