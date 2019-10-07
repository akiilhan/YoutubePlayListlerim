package com.example.fragmentstickyeventbus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class fragmentAciklama : Fragment() {
    lateinit var textViewAciklama:TextView
    lateinit var aciklamalar:Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v= inflater.inflate(R.layout.fragment_aciklama, container, false)
        textViewAciklama=v.findViewById(R.id.tvaciklama)
        aciklamalar=resources.getStringArray(R.array.Açıklamalar)
        textViewAciklama.setText(aciklamalar[0])

        return v
    }
    public fun konuAciklama(position:Int){

        aciklamalar=resources.getStringArray(R.array.Açıklamalar)
        textViewAciklama.setText(aciklamalar[position])
    }


}
