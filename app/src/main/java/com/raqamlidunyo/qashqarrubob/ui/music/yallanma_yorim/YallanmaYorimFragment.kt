package com.raqamlidunyo.qashqarrubob.ui.music.yallanma_yorim

import android.animation.ValueAnimator
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
import androidx.core.widget.NestedScrollView
import com.raqamlidunyo.qashqarrubob.R
import com.raqamlidunyo.qashqarrubob.ui.music.yallanma_yorim.model.YallanmaYorim
import com.raqamlidunyo.qashqarrubob.ui.music.yallanma_yorim.util.YallanmaYorimUtil
import com.google.android.material.button.MaterialButton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class YallanmaYorimFragment : Fragment() {

    private lateinit var play_button: MaterialButton
    private lateinit var play_button_original: MaterialButton
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var mediaPlayer_orginal: MediaPlayer

    private lateinit var cl_yallanma_yorim_1: ConstraintLayout
    private lateinit var cl_yallanma_yorim_2: ConstraintLayout
    private lateinit var cl_yallanma_yorim_3: ConstraintLayout
    private lateinit var cl_yallanma_yorim_4: ConstraintLayout
    private lateinit var nested_yallanma_yorim_1: NestedScrollView
    private lateinit var nested_yallanma_yorim_2: NestedScrollView
    private lateinit var nested_yallanma_yorim_3: NestedScrollView
    private lateinit var nested_yallanma_yorim_4: NestedScrollView

    private lateinit var view_line_rubob_1:View


    private lateinit var yallanma_yorim_1_si_1: ImageView
    private lateinit var yallanma_yorim_1_si_2: ImageView
    private lateinit var yallanma_yorim_1_do_1: ImageView
    private lateinit var yallanma_yorim_1_re_1: ImageView
    private lateinit var yallanma_yorim_1_re_2: ImageView
    private lateinit var yallanma_yorim_1_do_2: ImageView
    private lateinit var yallanma_yorim_1_do_3: ImageView
    private lateinit var yallanma_yorim_1_si_3: ImageView
    private lateinit var yallanma_yorim_1_do_4: ImageView
    private lateinit var yallanma_yorim_1_do_5: ImageView
    private lateinit var yallanma_yorim_1_si_4: ImageView
    private lateinit var yallanma_yorim_1_lya_1: ImageView
    private lateinit var yallanma_yorim_1_lya_2: ImageView
    private lateinit var yallanma_yorim_1_si_5: ImageView
    private lateinit var yallanma_yorim_1_si_6: ImageView
    private lateinit var yallanma_yorim_1_si_7: ImageView


    private lateinit var yallanma_yorim_2_si_1: ImageView
    private lateinit var yallanma_yorim_2_si_2: ImageView
    private lateinit var yallanma_yorim_2_do_1: ImageView
    private lateinit var yallanma_yorim_2_re_1: ImageView
    private lateinit var yallanma_yorim_2_re_2: ImageView
    private lateinit var yallanma_yorim_2_re_3: ImageView
    private lateinit var yallanma_yorim_2_re_4: ImageView
    private lateinit var yallanma_yorim_2_re_5: ImageView
    private lateinit var yallanma_yorim_2_mi_1: ImageView
    private lateinit var yallanma_yorim_2_mi_2: ImageView
    private lateinit var yallanma_yorim_2_mi_3: ImageView
    private lateinit var yallanma_yorim_2_mi_4: ImageView
    private lateinit var yallanma_yorim_2_mi_5: ImageView
    private lateinit var yallanma_yorim_2_re_6: ImageView
    private lateinit var yallanma_yorim_2_re_7: ImageView
    private lateinit var yallanma_yorim_2_do_2: ImageView
    private lateinit var yallanma_yorim_2_si_3: ImageView


    private lateinit var yallanma_yorim_3_mi_1: ImageView
    private lateinit var yallanma_yorim_3_mi_2: ImageView
    private lateinit var yallanma_yorim_3_mi_3: ImageView
    private lateinit var yallanma_yorim_3_mi_4: ImageView
    private lateinit var yallanma_yorim_3_mi_5: ImageView
    private lateinit var yallanma_yorim_3_re_1: ImageView
    private lateinit var yallanma_yorim_3_mi_6: ImageView
    private lateinit var yallanma_yorim_3_re_2: ImageView
    private lateinit var yallanma_yorim_3_do_1: ImageView
    private lateinit var yallanma_yorim_3_si_1: ImageView
    private lateinit var yallanma_yorim_3_si_2: ImageView
    private lateinit var yallanma_yorim_3_si_3: ImageView
    private lateinit var yallanma_yorim_3_do_2: ImageView
    private lateinit var yallanma_yorim_3_re_3: ImageView
    private lateinit var yallanma_yorim_3_re_4: ImageView
    private lateinit var yallanma_yorim_3_do_3: ImageView
    private lateinit var yallanma_yorim_3_do_4: ImageView
    private lateinit var yallanma_yorim_3_si_4: ImageView
    private lateinit var yallanma_yorim_3_do_5: ImageView
    private lateinit var yallanma_yorim_3_do_6: ImageView
    private lateinit var yallanma_yorim_3_si_5: ImageView
    private lateinit var yallanma_yorim_3_lya_1: ImageView
    private lateinit var yallanma_yorim_3_lya_2: ImageView
    private lateinit var yallanma_yorim_3_si_6: ImageView
    private lateinit var yallanma_yorim_3_si_7: ImageView
    private lateinit var yallanma_yorim_3_si_8: ImageView

    private lateinit var yallanma_yorim_4_si_1: ImageView
    private lateinit var yallanma_yorim_4_si_2: ImageView
    private lateinit var yallanma_yorim_4_do_1: ImageView
    private lateinit var yallanma_yorim_4_re_1: ImageView
    private lateinit var yallanma_yorim_4_re_2: ImageView
    private lateinit var yallanma_yorim_4_do_2: ImageView
    private lateinit var yallanma_yorim_4_do_3: ImageView
    private lateinit var yallanma_yorim_4_re_3: ImageView
    private lateinit var yallanma_yorim_4_si_3: ImageView
    private lateinit var yallanma_yorim_4_do_4: ImageView
    private lateinit var yallanma_yorim_4_do_5: ImageView
    private lateinit var yallanma_yorim_4_si_4: ImageView
    private lateinit var yallanma_yorim_4_lya_1: ImageView
    private lateinit var yallanma_yorim_4_si_5: ImageView
    private lateinit var yallanma_yorim_4_lya_2: ImageView
    private lateinit var yallanma_yorim_4_si_6: ImageView
    private lateinit var yallanma_yorim_4_si_7: ImageView
    private lateinit var yallanma_yorim_4_si_8: ImageView


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

    private lateinit var list_of_image_notes: List<ImageView>
    private lateinit var list_of_rubob_notes: List<ImageView>
    private lateinit var songs_list: List<YallanmaYorim>

    private var isClickButton: Boolean = false
    private var count = 0
    private var main_count = 0

    private var isStartFirstTrack: Boolean = true
    private var isStartFirstTrackReturn: Boolean = true
    private var isStartFirstTrackSecondReturn: Boolean = true
    private var isStartSecondTrack: Boolean = true
    private var isStartSecondTrackReturn: Boolean = true
    private var isStartThirdTrack: Boolean = true

    private var isPlaying: Boolean = false
    private var isClickButtonOriginal: Boolean = false
    private var isFinishOriginal:Boolean = false


    private var isStartFourthTrack: Boolean = true


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_yallanma_yorim, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        cl_yallanma_yorim_1 = view.findViewById(R.id.cl_yallanma_yorim_1)
        cl_yallanma_yorim_2 = view.findViewById(R.id.cl_yallanma_yorim_2)
        cl_yallanma_yorim_3 = view.findViewById(R.id.cl_yallanma_yorim_3)
        cl_yallanma_yorim_4 = view.findViewById(R.id.cl_yallanma_yorim_4)
        nested_yallanma_yorim_1 = view.findViewById(R.id.nested_yallanma_yorim_1)
        nested_yallanma_yorim_2 = view.findViewById(R.id.nested_yallanma_yorim_2)
        nested_yallanma_yorim_3 = view.findViewById(R.id.nested_yallanma_yorim_3)
        nested_yallanma_yorim_4 = view.findViewById(R.id.nested_yallanma_yorim_4)

        view_line_rubob_1 = view.findViewById(R.id.view_line_rubob_1)

        yallanma_yorim_1_si_1 = view.findViewById(R.id.yallanma_yorim_1_si_1)
        yallanma_yorim_1_si_2 = view.findViewById(R.id.yallanma_yorim_1_si_2)
        yallanma_yorim_1_do_1 = view.findViewById(R.id.yallanma_yorim_1_do_1)
        yallanma_yorim_1_re_1 = view.findViewById(R.id.yallanma_yorim_1_re_1)
        yallanma_yorim_1_re_2 = view.findViewById(R.id.yallanma_yorim_1_re_2)
        yallanma_yorim_1_do_2 = view.findViewById(R.id.yallanma_yorim_1_do_2)
        yallanma_yorim_1_do_3 = view.findViewById(R.id.yallanma_yorim_1_do_3)
        yallanma_yorim_1_si_3 = view.findViewById(R.id.yallanma_yorim_1_si_3)
        yallanma_yorim_1_do_4 = view.findViewById(R.id.yallanma_yorim_1_do_4)
        yallanma_yorim_1_do_5 = view.findViewById(R.id.yallanma_yorim_1_do_5)
        yallanma_yorim_1_si_4 = view.findViewById(R.id.yallanma_yorim_1_si_4)
        yallanma_yorim_1_lya_1 = view.findViewById(R.id.yallanma_yorim_1_lya_1)
        yallanma_yorim_1_lya_2 = view.findViewById(R.id.yallanma_yorim_1_lya_2)
        yallanma_yorim_1_si_5 = view.findViewById(R.id.yallanma_yorim_1_si_5)
        yallanma_yorim_1_si_6 = view.findViewById(R.id.yallanma_yorim_1_si_6)
        yallanma_yorim_1_si_7 = view.findViewById(R.id.yallanma_yorim_1_si_7)


        yallanma_yorim_2_si_1 = view.findViewById(R.id.yallanma_yorim_2_si_1)
        yallanma_yorim_2_si_2 = view.findViewById(R.id.yallanma_yorim_2_si_2)
        yallanma_yorim_2_do_1 = view.findViewById(R.id.yallanma_yorim_2_do_1)
        yallanma_yorim_2_re_1 = view.findViewById(R.id.yallanma_yorim_2_re_1)
        yallanma_yorim_2_re_2 = view.findViewById(R.id.yallanma_yorim_2_re_2)
        yallanma_yorim_2_re_3 = view.findViewById(R.id.yallanma_yorim_2_re_3)
        yallanma_yorim_2_re_4 = view.findViewById(R.id.yallanma_yorim_2_re_4)
        yallanma_yorim_2_re_5 = view.findViewById(R.id.yallanma_yorim_2_re_5)
        yallanma_yorim_2_mi_1 = view.findViewById(R.id.yallanma_yorim_2_mi_1)
        yallanma_yorim_2_mi_2 = view.findViewById(R.id.yallanma_yorim_2_mi_2)
        yallanma_yorim_2_mi_3 = view.findViewById(R.id.yallanma_yorim_2_mi_3)
        yallanma_yorim_2_mi_4 = view.findViewById(R.id.yallanma_yorim_2_mi_4)
        yallanma_yorim_2_mi_5 = view.findViewById(R.id.yallanma_yorim_2_mi_5)
        yallanma_yorim_2_re_6 = view.findViewById(R.id.yallanma_yorim_2_re_6)
        yallanma_yorim_2_re_7 = view.findViewById(R.id.yallanma_yorim_2_re_7)
        yallanma_yorim_2_do_2 = view.findViewById(R.id.yallanma_yorim_2_do_2)
        yallanma_yorim_2_si_3 = view.findViewById(R.id.yallanma_yorim_2_si_3)


        yallanma_yorim_3_mi_1 = view.findViewById(R.id.yallanma_yorim_3_mi_1)
        yallanma_yorim_3_mi_2 = view.findViewById(R.id.yallanma_yorim_3_mi_2)
        yallanma_yorim_3_mi_3 = view.findViewById(R.id.yallanma_yorim_3_mi_3)
        yallanma_yorim_3_mi_4 = view.findViewById(R.id.yallanma_yorim_3_mi_4)
        yallanma_yorim_3_mi_5 = view.findViewById(R.id.yallanma_yorim_3_mi_5)
        yallanma_yorim_3_re_1 = view.findViewById(R.id.yallanma_yorim_3_re_1)
        yallanma_yorim_3_mi_6 = view.findViewById(R.id.yallanma_yorim_3_mi_6)
        yallanma_yorim_3_re_2 = view.findViewById(R.id.yallanma_yorim_3_re_2)
        yallanma_yorim_3_do_1 = view.findViewById(R.id.yallanma_yorim_3_do_1)
        yallanma_yorim_3_si_1 = view.findViewById(R.id.yallanma_yorim_3_si_1)
        yallanma_yorim_3_si_2 = view.findViewById(R.id.yallanma_yorim_3_si_2)
        yallanma_yorim_3_si_3 = view.findViewById(R.id.yallanma_yorim_3_si_3)
        yallanma_yorim_3_do_2 = view.findViewById(R.id.yallanma_yorim_3_do_2)
        yallanma_yorim_3_re_3 = view.findViewById(R.id.yallanma_yorim_3_re_3)
        yallanma_yorim_3_re_4 = view.findViewById(R.id.yallanma_yorim_3_re_4)
        yallanma_yorim_3_do_3 = view.findViewById(R.id.yallanma_yorim_3_do_3)
        yallanma_yorim_3_do_4 = view.findViewById(R.id.yallanma_yorim_3_do_4)
        yallanma_yorim_3_si_4 = view.findViewById(R.id.yallanma_yorim_3_si_4)
        yallanma_yorim_3_do_5 = view.findViewById(R.id.yallanma_yorim_3_do_5)
        yallanma_yorim_3_do_6 = view.findViewById(R.id.yallanma_yorim_3_do_6)
        yallanma_yorim_3_si_5 = view.findViewById(R.id.yallanma_yorim_3_si_5)
        yallanma_yorim_3_lya_1 = view.findViewById(R.id.yallanma_yorim_3_lya_1)
        yallanma_yorim_3_lya_2 = view.findViewById(R.id.yallanma_yorim_3_lya_2)
        yallanma_yorim_3_si_6 = view.findViewById(R.id.yallanma_yorim_3_si_6)
        yallanma_yorim_3_si_7 = view.findViewById(R.id.yallanma_yorim_3_si_7)
        yallanma_yorim_3_si_8 = view.findViewById(R.id.yallanma_yorim_3_si_8)

        yallanma_yorim_4_si_1 = view.findViewById(R.id.yallanma_yorim_4_si_1)
        yallanma_yorim_4_si_2 = view.findViewById(R.id.yallanma_yorim_4_si_2)
        yallanma_yorim_4_do_1 = view.findViewById(R.id.yallanma_yorim_4_do_1)
        yallanma_yorim_4_re_1 = view.findViewById(R.id.yallanma_yorim_4_re_1)
        yallanma_yorim_4_re_2 = view.findViewById(R.id.yallanma_yorim_4_re_2)
        yallanma_yorim_4_do_2 = view.findViewById(R.id.yallanma_yorim_4_do_2)
        yallanma_yorim_4_do_3 = view.findViewById(R.id.yallanma_yorim_4_do_3)
        yallanma_yorim_4_re_3 = view.findViewById(R.id.yallanma_yorim_4_re_3)
        yallanma_yorim_4_si_3 = view.findViewById(R.id.yallanma_yorim_4_si_3)
        yallanma_yorim_4_do_4 = view.findViewById(R.id.yallanma_yorim_4_do_4)
        yallanma_yorim_4_do_5 = view.findViewById(R.id.yallanma_yorim_4_do_5)
        yallanma_yorim_4_si_4 = view.findViewById(R.id.yallanma_yorim_4_si_4)
        yallanma_yorim_4_lya_1 = view.findViewById(R.id.yallanma_yorim_4_lya_1)
        yallanma_yorim_4_si_5 = view.findViewById(R.id.yallanma_yorim_4_si_5)
        yallanma_yorim_4_lya_2 = view.findViewById(R.id.yallanma_yorim_4_lya_2)
        yallanma_yorim_4_si_6 = view.findViewById(R.id.yallanma_yorim_4_si_6)
        yallanma_yorim_4_si_7 = view.findViewById(R.id.yallanma_yorim_4_si_7)
        yallanma_yorim_4_si_8 = view.findViewById(R.id.yallanma_yorim_4_si_8)


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


        list_of_image_notes = listOf(
            yallanma_yorim_1_si_1,
            yallanma_yorim_1_si_2,
            yallanma_yorim_1_do_1,
            yallanma_yorim_1_re_1,
            yallanma_yorim_1_re_2,
            yallanma_yorim_1_do_2,
            yallanma_yorim_1_do_3,
            yallanma_yorim_1_si_3,
            yallanma_yorim_1_do_4,
            yallanma_yorim_1_do_5,
            yallanma_yorim_1_si_4,
            yallanma_yorim_1_lya_1,
            yallanma_yorim_1_lya_2,
            yallanma_yorim_1_si_5,
            yallanma_yorim_1_si_6,
            yallanma_yorim_1_si_7,

            yallanma_yorim_2_si_1,
            yallanma_yorim_2_si_2,
            yallanma_yorim_2_do_1,
            yallanma_yorim_2_re_1,
            yallanma_yorim_2_re_2,
            yallanma_yorim_2_re_3,
            yallanma_yorim_2_re_4,
            yallanma_yorim_2_re_5,
            yallanma_yorim_2_mi_1,
            yallanma_yorim_2_mi_2,
            yallanma_yorim_2_mi_3,
            yallanma_yorim_2_mi_4,
            yallanma_yorim_2_mi_5,
            yallanma_yorim_2_re_6,
            yallanma_yorim_2_re_7,
            yallanma_yorim_2_do_2,
            yallanma_yorim_2_si_3,

            yallanma_yorim_3_mi_1,
            yallanma_yorim_3_mi_2,
            yallanma_yorim_3_mi_3,
            yallanma_yorim_3_mi_4,
            yallanma_yorim_3_mi_5,
            yallanma_yorim_3_re_1,
            yallanma_yorim_3_mi_6,
            yallanma_yorim_3_re_2,
            yallanma_yorim_3_do_1,
            yallanma_yorim_3_si_1,
            yallanma_yorim_3_si_2,
            yallanma_yorim_3_si_3,
            yallanma_yorim_3_do_2,
            yallanma_yorim_3_re_3,
            yallanma_yorim_3_re_4,
            yallanma_yorim_3_do_3,
            yallanma_yorim_3_do_4,
            yallanma_yorim_3_si_4,
            yallanma_yorim_3_do_5,
            yallanma_yorim_3_do_6,
            yallanma_yorim_3_si_5,
            yallanma_yorim_3_lya_1,
            yallanma_yorim_3_lya_2,
            yallanma_yorim_3_si_6,
            yallanma_yorim_3_si_7,
            yallanma_yorim_3_si_8,


            yallanma_yorim_4_si_1,
            yallanma_yorim_4_si_2,
            yallanma_yorim_4_do_1,
            yallanma_yorim_4_re_1,
            yallanma_yorim_4_re_2,
            yallanma_yorim_4_do_2,
            yallanma_yorim_4_do_3,
            yallanma_yorim_4_re_3,
            yallanma_yorim_4_si_3,
            yallanma_yorim_4_do_4,
            yallanma_yorim_4_do_5,
            yallanma_yorim_4_si_4,
            yallanma_yorim_4_lya_1,
            yallanma_yorim_4_si_5,
            yallanma_yorim_4_lya_2,
            yallanma_yorim_4_si_6,
            yallanma_yorim_4_si_7,
            yallanma_yorim_4_si_8
        )

        list_of_rubob_notes = listOf(
            lya_1_si_1,
            lya_1_si_1,
            lya_1_do_1,
            lya_1_re_1,
            lya_1_re_1,
            lya_1_do_1,
            lya_1_do_1,
            lya_1_si_1,
            lya_1_do_1,
            lya_1_do_1,
            lya_1_si_1,
            lya_1_lya_1,
            lya_1_lya_1,
            lya_1_si_1,
            lya_1_si_1,
            lya_1_si_1,


            lya_1_si_1,
            lya_1_si_1,
            lya_1_do_1,
            lya_1_re_1,
            lya_1_re_1,
            lya_1_re_1,
            lya_1_re_1,
            lya_1_re_1,
            lya_1_mi_1,
            lya_1_mi_1,
            lya_1_mi_1,
            lya_1_mi_1,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_re_1,
            lya_1_do_1,
            lya_1_si_1,


            lya_1_mi_1,
            lya_1_mi_1,
            lya_1_mi_1,
            lya_1_mi_1,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_do_1,
            lya_1_si_1,
            lya_1_si_1,
            lya_1_si_1,
            lya_1_do_1,
            lya_1_re_1,
            lya_1_re_1,
            lya_1_do_1,
            lya_1_do_1,
            lya_1_si_1,
            lya_1_do_1,
            lya_1_do_1,
            lya_1_si_1,
            lya_1_lya_1,
            lya_1_lya_1,
            lya_1_si_1,
            lya_1_si_1,
            lya_1_si_1,

            lya_1_si_1,
            lya_1_si_1,
            lya_1_do_1,
            lya_1_re_1,
            lya_1_re_1,
            lya_1_do_1,
            lya_1_do_1,
            lya_1_re_1,
            lya_1_si_1,
            lya_1_do_1,
            lya_1_do_1,
            lya_1_si_1,
            lya_1_lya_1,
            lya_1_si_1,
            lya_1_lya_1,
            lya_1_si_1,
            lya_1_si_1,
            lya_1_si_1,

        )

        songs_list = YallanmaYorimUtil.yallanma_yorim_List()

        play_button = view.findViewById(R.id.mtb_play_button)
        play_button_original = view.findViewById(R.id.mtb_play_original_button)


        play_button.setOnClickListener {

            val scope = CoroutineScope(Dispatchers.Main)
            scope.launch {
                try {
                    playFirstTor(songs_list, list_of_image_notes, list_of_rubob_notes)
                } catch (e: Exception) {
                }
            }
        }

        mediaPlayer_orginal = MediaPlayer.create(requireContext(),R.raw.yallama_yorim)
        mediaPlayer_orginal.setOnCompletionListener {
            play_button_original.setIconResource(R.drawable.icon_play)
            play_button_original.text = "Original"
            isClickButtonOriginal = false

        }


        play_button_original.setOnClickListener {


            if (!isClickButtonOriginal)
            {
                isClickButtonOriginal = true
                play_button_original.setIconResource(R.drawable.ic_pause)
                play_button_original.text = "Original"
                mediaPlayer_orginal.start()


                isClickButton = false
                play_button.setIconResource(R.drawable.icon_play)
                play_button.text = "Play"
                isFinishOriginal = true
            }
            else{
                isClickButtonOriginal = false
                mediaPlayer_orginal.pause()
                play_button_original.setIconResource(R.drawable.icon_play)
                play_button_original.text = "Original"
            }


        }

    }

    private suspend fun playFirstTor(
        songsList: List<YallanmaYorim>,
        listOfNotsImages: List<ImageView>,
        listOfNotesOnRubob: List<ImageView>
    ) {

        if (!isClickButton) {
            isClickButton = true
            play_button.setIconResource(R.drawable.ic_pause)
            play_button.text = "Pause"
            play_button.isEnabled = false
            delay(500)
            play_button.isEnabled = true

            if (isClickButtonOriginal) {
                mediaPlayer_orginal.pause()
//                mediaPlayer_orginal.setOnCompletionListener {
//                    play_button_original.setIconResource(R.drawable.icon_play)
//                    play_button_original.text = "Original"
//                    isClickButtonOriginal = false
//                }
                isClickButtonOriginal = false
                play_button_original.setIconResource(R.drawable.icon_play)
                play_button_original.text = "Original"
            }



        } else {
            isClickButton = false
            play_button.setIconResource(R.drawable.icon_play)
            play_button.text = "Play"
            play_button.isEnabled = false
            delay(500)
            play_button.isEnabled = true


            isClickButtonOriginal = false
            play_button_original.setIconResource(R.drawable.icon_play)
            play_button_original.text = "Original"


        }

        for (j in main_count..4)
        {
            Log.d("playsong", "playFirstTor: ${main_count}")
            if (!isClickButton)
            {
                break
            }
            if ((count == 0 || (count > 0 && count < 16)) && j < 1) {
                Log.d("playsong", "count: ${count}")
                playTackt1(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 16) {

                    main_count = 1
                    count = 0
                }
            }

            else if ((count == 0 || (count > 0 && count < 16)) && j < 2) {
                Log.d("playsong", "count: ${count}")
                playTackt1(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 16) {
                    main_count = 2
                }
            }

            else if ((count == 16 || (count > 16 && count < 33)) && j < 3) {
                Log.d("playsong", "count: ${count}")
                playTackt2(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 33) {
                    main_count = 3
                }
            }

            else if ((count == 33 || (count > 33 && count < songsList.size - 18)) && j < 4) {
                Log.d("playsong", "count: ${count}")
                playTackt3(songsList, listOfNotsImages, listOfNotesOnRubob)

                if (count == songsList.size - 18) {
                    main_count = 4
                }
            }

            else if ((count == songsList.size - 18 || (count > songsList.size - 18 && count < songsList.size)) && j ==4) {
                Log.d("playsong", "count: ${count}")
                playTackt4(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == songsList.size) {
                    main_count = 0
                    count = 0
                    isClickButton = false
                    isStartFirstTrack = true
                    isStartSecondTrack = true
                    isStartThirdTrack = true
                    isStartFourthTrack = true
                    play_button.text = "Play"
                    play_button.setIconResource(R.drawable.icon_play)
                }
            }



        }


        play_button.isEnabled = true
    }


    private suspend fun playTackt1(
        songsList: List<YallanmaYorim>,
        listOfNotsImages: List<ImageView>,
        listOfNotesOnRubob: List<ImageView>
    ) {
        Log.d("playsong", "count: ${count}")

        listOfNotsImages[listOfNotsImages.size - 62].setColorFilter(
            ContextCompat.getColor(
                requireContext(),
                android.R.color.white
            )
        )

        Log.d("playsong", "count1: ${count}")


        listOfNotesOnRubob[listOfNotesOnRubob.size - 62].visibility = View.INVISIBLE
        Log.d("playsong", "count: ${count}")

        if (isStartFirstTrack) {
            cl_yallanma_yorim_1.visibility = View.VISIBLE
            cl_yallanma_yorim_2.visibility = View.INVISIBLE
            cl_yallanma_yorim_3.visibility = View.INVISIBLE
            cl_yallanma_yorim_4.visibility = View.INVISIBLE
            Log.d("playsong", "count2: ${count}")

            if (isPlaying) {
                cl_yallanma_yorim_1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
                cl_yallanma_yorim_2.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
                cl_yallanma_yorim_3.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
                cl_yallanma_yorim_4.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            }

            isStartFirstTrack = false
        }

        isPlaying = true
        Log.d("playsong", "count: ${count}")

        for (i in count until 16) {
            try {

                Log.d("playsong", "not: ${listOfNotesOnRubob[i]}")


                mediaPlayer = MediaPlayer.create(view?.context, songsList[i].song)
                if (!isClickButton) {
                    mediaPlayer.stop()
                    break
                } else {
                    mediaPlayer.start()
                    count++
                }

                if (i == 0)
                {
                    nested_yallanma_yorim_1.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_yallanma_yorim_1.smoothScrollTo(0, nested_yallanma_yorim_1.top)

                    }
                }

                if (i == 10) {
                    Log.d("playsong", "playTackt2: smooth1")
                    nested_yallanma_yorim_1.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_yallanma_yorim_1.smoothScrollTo(0, nested_yallanma_yorim_1.bottom)

                    }
                }


                mediaPlayer.setOnCompletionListener {
                    it.release()
                }
                if (i == 0) {

                    animateBg(listOfNotsImages[i], songsList[i].time)

                    listOfNotsImages[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )
                    listOfNotsImages[i + 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )

                    if (listOfNotesOnRubob[i].id == R.id.lya_1_lya_1)
                    {
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.holo_red_light))
                        view_line_rubob_1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
                    }
                    else{
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.white))
                        listOfNotesOnRubob[i].visibility = View.VISIBLE
                        listOfNotesOnRubob[i].startAnimation(
                            AnimationUtils.loadAnimation(
                                requireContext(),
                                R.anim.fade_in_not
                            )
                        )
                    }
                    listOfNotesOnRubob[i + 1].visibility = View.INVISIBLE

                } else if (i < songsList.size - 36) {


                    listOfNotsImages[i - 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )

                    animateBg(listOfNotsImages[i], songsList[i].time)

                    listOfNotsImages[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )
                    listOfNotsImages[i + 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )
                    listOfNotesOnRubob[i - 1].visibility = View.INVISIBLE
                    if (listOfNotesOnRubob[i].id == R.id.lya_1_lya_1)
                    {
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.holo_red_light))
                        view_line_rubob_1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
                    }
                    else{
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.white))
                        listOfNotesOnRubob[i].visibility = View.VISIBLE
                        listOfNotesOnRubob[i].startAnimation(
                            AnimationUtils.loadAnimation(
                                requireContext(),
                                R.anim.fade_in_not
                            )
                        )
                    }
                    listOfNotesOnRubob[i + 1].visibility = View.INVISIBLE

                } else if (i == songsList.size - 36) {

                    listOfNotsImages[i - 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )

                    animateBg(listOfNotsImages[i], songsList[i].time)

                    listOfNotsImages[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )

                    listOfNotesOnRubob[i - 1].visibility = View.INVISIBLE
                    if (listOfNotesOnRubob[i].id == R.id.lya_1_lya_1)
                    {
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.holo_red_light))
                        view_line_rubob_1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
                    }
                    else{
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.white))
                        listOfNotesOnRubob[i].visibility = View.VISIBLE
                        listOfNotesOnRubob[i].startAnimation(
                            AnimationUtils.loadAnimation(
                                requireContext(),
                                R.anim.fade_in_not
                            )
                        )
                    }
                }

                delay(songs_list[i].time)
            } catch (e: Exception) {
                mediaPlayer.stop()
            }

        }


    }


    private suspend fun playTackt2(songsList: List<YallanmaYorim>,
                                   listOfNotsImages: List<ImageView>,
                                   listOfNotesOnRubob: List<ImageView>)
    {

        listOfNotsImages[listOfNotsImages.size - 45].setColorFilter(
            ContextCompat.getColor(
                requireContext(),
                android.R.color.white
            )
        )

        listOfNotesOnRubob[listOfNotesOnRubob.size - 45].visibility = View.INVISIBLE

        if (isStartSecondTrack) {
            cl_yallanma_yorim_1.visibility = View.INVISIBLE
            cl_yallanma_yorim_2.visibility = View.VISIBLE
            cl_yallanma_yorim_3.visibility = View.INVISIBLE
            cl_yallanma_yorim_1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            cl_yallanma_yorim_2.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
            cl_yallanma_yorim_3.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            isStartSecondTrack = false
        }

        for (i in count until 33) {
            try {
                Log.d("playsong", "playTackt2: ${count}")
                mediaPlayer = MediaPlayer.create(view?.context, songsList[i].song)
                if (!isClickButton) {
                    mediaPlayer.stop()
                    break
                } else {
                    mediaPlayer.start()
                    count++
                }
                mediaPlayer.setOnCompletionListener {
                    it.release()
                }

                if (i == 16)
                {
                    nested_yallanma_yorim_2.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_yallanma_yorim_2.smoothScrollTo(0, nested_yallanma_yorim_2.top)

                    }
                }

                if (i == 22) {
                    Log.d("playsong", "playTackt2: smooth1")
                    nested_yallanma_yorim_2.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_yallanma_yorim_2.smoothScrollTo(0, nested_yallanma_yorim_2.bottom)

                    }
                }

                if (i == 16) {

                    animateBg(listOfNotsImages[i], songsList[i].time)

                    listOfNotsImages[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )
                    listOfNotsImages[i + 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )

                    if (listOfNotesOnRubob[i].id == R.id.lya_1_lya_1)
                    {
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.holo_red_light))
                        view_line_rubob_1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
                    }
                    else{
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.white))
                        listOfNotesOnRubob[i].visibility = View.VISIBLE
                        listOfNotesOnRubob[i].startAnimation(
                            AnimationUtils.loadAnimation(
                                requireContext(),
                                R.anim.fade_in_not
                            )
                        )
                    }
                    listOfNotesOnRubob[i + 1].visibility = View.INVISIBLE
                    listOfNotesOnRubob[i - 1].visibility = View.INVISIBLE

                } else if (i < songs_list.size - 44) {
                    listOfNotsImages[i - 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )

                    animateBg(listOfNotsImages[i], songsList[i].time)

                    listOfNotsImages[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )
                    listOfNotsImages[i + 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )
                    listOfNotesOnRubob[i - 1].visibility = View.INVISIBLE
                    if (listOfNotesOnRubob[i].id == R.id.lya_1_lya_1)
                    {
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.holo_red_light))
                        view_line_rubob_1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
                    }
                    else{
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.white))
                        listOfNotesOnRubob[i].visibility = View.VISIBLE
                        listOfNotesOnRubob[i].startAnimation(
                            AnimationUtils.loadAnimation(
                                requireContext(),
                                R.anim.fade_in_not
                            )
                        )
                    }
                    listOfNotesOnRubob[i + 1].visibility = View.INVISIBLE

                } else if (i == songsList.size - 44) {
                    listOfNotsImages[i - 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )

                    animateBg(listOfNotsImages[i], songsList[i].time)

                    listOfNotsImages[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )

                    listOfNotesOnRubob[i - 1].visibility = View.INVISIBLE
                    if (listOfNotesOnRubob[i].id == R.id.lya_1_lya_1)
                    {
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.holo_red_light))
                        view_line_rubob_1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
                    }
                    else{
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.white))
                        listOfNotesOnRubob[i].visibility = View.VISIBLE
                        listOfNotesOnRubob[i].startAnimation(
                            AnimationUtils.loadAnimation(
                                requireContext(),
                                R.anim.fade_in_not
                            )
                        )
                    }

                    nested_yallanma_yorim_2.smoothScrollTo(0, nested_yallanma_yorim_2.top)

                }

                delay(songs_list[i].time)
            } catch (e: Exception) {
                mediaPlayer.stop()
            }


        }

    }


    private suspend fun playTackt3(songsList: List<YallanmaYorim>,
                                   listOfNotsImages: List<ImageView>,
                                   listOfNotesOnRubob: List<ImageView>)
    {

        listOfNotsImages[listOfNotsImages.size - 19].setColorFilter(
            ContextCompat.getColor(
                requireContext(),
                android.R.color.white
            )
        )

        listOfNotesOnRubob[listOfNotesOnRubob.size - 19].visibility = View.INVISIBLE

        if (isStartThirdTrack) {
            cl_yallanma_yorim_2.visibility = View.INVISIBLE
            cl_yallanma_yorim_3.visibility = View.VISIBLE
            cl_yallanma_yorim_2.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            cl_yallanma_yorim_3.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
            isStartThirdTrack = false
        }

        for (i in count until songsList.size - 18) {
            try {
                mediaPlayer = MediaPlayer.create(view?.context, songsList[i].song)
                if (!isClickButton) {
                    mediaPlayer.stop()
                    break
                } else {
                    mediaPlayer.start()
                    count++
                }
                mediaPlayer.setOnCompletionListener {
                    it.release()
                }

                if (i == 33)
                {
                    nested_yallanma_yorim_3.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_yallanma_yorim_3.smoothScrollTo(0, nested_yallanma_yorim_3.top)

                    }
                }

                if (i == 42) {
                    Log.d("playsong", "playTackt2: smooth1")
                    nested_yallanma_yorim_3.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_yallanma_yorim_3.smoothScrollTo(0, nested_yallanma_yorim_3.bottom / 2)

                    }
                }

                if (i == 50) {
                    Log.d("playsong", "playTackt2: smooth1")
                    nested_yallanma_yorim_3.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_yallanma_yorim_3.smoothScrollTo(0, nested_yallanma_yorim_3.bottom)

                    }
                }


                if (i == 33) {

                    animateBg(listOfNotsImages[i], songsList[i].time)

                    listOfNotsImages[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )
                    listOfNotsImages[i + 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )

                    listOfNotesOnRubob[i].visibility = View.VISIBLE
                    listOfNotesOnRubob[i].startAnimation(
                        AnimationUtils.loadAnimation(
                            requireContext(),
                            R.anim.fade_in_not
                        )
                    )
                    listOfNotesOnRubob[i + 1].visibility = View.INVISIBLE
                    listOfNotesOnRubob[i - 1].visibility = View.INVISIBLE

                } else if (i < songsList.size - 18) {


                    Log.d("playsong", "playTackt3: ${i}")
                    listOfNotsImages[i - 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )

                    animateBg(listOfNotsImages[i], songsList[i].time)

                    listOfNotsImages[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )
                    listOfNotsImages[i + 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )
                    listOfNotesOnRubob[i - 1].visibility = View.INVISIBLE
                    if (listOfNotesOnRubob[i].id == R.id.lya_1_lya_1)
                    {
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.holo_red_light))
                        view_line_rubob_1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
                    }
                    else{
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.white))
                        listOfNotesOnRubob[i].visibility = View.VISIBLE
                        listOfNotesOnRubob[i].startAnimation(
                            AnimationUtils.loadAnimation(
                                requireContext(),
                                R.anim.fade_in_not
                            )
                        )
                    }
                    listOfNotesOnRubob[i + 1].visibility = View.INVISIBLE


                } else if (i == songsList.size - 18) {
                    listOfNotsImages[i - 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )

                    animateBg(listOfNotsImages[i], songsList[i].time)

                    listOfNotsImages[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )

                    listOfNotesOnRubob[i - 1].visibility = View.INVISIBLE
                    if (listOfNotesOnRubob[i].id == R.id.lya_1_lya_1)
                    {
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.holo_red_light))
                        view_line_rubob_1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
                    }
                    else{
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.white))
                        listOfNotesOnRubob[i].visibility = View.VISIBLE
                        listOfNotesOnRubob[i].startAnimation(
                            AnimationUtils.loadAnimation(
                                requireContext(),
                                R.anim.fade_in_not
                            )
                        )
                    }
                }

                delay(songs_list[i].time)
            } catch (e: Exception) {
                mediaPlayer.stop()
            }


        }

    }


    private suspend fun playTackt4(songsList: List<YallanmaYorim>,
                                   listOfNotsImages: List<ImageView>,
                                   listOfNotesOnRubob: List<ImageView>)
    {

        listOfNotsImages[listOfNotsImages.size - 1].setColorFilter(
            ContextCompat.getColor(
                requireContext(),
                android.R.color.white
            )
        )

        listOfNotesOnRubob[listOfNotesOnRubob.size - 1].visibility = View.INVISIBLE

        if (isStartFourthTrack) {
            cl_yallanma_yorim_1.visibility = View.INVISIBLE
            cl_yallanma_yorim_2.visibility = View.INVISIBLE
            cl_yallanma_yorim_3.visibility = View.INVISIBLE
            cl_yallanma_yorim_4.visibility = View.VISIBLE
            cl_yallanma_yorim_1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            cl_yallanma_yorim_4.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
            cl_yallanma_yorim_3.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            cl_yallanma_yorim_2.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            isStartFourthTrack = false
        }

        for (i in count until songsList.size) {
            try {
                Log.d("playsong", "playTackt2: ${count}")
                mediaPlayer = MediaPlayer.create(view?.context, songsList[i].song)
                if (!isClickButton) {
                    mediaPlayer.stop()
                    break
                } else {
                    mediaPlayer.start()
                    count++
                }
                mediaPlayer.setOnCompletionListener {
                    it.release()
                }

                if (i == songsList.size - 18)
                {
                    nested_yallanma_yorim_4.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_yallanma_yorim_4.smoothScrollTo(0, nested_yallanma_yorim_4.top)

                    }
                }

                if (i == songsList.size - 10) {
                    Log.d("playsong", "playTackt2: smooth1")
                    nested_yallanma_yorim_4.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_yallanma_yorim_4.smoothScrollTo(0, nested_yallanma_yorim_4.bottom)

                    }
                }

                if (i == songsList.size - 18) {

                    animateBg(listOfNotsImages[i], songsList[i].time)

                    listOfNotsImages[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )
                    listOfNotsImages[i + 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )

                    if (listOfNotesOnRubob[i].id == R.id.lya_1_lya_1)
                    {
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.holo_red_light))
                        view_line_rubob_1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
                    }
                    else{
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.white))
                        listOfNotesOnRubob[i].visibility = View.VISIBLE
                        listOfNotesOnRubob[i].startAnimation(
                            AnimationUtils.loadAnimation(
                                requireContext(),
                                R.anim.fade_in_not
                            )
                        )
                    }
                    listOfNotesOnRubob[i + 1].visibility = View.INVISIBLE
                    listOfNotesOnRubob[i - 1].visibility = View.INVISIBLE

                } else if (i < songs_list.size - 1) {
                    listOfNotsImages[i - 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )

                    animateBg(listOfNotsImages[i], songsList[i].time)

                    listOfNotsImages[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )
                    listOfNotsImages[i + 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )
                    listOfNotesOnRubob[i - 1].visibility = View.INVISIBLE
                    if (listOfNotesOnRubob[i].id == R.id.lya_1_lya_1)
                    {
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.holo_red_light))
                        view_line_rubob_1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
                    }
                    else{
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.white))
                        listOfNotesOnRubob[i].visibility = View.VISIBLE
                        listOfNotesOnRubob[i].startAnimation(
                            AnimationUtils.loadAnimation(
                                requireContext(),
                                R.anim.fade_in_not
                            )
                        )
                    }
                    listOfNotesOnRubob[i + 1].visibility = View.INVISIBLE

                } else if (i == songsList.size - 1) {
                    listOfNotsImages[i - 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )

                    animateBg(listOfNotsImages[i], songsList[i].time)

                    listOfNotsImages[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )

                    listOfNotesOnRubob[i - 1].visibility = View.INVISIBLE
                    if (listOfNotesOnRubob[i].id == R.id.lya_1_lya_1)
                    {
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.holo_red_light))
                        view_line_rubob_1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
                    }
                    else{
                        view_line_rubob_1.setBackgroundColor(ContextCompat.getColor(requireContext(), android.R.color.white))
                        listOfNotesOnRubob[i].visibility = View.VISIBLE
                        listOfNotesOnRubob[i].startAnimation(
                            AnimationUtils.loadAnimation(
                                requireContext(),
                                R.anim.fade_in_not
                            )
                        )
                    }


                }

                delay(songs_list[i].time)
            } catch (e: Exception) {
                mediaPlayer.stop()
            }


        }

    }

    private fun animateBg(imageView: ImageView,songsList:Long) {
        val animator = ValueAnimator.ofFloat(0.7f, 1f)
        animator.addUpdateListener {
            imageView.alpha = it.animatedValue as Float
        }
        animator.duration = songsList
        animator.start()
    }

    override fun onStart() {
        super.onStart()
        isClickButtonOriginal = false
    }

    override fun onPause() {
        super.onPause()
        mediaPlayer_orginal.pause()
        isClickButtonOriginal = false
        isClickButton = false
        play_button_original.setIconResource(R.drawable.icon_play)
        play_button.setIconResource(R.drawable.icon_play)
        play_button.text = "Play"
    }

    override fun onStop() {
        super.onStop()
        mediaPlayer_orginal.pause()
        isClickButtonOriginal = false
        isClickButton = false
        play_button_original.setIconResource(R.drawable.icon_play)
        play_button.setIconResource(R.drawable.icon_play)
        play_button.text = "Play"

    }


    override fun onDestroyView() {
        super.onDestroyView()
        mediaPlayer_orginal.pause()
        isClickButtonOriginal = false
        isClickButton = false
        play_button_original.setIconResource(R.drawable.icon_play)
        play_button.setIconResource(R.drawable.icon_play)
        play_button.text = "Play"

    }
}