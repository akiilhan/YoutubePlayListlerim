package com.example.youtubeplaylistlerim

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.teksatirplaylist.view.*

class PlaylistAdapter(tumOynatmaListeler: List<YoutubePlaylist.Items>?) :
    RecyclerView.Adapter<PlaylistAdapter.PlaylistViewHolder>() {

    var oynatmaListeleri=tumOynatmaListeler
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {

        var inflater=LayoutInflater.from(parent?.context)
        var tekSatirPlaylist=inflater.inflate(R.layout.teksatirplaylist,parent,false)
        return PlaylistViewHolder(tekSatirPlaylist)


    }

    override fun getItemCount(): Int {
        return oynatmaListeleri!!.size
    }

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {

        var oAnOlusturulanSatir=oynatmaListeleri?.get(position)
        holder.setData(oAnOlusturulanSatir,position)



    }


    inner class PlaylistViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        var tekSatirPlaylist=itemView as CardView
        var playlistTitle=tekSatirPlaylist.tvListeBaslik
        var playlistImage=tekSatirPlaylist.circleResim

        fun setData(oAnoluşturulanSatir:YoutubePlaylist.Items?,pos:Int){

            playlistTitle.text=oAnoluşturulanSatir?.snippet?.title
            Picasso.get().load(oAnoluşturulanSatir?.snippet?.thumbnails?.high?.url).into(playlistImage)



        }
    }


}

