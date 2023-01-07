package com.raqamlidunyo.qashqarrubob.ui.music.doloncha

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
import android.widget.ScrollView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.widget.NestedScrollView
import com.raqamlidunyo.qashqarrubob.R
import com.raqamlidunyo.qashqarrubob.ui.music.doloncha.model.Doloncha
import com.raqamlidunyo.qashqarrubob.ui.music.doloncha.util.DolonchaUtil
import com.google.android.material.button.MaterialButton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class DolonchaFragment : Fragment() {

    private lateinit var play_button: MaterialButton
    private lateinit var play_button_original: MaterialButton
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var mediaPlayer_orginal: MediaPlayer

    private lateinit var cl_doloncha1: ConstraintLayout
    private lateinit var cl_doloncha2: ConstraintLayout
    private lateinit var cl_doloncha3: ConstraintLayout
    private lateinit var nested_scroll_doloncha_1: NestedScrollView
    private lateinit var nested_scroll_doloncha_2: ScrollView
    private lateinit var nested_scroll_doloncha_3: NestedScrollView

    private lateinit var view_line_rubob_1:View

    private lateinit var doloncha_1_lya_1: ImageView
    private lateinit var doloncha_1_lya_2: ImageView
    private lateinit var doloncha_1_si_1: ImageView
    private lateinit var doloncha_1_do_1: ImageView
    private lateinit var doloncha_1_do_2: ImageView
    private lateinit var doloncha_1_si_2: ImageView
    private lateinit var doloncha_1_lya_3: ImageView
    private lateinit var doloncha_1_lya_4: ImageView
    private lateinit var doloncha_1_mi_1: ImageView
    private lateinit var doloncha_1_mi_2: ImageView
    private lateinit var doloncha_1_re_1: ImageView
    private lateinit var doloncha_1_do_3: ImageView
    private lateinit var doloncha_1_do_4: ImageView
    private lateinit var doloncha_1_si_3: ImageView
    private lateinit var doloncha_1_lya_5: ImageView
    private lateinit var doloncha_1_si_4: ImageView
    private lateinit var doloncha_1_do_5: ImageView
    private lateinit var doloncha_1_lya_6: ImageView
    private lateinit var doloncha_1_lya_7: ImageView
    private lateinit var doloncha_1_lya_8: ImageView

    private lateinit var doloncha_2_re_1: ImageView
    private lateinit var doloncha_2_re_2: ImageView
    private lateinit var doloncha_2_re_3: ImageView
    private lateinit var doloncha_2_fa_1: ImageView
    private lateinit var doloncha_2_mi_1: ImageView
    private lateinit var doloncha_2_fa_2: ImageView
    private lateinit var doloncha_2_mi_2: ImageView
    private lateinit var doloncha_2_re_4: ImageView
    private lateinit var doloncha_2_do_1: ImageView
    private lateinit var doloncha_2_re_5: ImageView
    private lateinit var doloncha_2_re_6: ImageView
    private lateinit var doloncha_2_re_7: ImageView
    private lateinit var doloncha_2_fa_3: ImageView
    private lateinit var doloncha_2_mi_3: ImageView
    private lateinit var doloncha_2_re_8: ImageView
    private lateinit var doloncha_2_mi_4: ImageView
    private lateinit var doloncha_2_fa_4: ImageView
    private lateinit var doloncha_2_mi_5: ImageView
    private lateinit var doloncha_2_re_9: ImageView
    private lateinit var doloncha_2_do_2: ImageView
    private lateinit var doloncha_2_do_3: ImageView
    private lateinit var doloncha_2_si_1: ImageView
    private lateinit var doloncha_2_lya_1: ImageView
    private lateinit var doloncha_2_si_2: ImageView
    private lateinit var doloncha_2_do_4: ImageView

    private lateinit var doloncha_3_lya_3: ImageView
    private lateinit var doloncha_3_lya_4: ImageView
    private lateinit var doloncha_3_mi_1: ImageView
    private lateinit var doloncha_3_mi_2: ImageView
    private lateinit var doloncha_3_re_1: ImageView
    private lateinit var doloncha_3_do_3: ImageView
    private lateinit var doloncha_3_do_4: ImageView
    private lateinit var doloncha_3_si_3: ImageView
    private lateinit var doloncha_3_lya_5: ImageView
    private lateinit var doloncha_3_si_4: ImageView
    private lateinit var doloncha_3_do_5: ImageView
    private lateinit var doloncha_3_lya_6: ImageView
    private lateinit var doloncha_3_lya_7: ImageView
    private lateinit var doloncha_3_lya_8: ImageView


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
    private lateinit var songs_list: List<Doloncha>

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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_doloncha, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cl_doloncha1 = view.findViewById(R.id.cl_doloncha_1)
        cl_doloncha2 = view.findViewById(R.id.cl_doloncha_2)
        cl_doloncha3 = view.findViewById(R.id.cl_doloncha_3)
        nested_scroll_doloncha_1 = view.findViewById(R.id.nested_scroll_doloncha_1)
        nested_scroll_doloncha_2 = view.findViewById(R.id.nested_scroll_doloncha_2)
        nested_scroll_doloncha_3 = view.findViewById(R.id.nested_scroll_doloncha_3)

        view_line_rubob_1 = view.findViewById(R.id.view_line_rubob_1)

        doloncha_1_lya_1 = view.findViewById(R.id.doloncha_1_lya_1)
        doloncha_1_lya_2 = view.findViewById(R.id.doloncha_1_lya_2)
        doloncha_1_si_1 = view.findViewById(R.id.doloncha_1_si_1)
        doloncha_1_do_1 = view.findViewById(R.id.doloncha_1_do_1)
        doloncha_1_do_2 = view.findViewById(R.id.doloncha_1_do_2)
        doloncha_1_si_2 = view.findViewById(R.id.doloncha_1_si_2)
        doloncha_1_lya_3 = view.findViewById(R.id.doloncha_1_lya_3)
        doloncha_1_lya_4 = view.findViewById(R.id.doloncha_1_lya_4)
        doloncha_1_mi_1 = view.findViewById(R.id.doloncha_1_mi_1)
        doloncha_1_mi_2 = view.findViewById(R.id.doloncha_1_mi_2)
        doloncha_1_re_1 = view.findViewById(R.id.doloncha_1_re_1)
        doloncha_1_do_3 = view.findViewById(R.id.doloncha_1_do_3)
        doloncha_1_do_4 = view.findViewById(R.id.doloncha_1_do_4)
        doloncha_1_si_3 = view.findViewById(R.id.doloncha_1_si_3)
        doloncha_1_lya_5 = view.findViewById(R.id.doloncha_1_lya_5)
        doloncha_1_si_4 = view.findViewById(R.id.doloncha_1_si_4)
        doloncha_1_do_5 = view.findViewById(R.id.doloncha_1_do_5)
        doloncha_1_lya_6 = view.findViewById(R.id.doloncha_1_lya_6)
        doloncha_1_lya_7 = view.findViewById(R.id.doloncha_1_lya_7)
        doloncha_1_lya_8 = view.findViewById(R.id.doloncha_1_lya_8)


        doloncha_2_re_1 = view.findViewById(R.id.doloncha_2_re_1)
        doloncha_2_re_2 = view.findViewById(R.id.doloncha_2_re_2)
        doloncha_2_re_3 = view.findViewById(R.id.doloncha_2_re_3)
        doloncha_2_fa_1 = view.findViewById(R.id.doloncha_2_fa_1)
        doloncha_2_mi_1 = view.findViewById(R.id.doloncha_2_mi_1)
        doloncha_2_fa_2 = view.findViewById(R.id.doloncha_2_fa_2)
        doloncha_2_mi_2 = view.findViewById(R.id.doloncha_2_mi_2)
        doloncha_2_re_4 = view.findViewById(R.id.doloncha_2_re_4)
        doloncha_2_do_1 = view.findViewById(R.id.doloncha_2_do_1)
        doloncha_2_re_5 = view.findViewById(R.id.doloncha_2_re_5)
        doloncha_2_re_6 = view.findViewById(R.id.doloncha_2_re_6)
        doloncha_2_re_7 = view.findViewById(R.id.doloncha_2_re_7)
        doloncha_2_fa_3 = view.findViewById(R.id.doloncha_2_fa_3)
        doloncha_2_mi_3 = view.findViewById(R.id.doloncha_2_mi_3)
        doloncha_2_re_8 = view.findViewById(R.id.doloncha_2_re_8)
        doloncha_2_mi_4 = view.findViewById(R.id.doloncha_2_mi_4)
        doloncha_2_fa_4 = view.findViewById(R.id.doloncha_2_fa_4)
        doloncha_2_mi_5 = view.findViewById(R.id.doloncha_2_mi_5)
        doloncha_2_re_9 = view.findViewById(R.id.doloncha_2_re_9)
        doloncha_2_do_2 = view.findViewById(R.id.doloncha_2_do_2)
        doloncha_2_do_3 = view.findViewById(R.id.doloncha_2_do_3)
        doloncha_2_si_1 = view.findViewById(R.id.doloncha_2_si_1)
        doloncha_2_lya_1 = view.findViewById(R.id.doloncha_2_lya_1)
        doloncha_2_si_2 = view.findViewById(R.id.doloncha_2_si_2)
        doloncha_2_do_4 = view.findViewById(R.id.doloncha_2_do_4)

        doloncha_3_lya_3 = view.findViewById(R.id.doloncha_3_lya_3)
        doloncha_3_lya_4 = view.findViewById(R.id.doloncha_3_lya_4)
        doloncha_3_mi_1 = view.findViewById(R.id.doloncha_3_mi_1)
        doloncha_3_mi_2 = view.findViewById(R.id.doloncha_3_mi_2)
        doloncha_3_re_1 = view.findViewById(R.id.doloncha_3_re_1)
        doloncha_3_do_3 = view.findViewById(R.id.doloncha_3_do_3)
        doloncha_3_do_4 = view.findViewById(R.id.doloncha_3_do_4)
        doloncha_3_si_3 = view.findViewById(R.id.doloncha_3_si_3)
        doloncha_3_lya_5 = view.findViewById(R.id.doloncha_3_lya_5)
        doloncha_3_si_4 = view.findViewById(R.id.doloncha_3_si_4)
        doloncha_3_do_5 = view.findViewById(R.id.doloncha_3_do_5)
        doloncha_3_lya_6 = view.findViewById(R.id.doloncha_3_lya_6)
        doloncha_3_lya_7 = view.findViewById(R.id.doloncha_3_lya_7)
        doloncha_3_lya_8 = view.findViewById(R.id.doloncha_3_lya_8)

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
            doloncha_1_lya_1,
            doloncha_1_lya_2,
            doloncha_1_si_1,
            doloncha_1_do_1,
            doloncha_1_do_2,
            doloncha_1_si_2,
            doloncha_1_lya_3,
            doloncha_1_lya_4,
            doloncha_1_mi_1,
            doloncha_1_mi_2,
            doloncha_1_re_1,
            doloncha_1_do_3,
            doloncha_1_do_4,
            doloncha_1_si_3,
            doloncha_1_lya_5,
            doloncha_1_si_4,
            doloncha_1_do_5,
            doloncha_1_lya_6,
            doloncha_1_lya_7,
            doloncha_1_lya_8,

            doloncha_2_re_1,
            doloncha_2_re_2,
            doloncha_2_re_3,
            doloncha_2_fa_1,
            doloncha_2_mi_1,
            doloncha_2_fa_2,
            doloncha_2_mi_2,
            doloncha_2_re_4,
            doloncha_2_do_1,
            doloncha_2_re_5,
            doloncha_2_re_6,
            doloncha_2_re_7,
            doloncha_2_fa_3,
            doloncha_2_mi_3,
            doloncha_2_re_8,
            doloncha_2_mi_4,
            doloncha_2_fa_4,
            doloncha_2_mi_5,
            doloncha_2_re_9,
            doloncha_2_do_2,
            doloncha_2_do_3,
            doloncha_2_si_1,
            doloncha_2_lya_1,
            doloncha_2_si_2,
            doloncha_2_do_4,

            doloncha_3_lya_3,
            doloncha_3_lya_4,
            doloncha_3_mi_1,
            doloncha_3_mi_2,
            doloncha_3_re_1,
            doloncha_3_do_3,
            doloncha_3_do_4,
            doloncha_3_si_3,
            doloncha_3_lya_5,
            doloncha_3_si_4,
            doloncha_3_do_5,
            doloncha_3_lya_6,
            doloncha_3_lya_7,
            doloncha_3_lya_8
        )

        list_of_rubob_notes = listOf(
            lya_1_lya_1,
            lya_1_lya_1,
            lya_1_si_1,
            lya_1_do_1_diyez,
            lya_1_do_1_diyez,
            lya_1_si_1,
            lya_1_lya_1,
            lya_1_lya_1,
            lya_1_mi_1,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_do_1_diyez,
            lya_1_do_1_diyez,
            lya_1_si_1,
            lya_1_lya_1,
            lya_1_si_1,
            lya_1_do_1_diyez,
            lya_1_lya_1,
            lya_1_lya_1,
            lya_1_lya_1,

            lya_1_re_1,
            lya_1_re_1,
            lya_1_re_1,
            lya_1_fa_1_diyez,
            lya_1_mi_1,
            lya_1_fa_1_diyez,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_do_1_diyez,
            lya_1_re_1,
            lya_1_re_1,
            lya_1_re_1,
            lya_1_fa_1_diyez,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_mi_1,
            lya_1_fa_1_diyez,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_do_1_diyez,
            lya_1_do_1_diyez,
            lya_1_si_1,
            lya_1_lya_1,
            lya_1_si_1,
            lya_1_do_1_diyez,

            lya_1_lya_1,
            lya_1_lya_1,
            lya_1_mi_1,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_do_1_diyez,
            lya_1_do_1_diyez,
            lya_1_si_1,
            lya_1_lya_1,
            lya_1_si_1,
            lya_1_do_1_diyez,
            lya_1_lya_1,
            lya_1_lya_1,
            lya_1_lya_1
        )

        songs_list = DolonchaUtil.dolonchaList()

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

        mediaPlayer_orginal = MediaPlayer.create(requireContext(),R.raw.duloncha)
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
        songsList: List<Doloncha>,
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

        for (j in main_count..7)
        {
            Log.d("playsong", "playFirstTor: ${main_count}")
            if (!isClickButton)
            {
                break
            }
            if ((count == 0 || (count > 0 && count < 20)) && j < 2) {
                playTackt1(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 20 && j != 1) {
                    main_count = 1
                    count = 0

                }

                if (count == 20 && j == 1)
                {
                    isStartSecondTrack = true
                    count = 20
                    main_count = 2
                }
            }

            else if ((count == 20 || (count > 20 && count < 45)) && (j < 3))
            {

                playTackt2(songsList, listOfNotsImages, listOfNotesOnRubob)
                main_count = 2

            }
            else if ((count == 45 || (count > 45 && count < songsList.size)) && (j < 4))
            {
                playTackt3(songsList, listOfNotsImages, listOfNotesOnRubob)
                nested_scroll_doloncha_2.smoothScrollTo(0, nested_scroll_doloncha_2.top)
                main_count = 3

            }
            else if ((count == songsList.size || (count > 20 && count < 45)) && j < 5)
            {
                if (isStartSecondTrackReturn) {
                    count = 20
                    isStartSecondTrackReturn = false
                }
                isStartSecondTrack = true
                playTackt2(songsList, listOfNotsImages, listOfNotesOnRubob)

                main_count = 4
            }

            else if ((count == 45 || (count > 45 && count < songsList.size)) && (j < 6))
            {

                playTackt3(songsList, listOfNotsImages, listOfNotesOnRubob)
                nested_scroll_doloncha_1.smoothScrollTo(0, nested_scroll_doloncha_1.top)
                main_count = 5

            }

            else if ((count == songsList.size || (count > 0 && count < 20)) && j < 7)
            {
                isStartFirstTrack = true
                main_count = 6
                if (isStartFirstTrackReturn) {
                    count = 0
                    isStartFirstTrackReturn = false
                }

                playTackt1(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 20)
                {
                    isStartFirstTrackReturn = true
                }

            }

            else if ((count == 20 || (count > 0 && count < 20)) && j == 7) {
                main_count = 7
                if (isStartFirstTrackReturn) {
                    count = 0
                    isStartFirstTrackReturn = false
                }
                playTackt1(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 20)
                {
                    count = 0
                    main_count = 0
                    play_button.text = "Play"
                    play_button.setIconResource(R.drawable.icon_play)
                    isStartFirstTrack = true
                    isStartFirstTrackReturn = true
                    isStartSecondTrack = true
                    isStartSecondTrackReturn = true
                    isStartThirdTrack = true

                    isClickButton = false
                }
            }


        }


        play_button.isEnabled = true
    }


    private suspend fun playTackt1(
        songsList: List<Doloncha>,
        listOfNotsImages: List<ImageView>,
        listOfNotesOnRubob: List<ImageView>
    ) {

        listOfNotsImages[listOfNotsImages.size - 40].setColorFilter(
            ContextCompat.getColor(
                requireContext(),
                android.R.color.white
            )
        )

        listOfNotesOnRubob[listOfNotesOnRubob.size - 40].visibility = View.INVISIBLE
        if (isStartFirstTrack) {
            cl_doloncha1.visibility = View.VISIBLE
            cl_doloncha2.visibility = View.INVISIBLE
            cl_doloncha3.visibility = View.INVISIBLE

            if (isPlaying) {
                cl_doloncha1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
                cl_doloncha2.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
                cl_doloncha3.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            }

            isStartFirstTrack = false
        }

        isPlaying = true
        for (i in count until songsList.size - 39) {
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
                    nested_scroll_doloncha_1.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_doloncha_1.smoothScrollTo(0, nested_scroll_doloncha_1.top)

                    }
                }

                if (i == 10) {
                    Log.d("playsong", "playTackt2: smooth1")
                    nested_scroll_doloncha_1.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_doloncha_1.smoothScrollTo(0, nested_scroll_doloncha_1.bottom)

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
//            count = 0

        }


    }

    private fun animateBg(imageView: ImageView, songsList:Long) {
        val animator = ValueAnimator.ofFloat(0.7f, 1f)
        animator.addUpdateListener {
            imageView.alpha = it.animatedValue as Float
        }
        animator.duration = songsList
        animator.start()
    }

    private suspend fun playTackt2(songsList: List<Doloncha>,
                                   listOfNotsImages: List<ImageView>,
                                   listOfNotesOnRubob: List<ImageView>)
    {

        listOfNotsImages[listOfNotsImages.size - 15].setColorFilter(
            ContextCompat.getColor(
                requireContext(),
                android.R.color.white
            )
        )

        listOfNotesOnRubob[listOfNotesOnRubob.size - 15].visibility = View.INVISIBLE

        if (isStartSecondTrack) {
            cl_doloncha1.visibility = View.INVISIBLE
            cl_doloncha2.visibility = View.VISIBLE
            cl_doloncha3.visibility = View.INVISIBLE
            cl_doloncha1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            cl_doloncha2.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
            cl_doloncha3.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            isStartSecondTrack = false
        }

        for (i in count until songsList.size - 14) {
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

                if (i == 21)
                {
                    nested_scroll_doloncha_2.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_doloncha_2.smoothScrollTo(0, nested_scroll_doloncha_2.top)

                    }
                }

                if (i == 30) {
                    Log.d("playsong", "playTackt2: smooth1")
                    nested_scroll_doloncha_2.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_doloncha_2.smoothScrollTo(0, nested_scroll_doloncha_2.bottom)

                    }
                }

                if (i == songsList.size - 39) {

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

                } else if (i < songs_list.size - 14) {
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

                } else if (i == songsList.size - 14) {
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

                    nested_scroll_doloncha_2.smoothScrollTo(0, nested_scroll_doloncha_2.top)

                }

                delay(songs_list[i].time)
            } catch (e: Exception) {
                mediaPlayer.stop()
            }


        }

    }



    private suspend fun playTackt3(songsList: List<Doloncha>,
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


            cl_doloncha1.visibility = View.INVISIBLE
            cl_doloncha2.visibility = View.INVISIBLE
            cl_doloncha3.visibility = View.VISIBLE
            cl_doloncha1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            cl_doloncha2.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            cl_doloncha3.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)




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

                if (i == 45)
                {


                    nested_scroll_doloncha_3.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_doloncha_3.smoothScrollTo(0, nested_scroll_doloncha_3.top)

                    }
                }

                if (i == 50) {
                    Log.d("playsong", "playTackt2: smooth1")
                    nested_scroll_doloncha_3.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_doloncha_3.smoothScrollTo(0, nested_scroll_doloncha_3.bottom)

                    }
                }


                if (i == songsList.size - 14) {

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