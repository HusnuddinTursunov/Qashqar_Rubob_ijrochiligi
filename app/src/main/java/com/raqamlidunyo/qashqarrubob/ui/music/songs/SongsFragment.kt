package com.raqamlidunyo.qashqarrubob.ui.music.songs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.raqamlidunyo.qashqarrubob.R
import com.raqamlidunyo.qashqarrubob.ui.music.songs.adapter.SongsFragmentAdapter
import com.raqamlidunyo.qashqarrubob.ui.music.songs.model.Songs
import com.raqamlidunyo.qashqarrubob.ui.music.songs.util.SongsUtil


class SongsFragment : Fragment(), SongsFragmentAdapter.OnItemButtonClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: SongsFragmentAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_songs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.songs_recyclerView)
        adapter = SongsFragmentAdapter(this)
        adapter.setList(SongsUtil.songsList())
        recyclerView.adapter = adapter
        val stagger = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = stagger

    }

    override fun onButtonClick(songs: Songs, position: Int) {
        when (position) {
            0 -> {
                findNavController().navigate(R.id.action_songsFragment_to_paxtaoyFragment)
            }
            1 -> {
                findNavController().navigate(R.id.action_songsFragment_to_dolonchaFragment)
            }
            2 -> {
                findNavController().navigate(R.id.action_songsFragment_to_andijonPolkaFragment)
            }
            3 -> {
                findNavController().navigate(R.id.action_songsFragment_to_qashqarchaFragment)
            }
            4 -> {
                findNavController().navigate(R.id.action_songsFragment_to_yallanmaYorimFragment)
            }
        }
    }
}