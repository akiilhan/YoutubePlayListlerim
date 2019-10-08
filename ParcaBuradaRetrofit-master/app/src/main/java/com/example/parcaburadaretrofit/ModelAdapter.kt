package com.example.parcaburadaretrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.tek_satir_model.view.*

class ModelAdapter(modelliste: List<AracModel>) :
    RecyclerView.Adapter<ModelAdapter.AracModelViewHolder>() {
    var modellist=modelliste
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AracModelViewHolder {
        return AracModelViewHolder(parent)



    }

    override fun getItemCount(): Int {
        return  modellist.size
    }

    override fun onBindViewHolder(holder: AracModelViewHolder, position: Int) {
        val oAnolusturulanSatir=modellist.get(position)
        holder.setData(oAnolusturulanSatir,position)

    }

    class AracModelViewHolder(viewGroup: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(viewGroup.context).inflate(
            R.layout.tek_satir_model,
            viewGroup,
            false
        )
    ) {
        var teksatirliste= itemView as CardView
        var modeltitle=teksatirliste.tvListeBaslik

        fun setData(modelliste: AracModel, position: Int){

            modeltitle.text=modelliste.model
        }

    }
}


