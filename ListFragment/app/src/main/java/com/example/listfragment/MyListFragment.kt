package com.example.listfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.ListFragment

class MyListFragment:ListFragment(),AdapterView.OnItemClickListener {
    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        Toast.makeText(activity,"tıklanan öge: " +p2,Toast.LENGTH_LONG).show()
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var v=inflater.inflate(R.layout.listfragment,container,false)


        return v
    }
    // FRAGMENTİ JAVA İLE OLUŞTURDUĞUMUZ İÇİN ASAĞIDAKİ FONKSYONU OLUŞUTURUP ONUN ALTINDA ADAPTER'İ YAZDIK.

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var adapter=ArrayAdapter.createFromResource(activity!!,R.array.Günler,android.R.layout.simple_list_item_1)
        listView.setAdapter(adapter)
        listView.setOnItemClickListener(this)
    }

    }