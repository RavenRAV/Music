package com.example.music

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.music.databinding.ItemMusicBinding
import java.util.ArrayList

class MusicAdapter(val data: ArrayList<Music>,
                   val onClick:() -> Unit):
    RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = data.size



    inner class MusicViewHolder(private val binding: ItemMusicBinding):RecyclerView.ViewHolder(binding.root){


        fun bind(){
            itemView.setOnClickListener {
                onClick()
            }
            val item = data[adapterPosition]
            binding.number.text = item.number
            binding.title.text = item.title
            binding.musician.text = item.musician
            binding.time.text = item.time
        }
    }
}