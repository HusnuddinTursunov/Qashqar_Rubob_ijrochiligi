package com.raqamlidunyo.qashqarrubob.ui.music.andijon_polka

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
import com.raqamlidunyo.qashqarrubob.ui.music.andijon_polka.model.AndijonPolka
import com.raqamlidunyo.qashqarrubob.ui.music.andijon_polka.util.AndijonPolkaUtil
import com.google.android.material.button.MaterialButton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class AndijonPolkaFragment : Fragment() {

    private lateinit var play_button: MaterialButton
    private lateinit var mediaPlayer: MediaPlayer

    private lateinit var cl_andijon_polka_1: ConstraintLayout
    private lateinit var cl_andijon_polka_2: ConstraintLayout
    private lateinit var cl_andijon_polka_3: ConstraintLayout
    private lateinit var nested_scroll_andijon_polka_1: NestedScrollView
    private lateinit var nested_scroll_andijon_polka_2: NestedScrollView
    private lateinit var nested_scroll_andijon_polka_3: NestedScrollView

    private lateinit var view_line_rubob_1:View

    private lateinit var andijon_polka_1_re_1: ImageView
    private lateinit var andijon_polka_1_do_1: ImageView
    private lateinit var andijon_polka_1_re_2: ImageView
    private lateinit var andijon_polka_1_re_3: ImageView
    private lateinit var andijon_polka_1_lya_1: ImageView
    private lateinit var andijon_polka_1_lya_2: ImageView
    private lateinit var andijon_polka_1_re_4: ImageView
    private lateinit var andijon_polka_1_re_5: ImageView
    private lateinit var andijon_polka_1_do_2: ImageView
    private lateinit var andijon_polka_1_do_3: ImageView
    private lateinit var andijon_polka_1_mi_1: ImageView
    private lateinit var andijon_polka_1_re_6: ImageView
    private lateinit var andijon_polka_1_re_7: ImageView
    private lateinit var andijon_polka_1_lya_3: ImageView
    private lateinit var andijon_polka_1_lya_4: ImageView

    private lateinit var andijon_polka_2_fa_1: ImageView
    private lateinit var andijon_polka_2_fa_2: ImageView
    private lateinit var andijon_polka_2_sol_1: ImageView
    private lateinit var andijon_polka_2_fa_3: ImageView
    private lateinit var andijon_polka_2_mi_1: ImageView
    private lateinit var andijon_polka_2_re_1: ImageView
    private lateinit var andijon_polka_2_mi_2: ImageView
    private lateinit var andijon_polka_2_mi_3: ImageView
    private lateinit var andijon_polka_2_fa_4: ImageView
    private lateinit var andijon_polka_2_mi_4: ImageView
    private lateinit var andijon_polka_2_re_2: ImageView
    private lateinit var andijon_polka_2_do_1: ImageView


    private lateinit var andijon_polka_3_fa_1: ImageView
    private lateinit var andijon_polka_3_fa_2: ImageView
    private lateinit var andijon_polka_3_sol_1: ImageView
    private lateinit var andijon_polka_3_fa_3: ImageView
    private lateinit var andijon_polka_3_mi_1: ImageView
    private lateinit var andijon_polka_3_re_1: ImageView
    private lateinit var andijon_polka_3_mi_2: ImageView
    private lateinit var andijon_polka_3_mi_3: ImageView
    private lateinit var andijon_polka_3_fa_4: ImageView
    private lateinit var andijon_polka_3_mi_4: ImageView
    private lateinit var andijon_polka_3_re_2: ImageView
    private lateinit var andijon_polka_3_mi_5: ImageView

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
    private lateinit var songs_list: List<AndijonPolka>

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
        return inflater.inflate(R.layout.fragment_andijon_polka, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cl_andijon_polka_1 = view.findViewById(R.id.cl_andijon_polka_1)
        cl_andijon_polka_2 = view.findViewById(R.id.cl_andijon_polka_2)
        cl_andijon_polka_3 = view.findViewById(R.id.cl_andijon_polka_3)
        nested_scroll_andijon_polka_1 = view.findViewById(R.id.nested_andijon_polka_1)
        nested_scroll_andijon_polka_2 = view.findViewById(R.id.nested_andijon_polka_2)
        nested_scroll_andijon_polka_3 = view.findViewById(R.id.nested_andijon_polka_3)

        view_line_rubob_1 = view.findViewById(R.id.view_line_rubob_1)

        andijon_polka_1_re_1 = view.findViewById(R.id.andijon_polka_1_re_1)
        andijon_polka_1_do_1 = view.findViewById(R.id.andijon_polka_1_do_1)
        andijon_polka_1_re_2 = view.findViewById(R.id.andijon_polka_1_re_2)
        andijon_polka_1_re_3 = view.findViewById(R.id.andijon_polka_1_re_3)
        andijon_polka_1_lya_1 = view.findViewById(R.id.andijon_polka_1_lya_1)
        andijon_polka_1_lya_2 = view.findViewById(R.id.andijon_polka_1_lya_2)
        andijon_polka_1_re_4 = view.findViewById(R.id.andijon_polka_1_re_4)
        andijon_polka_1_re_5 = view.findViewById(R.id.andijon_polka_1_re_5)
        andijon_polka_1_do_2 = view.findViewById(R.id.andijon_polka_1_do_2)
        andijon_polka_1_do_3 = view.findViewById(R.id.andijon_polka_1_do_3)
        andijon_polka_1_mi_1 = view.findViewById(R.id.andijon_polka_1_mi_1)
        andijon_polka_1_re_6 = view.findViewById(R.id.andijon_polka_1_re_6)
        andijon_polka_1_re_7 = view.findViewById(R.id.andijon_polka_1_re_7)
        andijon_polka_1_lya_3 = view.findViewById(R.id.andijon_polka_1_lya_3)
        andijon_polka_1_lya_4 = view.findViewById(R.id.andijon_polka_1_lya_4)

        andijon_polka_2_fa_1 = view.findViewById(R.id.andijon_polka_2_fa_1)
        andijon_polka_2_fa_2 = view.findViewById(R.id.andijon_polka_2_fa_2)
        andijon_polka_2_sol_1 = view.findViewById(R.id.andijon_polka_2_sol_1)
        andijon_polka_2_fa_3 = view.findViewById(R.id.andijon_polka_2_fa_3)
        andijon_polka_2_mi_1 = view.findViewById(R.id.andijon_polka_2_mi_1)
        andijon_polka_2_re_1 = view.findViewById(R.id.andijon_polka_2_re_1)
        andijon_polka_2_mi_2 = view.findViewById(R.id.andijon_polka_2_mi_2)
        andijon_polka_2_mi_3 = view.findViewById(R.id.andijon_polka_2_mi_3)
        andijon_polka_2_fa_4 = view.findViewById(R.id.andijon_polka_2_fa_4)
        andijon_polka_2_mi_4 = view.findViewById(R.id.andijon_polka_2_mi_4)
        andijon_polka_2_re_2 = view.findViewById(R.id.andijon_polka_2_re_2)
        andijon_polka_2_do_1 = view.findViewById(R.id.andijon_polka_2_do_1)


        andijon_polka_3_fa_1 = view.findViewById(R.id.andijon_polka_3_fa_1)
        andijon_polka_3_fa_2 = view.findViewById(R.id.andijon_polka_3_fa_2)
        andijon_polka_3_sol_1 = view.findViewById(R.id.andijon_polka_3_sol_1)
        andijon_polka_3_fa_3 = view.findViewById(R.id.andijon_polka_3_fa_3)
        andijon_polka_3_mi_1 = view.findViewById(R.id.andijon_polka_3_mi_1)
        andijon_polka_3_re_1 = view.findViewById(R.id.andijon_polka_3_re_1)
        andijon_polka_3_mi_2 = view.findViewById(R.id.andijon_polka_3_mi_2)
        andijon_polka_3_mi_3 = view.findViewById(R.id.andijon_polka_3_mi_3)
        andijon_polka_3_fa_4 = view.findViewById(R.id.andijon_polka_3_fa_4)
        andijon_polka_3_mi_4 = view.findViewById(R.id.andijon_polka_3_mi_4)
        andijon_polka_3_re_2 = view.findViewById(R.id.andijon_polka_3_re_2)
        andijon_polka_3_mi_5 = view.findViewById(R.id.andijon_polka_3_mi_5)

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
            andijon_polka_1_re_1,
            andijon_polka_1_do_1,
            andijon_polka_1_re_2,
            andijon_polka_1_re_3,
            andijon_polka_1_lya_1,
            andijon_polka_1_lya_2,
            andijon_polka_1_re_4,
            andijon_polka_1_re_5,
            andijon_polka_1_do_2,
            andijon_polka_1_do_3,
            andijon_polka_1_mi_1,
            andijon_polka_1_re_6,
            andijon_polka_1_re_7,
            andijon_polka_1_lya_3,
            andijon_polka_1_lya_4,

            andijon_polka_2_fa_1,
            andijon_polka_2_fa_2,
            andijon_polka_2_sol_1,
            andijon_polka_2_fa_3,
            andijon_polka_2_mi_1,
            andijon_polka_2_re_1,
            andijon_polka_2_mi_2,
            andijon_polka_2_mi_3,
            andijon_polka_2_fa_4,
            andijon_polka_2_mi_4,
            andijon_polka_2_re_2,
            andijon_polka_2_do_1,

            andijon_polka_3_fa_1,
            andijon_polka_3_fa_2,
            andijon_polka_3_sol_1,
            andijon_polka_3_fa_3,
            andijon_polka_3_mi_1,
            andijon_polka_3_re_1,
            andijon_polka_3_mi_2,
            andijon_polka_3_mi_3,
            andijon_polka_3_fa_4,
            andijon_polka_3_mi_4,
            andijon_polka_3_re_2,
            andijon_polka_3_mi_5
        )

        list_of_rubob_notes = listOf(
            lya_1_re_1,
            lya_1_do_1_diyez,
            lya_1_re_1,
            lya_1_re_1,
            lya_1_lya_1,
            lya_1_lya_1,
            lya_1_re_1,
            lya_1_re_1,
            lya_1_do_1_diyez,
            lya_1_do_1_diyez,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_re_1,
            lya_1_lya_1,
            lya_1_lya_1,

            lya_1_fa_1_diyez,
            lya_1_fa_1_diyez,
            lya_1_sol_1,
            lya_1_fa_1_diyez,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_mi_1,
            lya_1_mi_1,
            lya_1_fa_1_diyez,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_do_1_diyez,

            lya_1_fa_1_diyez,
            lya_1_fa_1_diyez,
            lya_1_sol_1,
            lya_1_fa_1_diyez,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_mi_1,
            lya_1_mi_1,
            lya_1_fa_1_diyez,
            lya_1_mi_1,
            lya_1_re_1,
            lya_1_mi_1,
        )

        songs_list = AndijonPolkaUtil.andijonPolkaList()

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
        songsList: List<AndijonPolka>,
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

        for (j in main_count..5)
        {
            Log.d("playsong", "playFirstTor: ${main_count}")
            if (!isClickButton)
            {
                break
            }
            if ((count == 0 || (count > 0 && count < 15)) && j < 2) {
                playTackt1(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 15 && j != 1) {
                    main_count = 1
                    count = 0

                }

                if (count == 15 && j == 1)
                {
                    isStartSecondTrack = true
                    count = 15
                    main_count = 2
                }
            }

            else if ((count == 15 || (count > 15 && count < 27)) && (j < 3))
            {

                playTackt2(songsList, listOfNotsImages, listOfNotesOnRubob)
                main_count = 2

            }
            else if ((count == 27 || (count > 27 && count < songsList.size)) && (j < 4))
            {
                playTackt3(songsList, listOfNotsImages, listOfNotesOnRubob)
                main_count = 3
                if (count == songsList.size)
                {
                    count = 0
                }

            }
            else if ((count == 0 || (count > 0 && count < 15)) && j < 5)
            {
                if (isStartFirstTrackReturn) {
                    isStartFirstTrack = true
                    isStartSecondTrackReturn = false
                }
                playTackt1(songsList, listOfNotsImages, listOfNotesOnRubob)
                Log.d("playsong", "playFirstTor: ${main_count}")
                main_count = 4
                if (count == 15)
                {
                    count = 0
                }
            }

            else if ((count == 0 || (count > 0 && count < 15)) && j == 5)
            {

                playTackt1(songsList, listOfNotsImages, listOfNotesOnRubob)
                Log.d("playsong", "main: ${main_count}")
                Log.d("playsong", "count: ${count}")
                main_count = 5
                if (count == 15)
                {
                    count = 0
                    main_count = 0
                    isClickButton = false
                    isStartSecondTrack = true
                    isStartThirdTrack = true
                    play_button.text = "Play"
                    play_button.setIconResource(R.drawable.icon_play)
                    Log.d("playsong", "main: ${main_count}")
                    Log.d("playsong", "count: ${count}")
                }
            }





        }


        play_button.isEnabled = true
    }


    private suspend fun playTackt1(
        songsList: List<AndijonPolka>,
        listOfNotsImages: List<ImageView>,
        listOfNotesOnRubob: List<ImageView>
    ) {

        listOfNotsImages[listOfNotsImages.size - 25].setColorFilter(
            ContextCompat.getColor(
                requireContext(),
                android.R.color.white
            )
        )

        listOfNotesOnRubob[listOfNotesOnRubob.size - 25].visibility = View.INVISIBLE
        if (isStartFirstTrack) {
            cl_andijon_polka_1.visibility = View.VISIBLE
            cl_andijon_polka_2.visibility = View.INVISIBLE
            cl_andijon_polka_3.visibility = View.INVISIBLE

            if (isPlaying) {
                cl_andijon_polka_1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
                cl_andijon_polka_2.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            }

            isStartFirstTrack = false
        }

        isPlaying = true
        for (i in count until songsList.size - 24) {
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
                    nested_scroll_andijon_polka_1.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_andijon_polka_1.smoothScrollTo(0, nested_scroll_andijon_polka_1.top)

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

                } else if (i < songs_list.size - 24) {

                    if (i == 7)
                    {
                        nested_scroll_andijon_polka_1.post {
                            nested_scroll_andijon_polka_1.smoothScrollTo(0, nested_scroll_andijon_polka_1.bottom)
                        }
                    }

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

                } else if (i == songsList.size - 24) {

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

    private suspend fun playTackt2(songsList: List<AndijonPolka>,
                                   listOfNotsImages: List<ImageView>,
                                   listOfNotesOnRubob: List<ImageView>)
    {

        listOfNotsImages[listOfNotsImages.size - 12].setColorFilter(
            ContextCompat.getColor(
                requireContext(),
                android.R.color.white
            )
        )

        listOfNotesOnRubob[listOfNotesOnRubob.size - 12].visibility = View.INVISIBLE

        if (isStartSecondTrack) {
            cl_andijon_polka_1.visibility = View.INVISIBLE
            cl_andijon_polka_2.visibility = View.VISIBLE
            cl_andijon_polka_3.visibility = View.INVISIBLE
            cl_andijon_polka_1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            cl_andijon_polka_2.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
            cl_andijon_polka_3.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            isStartSecondTrack = false
        }

        for (i in count until songsList.size - 12) {
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

                if (i == 22) {
                    Log.d("playsong", "playTackt2: smooth1")
                    nested_scroll_andijon_polka_2.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_andijon_polka_2.smoothScrollTo(0, nested_scroll_andijon_polka_2.bottom)

                    }
                }

                if (i == 15) {

                    nested_scroll_andijon_polka_2.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_andijon_polka_2.smoothScrollTo(0, nested_scroll_andijon_polka_2.top)

                    }

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

                } else if (i < songsList.size - 12) {
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

                } else if (i == songsList.size - 12) {
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

                    nested_scroll_andijon_polka_2.smoothScrollTo(0, nested_scroll_andijon_polka_2.top)

                }

                delay(songs_list[i].time)
            } catch (e: Exception) {
                mediaPlayer.stop()
            }


        }

    }

    private suspend fun playTackt3(songsList: List<AndijonPolka>,
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
            cl_andijon_polka_2.visibility = View.INVISIBLE
            cl_andijon_polka_3.visibility = View.VISIBLE
            cl_andijon_polka_2.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
            cl_andijon_polka_3.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
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

                if (i == 28)
                {
                    nested_scroll_andijon_polka_3.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_andijon_polka_3.smoothScrollTo(0, nested_scroll_andijon_polka_3.top)

                    }
                }

                if (i == 33) {
                    Log.d("playsong", "playTackt2: smooth1")
                    nested_scroll_andijon_polka_3.post {
                        Log.d("playsong", "playTackt2: smooth2")
                        nested_scroll_andijon_polka_3.smoothScrollTo(0, nested_scroll_andijon_polka_3.bottom)

                    }
                }


                if (i == songsList.size - 13) {

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

            listOfNotesOnRubob[songsList.size - 1].visibility = View.INVISIBLE
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