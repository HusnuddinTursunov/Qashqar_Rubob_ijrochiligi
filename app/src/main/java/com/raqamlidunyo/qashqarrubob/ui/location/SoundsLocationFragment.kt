package com.raqamlidunyo.qashqarrubob.ui.location

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.raqamlidunyo.qashqarrubob.R
import com.raqamlidunyo.qashqarrubob.ui.location.util.LocationUtil
import com.google.android.material.button.MaterialButton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SoundsLocationFragment : Fragment() {

    private lateinit var cl_1_tor: ConstraintLayout
    private lateinit var cl_2_tor: ConstraintLayout
    private lateinit var cl_3_tor: ConstraintLayout

    private lateinit var mtb_1_tor: MaterialButton
    private lateinit var mtb_2_tor: MaterialButton
    private lateinit var mtb_3_tor: MaterialButton

    private lateinit var mediaPlayer: MediaPlayer

    private lateinit var lya_1_1_tor: ImageView
    private lateinit var si_1_1_tor: ImageView
    private lateinit var do_1_1_tor: ImageView
    private lateinit var re_1_1_tor: ImageView
    private lateinit var mi_1_1_tor: ImageView
    private lateinit var fa_1_1_tor: ImageView
    private lateinit var sol_1_1_tor: ImageView
    private lateinit var lya_2_1_tor: ImageView
    private lateinit var si_2_1_tor: ImageView
    private lateinit var do_2_1_tor: ImageView
    private lateinit var re_2_1_tor: ImageView
    private lateinit var mi_2_1_tor: ImageView
    private lateinit var fa_2_1_tor: ImageView
    private lateinit var sol_2_1_tor: ImageView
    private lateinit var lya_3_1_tor: ImageView

    private lateinit var lya_1_2_tor: ImageView
    private lateinit var si_1_2_tor: ImageView
    private lateinit var do_1_2_tor: ImageView
    private lateinit var re_1_2_tor: ImageView
    private lateinit var mi_1_2_tor: ImageView
    private lateinit var fa_1_2_tor: ImageView
    private lateinit var sol_1_2_tor: ImageView
    private lateinit var lya_2_2_tor: ImageView
    private lateinit var si_2_2_tor: ImageView
    private lateinit var do_2_2_tor: ImageView
    private lateinit var re_2_2_tor: ImageView
    private lateinit var mi_2_2_tor: ImageView
    private lateinit var fa_2_2_tor: ImageView
    private lateinit var sol_2_2_tor: ImageView
    private lateinit var mi_3_2_tor: ImageView

    private lateinit var lya_1_3_tor: ImageView
    private lateinit var si_1_3_tor: ImageView
    private lateinit var do_1_3_tor: ImageView
    private lateinit var re_1_3_tor: ImageView
    private lateinit var mi_1_3_tor: ImageView
    private lateinit var fa_1_3_tor: ImageView
    private lateinit var sol_1_3_tor: ImageView
    private lateinit var lya_2_3_tor: ImageView
    private lateinit var si_2_3_tor: ImageView
    private lateinit var do_2_3_tor: ImageView
    private lateinit var re_2_3_tor: ImageView
    private lateinit var mi_2_3_tor: ImageView
    private lateinit var fa_2_3_tor: ImageView
    private lateinit var sol_2_3_tor: ImageView
    private lateinit var lya_3_3_tor: ImageView


    private lateinit var lya_3_si_1_bimol: ImageView
    private lateinit var lya_3_si_1: ImageView
    private lateinit var lya_3_do_1: ImageView
    private lateinit var lya_3_do_1_diyez: ImageView
    private lateinit var lya_3_re_1: ImageView
    private lateinit var lya_3_re_1_diyez: ImageView
    private lateinit var lya_3_mi_1: ImageView
    private lateinit var lya_3_fa_1: ImageView
    private lateinit var lya_3_fa_1_diyez: ImageView
    private lateinit var lya_3_sol_1: ImageView
    private lateinit var lya_3_sol_1_diyez: ImageView
    private lateinit var lya_3_lya_1: ImageView
    private lateinit var lya_3_lya_1_diyez: ImageView
    private lateinit var lya_3_si_2: ImageView
    private lateinit var lya_3_do_2: ImageView
    private lateinit var lya_3_do_2_diyez: ImageView
    private lateinit var lya_3_re_2: ImageView
    private lateinit var lya_3_re_2_diyez: ImageView
    private lateinit var lya_3_mi_2: ImageView
    private lateinit var lya_3_fa_2: ImageView
    private lateinit var lya_3_fa_2_diyez: ImageView
    private lateinit var lya_3_sol_2: ImageView
    private lateinit var lya_3_sol_2_diyez: ImageView
    private lateinit var lya_3_lya_2: ImageView
    private lateinit var lya_3_lya_2_diyez: ImageView


    private lateinit var mi_2_fa_1: ImageView
    private lateinit var mi_2_fa_1_diyez: ImageView
    private lateinit var mi_2_sol_1: ImageView
    private lateinit var mi_2_sol_1_diyez: ImageView
    private lateinit var mi_2_lya_1: ImageView
    private lateinit var mi_2_lya_1_diyez: ImageView
    private lateinit var mi_2_si_1: ImageView
    private lateinit var mi_2_do_1: ImageView
    private lateinit var mi_2_do_1_diyez: ImageView
    private lateinit var mi_2_re_1: ImageView
    private lateinit var mi_2_re_1_diyez: ImageView
    private lateinit var mi_2_mi_1: ImageView
    private lateinit var mi_2_fa_2: ImageView
    private lateinit var mi_2_fa_2_diyez: ImageView
    private lateinit var mi_2_sol_2: ImageView
    private lateinit var mi_2_sol_2_diyez: ImageView
    private lateinit var mi_2_lya_2: ImageView
    private lateinit var mi_2_lya_2_diyez: ImageView
    private lateinit var mi_2_si_2: ImageView
    private lateinit var mi_2_do_2: ImageView
    private lateinit var mi_2_do_2_diyez: ImageView
    private lateinit var mi_2_re_2: ImageView
    private lateinit var mi_2_re_2_diyez: ImageView
    private lateinit var mi_2_mi_2: ImageView
    private lateinit var mi_2_mi_2_diyez: ImageView


    private lateinit var lya_1_si_1_bimol: ImageView
    private lateinit var lya_1_si_1: ImageView
    private lateinit var lya_1_do_1: ImageView
    private lateinit var lya_1_do_1_diyez: ImageView
    private lateinit var lya_1_re_1: ImageView
    private lateinit var lya_1_re_1_diyez: ImageView
    private lateinit var lya_1_mi_1: ImageView
    private lateinit var lya_1_fa_1: ImageView
    private lateinit var lya_1_fa_1_diyez: ImageView
    private lateinit var lya_1_sol_1: ImageView
    private lateinit var lya_1_sol_1_diyez: ImageView
    private lateinit var lya_1_lya_1: ImageView
    private lateinit var lya_1_lya_1_diyez: ImageView
    private lateinit var lya_1_si_2: ImageView
    private lateinit var lya_1_do_2: ImageView
    private lateinit var lya_1_do_2_diyez: ImageView
    private lateinit var lya_1_re_2: ImageView
    private lateinit var lya_1_re_2_diyez: ImageView
    private lateinit var lya_1_mi_2: ImageView
    private lateinit var lya_1_fa_2: ImageView
    private lateinit var lya_1_fa_2_diyez: ImageView
    private lateinit var lya_1_sol_2: ImageView
    private lateinit var lya_1_sol_2_diyez: ImageView
    private lateinit var lya_1_lya_2: ImageView
    private lateinit var lya_1_lya_2_diyez: ImageView

    private lateinit var view_line_rubob_1: View
    private lateinit var view_line_rubob_2: View
    private lateinit var view_line_rubob_3: View

    private lateinit var helpers_nots: List<ImageView>

    private lateinit var scope: CoroutineScope

    private var count_tor_1 = 0
    private var count_tor_2 = 0
    private var count_tor_3 = 0
    private var count = 0

    private var isFirstTorClick = false
    private var isFirstTorClickReturn = true
    private var isFirstTorClickReturnSecond = false
    private var isSecondTorClick = false
    private var isSecondTorClickReturn = false
    private var isThirdTorClick = false
    private var isThirdTorClickReturn = false

    private var isFirstButtonClick = false
    private var isSecondButtonClick = false
    private var isThirdButtonClick = false

    private var isPlaying: Boolean = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sounds_location, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        scope = CoroutineScope(Main)

        cl_1_tor = view.findViewById(R.id.cl_1_tor)
        cl_2_tor = view.findViewById(R.id.cl_2_tor)
        cl_3_tor = view.findViewById(R.id.cl_3_tor)

        mtb_1_tor = view.findViewById(R.id.mb_1_tor)
        mtb_2_tor = view.findViewById(R.id.mb_2_tor)
        mtb_3_tor = view.findViewById(R.id.mb_3_tor)

        lya_1_1_tor = view.findViewById(R.id.lya_1_1_tor)
        si_1_1_tor = view.findViewById(R.id.si_1_1_tor)
        do_1_1_tor = view.findViewById(R.id.do_1_1_tor)
        re_1_1_tor = view.findViewById(R.id.re_1_1_tor)
        mi_1_1_tor = view.findViewById(R.id.mi_1_1_tor)
        fa_1_1_tor = view.findViewById(R.id.fa_1_1_tor)
        sol_1_1_tor = view.findViewById(R.id.sol_1_1_tor)
        lya_2_1_tor = view.findViewById(R.id.lya_2_1_tor)
        si_2_1_tor = view.findViewById(R.id.si_2_1_tor)
        do_2_1_tor = view.findViewById(R.id.do_2_1_tor)
        re_2_1_tor = view.findViewById(R.id.re_2_1_tor)
        mi_2_1_tor = view.findViewById(R.id.mi_2_1_tor)
        fa_2_1_tor = view.findViewById(R.id.fa_2_1_tor)
        sol_2_1_tor = view.findViewById(R.id.sol_2_1_tor)
        lya_3_1_tor = view.findViewById(R.id.lya_3_1_tor)

        mi_1_2_tor = view.findViewById(R.id.mi_1_2_tor)
        fa_1_2_tor = view.findViewById(R.id.fa_1_2_tor)
        sol_1_2_tor = view.findViewById(R.id.sol_1_2_tor)
        lya_1_2_tor = view.findViewById(R.id.lya_1_2_tor)
        si_1_2_tor = view.findViewById(R.id.si_1_2_tor)
        do_1_2_tor = view.findViewById(R.id.do_1_2_tor)
        re_1_2_tor = view.findViewById(R.id.re_1_2_tor)
        mi_2_2_tor = view.findViewById(R.id.mi_2_2_tor)
        fa_2_2_tor = view.findViewById(R.id.fa_2_2_tor)
        sol_2_2_tor = view.findViewById(R.id.sol_2_2_tor)
        lya_2_2_tor = view.findViewById(R.id.lya_2_2_tor)
        si_2_2_tor = view.findViewById(R.id.si_2_2_tor)
        do_2_2_tor = view.findViewById(R.id.do_2_2_tor)
        re_2_2_tor = view.findViewById(R.id.re_2_2_tor)
        mi_3_2_tor = view.findViewById(R.id.mi_3_2_tor)

        mi_1_3_tor = view.findViewById(R.id.mi_1_3_tor)
        fa_1_3_tor = view.findViewById(R.id.fa_1_3_tor)
        sol_1_3_tor = view.findViewById(R.id.sol_1_3_tor)
        lya_1_3_tor = view.findViewById(R.id.lya_1_3_tor)
        si_1_3_tor = view.findViewById(R.id.si_1_3_tor)
        do_1_3_tor = view.findViewById(R.id.do_1_3_tor)
        re_1_3_tor = view.findViewById(R.id.re_1_3_tor)
        mi_2_3_tor = view.findViewById(R.id.mi_2_3_tor)
        fa_2_3_tor = view.findViewById(R.id.fa_2_3_tor)
        sol_2_3_tor = view.findViewById(R.id.sol_2_3_tor)
        lya_2_3_tor = view.findViewById(R.id.lya_2_3_tor)
        si_2_3_tor = view.findViewById(R.id.si_2_3_tor)
        do_2_3_tor = view.findViewById(R.id.do_2_3_tor)
        re_2_3_tor = view.findViewById(R.id.re_2_3_tor)
        lya_3_3_tor = view.findViewById(R.id.lya_3_3_tor)


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


        cl_1_tor.visibility = View.VISIBLE


        val notList_first_tor = listOf(
            lya_1_1_tor,
            si_1_1_tor,
            do_1_1_tor,
            re_1_1_tor,
            mi_1_1_tor,
            fa_1_1_tor,
            sol_1_1_tor,
            lya_2_1_tor,
            si_2_1_tor,
            do_2_1_tor,
            re_2_1_tor,
            mi_2_1_tor,
            fa_2_1_tor,
            sol_2_1_tor,
            lya_3_1_tor
        )

        val notList_secon_tor = listOf(
            mi_1_2_tor,
            fa_1_2_tor,
            sol_1_2_tor,
            lya_1_2_tor,
            si_1_2_tor,
            do_1_2_tor,
            re_1_2_tor,
            mi_2_2_tor,
            fa_2_2_tor,
            sol_2_2_tor,
            lya_2_2_tor,
            si_2_2_tor,
            do_2_2_tor,
            re_2_2_tor,
            mi_3_2_tor
        )

        val notList_third_tor = listOf(
            lya_1_3_tor,
            si_1_3_tor,
            do_1_3_tor,
            re_1_3_tor,
            mi_1_3_tor,
            fa_1_3_tor,
            sol_1_3_tor,
            lya_2_3_tor,
            si_2_3_tor,
            do_2_3_tor,
            re_2_3_tor,
            mi_2_3_tor,
            fa_2_3_tor,
            sol_2_3_tor,
            lya_3_3_tor
        )



        mtb_1_tor.setOnClickListener {
            cl_1_tor.visibility = View.VISIBLE
            cl_2_tor.visibility = View.GONE
            cl_3_tor.visibility = View.GONE

            CoroutineScope(Main).launch {
                helpers_nots = listOf(
                    lya_1_lya_1,
                    lya_1_si_1,
                    lya_1_do_1,
                    lya_1_re_1,
                    lya_1_mi_1,
                    lya_1_fa_1,
                    lya_1_sol_1,
                    lya_1_lya_1,
                    lya_1_si_2,
                    lya_1_do_2,
                    lya_1_re_2,
                    lya_1_mi_2,
                    lya_1_fa_2,
                    lya_1_sol_2,
                    lya_1_lya_2
                )

                isFirstButtonClick = true
                playFirstTor(LocationUtil.first_tor(), notList_first_tor, helpers_nots)
            }

        }

        mtb_2_tor.setOnClickListener {
            cl_1_tor.visibility = View.GONE
            cl_2_tor.visibility = View.VISIBLE
            cl_3_tor.visibility = View.GONE

            CoroutineScope(Main).launch {
                helpers_nots = listOf(
                    mi_2_mi_1,
                    mi_2_fa_1,
                    mi_2_sol_1,
                    mi_2_lya_1,
                    mi_2_si_1,
                    mi_2_do_1,
                    mi_2_re_1,
                    mi_2_mi_1,
                    mi_2_fa_2,
                    mi_2_sol_2,
                    mi_2_lya_2,
                    mi_2_si_2,
                    mi_2_do_2,
                    mi_2_re_2,
                    mi_2_mi_2
                )

                isSecondButtonClick = true
                playFirstTor(LocationUtil.second_tor(), notList_secon_tor, helpers_nots)

            }

        }

        mtb_3_tor.setOnClickListener {
            cl_1_tor.visibility = View.GONE
            cl_2_tor.visibility = View.GONE
            cl_3_tor.visibility = View.VISIBLE

            CoroutineScope(Main).launch {
                helpers_nots = listOf(
                    lya_3_lya_1,
                    lya_3_si_1,
                    lya_3_do_1,
                    lya_3_re_1,
                    lya_3_mi_1,
                    lya_3_fa_1,
                    lya_3_sol_1,
                    lya_3_lya_1,
                    lya_3_si_2,
                    lya_3_do_2,
                    lya_3_re_2,
                    lya_3_mi_2,
                    lya_3_fa_2,
                    lya_3_sol_2,
                    lya_3_lya_2
                )

                isThirdButtonClick = true
                playFirstTor(LocationUtil.third_tor(), notList_third_tor, helpers_nots)
            }

        }

    }

    private suspend fun playFirstTor(
        tors: List<Int>,
        notList_tor: List<ImageView>,
        helpers_nots: List<ImageView>
    ) {
        lya_1_lya_2.visibility = View.INVISIBLE
        mi_2_mi_2.visibility = View.INVISIBLE
        lya_3_lya_2.visibility = View.INVISIBLE

        if (count_tor_1 == tors.size) {
            count_tor_1 = 0
        }
        if (count_tor_2 == tors.size) {
            count_tor_2 = 0
        }
        if (count_tor_3 == tors.size) {
            count_tor_3 = 0
        }

        //Проверка на то чтобы остановить первый тор(1-Tor) начало
        if (
        //Пауза перво тора при проигрывании
            (isFirstButtonClick && isFirstTorClick && !isSecondButtonClick && !isSecondTorClick && !isThirdTorClick && !isThirdButtonClick) ||

            //Пауза второго тора при проигрывании
            (!isFirstButtonClick && !isFirstTorClick && isSecondButtonClick && isSecondTorClick && !isThirdTorClick && !isThirdButtonClick) ||

            //Пауза третьего тора при проигрывании
            (!isFirstButtonClick && !isFirstTorClick && !isSecondButtonClick && !isSecondTorClick && isThirdTorClick && isThirdButtonClick)

        ) {
            isFirstTorClick = false
            isFirstButtonClick = false
            isSecondTorClick = false
            isSecondButtonClick = false
            isThirdTorClick = false
            isThirdButtonClick = false

            isPlaying = false

            mtb_1_tor.setIconResource(R.drawable.icon_play)


            mtb_2_tor.setIconResource(R.drawable.icon_play)


            mtb_3_tor.setIconResource(R.drawable.icon_play)

        }
        //Проверка на то чтобы остановить первый тор(1-Tor) конец

            else if (
        //Пауза перво тора при 1 -> 2!
            (isFirstButtonClick && isFirstTorClick && isSecondButtonClick && !isSecondTorClick && !isThirdTorClick && !isThirdButtonClick) ||

            //Пауза перво тора при 1 -> 3!
            (isFirstButtonClick && isFirstTorClick && !isSecondButtonClick && !isSecondTorClick && !isThirdTorClick && isThirdButtonClick) ||

            //Пауза перво тора при 1! -> 2!, 2! -> 1!
            (isFirstButtonClick && !isFirstTorClick && isSecondButtonClick && !isSecondTorClick && !isThirdTorClick && !isThirdButtonClick) ||

            //Пауза перво тора при 1! -> 3!, 3! -> 1!
            (isFirstButtonClick && !isFirstTorClick && !isSecondButtonClick && !isSecondTorClick && !isThirdTorClick && isThirdButtonClick) ||

            //Пауза перво тора при 2 -> 1!
            (isFirstButtonClick && !isFirstTorClick && isSecondButtonClick && isSecondTorClick && !isThirdTorClick && !isThirdButtonClick) ||

            //Пауза перво тора при 2 -> 3!
            (!isFirstButtonClick && !isFirstTorClick && isSecondButtonClick && isSecondTorClick && !isThirdTorClick && isThirdButtonClick) ||

            //Пауза перво тора при 2! -> 3!, 3! -> 2!
            (!isFirstButtonClick && !isFirstTorClick && isSecondButtonClick && !isSecondTorClick && !isThirdTorClick && isThirdButtonClick) ||

            //Пауза перво тора при 3 -> 1!
            (isFirstButtonClick && !isFirstTorClick && !isSecondButtonClick && !isSecondTorClick && isThirdTorClick && isThirdButtonClick) ||

            //Пауза перво тора при 3 -> 2!
            (!isFirstButtonClick && !isFirstTorClick && isSecondButtonClick && !isSecondTorClick && isThirdTorClick && isThirdButtonClick)

        )
        {
            isFirstTorClick = false
            isFirstButtonClick = false
            isSecondTorClick = false
            isSecondButtonClick = false
            isThirdTorClick = false
            isThirdButtonClick = false

            isPlaying = true

            mtb_1_tor.setIconResource(R.drawable.icon_play)

            mtb_2_tor.setIconResource(R.drawable.icon_play)


            mtb_3_tor.setIconResource(R.drawable.icon_play)
        }
        //Проверка на то чтобы запустить первый тор(1-Tor) начало
        else if (isFirstButtonClick && !isFirstTorClick && !isSecondButtonClick && !isSecondTorClick && !isThirdTorClick && !isThirdButtonClick) {
            if (isPlaying) {
                count = count_tor_1
                isFirstTorClick = true
                mtb_1_tor.setIconResource(R.drawable.ic_pause)
            }
            else{
                isPlaying = true
            }


        }
        //Проверка на то чтобы запустить первый тор(1-Tor) конец

        //Проверка на то чтобы запустить второй тор(2-Tor) начало
        else if (!isFirstButtonClick && !isFirstTorClick && isSecondButtonClick && !isSecondTorClick && !isThirdTorClick && !isThirdButtonClick) {
            if (isPlaying) {
                count = count_tor_2
                isSecondTorClick = true
                mtb_2_tor.setIconResource(R.drawable.ic_pause)
            }
            else{
                isPlaying = true
            }
        }
        //Проверка на то чтобы запустить второй тор(2-Tor) конец

        //Проверка на то чтобы запустить третий тор(3-Tor) начало
        else if (!isFirstButtonClick && !isFirstTorClick && !isSecondButtonClick && !isSecondTorClick && !isThirdTorClick && isThirdButtonClick) {
            if (isPlaying) {
                count = count_tor_3
                isThirdTorClick = true
                mtb_3_tor.setIconResource(R.drawable.ic_pause)
            }
            else{
                isPlaying = true
            }
        }
        //Проверка на то чтобы запустить третий тор(3-Tor) конец


        notList_tor[notList_tor.size - 1].setColorFilter(
            ContextCompat.getColor(
                requireContext(),
                android.R.color.white
            )
        )

        helpers_nots[helpers_nots.size - 1].visibility = View.INVISIBLE
        Log.d(
            "playsong",
            "isFirstTorClick: ${isFirstTorClick}\nisFistButtonClick: ${isFirstButtonClick}\nisSecondTorClick: ${isSecondTorClick}\nisSecondButtonClick: ${isSecondButtonClick}\nisThirdTorClick: ${isThirdTorClick}\nisThirdButtonClick: ${isThirdButtonClick}"
        )

        for (i in count until tors.size) {
            try {
                mediaPlayer = MediaPlayer.create(view?.context, tors[i])

                //Проверка на то чтобы запустить первый тор(1-Tor) начало
                if (
                    (isFirstButtonClick && isFirstTorClick && !isSecondButtonClick && !isSecondTorClick && !isThirdTorClick && !isThirdButtonClick) ||
                    (!isFirstButtonClick && !isFirstTorClick && isSecondButtonClick && isSecondTorClick && !isThirdTorClick && !isThirdButtonClick) ||
                    (!isFirstButtonClick && !isFirstTorClick && !isSecondButtonClick && !isSecondTorClick && isThirdTorClick && isThirdButtonClick)
                ) {
                    mediaPlayer.start()

                    if (isFirstTorClick) {
                        count_tor_1++
                    } else if (isSecondTorClick) {
                        count_tor_2++
                    } else if (isThirdTorClick) {
                        count_tor_3++
                    }
                }
                //Проверка на то чтобы запустить первый тор(1-Tor) конец

                //Проверка на то чтобы остановить первый тор(1-Tor) начало
                else if ((!isFirstButtonClick && !isFirstTorClick && !isSecondButtonClick && !isSecondTorClick && !isThirdTorClick && !isThirdButtonClick) || !isFirstTorClickReturn || !isSecondTorClickReturn || !isThirdTorClickReturn) {
                    mediaPlayer.stop()
                    break
                }
                //Проверка на то чтобы остановить первый тор(1-Tor) конец

                mediaPlayer.setOnCompletionListener {
                    it.release()
                }
                if (i == 0) {
                    notList_tor[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )
                    notList_tor[i + 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )

                    when (helpers_nots[0]) {
                        lya_1_lya_1 -> {
                            helpers_nots[i].visibility = View.INVISIBLE
                            helpers_nots[i + 1].visibility = View.INVISIBLE
                            view_line_rubob_1.setBackgroundColor(
                                ContextCompat.getColor(
                                    requireContext(),
                                    android.R.color.holo_red_light
                                )
                            )
                        }
                        mi_2_mi_1 -> {
                            helpers_nots[i].visibility = View.INVISIBLE
                            helpers_nots[i + 1].visibility = View.INVISIBLE
                            view_line_rubob_2.setBackgroundColor(
                                ContextCompat.getColor(
                                    requireContext(),
                                    android.R.color.holo_red_light
                                )
                            )
                        }
                        lya_3_lya_1 -> {
                            helpers_nots[i].visibility = View.INVISIBLE
                            helpers_nots[i + 1].visibility = View.INVISIBLE
                            view_line_rubob_3.setBackgroundColor(
                                ContextCompat.getColor(
                                    requireContext(),
                                    android.R.color.holo_red_light
                                )
                            )
                        }


                    }

                } else if (i < tors.size - 1) {
                    notList_tor[i - 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )
                    notList_tor[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )
                    notList_tor[i + 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )
                    view_line_rubob_1.setBackgroundColor(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )

                    view_line_rubob_2.setBackgroundColor(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )

                    view_line_rubob_3.setBackgroundColor(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )


                    helpers_nots[i - 1].visibility = View.INVISIBLE
                    helpers_nots[i].visibility = View.VISIBLE
                    helpers_nots[i].startAnimation(
                        AnimationUtils.loadAnimation(
                            requireContext(),
                            R.anim.fade_in_not
                        )
                    )
                    helpers_nots[i + 1].visibility = View.INVISIBLE

                } else if (i == tors.size - 1) {
                    notList_tor[i - 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )
                    notList_tor[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )
                    helpers_nots[i - 1].visibility = View.INVISIBLE
                    helpers_nots[i].visibility = View.VISIBLE
                    helpers_nots[i].startAnimation(
                        AnimationUtils.loadAnimation(
                            requireContext(),
                            R.anim.fade_in_not
                        )
                    )
                }

                delay(1000)
            } catch (e: Exception) {
                mediaPlayer.stop()
            }
        }
        if (count_tor_1 == tors.size)
        {
            count_tor_1 = 0
            mtb_1_tor.setIconResource(R.drawable.icon_play)
            isFirstTorClick = false
            isFirstButtonClick = false
            isSecondTorClick = false
            isSecondButtonClick = false
            isThirdTorClick = false
            isThirdButtonClick = false
        }
        if (count_tor_2 == tors.size)
        {
            count_tor_2 = 0
            mtb_2_tor.setIconResource(R.drawable.icon_play)
            isFirstTorClick = false
            isFirstButtonClick = false
            isSecondTorClick = false
            isSecondButtonClick = false
            isThirdTorClick = false
            isThirdButtonClick = false
        }
        if (count_tor_3 == tors.size)
        {
            count_tor_3 = 0
            mtb_3_tor.setIconResource(R.drawable.icon_play)
            isFirstTorClick = false
            isFirstButtonClick = false
            isSecondTorClick = false
            isSecondButtonClick = false
            isThirdTorClick = false
            isThirdButtonClick = false
        }


    }


    override fun onStart() {
        super.onStart()

    }

    override fun onStop() {
        super.onStop()
        isFirstTorClick = false
        isFirstButtonClick = false
        isSecondTorClick = false
        isSecondButtonClick = false
        isThirdTorClick = false
        isThirdButtonClick = false

        mtb_1_tor.setIconResource(R.drawable.icon_play)
        mtb_2_tor.setIconResource(R.drawable.icon_play)
        mtb_3_tor.setIconResource(R.drawable.icon_play)

    }

    override fun onPause() {
        super.onPause()
        isFirstTorClick = false
        isFirstButtonClick = false
        isSecondTorClick = false
        isSecondButtonClick = false
        isThirdTorClick = false
        isThirdButtonClick = false
        mtb_1_tor.setIconResource(R.drawable.icon_play)
        mtb_2_tor.setIconResource(R.drawable.icon_play)
        mtb_3_tor.setIconResource(R.drawable.icon_play)
    }

    override fun onDestroyView() {
        super.onDestroyView()

        isFirstTorClick = false
        isFirstButtonClick = false
        isSecondTorClick = false
        isSecondButtonClick = false
        isThirdTorClick = false
        isThirdButtonClick = false
    }

}