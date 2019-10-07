package com.example.fragmentstickyeventbus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.ScrollView
import org.greenrobot.eventbus.EventBus


class FragmentKonu : Fragment(),AdapterView.OnItemClickListener{


    lateinit var konulistesi: ListView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        var v = inflater.inflate(R.layout.fragment_konu, container, false)
        konulistesi = v.findViewById(R.id.lvKonular)
        var adapter=ArrayAdapter.createFromResource(activity!!,R.array.konular,android.R.layout.simple_list_item_1
        )

        konulistesi.setAdapter(adapter)
        konulistesi.setOnItemClickListener(this)


        return v
    }

    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        //      Burada yaptığımız şey, Konu sekmesinde bir sekmeye tıklandığında hangi sekme tıklandığında hangi
        //açıklama göstericek onu ayarlıyoruz. Bunuda position değerine göre yapıcaz. Burada "P2" position
        //değerini gösteriyor. Sonra bu pozisyonu Listenerdaki sentData fonksyonuna gönderiyoruz.


        EventBus.getDefault().postSticky(PositionEvent(p2))
    }


}
