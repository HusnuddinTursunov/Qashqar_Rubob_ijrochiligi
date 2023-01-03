package com.raqamlidunyo.qashqarrubob.ui.lessons.gammas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.raqamlidunyo.qashqarrubob.R
import com.raqamlidunyo.qashqarrubob.ui.lessons.gammas.adapter.GammasFragmentAdapter
import com.raqamlidunyo.qashqarrubob.ui.lessons.gammas.util.GammasUtil
import com.raqamlidunyo.qashqarrubob.ui.main.model.GammasModule


class GammasFragment : Fragment(), GammasFragmentAdapter.OnItemButtonClickListener {

    private lateinit var adapter: GammasFragmentAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gammas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = GammasFragmentAdapter(this)
        adapter.setList(list = GammasUtil.createGammasList(30))
        val stagger = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView = view.findViewById(R.id.gammas_recyclerView)
        recyclerView.layoutManager = stagger
        recyclerView.adapter = adapter

    }

    override fun onButtonClick(gammasModule: GammasModule, position: Int) {
        val action = GammasFragmentDirections.actionGammasFragmentToHelpersFragment(position)
        findNavController().navigate(action)
    }
}