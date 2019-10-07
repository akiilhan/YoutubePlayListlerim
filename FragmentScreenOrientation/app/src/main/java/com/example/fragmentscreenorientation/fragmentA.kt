package com.example.fragmentscreenorientation

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class fragmentA : Fragment() {
    lateinit var text: TextView
    lateinit var buton: Button
    var sayi: Int? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var inflater = inflater.inflate(R.layout.fragmenttest, container, false)

        text = inflater.findViewById(R.id.tvDegistir)
        buton = inflater.findViewById(R.id.btnGiris)
        sayi = 0
        if (savedInstanceState!=null){

            text.setText(savedInstanceState.getString("textViewIcerik"))
            buton.setText(savedInstanceState.getString("buton"))
        }

        buton.setOnClickListener {

            text.setText("butona tıkladınız.")
            buton.setText("tıklandı.")
            sayi=50
            Toast.makeText(activity,"sayi= "+sayi,Toast.LENGTH_LONG).show()

        }
        return inflater
    }

    override fun onSaveInstanceState(outState: Bundle) {

        //ekranı cevirdiğimde değişmemesi için kullanılan fonksyon

        outState.putString("textViewIcerik",text.text.toString())
        outState.putString("buton",buton.text.toString())

        super.onSaveInstanceState(outState)
    }

}
