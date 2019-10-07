package com.example.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast


class Mainctivity : AppCompatActivity(),MyListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun showDialog(view: View) {
    var MyDialog = MyFragment()
    MyDialog.show(supportFragmentManager, "My Dialog")
    }

    override fun DialogVerisiniGonder(mesaj: String) {
        Toast.makeText(this,mesaj,Toast.LENGTH_LONG).show()
    }

}
