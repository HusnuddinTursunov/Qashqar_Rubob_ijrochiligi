package com.raqamlidunyo.qashqarrubob.ui.lessons.helpers

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.navArgs
import com.raqamlidunyo.qashqarrubob.R
import com.raqamlidunyo.qashqarrubob.ui.lessons.helpers.util.HelpersUtil
import com.google.android.material.button.MaterialButton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class HelpersFragment : Fragment() {

    private val args:HelpersFragmentArgs by navArgs()

    private lateinit var play_button:MaterialButton
    private lateinit var mediaPlayer: MediaPlayer

    private lateinit var cl_gamma:ConstraintLayout

    private lateinit var cl_not:ConstraintLayout

    private lateinit var do_1_gamma: ImageView
    private lateinit var re_1_gamma: ImageView
    private lateinit var mi_1_gamma: ImageView
    private lateinit var fa_1_gamma: ImageView
    private lateinit var sol_1_gamma: ImageView
    private lateinit var lya_1_gamma: ImageView
    private lateinit var si_1_gamma: ImageView
    private lateinit var do_2_gamma: ImageView
    private lateinit var re_2_gamma: ImageView
    private lateinit var mi_2_gamma: ImageView
    private lateinit var fa_2_gamma: ImageView
    private lateinit var sol_2_gamma: ImageView
    private lateinit var lya_2_gamma: ImageView
    private lateinit var si_2_gamma: ImageView
    private lateinit var do_3_gamma: ImageView
    private lateinit var sol_3_gamma: ImageView
    private lateinit var re_3_gamma: ImageView
    private lateinit var lya_3_gamma: ImageView
    private lateinit var mi_3_gamma: ImageView
    private lateinit var si_3_gamma: ImageView
    private lateinit var fa_3_gamma: ImageView



    private lateinit var lya_3_si_1_bimol:ImageView
    private lateinit var lya_3_si_1:ImageView
    private lateinit var lya_3_do_1:ImageView
    private lateinit var lya_3_do_1_diyez:ImageView
    private lateinit var lya_3_re_1:ImageView
    private lateinit var lya_3_re_1_diyez:ImageView
    private lateinit var lya_3_mi_1:ImageView
    private lateinit var lya_3_fa_1:ImageView
    private lateinit var lya_3_fa_1_diyez:ImageView
    private lateinit var lya_3_sol_1:ImageView
    private lateinit var lya_3_sol_1_diyez:ImageView
    private lateinit var lya_3_lya_1:ImageView
    private lateinit var lya_3_lya_1_diyez:ImageView
    private lateinit var lya_3_si_2:ImageView
    private lateinit var lya_3_do_2:ImageView
    private lateinit var lya_3_do_2_diyez:ImageView
    private lateinit var lya_3_re_2:ImageView
    private lateinit var lya_3_re_2_diyez:ImageView
    private lateinit var lya_3_mi_2:ImageView
    private lateinit var lya_3_fa_2:ImageView
    private lateinit var lya_3_fa_2_diyez:ImageView
    private lateinit var lya_3_sol_2:ImageView
    private lateinit var lya_3_sol_2_diyez:ImageView
    private lateinit var lya_3_lya_2:ImageView
    private lateinit var lya_3_lya_2_diyez:ImageView


    private lateinit var mi_2_fa_1:ImageView
    private lateinit var mi_2_fa_1_diyez:ImageView
    private lateinit var mi_2_sol_1:ImageView
    private lateinit var mi_2_sol_1_diyez:ImageView
    private lateinit var mi_2_lya_1:ImageView
    private lateinit var mi_2_lya_1_diyez:ImageView
    private lateinit var mi_2_si_1:ImageView
    private lateinit var mi_2_do_1:ImageView
    private lateinit var mi_2_do_1_diyez:ImageView
    private lateinit var mi_2_re_1:ImageView
    private lateinit var mi_2_re_1_diyez:ImageView
    private lateinit var mi_2_mi_1:ImageView
    private lateinit var mi_2_fa_2:ImageView
    private lateinit var mi_2_fa_2_diyez:ImageView
    private lateinit var mi_2_sol_2:ImageView
    private lateinit var mi_2_sol_2_diyez:ImageView
    private lateinit var mi_2_lya_2:ImageView
    private lateinit var mi_2_lya_2_diyez:ImageView
    private lateinit var mi_2_si_2:ImageView
    private lateinit var mi_2_do_2:ImageView
    private lateinit var mi_2_do_2_diyez:ImageView
    private lateinit var mi_2_re_2:ImageView
    private lateinit var mi_2_re_2_diyez:ImageView
    private lateinit var mi_2_mi_2:ImageView
    private lateinit var mi_2_mi_2_diyez:ImageView


    private lateinit var lya_1_si_1_bimol:ImageView
    private lateinit var lya_1_si_1:ImageView
    private lateinit var lya_1_do_1:ImageView
    private lateinit var lya_1_do_1_diyez:ImageView
    private lateinit var lya_1_re_1:ImageView
    private lateinit var lya_1_re_1_diyez:ImageView
    private lateinit var lya_1_mi_1:ImageView
    private lateinit var lya_1_fa_1:ImageView
    private lateinit var lya_1_fa_1_diyez:ImageView
    private lateinit var lya_1_sol_1:ImageView
    private lateinit var lya_1_sol_1_diyez:ImageView
    private lateinit var lya_1_lya_1:ImageView
    private lateinit var lya_1_lya_1_diyez:ImageView
    private lateinit var lya_1_si_2:ImageView
    private lateinit var lya_1_do_2:ImageView
    private lateinit var lya_1_do_2_diyez:ImageView
    private lateinit var lya_1_re_2:ImageView
    private lateinit var lya_1_re_2_diyez:ImageView
    private lateinit var lya_1_mi_2:ImageView
    private lateinit var lya_1_fa_2:ImageView
    private lateinit var lya_1_fa_2_diyez:ImageView
    private lateinit var lya_1_sol_2:ImageView
    private lateinit var lya_1_sol_2_diyez:ImageView
    private lateinit var lya_1_lya_2:ImageView
    private lateinit var lya_1_lya_2_diyez:ImageView

    private lateinit var view_line_rubob_1:View
    private lateinit var view_line_rubob_2:View
    private lateinit var view_line_rubob_3:View

    private lateinit var helpers_nots:List<ImageView>
    private lateinit var helpers_image:List<ImageView>
    private lateinit var helpers_list:List<Int>

    private var position:Int = 0
    private var count:Int = 0
    private var isButtonClikc:Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_helpers, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        position = args.gammasNum

        play_button = view.findViewById(R.id.mtb_play_button)


        lya_3_si_1_bimol = view.findViewById(R.id.lya_3_si_1_bimol)
        lya_3_si_1 = view.findViewById(R.id.lya_3_si_1)
        lya_3_do_1 = view.findViewById(R.id.lya_3_do_1)
        lya_3_do_1_diyez = view.findViewById(R.id.lya_3_do_1_diyez)
        lya_3_re_1 = view.findViewById(R.id.lya_3_re_1)
        lya_3_re_1_diyez = view.findViewById(R.id.lya_3_re_1_diyez)
        lya_3_mi_1 = view.findViewById(R.id.lya_3_mi_1)
        lya_3_fa_1 = view.findViewById(R.id.lya_3_fa_1)
        lya_3_fa_1_diyez = view.findViewById(R.id.lya_3_fa_1_diyez)
        lya_3_sol_1 = view.findViewById(R.id.lya_3_sol_1)
        lya_3_sol_1_diyez = view.findViewById(R.id.lya_3_sol_1_diyez)
        lya_3_lya_1 = view.findViewById(R.id.lya_3_lya_1)
        lya_3_lya_1_diyez = view.findViewById(R.id.lya_3_lya_1_diyez)
        lya_3_si_2 = view.findViewById(R.id.lya_3_si_2)
        lya_3_do_2 = view.findViewById(R.id.lya_3_do_2)
        lya_3_do_2_diyez = view.findViewById(R.id.lya_3_do_2_diyez)
        lya_3_re_2 = view.findViewById(R.id.lya_3_re_2)
        lya_3_re_2_diyez = view.findViewById(R.id.lya_3_re_2_diyez)
        lya_3_mi_2 = view.findViewById(R.id.lya_3_mi_2)
        lya_3_fa_2 = view.findViewById(R.id.lya_3_fa_2)
        lya_3_fa_2_diyez = view.findViewById(R.id.lya_3_fa_2_diyez)
        lya_3_sol_2 = view.findViewById(R.id.lya_3_sol_2)
        lya_3_sol_2_diyez = view.findViewById(R.id.lya_3_sol_2_diyez)
        lya_3_lya_2 = view.findViewById(R.id.lya_3_lya_2)
        lya_3_lya_2_diyez = view.findViewById(R.id.lya_3_lya_2_diyez)


        mi_2_fa_1 = view.findViewById(R.id.mi_2_fa_1)
        mi_2_fa_1_diyez = view.findViewById(R.id.mi_2_fa_1_diyez)
        mi_2_sol_1 = view.findViewById(R.id.mi_2_sol_1)
        mi_2_sol_1_diyez = view.findViewById(R.id.mi_2_sol_1_diyez)
        mi_2_lya_1 = view.findViewById(R.id.mi_2_lya_1)
        mi_2_lya_1_diyez = view.findViewById(R.id.mi_2_lya_1_diyez)
        mi_2_si_1 = view.findViewById(R.id.mi_2_si_1)
        mi_2_do_1 = view.findViewById(R.id.mi_2_do_1)
        mi_2_do_1_diyez = view.findViewById(R.id.mi_2_do_1_diyez)
        mi_2_re_1 = view.findViewById(R.id.mi_2_re_1)
        mi_2_re_1_diyez = view.findViewById(R.id.mi_2_re_1_diyez)
        mi_2_mi_1 = view.findViewById(R.id.mi_2_mi_1)
        mi_2_fa_2 = view.findViewById(R.id.mi_2_fa_2)
        mi_2_fa_2_diyez = view.findViewById(R.id.mi_2_fa_2_diyez)
        mi_2_sol_2 = view.findViewById(R.id.mi_2_sol_2)
        mi_2_sol_2_diyez = view.findViewById(R.id.mi_2_sol_2_diyez)
        mi_2_lya_2 = view.findViewById(R.id.mi_2_lya_2)
        mi_2_lya_2_diyez = view.findViewById(R.id.mi_2_lya_2_diyez)
        mi_2_si_2 = view.findViewById(R.id.mi_2_si_2)
        mi_2_do_2 = view.findViewById(R.id.mi_2_do_2)
        mi_2_do_2_diyez = view.findViewById(R.id.mi_2_do_2_diyez)
        mi_2_re_2 = view.findViewById(R.id.mi_2_re_2)
        mi_2_re_2_diyez = view.findViewById(R.id.mi_2_re_2_diyez)
        mi_2_mi_2 = view.findViewById(R.id.mi_2_mi_2)
        mi_2_mi_2_diyez = view.findViewById(R.id.mi_2_mi_2_diyez)


        lya_1_si_1_bimol = view.findViewById(R.id.lya_1_si_1_bimol)
        lya_1_si_1 = view.findViewById(R.id.lya_1_si_1)
        lya_1_do_1 = view.findViewById(R.id.lya_1_do_1)
        lya_1_do_1_diyez = view.findViewById(R.id.lya_1_do_1_diyez)
        lya_1_re_1 = view.findViewById(R.id.lya_1_re_1)
        lya_1_re_1_diyez = view.findViewById(R.id.lya_1_re_1_diyez)
        lya_1_mi_1 = view.findViewById(R.id.lya_1_mi_1)
        lya_1_fa_1 = view.findViewById(R.id.lya_1_fa_1)
        lya_1_fa_1_diyez = view.findViewById(R.id.lya_1_fa_1_diyez)
        lya_1_sol_1 = view.findViewById(R.id.lya_1_sol_1)
        lya_1_sol_1_diyez = view.findViewById(R.id.lya_1_sol_1_diyez)
        lya_1_lya_1 = view.findViewById(R.id.lya_1_lya_1)
        lya_1_lya_1_diyez = view.findViewById(R.id.lya_1_lya_1_diyez)
        lya_1_si_2 = view.findViewById(R.id.lya_1_si_2)
        lya_1_do_2 = view.findViewById(R.id.lya_1_do_2)
        lya_1_do_2_diyez = view.findViewById(R.id.lya_1_do_2_diyez)
        lya_1_re_2 = view.findViewById(R.id.lya_1_re_2)
        lya_1_re_2_diyez = view.findViewById(R.id.lya_1_re_2_diyez)
        lya_1_mi_2 = view.findViewById(R.id.lya_1_mi_2)
        lya_1_fa_2 = view.findViewById(R.id.lya_1_fa_2)
        lya_1_fa_2_diyez = view.findViewById(R.id.lya_1_fa_2_diyez)
        lya_1_sol_2 = view.findViewById(R.id.lya_1_sol_2)
        lya_1_sol_2_diyez = view.findViewById(R.id.lya_1_sol_2_diyez)
        lya_1_lya_2 = view.findViewById(R.id.lya_1_lya_2)
        lya_1_lya_2_diyez = view.findViewById(R.id.lya_1_lya_2_diyez)

        view_line_rubob_1 = view.findViewById(R.id.view_line_rubob_1)
        view_line_rubob_2 = view.findViewById(R.id.view_line_rubob_2)
        view_line_rubob_3 = view.findViewById(R.id.view_line_rubob_3)

        cl_not = view.findViewById(R.id.cl_not)

        

        when(position)
        {
            0 -> {
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_1)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_1)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_1)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_1)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_1)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_1)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_1)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_1)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_1)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_1)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_1)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_1)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_1)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_1)
                do_3_gamma = view.findViewById(R.id.imv_do_3_gamma_1)
                cl_gamma = view.findViewById(R.id.cl_1_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_3_gamma)
                helpers_list = HelpersUtil.do_major_list()
                helpers_nots = listOf(lya_3_do_1, lya_3_re_1, lya_3_mi_1, lya_3_fa_1, mi_2_sol_1, mi_2_lya_1, mi_2_si_1, mi_2_do_1, lya_1_re_1, lya_1_mi_1,lya_1_fa_1,lya_1_sol_1, lya_1_lya_1,lya_1_si_2, lya_1_do_2)
            }
            1 -> {
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_2)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_2)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_2)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_2)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_2)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_2)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_2)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_2)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_2)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_2)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_2)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_2)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_2)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_2)
                sol_3_gamma = view.findViewById(R.id.imv_sol_3_gamma_2)
                cl_gamma = view.findViewById(R.id.cl_2_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(sol_1_gamma, lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_3_gamma)
                helpers_list = HelpersUtil.sol_major_list()
                helpers_nots = listOf(mi_2_sol_1, mi_2_lya_1, mi_2_si_1, mi_2_do_1, lya_1_re_1, lya_1_mi_1, lya_1_fa_1_diyez, lya_1_sol_1, lya_1_lya_1, lya_1_si_2, lya_1_do_2, lya_1_re_2, lya_1_mi_2, lya_1_fa_2_diyez, lya_1_sol_2)
            }

            2 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_3)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_3)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_3)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_3)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_3)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_3)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_3)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_3)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_3)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_3)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_3)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_3)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_3)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_3)
                re_3_gamma = view.findViewById(R.id.imv_re_3_gamma_3)
                cl_gamma = view.findViewById(R.id.cl_3_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_1_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_3_gamma)
                helpers_list = HelpersUtil.re_major_list()
                helpers_nots = listOf(lya_3_re_1, lya_3_mi_1, lya_3_fa_1_diyez, lya_3_sol_1, mi_2_lya_1, mi_2_si_1, mi_2_do_1_diyez, mi_2_re_1, lya_1_mi_1, lya_1_fa_1_diyez, lya_1_sol_1, lya_1_lya_1, lya_1_si_2, lya_1_do_2_diyez, lya_1_re_2)
            }

            3 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_4)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_4)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_4)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_4)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_4)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_4)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_4)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_4)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_4)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_4)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_4)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_4)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_4)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_4)
                lya_3_gamma = view.findViewById(R.id.imv_lya_3_gamma_4)
                cl_gamma = view.findViewById(R.id.cl_4_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_3_gamma)
                helpers_list = HelpersUtil.lya_major_list()
                helpers_nots = listOf(lya_3_lya_1_diyez, lya_3_si_1, lya_3_do_1_diyez, lya_3_re_1, mi_2_mi_1, mi_2_fa_1_diyez, mi_2_sol_1_diyez, mi_2_lya_1, lya_1_si_1, lya_1_do_1_diyez, lya_1_re_1, lya_1_mi_1, lya_1_fa_1_diyez, lya_1_sol_1_diyez, lya_1_lya_1)
            }

            4 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_5)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_5)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_5)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_5)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_5)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_5)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_5)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_5)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_5)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_5)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_5)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_5)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_5)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_5)
                mi_3_gamma = view.findViewById(R.id.imv_mi_3_gamma_5)
                cl_gamma = view.findViewById(R.id.cl_5_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_3_gamma)
                helpers_list = HelpersUtil.mi_major_list()
                helpers_nots = listOf(lya_3_mi_1, lya_3_fa_1_diyez, lya_3_sol_1_diyez, lya_3_lya_1, mi_2_si_1, mi_2_do_1_diyez, mi_2_re_1_diyez, mi_2_mi_1, lya_1_fa_1_diyez, lya_1_sol_1_diyez, lya_1_lya_1, lya_1_si_2, lya_1_do_2_diyez, lya_1_re_2_diyez, lya_1_mi_2)
            }

            5 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_6)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_6)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_6)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_6)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_6)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_6)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_6)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_6)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_6)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_6)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_6)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_6)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_6)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_6)
                si_3_gamma = view.findViewById(R.id.imv_si_3_gamma_6)
                cl_gamma = view.findViewById(R.id.cl_6_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_3_gamma)
                helpers_list = HelpersUtil.si_major_list()
                helpers_nots = listOf(lya_3_si_1, lya_3_do_1_diyez, lya_3_re_1_diyez, lya_3_mi_1, mi_2_fa_1_diyez, mi_2_sol_1_diyez, mi_2_lya_1_diyez, mi_2_si_1, lya_1_do_1_diyez, lya_1_re_1_diyez, lya_1_mi_1, lya_1_fa_1_diyez, lya_1_sol_1_diyez, lya_1_lya_1_diyez, lya_1_si_2)
            }

            6 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_7)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_7)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_7)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_7)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_7)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_7)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_7)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_7)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_7)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_7)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_7)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_7)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_7)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_7)
                fa_3_gamma = view.findViewById(R.id.imv_fa_3_gamma_7)
                cl_gamma = view.findViewById(R.id.cl_7_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma,  fa_3_gamma)
                helpers_list = HelpersUtil.fa_diyez_major_list()
                helpers_nots = listOf(mi_2_fa_1_diyez, mi_2_sol_1_diyez, mi_2_lya_1_diyez, mi_2_si_1, lya_1_do_1_diyez, lya_1_re_1_diyez, lya_1_fa_1, lya_1_fa_1_diyez, lya_1_sol_1_diyez, lya_1_lya_1_diyez, lya_1_si_2, lya_1_do_2_diyez, lya_1_re_2_diyez, lya_1_fa_2, lya_1_fa_2_diyez)
            }

            7 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_8)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_8)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_8)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_8)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_8)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_8)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_8)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_8)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_8)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_8)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_8)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_8)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_8)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_8)
                do_3_gamma = view.findViewById(R.id.imv_do_3_gamma_8)
                cl_gamma = view.findViewById(R.id.cl_8_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_3_gamma)
                helpers_list = HelpersUtil.do_diyez_major_list()
                helpers_nots = listOf(lya_3_do_1_diyez, lya_3_re_1_diyez, lya_3_fa_1, lya_3_fa_1_diyez, mi_2_sol_1_diyez, mi_2_lya_1_diyez, mi_2_do_1, mi_2_do_1_diyez, lya_1_re_1_diyez, lya_1_fa_1, lya_1_fa_1_diyez, lya_1_sol_1_diyez, lya_1_lya_1_diyez, lya_1_do_2, lya_1_do_2_diyez)
            }

            8 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_9)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_9)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_9)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_9)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_9)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_9)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_9)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_9)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_9)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_9)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_9)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_9)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_9)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_9)
                lya_3_gamma = view.findViewById(R.id.imv_lya_3_gamma_9)
                cl_gamma = view.findViewById(R.id.cl_9_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_3_gamma)
                helpers_list = HelpersUtil.lya_minor_list()
                helpers_nots = listOf(lya_3_lya_1, lya_3_si_1, lya_3_do_1, lya_3_re_1, lya_3_mi_1, lya_3_fa_1, mi_2_sol_1, mi_2_lya_1, mi_2_si_1, mi_2_do_1, lya_1_re_1, lya_1_mi_1, lya_1_fa_1, lya_1_sol_1, lya_1_lya_1)
            }

            9 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_10)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_10)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_10)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_10)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_10)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_10)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_10)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_10)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_10)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_10)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_10)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_10)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_10)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_10)
                mi_3_gamma = view.findViewById(R.id.imv_mi_3_gamma_10)
                cl_gamma = view.findViewById(R.id.cl_10_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_3_gamma)
                helpers_list = HelpersUtil.mi_minor_list()
                helpers_nots = listOf(mi_2_mi_1, mi_2_fa_2_diyez, mi_2_sol_2, mi_2_lya_2, mi_2_si_2, mi_2_do_2, lya_1_re_1, lya_1_mi_1, lya_1_fa_1_diyez, lya_1_sol_1, lya_1_lya_1, lya_1_si_2, lya_1_do_2, lya_1_re_2, lya_1_mi_2)
            }

            10 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_11)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_11)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_11)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_11)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_11)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_11)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_11)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_11)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_11)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_11)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_11)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_11)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_11)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_11)
                si_3_gamma = view.findViewById(R.id.imv_si_3_gamma_11)
                cl_gamma = view.findViewById(R.id.cl_11_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_3_gamma)
                helpers_list = HelpersUtil.si_minor_list()
                helpers_nots = listOf(lya_3_si_1, lya_3_do_1_diyez, lya_3_re_1, lya_3_mi_1, lya_3_fa_1_diyez, lya_3_sol_1, mi_2_lya_1, mi_2_si_1, mi_2_do_1_diyez, mi_2_re_1, lya_1_mi_1, lya_1_fa_1_diyez, lya_1_sol_1, lya_1_lya_1, lya_1_si_2)
            }

            11 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_12)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_12)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_12)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_12)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_12)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_12)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_12)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_12)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_12)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_12)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_12)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_12)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_12)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_12)
                fa_3_gamma = view.findViewById(R.id.imv_fa_3_gamma_12)
                cl_gamma = view.findViewById(R.id.cl_12_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma,  fa_3_gamma)
                helpers_list = HelpersUtil.fa_diyez_minor_list()
                helpers_nots = listOf(mi_2_fa_1_diyez, mi_2_sol_1_diyez, mi_2_lya_1, mi_2_si_1, mi_2_do_1_diyez, mi_2_re_1, lya_1_mi_1, lya_1_fa_1_diyez, lya_1_sol_1_diyez, lya_1_lya_1, lya_1_si_1, lya_1_do_2_diyez, lya_1_re_2, lya_1_mi_2, lya_1_fa_2_diyez)
            }

            12 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_13)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_13)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_13)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_13)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_13)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_13)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_13)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_13)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_13)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_13)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_13)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_13)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_13)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_13)
                do_3_gamma = view.findViewById(R.id.imv_do_3_gamma_13)
                cl_gamma = view.findViewById(R.id.cl_13_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_3_gamma)
                helpers_list = HelpersUtil.do_diyez_minor_list()
                helpers_nots = listOf(lya_3_do_1_diyez, lya_3_re_1_diyez, lya_3_mi_1, lya_3_fa_1_diyez, lya_3_sol_1_diyez, lya_3_lya_1, mi_2_si_1, mi_2_do_1_diyez, mi_2_re_1_diyez, mi_2_mi_1, lya_1_fa_1_diyez, lya_1_sol_1_diyez, lya_1_lya_1, lya_1_si_2, lya_1_do_2_diyez)
            }

            13 -> {
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_14)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_14)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_14)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_14)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_14)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_14)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_14)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_14)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_14)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_14)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_14)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_14)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_14)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_14)
                sol_3_gamma = view.findViewById(R.id.imv_sol_3_gamma_14)
                cl_gamma = view.findViewById(R.id.cl_14_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(sol_1_gamma, lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_3_gamma)
                helpers_list = HelpersUtil.sol_diyez_minor_list()
                helpers_nots = listOf(mi_2_sol_1_diyez, mi_2_lya_1_diyez, mi_2_si_1, mi_2_do_1_diyez, mi_2_re_1_diyez, mi_2_mi_1, lya_1_fa_1_diyez, lya_1_sol_1_diyez, lya_1_lya_1_diyez, lya_1_si_2, lya_1_do_2_diyez, lya_1_re_2_diyez, lya_1_mi_2, lya_1_fa_2_diyez, lya_1_sol_2_diyez)
            }

            14 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_15)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_15)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_15)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_15)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_15)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_15)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_15)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_15)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_15)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_15)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_15)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_15)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_15)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_15)
                re_3_gamma = view.findViewById(R.id.imv_re_3_gamma_15)
                cl_gamma = view.findViewById(R.id.cl_15_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_1_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_3_gamma)
                helpers_list = HelpersUtil.re_diyez_minor_list()
                helpers_nots = listOf(lya_3_re_1_diyez, lya_3_fa_1, lya_3_fa_1_diyez, lya_3_sol_1_diyez, lya_3_lya_1_diyez, lya_3_si_2, mi_2_do_1_diyez, mi_2_re_1_diyez, mi_2_fa_2, mi_2_fa_2_diyez, lya_1_sol_1_diyez, lya_1_lya_1_diyez, lya_1_si_2, lya_1_do_2_diyez, lya_1_re_2_diyez)
            }

            15 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_16)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_16)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_16)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_16)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_16)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_16)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_16)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_16)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_16)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_16)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_16)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_16)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_16)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_16)
                lya_3_gamma = view.findViewById(R.id.imv_lya_3_gamma_16)
                cl_gamma = view.findViewById(R.id.cl_16_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_3_gamma)
                helpers_list = HelpersUtil.lya_diyez_minor_list()
                helpers_nots = listOf(lya_3_lya_1_diyez, lya_3_do_2, lya_3_do_2_diyez, lya_3_re_2_diyez, lya_3_fa_2, lya_3_fa_2_diyez, mi_2_sol_1_diyez, mi_2_lya_1_diyez, mi_2_do_1, mi_2_do_1_diyez, lya_1_re_1_diyez, lya_1_fa_1, lya_1_fa_1_diyez, lya_1_sol_1_diyez, lya_1_lya_1_diyez)
            }

            16 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_17)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_17)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_17)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_17)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_17)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_17)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_17)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_17)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_17)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_17)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_17)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_17)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_17)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_17)
                fa_3_gamma = view.findViewById(R.id.imv_fa_3_gamma_17)
                cl_gamma = view.findViewById(R.id.cl_17_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma,  fa_3_gamma)
                helpers_list = HelpersUtil.fa_major_list()
                helpers_nots = listOf(mi_2_fa_1, mi_2_sol_1, mi_2_lya_1, mi_2_lya_1_diyez, lya_1_do_1, lya_1_re_1, lya_1_mi_1, lya_1_fa_1, lya_1_sol_1, lya_1_lya_1, lya_1_lya_1_diyez, lya_1_do_2, lya_1_re_2, lya_1_mi_2, lya_1_fa_2)
            }

            17 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_18)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_18)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_18)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_18)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_18)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_18)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_18)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_18)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_18)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_18)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_18)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_18)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_18)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_18)
                si_3_gamma = view.findViewById(R.id.imv_si_3_gamma_18)
                cl_gamma = view.findViewById(R.id.cl_18_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_3_gamma)
                helpers_list = HelpersUtil.si_bemol_major_list()
                helpers_nots = listOf(lya_3_si_1_bimol, lya_3_do_1, lya_3_re_1, lya_3_re_1_diyez, mi_2_fa_1, mi_2_sol_1, mi_2_lya_1, mi_2_lya_1_diyez, lya_1_do_1, lya_1_re_1, lya_1_re_1_diyez, lya_1_fa_1, lya_1_sol_1, lya_1_lya_1, lya_1_lya_1_diyez)
            }

            18 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_19)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_19)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_19)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_19)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_19)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_19)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_19)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_19)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_19)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_19)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_19)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_19)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_19)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_19)
                mi_3_gamma = view.findViewById(R.id.imv_mi_3_gamma_19)
                cl_gamma = view.findViewById(R.id.cl_19_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_3_gamma)
                helpers_list = HelpersUtil.mi_bemol_major_list()
                helpers_nots = listOf(lya_3_re_1_diyez, lya_3_fa_1, lya_3_sol_1, lya_3_sol_1_diyez, mi_2_lya_1_diyez, mi_2_do_1, mi_2_re_1, mi_2_re_1_diyez, lya_1_fa_1,lya_1_sol_1, lya_1_sol_1_diyez, lya_1_lya_1_diyez, lya_1_do_2, lya_1_re_2, lya_1_re_2_diyez)
            }

            19 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_20)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_20)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_20)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_20)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_20)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_20)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_20)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_20)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_20)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_20)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_20)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_20)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_20)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_20)
                lya_3_gamma = view.findViewById(R.id.imv_lya_3_gamma_20)
                cl_gamma = view.findViewById(R.id.cl_20_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_3_gamma)
                helpers_list = HelpersUtil.lya_bemol_major_list()
                helpers_nots = listOf(mi_2_sol_1_diyez, mi_2_lya_1_diyez, mi_2_do_1, mi_2_do_1_diyez, lya_1_re_1_diyez, lya_1_fa_1, lya_1_sol_1, lya_1_sol_1_diyez, lya_1_lya_1_diyez, lya_1_do_2, lya_1_do_2_diyez, lya_1_re_2_diyez, lya_1_fa_2, lya_1_sol_2, lya_1_sol_2_diyez)
            }

            20 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_21)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_21)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_21)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_21)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_21)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_21)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_21)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_21)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_21)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_21)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_21)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_21)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_21)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_21)
                re_3_gamma = view.findViewById(R.id.imv_re_3_gamma_21)
                cl_gamma = view.findViewById(R.id.cl_21_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_1_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_3_gamma)
                helpers_list = HelpersUtil.re_bemol_major_list()
                helpers_nots = listOf(lya_3_do_1_diyez, lya_3_re_1_diyez, lya_3_fa_1, lya_3_fa_1_diyez, mi_2_sol_1_diyez, mi_2_lya_1_diyez, mi_2_do_1, mi_2_do_1_diyez, lya_1_re_1_diyez, lya_1_fa_1, lya_1_fa_1_diyez, lya_1_sol_1_diyez, lya_1_lya_1_diyez, lya_1_do_2, lya_1_re_2_diyez)
            }

            21 -> {
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_22)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_22)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_22)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_22)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_22)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_22)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_22)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_22)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_22)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_22)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_22)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_22)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_22)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_22)
                sol_3_gamma = view.findViewById(R.id.imv_sol_3_gamma_22)
                cl_gamma = view.findViewById(R.id.cl_22_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(sol_1_gamma, lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_3_gamma)
                helpers_list = HelpersUtil.sol_bemol_major_list()
                helpers_nots = listOf(mi_2_fa_1_diyez, mi_2_sol_1_diyez, mi_2_lya_1_diyez, mi_2_si_1, lya_1_do_1_diyez, lya_1_re_1_diyez, lya_1_fa_1, lya_1_fa_1_diyez, lya_1_sol_1_diyez, lya_1_lya_1_diyez, lya_1_si_2, lya_1_do_2_diyez, lya_1_re_2_diyez, lya_1_fa_2, lya_1_fa_2_diyez)
            }

            22 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_23)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_23)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_23)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_23)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_23)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_23)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_23)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_23)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_23)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_23)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_23)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_23)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_23)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_23)
                do_3_gamma = view.findViewById(R.id.imv_do_3_gamma_23)
                cl_gamma = view.findViewById(R.id.cl_23_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_3_gamma)
                helpers_list = HelpersUtil.do_bemol_major_list()
                helpers_nots = listOf(lya_3_si_1, lya_3_do_1_diyez, lya_3_re_1_diyez, lya_3_fa_1, mi_2_fa_1_diyez, mi_2_sol_1_diyez, mi_2_lya_1_diyez, mi_2_do_1, lya_1_do_1_diyez, lya_1_re_1_diyez, lya_1_mi_1, lya_1_fa_1_diyez, lya_1_sol_1_diyez, lya_1_lya_1_diyez, lya_1_si_2)
            }

            23 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_24)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_24)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_24)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_24)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_24)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_24)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_24)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_24)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_24)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_24)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_24)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_24)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_24)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_24)
                re_3_gamma = view.findViewById(R.id.imv_re_3_gamma_24)
                cl_gamma = view.findViewById(R.id.cl_24_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_1_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_3_gamma)
                helpers_list = HelpersUtil.re_minor_list()
                helpers_nots = listOf(lya_3_re_1, lya_3_mi_1, lya_3_fa_1, lya_3_sol_1, lya_3_lya_1, lya_3_lya_1_diyez, mi_2_do_1, mi_2_re_1, mi_2_mi_1, mi_2_fa_2, lya_1_sol_1, lya_1_lya_1, lya_1_lya_1_diyez, lya_1_do_2, lya_1_re_2)
            }

            24 -> {
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_25)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_25)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_25)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_25)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_25)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_25)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_25)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_25)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_25)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_25)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_25)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_25)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_25)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_25)
                sol_3_gamma = view.findViewById(R.id.imv_sol_3_gamma_25)
                cl_gamma = view.findViewById(R.id.cl_25_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(sol_1_gamma, lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_3_gamma)
                helpers_list = HelpersUtil.sol_minor_list()
                helpers_nots = listOf(mi_2_sol_1, mi_2_lya_1, mi_2_lya_1_diyez, mi_2_do_1, mi_2_re_1, mi_2_re_1_diyez, lya_1_re_1_diyez, lya_1_fa_1, lya_1_sol_1, lya_1_lya_1_diyez, lya_1_do_2, lya_1_re_2, lya_1_re_2_diyez, lya_1_fa_2, lya_1_sol_2)
            }

            25 -> {
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_26)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_26)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_26)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_26)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_26)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_26)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_26)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_26)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_26)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_26)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_26)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_26)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_26)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_26)
                do_3_gamma = view.findViewById(R.id.imv_do_3_gamma_26)
                cl_gamma = view.findViewById(R.id.cl_26_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_3_gamma)
                helpers_list = HelpersUtil.do_minor_list()
                helpers_nots = listOf(lya_3_do_1, lya_3_re_1, lya_3_re_1_diyez, lya_3_fa_1, lya_3_sol_1, lya_3_sol_1_diyez, mi_2_lya_1_diyez, mi_2_do_1, mi_2_re_1, mi_2_re_1_diyez, lya_1_fa_1, lya_1_sol_1, lya_1_sol_1_diyez, lya_1_lya_1_diyez, lya_1_do_2)
            }

            26 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_27)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_27)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_27)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_27)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_27)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_27)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_27)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_27)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_27)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_27)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_27)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_27)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_27)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_27)
                fa_3_gamma = view.findViewById(R.id.imv_fa_3_gamma_27)
                cl_gamma = view.findViewById(R.id.cl_27_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma,  fa_3_gamma)
                helpers_list = HelpersUtil.fa_minor_list()
                helpers_nots = listOf(mi_2_fa_1, mi_2_sol_1, mi_2_sol_1_diyez, mi_2_lya_1_diyez, mi_2_do_1, mi_2_do_1_diyez, lya_1_re_1_diyez, lya_1_fa_1, lya_1_sol_1, lya_1_sol_1_diyez, lya_1_lya_1_diyez, lya_1_do_2, lya_1_do_2_diyez, lya_1_re_2_diyez, lya_1_fa_2)
            }

            27 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_28)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_28)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_28)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_28)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_28)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_28)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_28)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_28)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_28)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_28)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_28)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_28)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_28)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_28)
                si_3_gamma = view.findViewById(R.id.imv_si_3_gamma_28)
                cl_gamma = view.findViewById(R.id.cl_28_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_3_gamma)
                helpers_list = HelpersUtil.si_bemol_minor_list()
                helpers_nots = listOf(lya_3_si_1_bimol, lya_3_do_1, lya_3_do_1_diyez, lya_3_re_1_diyez, lya_3_fa_1, lya_3_fa_1_diyez, mi_2_sol_1_diyez, mi_2_lya_1_diyez, mi_2_do_1, mi_2_do_1_diyez, lya_1_re_1_diyez, lya_1_fa_1, lya_1_fa_1_diyez, lya_1_sol_1_diyez, lya_1_lya_1_diyez)
            }

            28 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_29)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_29)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_29)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_29)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_29)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_29)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_29)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_29)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_29)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_29)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_29)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_29)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_29)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_29)
                mi_3_gamma = view.findViewById(R.id.imv_mi_3_gamma_29)
                cl_gamma = view.findViewById(R.id.cl_29_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_3_gamma)
                helpers_list = HelpersUtil.mi_bemol_minor_list()
                helpers_nots = listOf(lya_3_re_1_diyez, lya_3_fa_1, lya_3_fa_1_diyez, lya_3_sol_1_diyez, lya_3_lya_1_diyez, lya_3_si_2, mi_2_do_1_diyez, mi_2_re_1_diyez, mi_2_fa_2, mi_2_fa_2_diyez, lya_1_sol_1_diyez, lya_1_lya_1_diyez, lya_1_si_2, lya_1_do_2_diyez, lya_1_re_2_diyez)
            }

            29 ->{
                do_1_gamma = view.findViewById(R.id.imv_do_gamma_30)
                re_1_gamma = view.findViewById(R.id.imv_re_gamma_30)
                mi_1_gamma = view.findViewById(R.id.imv_mi_gamma_30)
                fa_1_gamma = view.findViewById(R.id.imv_fa_gamma_30)
                sol_1_gamma = view.findViewById(R.id.imv_sol_gamma_30)
                lya_1_gamma = view.findViewById(R.id.imv_lya_gamma_30)
                si_1_gamma = view.findViewById(R.id.imv_si_gamma_30)
                do_2_gamma = view.findViewById(R.id.imv_do_2_gamma_30)
                re_2_gamma = view.findViewById(R.id.imv_re_2_gamma_30)
                mi_2_gamma = view.findViewById(R.id.imv_mi_2_gamma_30)
                fa_2_gamma = view.findViewById(R.id.imv_fa_2_gamma_30)
                sol_2_gamma = view.findViewById(R.id.imv_sol_2_gamma_30)
                lya_2_gamma = view.findViewById(R.id.imv_lya_2_gamma_30)
                si_2_gamma = view.findViewById(R.id.imv_si_2_gamma_30)
                lya_3_gamma = view.findViewById(R.id.imv_lya_3_gamma_30)
                cl_gamma = view.findViewById(R.id.cl_30_gamma)
                cl_gamma.visibility = View.VISIBLE
                helpers_image = listOf(lya_1_gamma, si_1_gamma, do_1_gamma, re_1_gamma, mi_1_gamma, fa_1_gamma, sol_1_gamma, lya_2_gamma, si_2_gamma, do_2_gamma, re_2_gamma, mi_2_gamma, fa_2_gamma, sol_2_gamma, lya_3_gamma)
                helpers_list = HelpersUtil.lya_bemol_minor_list()
                helpers_nots = listOf(mi_2_sol_1_diyez, mi_2_lya_1_diyez, mi_2_si_1, mi_2_do_1_diyez, mi_2_re_1_diyez, mi_2_mi_1, lya_1_fa_1_diyez, lya_1_sol_1_diyez, lya_1_lya_1_diyez, lya_1_si_2, lya_1_do_2_diyez, lya_1_re_2_diyez, lya_1_mi_2, lya_1_fa_2_diyez, lya_1_sol_2_diyez)
            }
        }




        play_button.setOnClickListener {
            val scope = CoroutineScope(Main)
            scope.launch {
                try {
                    playFirstTor(helpers_list, helpers_image, helpers_nots)
                } catch (e: Exception) {
                }
            }
        }


    }


    private suspend fun playFirstTor(helpers_list: List<Int>, helpers_image: List<ImageView>, helpers_nots: List<ImageView>) {


        helpers_image[helpers_image.size - 1].setColorFilter(
            ContextCompat.getColor(
                requireContext(),
                android.R.color.white
            )
        )
        helpers_nots[helpers_nots.size - 1].visibility = View.INVISIBLE

        if (!isButtonClikc)
        {
            isButtonClikc = true
            play_button.text = "Pause"
            play_button.setIconResource(R.drawable.ic_pause)
        }
        else{
            isButtonClikc = false
            play_button.text = "PLay"
            play_button.setIconResource(R.drawable.icon_play)
        }

        for (i in count until helpers_list.size) {
            try {
                mediaPlayer = MediaPlayer.create(view?.context, helpers_list[i])
                if (isButtonClikc)
                {
                    mediaPlayer.start()
                    count++
                }
                else{
                    mediaPlayer.stop()
                    break
                }

                mediaPlayer.setOnCompletionListener {
                    it.release()
                }



                if (i == 0) {
                    helpers_image[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )
                    helpers_image[i + 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )


                    if (position == 3 || position == 8 || position == 9) {
                        helpers_nots[i].visibility = View.INVISIBLE
                        helpers_nots[i + 1].visibility = View.INVISIBLE
                        view_line_rubob_3.setBackgroundColor(ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        ))
                    } else {

                        view_line_rubob_3.setBackgroundColor(ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        ))

                        helpers_nots[i].visibility = View.VISIBLE
                        helpers_nots[i].startAnimation(AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in_not))
                        helpers_nots[i + 1].visibility = View.INVISIBLE
                    }
                } else if (i < helpers_list.size - 1) {
                    helpers_image[i - 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )
                    helpers_image[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )
                    helpers_image[i + 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )

                    if ((position == 3 && helpers_nots[i] == mi_2_mi_1)) {
                        view_line_rubob_2.setBackgroundColor(ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        ))
                        helpers_nots[i].visibility = View.INVISIBLE
                        helpers_nots[i + 1].visibility = View.INVISIBLE
                        helpers_nots[i - 1].visibility = View.INVISIBLE
                    } else {

                        view_line_rubob_3.setBackgroundColor(ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        ))

                        view_line_rubob_2.setBackgroundColor(ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        ))
                        helpers_nots[i - 1].visibility = View.INVISIBLE
                        helpers_nots[i].visibility = View.VISIBLE
                        helpers_nots[i].startAnimation(AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in_not))
                        helpers_nots[i + 1].visibility = View.INVISIBLE
                    }

                } else if (i == helpers_list.size - 1) {
                    helpers_image[i - 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )
                    helpers_image[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )

                    helpers_nots[i - 1].visibility = View.INVISIBLE
                    helpers_nots[i].visibility = View.VISIBLE
                    helpers_nots[i].startAnimation(AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in_not))

                    count = 0
                    isButtonClikc = false
                    play_button.text = "Play"
                    play_button.setIconResource(R.drawable.icon_play)
                }


                delay(1000)
            } catch (e: Exception) {
                mediaPlayer.stop()
            }


        }
        play_button.isEnabled = true
    }

    override fun onStop() {
        super.onStop()
        isButtonClikc = false
        play_button.text = "Play"
        play_button.setIconResource(R.drawable.icon_play)
    }

    override fun onPause() {
        super.onPause()
        isButtonClikc = false
        play_button.text = "Play"
        play_button.setIconResource(R.drawable.icon_play)
    }
}