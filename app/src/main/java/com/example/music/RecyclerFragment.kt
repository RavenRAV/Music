package com.example.music

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.music.databinding.FragmentRecyclerBinding

class RecyclerFragment : Fragment() {
    private val data = arrayListOf<Music>()
    private lateinit var binding: FragmentRecyclerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecyclerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
        val adapter = MusicAdapter(data, this::onClick)
        binding.recycler.adapter = adapter
    }

    private fun onClick(){
        startActivity(Intent(requireContext(),MainActivity2::class.java))
    }

    private fun loadData() {
        data.add(Music("1", "Beliver", "Imagine Dragons", "3:30"))
        data.add(Music("2", "Chouwa oto", "KOKIA", "4:38"))
        data.add(Music("3", "Guns for Hire", "Woodkid", "3:47"))
        data.add(Music("4", "Rubia", "Zhou Shen", "3:15"))
        data.add(Music("5", "Skyfall", "Adele", "4:45"))
        data.add(Music("6", "Cold illusions", "Kevin Penkin", "2:54"))
        data.add(Music("7", "Killing me softly", "Roberta Flack", "4:48"))
        data.add(Music("8", "Akatsuki no Requiem", "Linked Horizon", "1:28"))
        data.add(Music("9", "Sid & Nancy", "Lumen", "4:07"))
        data.add(Music("10", "Inside the Fire", "Disturbed", "3:48"))
    }

}