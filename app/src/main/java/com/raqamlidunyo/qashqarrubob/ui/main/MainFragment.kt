package com.raqamlidunyo.qashqarrubob.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.raqamlidunyo.qashqarrubob.R
import com.raqamlidunyo.qashqarrubob.ui.main.adapter.MainFragmentAdapter
import com.raqamlidunyo.qashqarrubob.ui.main.model.MainModule
import com.raqamlidunyo.qashqarrubob.ui.main.util.MainUtil

class MainFragment : Fragment(), MainFragmentAdapter.OnItemButtonClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MainFragmentAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recyclerView = view.findViewById(R.id.main_recyclerView)
        adapter = MainFragmentAdapter(this)

        val list = MainUtil.mainList()

        adapter.setList(list)
        recyclerView.adapter = adapter
        recyclerView.layoutManager =
            LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)

        val callBack = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                requireActivity().finish()
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(this, callBack)

    }

    override fun onButtonClick(gammasModule: MainModule, position: Int) {
        when (position) {
            0 -> {
                findNavController().navigate(R.id.action_mainFragment_to_usageFragment)
            }
            1 -> {
                findNavController().navigate(R.id.action_mainFragment_to_historyFragment)
            }
            2 -> {
                findNavController().navigate(R.id.action_mainFragment_to_rulesFragment)
            }
            3 -> {
                findNavController().navigate(R.id.action_mainFragment_to_mediatorFragment)
            }
            4 -> {
                findNavController().navigate(R.id.action_mainFragment_to_soundsLocationFragment)
            }
            5 -> {
                findNavController().navigate(R.id.action_mainFragment_to_gammasFragment)
            }
            6 -> {
                findNavController().navigate(R.id.action_mainFragment_to_songsFragment)
            }
            7 -> {
                findNavController().navigate(R.id.action_mainFragment_to_authorFragment)
            }
            else -> {
                Toast.makeText(requireContext(), "Other condition", Toast.LENGTH_LONG).show()

            }
        }
    }


}