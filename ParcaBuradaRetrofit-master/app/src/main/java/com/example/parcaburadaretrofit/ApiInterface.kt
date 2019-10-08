package com.example.parcaburadaretrofit


import retrofit2.http.GET


interface ApiInterface {
//https://www.parcaburada.com/welcome/arac_detay_getir_model/24
    @GET("24")

    fun tumModelleriGetir(): retrofit2.Call<List<AracModel>>
}
