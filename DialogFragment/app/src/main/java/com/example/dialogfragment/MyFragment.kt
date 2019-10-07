package com.example.dialogfragment

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class MyFragment : DialogFragment(), View.OnClickListener {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var evetbutonu:Button
        var hayirbutonu:Button
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT)) //-> fragmenti köşeli yapmak için
        //dialog.setCanceledOnTouchOutside(false) //-> diyalogta ekran dışına basıp çıkmasını engellemek için.
        var v = inflater.inflate(R.layout.my_dialog, null)

        evetbutonu=v.findViewById(R.id.btnEvet)
        hayirbutonu=v.findViewById(R.id.btnHayir)

        evetbutonu.setOnClickListener(this)
        hayirbutonu.setOnClickListener(this)




        return v
    }
    override fun onClick(p0: View?) {

        var mylistener=activity as MyListener
        if (p0?.id==R.id.btnEvet){
            mylistener.DialogVerisiniGonder("evet tıklandı")

            dismiss() //-> Bunu yaparsan evete tıklandığında hem evet butonu calısır hemde dialogtan çıkar.

        }
        else{
            mylistener.DialogVerisiniGonder("hayır tıklandı.")
            dismiss()

        }
    }


}