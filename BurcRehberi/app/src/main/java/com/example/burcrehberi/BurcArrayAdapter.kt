package com.example.burcrehberi

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.teksatir.view.*
import android.widget.ArrayAdapter as ArrayAdapter




/**class BurcArrayAdapter(var gelencontext: Context, resource: Int, textViewResourceId: Int, var burcAdlari: Array<String>, var burcTarih: Array<String>,
    var burcResimleri: Array<Int>) : ArrayAdapter<String>(gelencontext, resource, textViewResourceId, burcAdlari) {



    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        var  teksatirview = convertView
        var viewHolder:ViewHolder?=null

        if (teksatirview == null) {

            var inflater = LayoutInflater.from(gelencontext)
            teksatirview = inflater.inflate(R.layout.teksatir, parent, false)
            viewHolder= ViewHolder(teksatirview)
            Log.e("deneme","asd: " +burcAdlari[position])
            teksatirview.tag=viewHolder

        }else{
            //viewHolder= ViewHolder(teksatirview)
            viewHolder=teksatirview.getTag() as ViewHolder
        }



        viewHolder.burcAdi.setText(burcAdlari[position])
        viewHolder.burcTarih.setText(burcTarih[position])
        viewHolder.burcResim.setImageResource(burcResimleri[position])

        return teksatirview!!
    }

    class ViewHolder(teksatirview:View){

        var burcResim:ImageView
        var burcAdi:TextView
        var burcTarih:TextView
        init {
            this.burcResim =teksatirview.imgburcsembol
            this.burcTarih=teksatirview.tvburctarih
            this.burcAdi=teksatirview.tvburcadi
        }
    }

}*/