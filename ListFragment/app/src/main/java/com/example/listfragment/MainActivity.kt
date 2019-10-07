package com.example.listfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

//BURADA FRAGMENT'İ XML KULLANARAK DEĞİL JAVA KODLARI İLE OLUŞTURARAK YAPTIK.

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mylistfragment=MyListFragment()
        var manager=supportFragmentManager
        var transaction=manager.beginTransaction()
        transaction.add(R.id.container,mylistfragment,"addfrag")
        transaction.commit()

    }
}
