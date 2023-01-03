package com.raqamlidunyo.qashqarrubob.ui.music.qashqarcha

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
import com.raqamlidunyo.qashqarrubob.ui.music.qashqarcha.model.Qashqarcha
import com.raqamlidunyo.qashqarrubob.ui.music.qashqarcha.util.QashqarchaUtil
import com.google.android.material.button.MaterialButton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class QashqarchaFragment : Fragment() {

    private lateinit var play_button: MaterialButton
    private lateinit var mediaPlayer: MediaPlayer

    private lateinit var cl_qashaqarch1: ConstraintLayout
    private lateinit var cl_qashaqarch2: ConstraintLayout
    private lateinit var cl_qashaqarch3: ConstraintLayout
    private lateinit var nested_scroll_qashaqarch_1: NestedScrollView
    private lateinit var nested_scroll_qashaqarch_2: NestedScrollView
    private lateinit var nested_scroll_qashaqarch_3: NestedScrollView

    private lateinit var view_line_rubob_1:View

    private lateinit var qashqarcha_1_mi_1: ImageView
    private lateinit var qashqarcha_1_lya_1: ImageView
    private lateinit var qashqarcha_1_lya_2: ImageView
    private lateinit var qashqarcha_1_lya_3: ImageView
    private lateinit var qashqarcha_1_si_1: ImageView
    private lateinit var qashqarcha_1_do_1: ImageView
    private lateinit var qashqarcha_1_re_1: ImageView
    private lateinit var qashqarcha_1_mi_2: ImageView
    private lateinit var qashqarcha_1_mi_3: ImageView
    private lateinit var qashqarcha_1_re_2: ImageView
    private lateinit var qashqarcha_1_mi_4: ImageView
    private lateinit var qashqarcha_1_fa_1: ImageView
    private lateinit var qashqarcha_1_fa_2: ImageView
    private lateinit var qashqarcha_1_mi_5: ImageView
    private lateinit var qashqarcha_1_fa_3: ImageView
    private lateinit var qashqarcha_1_mi_6: ImageView
    private lateinit var qashqarcha_1_re_3: ImageView
    private lateinit var qashqarcha_1_do_2: ImageView

    private lateinit var qashqarcha_2_lya_1: ImageView
    private lateinit var qashqarcha_2_fa_1: ImageView
    private lateinit var qashqarcha_2_fa_2: ImageView
    private lateinit var qashqarcha_2_fa_3: ImageView
    private lateinit var qashqarcha_2_mi_1: ImageView
    private lateinit var qashqarcha_2_re_1: ImageView
    private lateinit var qashqarcha_2_mi_2: ImageView
    private lateinit var qashqarcha_2_fa_4: ImageView
    private lateinit var qashqarcha_2_mi_3: ImageView
    private lateinit var qashqarcha_2_re_2: ImageView
    private lateinit var qashqarcha_2_do_1: ImageView
    private lateinit var qashqarcha_2_do_2: ImageView
    private lateinit var qashqarcha_2_lya_2: ImageView
    private lateinit var qashqarcha_2_lya_3: ImageView
    private lateinit var qashqarcha_2_si_1: ImageView
    private lateinit var qashqarcha_2_lya_4: ImageView
    private lateinit var qashqarcha_2_lya_5: ImageView
    private lateinit var qashqarcha_2_lya_6: ImageView


    private lateinit var qashqarcha_3_lya_1: ImageView
    private lateinit var qashqarcha_3_lya_2: ImageView
    private lateinit var qashqarcha_3_lya_3: ImageView
    private lateinit var qashqarcha_3_lya_4: ImageView
    private lateinit var qashqarcha_3_lya_5: ImageView
    private lateinit var qashqarcha_3_si_1: ImageView
    private lateinit var qashqarcha_3_sol_1: ImageView
    private lateinit var qashqarcha_3_lya_6: ImageView
    private lateinit var qashqarcha_3_fa_1: ImageView
    private lateinit var qashqarcha_3_fa_2: ImageView
    private lateinit var qashqarcha_3_fa_3: ImageView
    private lateinit var qashqarcha_3_sol_2: ImageView
    private lateinit var qashqarcha_3_lya_7: ImageView
    private lateinit var qashqarcha_3_mi_1: ImageView
    private lateinit var qashqarcha_3_fa_4: ImageView
    private lateinit var qashqarcha_3_mi_2: ImageView
    private lateinit var qashqarcha_3_re_1: ImageView
    private lateinit var qashqarcha_3_do_1: ImageView


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
    private lateinit var songs_list: List<Qashqarcha>

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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_qashqarcha, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        cl_qashaqarch1 = view.findViewById(R.id.cl_qashqarcha_1)
        cl_qashaqarch2 = view.findViewById(R.id.cl_qashqarcha_2)
        cl_qashaqarch3 = view.findViewById(R.id.cl_qashqarcha_3)
        nested_scroll_qashaqarch_1 = view.findViewById(R.id.nested_qashqarcha_1)
        nested_scroll_qashaqarch_2 = view.findViewById(R.id.nested_qashqarcha_2)
        nested_scroll_qashaqarch_3 = view.findViewById(R.id.nested_qashqarcha_3)

        view_line_rubob_1 = view.findViewById(R.id.view_line_rubob_1)

        qashqarcha_1_mi_1 = view.findViewById(R.id.qashqarcha_1_mi_1)
        qashqarcha_1_lya_1 = view.findViewById(R.id.qashqarcha_1_lya_1)
        qashqarcha_1_lya_2 = view.findViewById(R.id.qashqarcha_1_lya_2)
        qashqarcha_1_lya_3 = view.findViewById(R.id.qashqarcha_1_lya_3)
        qashqarcha_1_si_1 = view.findViewById(R.id.qashqarcha_1_si_1)
        qashqarcha_1_do_1 = view.findViewById(R.id.qashqarcha_1_do_1)
        qashqarcha_1_re_1 = view.findViewById(R.id.qashqarcha_1_re_1)
        qashqarcha_1_mi_2 = view.findViewById(R.id.qashqarcha_1_mi_2)
        qashqarcha_1_mi_3 = view.findViewById(R.id.qashqarcha_1_mi_3)
        qashqarcha_1_re_2 = view.findViewById(R.id.qashqarcha_1_re_2)
        qashqarcha_1_mi_4 = view.findViewById(R.id.qashqarcha_1_mi_4)
        qashqarcha_1_fa_1 = view.findViewById(R.id.qashqarcha_1_fa_1)
        qashqarcha_1_fa_2 = view.findViewById(R.id.qashqarcha_1_fa_2)
        qashqarcha_1_mi_5 = view.findViewById(R.id.qashqarcha_1_mi_5)
        qashqarcha_1_fa_3 = view.findViewById(R.id.qashqarcha_1_fa_3)
        qashqarcha_1_mi_6 = view.findViewById(R.id.qashqarcha_1_mi_6)
        qashqarcha_1_re_3 = view.findViewById(R.id.qashqarcha_1_re_3)
        qashqarcha_1_do_2 = view.findViewById(R.id.qashqarcha_1_do_2)


        qashqarcha_2_lya_1 = view.findViewById(R.id.qashqarcha_2_lya_1)
        qashqarcha_2_fa_1 = view.findViewById(R.id.qashqarcha_2_fa_1)
        qashqarcha_2_fa_2 = view.findViewById(R.id.qashqarcha_2_fa_2)
        qashqarcha_2_fa_3 = view.findViewById(R.id.qashqarcha_2_fa_3)
        qashqarcha_2_mi_1 = view.findViewById(R.id.qashqarcha_2_mi_1)
        qashqarcha_2_re_1 = view.findViewById(R.id.qashqarcha_2_re_1)
        qashqarcha_2_mi_2 = view.findViewById(R.id.qashqarcha_2_mi_2)
        qashqarcha_2_fa_4 = view.findViewById(R.id.qashqarcha_2_fa_4)
        qashqarcha_2_mi_3 = view.findViewById(R.id.qashqarcha_2_mi_3)
        qashqarcha_2_re_2 = view.findViewById(R.id.qashqarcha_2_re_2)
        qashqarcha_2_do_1 = view.findViewById(R.id.qashqarcha_2_do_1)
        qashqarcha_2_do_2 = view.findViewById(R.id.qashqarcha_2_do_2)
        qashqarcha_2_lya_2 = view.findViewById(R.id.qashqarcha_2_lya_2)
        qashqarcha_2_lya_3 = view.findViewById(R.id.qashqarcha_2_lya_3)
        qashqarcha_2_si_1 = view.findViewById(R.id.qashqarcha_2_si_1)
        qashqarcha_2_lya_4 = view.findViewById(R.id.qashqarcha_2_lya_4)
        qashqarcha_2_lya_5 = view.findViewById(R.id.qashqarcha_2_lya_5)
        qashqarcha_2_lya_6 = view.findViewById(R.id.qashqarcha_2_lya_6)


        qashqarcha_3_lya_1 = view.findViewById(R.id.qashqarcha_3_lya_1)
        qashqarcha_3_lya_2 = view.findViewById(R.id.qashqarcha_3_lya_2)
        qashqarcha_3_lya_3 = view.findViewById(R.id.qashqarcha_3_lya_3)
        qashqarcha_3_lya_4 = view.findViewById(R.id.qashqarcha_3_lya_4)
        qashqarcha_3_lya_5 = view.findViewById(R.id.qashqarcha_3_lya_5)
        qashqarcha_3_si_1 = view.findViewById(R.id.qashqarcha_3_si_1)
        qashqarcha_3_sol_1 = view.findViewById(R.id.qashqarcha_3_sol_1)
        qashqarcha_3_lya_6 = view.findViewById(R.id.qashqarcha_3_lya_6)
        qashqarcha_3_fa_1 = view.findViewById(R.id.qashqarcha_3_fa_1)
        qashqarcha_3_fa_2 = view.findViewById(R.id.qashqarcha_3_fa_2)
        qashqarcha_3_fa_3 = view.findViewById(R.id.qashqarcha_3_fa_3)
        qashqarcha_3_sol_2 = view.findViewById(R.id.qashqarcha_3_sol_2)
        qashqarcha_3_lya_7 = view.findViewById(R.id.qashqarcha_3_lya_7)
        qashqarcha_3_mi_1 = view.findViewById(R.id.qashqarcha_3_mi_1)
        qashqarcha_3_fa_4 = view.findViewById(R.id.qashqarcha_3_fa_4)
        qashqarcha_3_mi_2 = view.findViewById(R.id.qashqarcha_3_mi_2)
        qashqarcha_3_re_1 = view.findViewById(R.id.qashqarcha_3_re_1)
        qashqarcha_3_do_1 = view.findViewById(R.id.qashqarcha_3_do_1)


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
            qashqarcha_1_mi_1,
            qashqarcha_1_lya_1,
            qashqarcha_1_lya_2,
            qashqarcha_1_lya_3,
            qashqarcha_1_si_1,
            qashqarcha_1_do_1,
            qashqarcha_1_re_1,
            qashqarcha_1_mi_2,
            qashqarcha_1_mi_3,
            qashqarcha_1_re_2,
            qashqarcha_1_mi_4,
            qashqarcha_1_fa_1,
            qashqarcha_1_fa_2,
            qashqarcha_1_mi_5,
            qashqarcha_1_fa_3,
            qashqarcha_1_mi_6,
            qashqarcha_1_re_3,
            qashqarcha_1_do_2,

            qashqarcha_2_lya_1,
            qashqarcha_2_fa_1,
            qashqarcha_2_fa_2,
            qashqarcha_2_fa_3,
            qashqarcha_2_mi_1,
            qashqarcha_2_re_1,
            qashqarcha_2_mi_2,
            qashqarcha_2_fa_4,
            qashqarcha_2_mi_3,
            qashqarcha_2_re_2,
            qashqarcha_2_do_1,
            qashqarcha_2_do_2,
            qashqarcha_2_lya_2,
            qashqarcha_2_lya_3,
            qashqarcha_2_si_1,
            qashqarcha_2_lya_4,
            qashqarcha_2_lya_5,
            qashqarcha_2_lya_6,


            qashqarcha_3_lya_1,
            qashqarcha_3_lya_2,
            qashqarcha_3_lya_3,
            qashqarcha_3_lya_4,
            qashqarcha_3_lya_5,
            qashqarcha_3_si_1,
            qashqarcha_3_sol_1,
            qashqarcha_3_lya_6,
            qashqarcha_3_fa_1,
            qashqarcha_3_fa_2,
            qashqarcha_3_fa_3,
            qashqarcha_3_sol_2,
            qashqarcha_3_lya_7,
            qashqarcha_3_mi_1,
            qashqarcha_3_fa_4,
            qashqarcha_3_mi_2,
            qashqarcha_3_re_1,
            qashqarcha_3_do_1,
        )

        list_of_rubob_notes = listOf(
            lya_1_mi_1,
            lya_1_lya_1,
            lya_1_lya_1,
            lya_1_lya_1,
            lya_1_si_1,
            lya_1_do_1_diyez,
            lya_1_re_1,
            lya_1_mi_1,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_mi_1,
            lya_1_fa_1_diyez,
            lya_1_fa_1_diyez,
            lya_1_mi_1,
            lya_1_fa_1_diyez,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_do_1_diyez,

            lya_1_lya_1,
            lya_1_fa_1_diyez,
            lya_1_fa_1_diyez,
            lya_1_fa_1_diyez,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_mi_1,
            lya_1_fa_1_diyez,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_do_1_diyez,
            lya_1_do_1_diyez,
            lya_1_lya_1,
            lya_1_lya_1,
            lya_1_si_1,
            lya_1_lya_1,
            lya_1_lya_1,
            lya_1_lya_1,

            lya_1_lya_1,
            lya_1_lya_2,
            lya_1_lya_2,
            lya_1_lya_2,
            lya_1_lya_2,
            lya_1_si_2,
            lya_1_sol_1,
            lya_1_lya_2,
            lya_1_fa_1_diyez,
            lya_1_fa_1_diyez,
            lya_1_fa_1_diyez,
            lya_1_sol_1,
            lya_1_lya_2,
            lya_1_mi_1,
            lya_1_fa_1_diyez,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_do_1_diyez
        )

        songs_list = QashqarchaUtil.qashqarchaList()

        play_button = view.findViewById(R.id.mtb_play_button)



        play_button.setOnClickListener {

            val scope = CoroutineScope(Dispatchers.Main)
            scope.launch {
                try {

                    playFirstTor(songs_list, list_of_image_notes, list_of_rubob_notes)
                } catch (e: Exception) {
                }
            }
        }

    }

    private suspend fun playFirstTor(
        songsList: List<Qashqarcha>,
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

        } else {
            isClickButton = false
            play_button.setIconResource(R.drawable.icon_play)
            play_button.text = "Play"
            play_button.isEnabled = false
            delay(500)
            play_button.isEnabled = true


        }

        for (j in main_count..12)
        {
            Log.d("playsong", "playFirstTor: ${main_count}")
            if (!isClickButton)
            {
                break
            }
            if ((count == 0 || (count > 0 && count < 18)) && j < 1) {
                playTackt1(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 18) {
                    main_count = 0
                }


            }

            else if ((count == 18 || (count > 18 && count < 36)) && j < 2)
            {
                playTackt2(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 36) {
                    main_count = 1
                    count = 0
                    isStartFirstTrack = true
                }
            }

            else if ((count == 0 || (count > 0 && count < 18)) && j < 3) {
                playTackt1(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 18) {
                    main_count = 2
                    isStartSecondTrack = true
                }


            }

            else if ((count == 18 || (count > 18 && count < 36)) && j < 4)
            {
                playTackt2(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 36) {
                    main_count = 3
                }
            }

            else if ((count == 36 || (count > 36 && count < 54)) && j < 5)
            {
                playTackt3(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 54) {
                    main_count = 4
                    count = 18
                    isStartSecondTrack = true
                }
            }

            else if ((count == 18 || (count > 18 && count < 36)) && j < 6)
            {
                playTackt2(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 36) {
                    main_count = 5
                    isStartThirdTrack = true
                }
            }

            else if ((count == 36 || (count > 36 && count < 54)) && j < 7)
            {
                playTackt3(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 54) {
                    main_count = 6
                    count = 18
                    isStartSecondTrack = true
                }
            }

            else if ((count == 18 || (count > 18 && count < 36)) && j < 8)
            {
                playTackt2(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 36) {
                    main_count = 8
                    count = 0
                    isStartFirstTrack = true
                }
            }

            else if ((count == 0 || (count > 0 && count < 18)) && j < 9) {
                playTackt1(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 18) {
                    main_count = 7
                    isStartSecondTrack = true
                }
            }

            else if ((count == 18 || (count > 18 && count < 36)) && j < 10)
            {
                playTackt2(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 36) {
                    main_count = 8
                    count = 0
                    isStartFirstTrack = true
                }
            }

            else if ((count == 0 || (count > 0 && count < 18)) && j < 11) {
                playTackt1(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 18) {
                    main_count = 9
                    isStartSecondTrack = true
                }


            }

            else if ((count == 18 || (count > 18 && count < 36)) && j == 12)
            {
                playTackt2(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 36) {
                    main_count = 0
                    count = 0
                    isClickButton = false
                    isStartFirstTrack = true
                    isStartSecondTrack = true
                    isStartThirdTrack = true
                    play_button.text = "Play"
                    play_button.setIconResource(R.drawable.icon_play)
                }
            }


        }


        play_button.isEnabled = true
    }


    private suspend fun playTackt1(
        songsList: List<Qashqarcha>,
        listOfNotsImages: List<ImageView>,
        listOfNotesOnRubob: List<ImageView>
    ) {

        listOfNotsImages[listOfNotsImages.size - 37].setColorFilter(
            ContextCompat.getColor(
                requireContext(),
                android.R.color.white
            )
        )

        listOfNotesOnRubob[listOfNotesOnRubob.size - 37].visibility = View.INVISIBLE
        if (isStartFirstTrack) {
            cl_qashaqarch1.visibility = View.VISIBLE
            cl_qashaqarch2.visibility = View.INVISIBLE
            cl_qashaqarch3.visibility = View.INVISIBLE

            if (isPlaying) {
                cl_qashaqarch1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
                cl_qashaqarch2.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            }

            isStartFirstTrack = false
        }

        isPlaying = true
        for (i in count until songsList.size - 36) {
            try {
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
                    nested_scroll_qashaqarch_1.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_qashaqarch_1.smoothScrollTo(0, nested_scroll_qashaqarch_1.top)

                    }
                }

                if (i == 10) {
                    Log.d("playsong", "playTackt2: smooth1")
                    nested_scroll_qashaqarch_1.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_qashaqarch_1.smoothScrollTo(0, nested_scroll_qashaqarch_1.bottom)

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


    private suspend fun playTackt2(songsList: List<Qashqarcha>,
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

        if (isStartSecondTrack) {
            cl_qashaqarch1.visibility = View.INVISIBLE
            cl_qashaqarch2.visibility = View.VISIBLE
            cl_qashaqarch3.visibility = View.INVISIBLE
            cl_qashaqarch1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            cl_qashaqarch2.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
            cl_qashaqarch3.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            isStartSecondTrack = false
        }

        for (i in count until songsList.size - 18) {
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

                if (i == 18)
                {
                    nested_scroll_qashaqarch_2.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_qashaqarch_2.smoothScrollTo(0, nested_scroll_qashaqarch_2.top)

                    }
                }

                if (i == 25) {
                    Log.d("playsong", "playTackt2: smooth1")
                    nested_scroll_qashaqarch_2.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_qashaqarch_2.smoothScrollTo(0, nested_scroll_qashaqarch_2.bottom)

                    }
                }

                if (i == songsList.size - 36) {

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

                } else if (i < songs_list.size - 18) {
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

                    nested_scroll_qashaqarch_2.smoothScrollTo(0, nested_scroll_qashaqarch_2.top)

                }

                delay(songs_list[i].time)
            } catch (e: Exception) {
                mediaPlayer.stop()
            }


        }

    }



    private suspend fun playTackt3(songsList: List<Qashqarcha>,
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

        if (isStartThirdTrack) {
            cl_qashaqarch2.visibility = View.INVISIBLE
            cl_qashaqarch3.visibility = View.VISIBLE
            cl_qashaqarch2.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            cl_qashaqarch3.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
            isStartThirdTrack = false
        }

        for (i in count until songsList.size) {
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

                if (i == 36)
                {
                    nested_scroll_qashaqarch_3.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_qashaqarch_3.smoothScrollTo(0, nested_scroll_qashaqarch_3.top)

                    }
                }

                if (i == 42) {
                    Log.d("playsong", "playTackt2: smooth1")
                    nested_scroll_qashaqarch_3.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_qashaqarch_3.smoothScrollTo(0, nested_scroll_qashaqarch_3.bottom)

                    }
                }


                if (i == 36) {

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

                } else if (i < songsList.size - 1) {


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
}