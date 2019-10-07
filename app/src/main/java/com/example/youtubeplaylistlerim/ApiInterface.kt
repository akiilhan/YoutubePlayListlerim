package com.example.youtubeplaylistlerim

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    //GET https://www.googleapis.com/youtube/v3/playlists?part=snippet&channelId=UClpEUtFu_dXbrUJ6kc3QtlA&key={YOUR_API_KEY}

    @GET("playlists?part=snippet")
    fun tumListeleriGetir(@Query("channelId")channelID:String,@Query("key") apiKey:String,@Query("maxResults") limit:Int):retrofit2.Call<YoutubePlaylist>
}