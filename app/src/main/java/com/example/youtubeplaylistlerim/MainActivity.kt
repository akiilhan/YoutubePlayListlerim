package com.example.youtubeplaylistlerim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    val API_KEY = "AIzaSyCFYg6Xk4pjkAmDH02l45qbiWx8cIWNOzw"
    val CHANNEL_ID = "UClpEUtFu_dXbrUJ6kc3QtlA"
    var gelenVeri: YoutubePlaylist? = null
    var yotubeplaylistOynatmaListeleri: List<YoutubePlaylist.Items>? = null
    var myAdapter:PlaylistAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var apiInterface = ApiClient.client?.create(ApiInterface::class.java)
        var apiCall = apiInterface?.tumListeleriGetir(CHANNEL_ID, API_KEY, 25)
        apiCall?.enqueue(object : Callback<YoutubePlaylist> {
            override fun onFailure(call: Call<YoutubePlaylist>, t: Throwable) {

                Log.e("hata", "" + t?.printStackTrace())
            }

            override fun onResponse(
                call: Call<YoutubePlaylist>,
                response: Response<YoutubePlaylist>
            ) {

                Log.e("başarılı", "" + call?.request()?.toString())
                gelenVeri = response?.body()
                yotubeplaylistOynatmaListeleri = gelenVeri?.items
                myAdapter= PlaylistAdapter(yotubeplaylistOynatmaListeleri)
                recyclerviewPlaylist.adapter=myAdapter
                var mylayoutManager=LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
                recyclerviewPlaylist.layoutManager=mylayoutManager
                supportActionBar?.setSubtitle("Toplam Liste Sayisi " +yotubeplaylistOynatmaListeleri?.size)

                Log.e("başarılı", "Toplam eleman sayisi: " + yotubeplaylistOynatmaListeleri?.size)

                /**for (i in 0..response.body()?.items?.size!! - 1)
                Log.e(
                "başarılı",
                "" + response?.body()?.items?.get(i)?.snippet?.title?.toString()
                )*/ }
        })


    }
}
