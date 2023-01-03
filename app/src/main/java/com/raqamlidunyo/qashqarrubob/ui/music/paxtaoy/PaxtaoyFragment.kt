package com.raqamlidunyo.qashqarrubob.ui.music.paxtaoy

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
import com.raqamlidunyo.qashqarrubob.ui.music.paxtaoy.model.Paxtaoy
import com.raqamlidunyo.qashqarrubob.ui.music.paxtaoy.util.PaxtaoyUtil
import com.google.android.material.button.MaterialButton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class PaxtaoyFragment : Fragment() {

    private lateinit var play_button: MaterialButton
    private lateinit var mediaPlayer: MediaPlayer

    private lateinit var cl_not1: ConstraintLayout
    private lateinit var cl_not2: ConstraintLayout


    private lateinit var paxtaoy_1_re_1_aktava: ImageView
    private lateinit var paxtaoy_1_re_2_aktava: ImageView
    private lateinit var paxtaoy_1_sol_1_aktava: ImageView
    private lateinit var paxtaoy_1_sol_2_aktava: ImageView
    private lateinit var paxtaoy_1_fa_1_aktava: ImageView
    private lateinit var paxtaoy_1_fa_2_aktava: ImageView
    private lateinit var paxtaoy_1_sol_3_aktava: ImageView
    private lateinit var paxtaoy_1_mi_1_aktava: ImageView
    private lateinit var paxtaoy_1_fa_3_aktava: ImageView
    private lateinit var paxtaoy_1_sol_4_aktava: ImageView
    private lateinit var paxtaoy_1_lya_1_aktava: ImageView
    private lateinit var paxtaoy_1_lya_2_aktava: ImageView
    private lateinit var paxtaoy_1_lya_3_aktava: ImageView
    private lateinit var paxtaoy_1_sol_5_aktava: ImageView
    private lateinit var paxtaoy_1_si_1_aktava: ImageView
    private lateinit var paxtaoy_1_lya_4_aktava: ImageView


    private lateinit var paxtaoy_2_re_1_aktava: ImageView
    private lateinit var paxtaoy_2_re_2_aktava: ImageView
    private lateinit var paxtaoy_2_sol_1_aktava: ImageView
    private lateinit var paxtaoy_2_sol_2_aktava: ImageView
    private lateinit var paxtaoy_2_fa_1_aktava: ImageView
    private lateinit var paxtaoy_2_fa_2_aktava: ImageView
    private lateinit var paxtaoy_2_sol_3_aktava: ImageView
    private lateinit var paxtaoy_2_mi_1_aktava: ImageView
    private lateinit var paxtaoy_2_fa_3_aktava: ImageView
    private lateinit var paxtaoy_2_sol_4_aktava: ImageView
    private lateinit var paxtaoy_2_lya_1_aktava: ImageView
    private lateinit var paxtaoy_2_lya_2_aktava: ImageView
    private lateinit var paxtaoy_2_lya_3_aktava: ImageView
    private lateinit var paxtaoy_2_sol_5_aktava: ImageView
    private lateinit var paxtaoy_2_si_1_aktava: ImageView
    private lateinit var paxtaoy_2_lya_4_aktava: ImageView
    private lateinit var paxtaoy_2_re_4_aktava: ImageView


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

    private lateinit var list_of_nots_images: List<ImageView>
    private lateinit var list_of_notes_on_rubob: List<ImageView>
    private lateinit var songs_list: List<Paxtaoy>

    private var isClickButton: Boolean = false
    private var count = 0
    private var main_count = 0

    private var isPlaying: Boolean = false
    private var isFinishFirstTrack = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_paxtaoy, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        play_button = view.findViewById(R.id.mtb_play_button)

        cl_not1 = view.findViewById(R.id.cl_paxtaoy_1)
        cl_not2 = view.findViewById(R.id.cl_paxtaoy_2)

        paxtaoy_1_re_1_aktava = view.findViewById(R.id.paxtaoy_1_re_1_aktava)
        paxtaoy_1_re_2_aktava = view.findViewById(R.id.paxtaoy_1_re_2_aktava)
        paxtaoy_1_sol_1_aktava = view.findViewById(R.id.paxtaoy_1_sol_1_aktava)
        paxtaoy_1_sol_2_aktava = view.findViewById(R.id.paxtaoy_1_sol_2_aktava)
        paxtaoy_1_fa_1_aktava = view.findViewById(R.id.paxtaoy_1_fa_1_aktava)
        paxtaoy_1_fa_2_aktava = view.findViewById(R.id.paxtaoy_1_fa_2_aktava)
        paxtaoy_1_sol_3_aktava = view.findViewById(R.id.paxtaoy_1_sol_3_aktava)
        paxtaoy_1_mi_1_aktava = view.findViewById(R.id.paxtaoy_1_mi_1_aktava)
        paxtaoy_1_fa_3_aktava = view.findViewById(R.id.paxtaoy_1_fa_3_aktava)
        paxtaoy_1_sol_4_aktava = view.findViewById(R.id.paxtaoy_1_sol_4_aktava)
        paxtaoy_1_lya_1_aktava = view.findViewById(R.id.paxtaoy_1_lya_1_aktava)
        paxtaoy_1_lya_2_aktava = view.findViewById(R.id.paxtaoy_1_lya_2_aktava)
        paxtaoy_1_lya_3_aktava = view.findViewById(R.id.paxtaoy_1_lya_3_aktava)
        paxtaoy_1_sol_5_aktava = view.findViewById(R.id.paxtaoy_1_sol_5_aktava)
        paxtaoy_1_si_1_aktava = view.findViewById(R.id.paxtaoy_1_si_1_aktava)
        paxtaoy_1_lya_4_aktava = view.findViewById(R.id.paxtaoy_1_lya_4_aktava)


        paxtaoy_2_re_1_aktava = view.findViewById(R.id.paxtaoy_2_re_1_aktava)
        paxtaoy_2_re_2_aktava = view.findViewById(R.id.paxtaoy_2_re_2_aktava)
        paxtaoy_2_sol_1_aktava = view.findViewById(R.id.paxtaoy_2_sol_1_aktava)
        paxtaoy_2_sol_2_aktava = view.findViewById(R.id.paxtaoy_2_sol_2_aktava)
        paxtaoy_2_fa_1_aktava = view.findViewById(R.id.paxtaoy_2_fa_1_aktava)
        paxtaoy_2_fa_2_aktava = view.findViewById(R.id.paxtaoy_2_fa_2_aktava)
        paxtaoy_2_sol_3_aktava = view.findViewById(R.id.paxtaoy_2_sol_3_aktava)
        paxtaoy_2_mi_1_aktava = view.findViewById(R.id.paxtaoy_2_mi_1_aktava)
        paxtaoy_2_fa_3_aktava = view.findViewById(R.id.paxtaoy_2_fa_3_aktava)
        paxtaoy_2_sol_4_aktava = view.findViewById(R.id.paxtaoy_2_sol_4_aktava)
        paxtaoy_2_lya_1_aktava = view.findViewById(R.id.paxtaoy_2_lya_1_aktava)
        paxtaoy_2_lya_2_aktava = view.findViewById(R.id.paxtaoy_2_lya_2_aktava)
        paxtaoy_2_lya_3_aktava = view.findViewById(R.id.paxtaoy_2_lya_3_aktava)
        paxtaoy_2_sol_5_aktava = view.findViewById(R.id.paxtaoy_2_sol_5_aktava)
        paxtaoy_2_si_1_aktava = view.findViewById(R.id.paxtaoy_2_si_1_aktava)
        paxtaoy_2_lya_4_aktava = view.findViewById(R.id.paxtaoy_2_lya_4_aktava)
        paxtaoy_2_re_4_aktava = view.findViewById(R.id.paxtaoy_2_re_4_aktava)




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

        list_of_nots_images = listOf(
            paxtaoy_1_re_1_aktava,
            paxtaoy_1_re_2_aktava,
            paxtaoy_1_sol_1_aktava,
            paxtaoy_1_sol_2_aktava,
            paxtaoy_1_fa_1_aktava,
            paxtaoy_1_fa_2_aktava,
            paxtaoy_1_sol_3_aktava,
            paxtaoy_1_mi_1_aktava,
            paxtaoy_1_fa_3_aktava,
            paxtaoy_1_sol_4_aktava,
            paxtaoy_1_lya_1_aktava,
            paxtaoy_1_lya_2_aktava,
            paxtaoy_1_lya_3_aktava,
            paxtaoy_1_sol_5_aktava,
            paxtaoy_1_si_1_aktava,
            paxtaoy_1_lya_4_aktava,

            paxtaoy_2_re_1_aktava,
            paxtaoy_2_re_2_aktava,
            paxtaoy_2_sol_1_aktava,
            paxtaoy_2_sol_2_aktava,
            paxtaoy_2_fa_1_aktava,
            paxtaoy_2_fa_2_aktava,
            paxtaoy_2_sol_3_aktava,
            paxtaoy_2_mi_1_aktava,
            paxtaoy_2_fa_3_aktava,
            paxtaoy_2_sol_4_aktava,
            paxtaoy_2_lya_1_aktava,
            paxtaoy_2_lya_2_aktava,
            paxtaoy_2_lya_3_aktava,
            paxtaoy_2_sol_5_aktava,
            paxtaoy_2_si_1_aktava,
            paxtaoy_2_lya_4_aktava,
            paxtaoy_2_re_4_aktava

        )

        list_of_notes_on_rubob = listOf(
            lya_1_re_1,
            lya_1_re_1,
            lya_1_sol_1,
            lya_1_sol_1,
            lya_1_fa_1_diyez,
            lya_1_fa_1_diyez,
            lya_1_sol_1,
            lya_1_mi_1,
            lya_1_fa_1_diyez,
            lya_1_sol_1,
            lya_1_lya_1,
            lya_1_lya_1,
            lya_1_lya_1,
            lya_1_sol_1,
            lya_1_si_2,
            lya_1_lya_1,

            lya_1_si_2,
            lya_1_si_2,
            lya_1_sol_1,
            lya_1_sol_1,
            lya_1_lya_1,
            lya_1_lya_1,
            lya_1_sol_1,
            lya_1_fa_1_diyez,
            lya_1_mi_1,
            lya_1_mi_1,
            lya_1_lya_1,
            lya_1_sol_1,
            lya_1_fa_1_diyez,
            lya_1_sol_1,
            lya_1_fa_1_diyez,
            lya_1_mi_1,
            lya_1_re_1
        )

        songs_list = PaxtaoyUtil.paxtaoyList()



        play_button.setOnClickListener {

            val scope = CoroutineScope(Dispatchers.Main)
            scope.launch {
                try {
                    playFirstTor(songs_list, list_of_nots_images, list_of_notes_on_rubob)
                } catch (e: Exception) {
                }
            }
        }

    }

    private suspend fun playFirstTor(
        songsList: List<Paxtaoy>,
        listOfNotsImages: List<ImageView>,
        listOfNotesOnRubob: List<ImageView>
    ) {

        if (!isClickButton) {
            isClickButton = true
            play_button.setIconResource(R.drawable.ic_pause)
            play_button.text = "Pause"

        } else {
            isClickButton = false
            play_button.setIconResource(R.drawable.icon_play)
            play_button.text = "Play"

        }

        for (j in main_count..3)
        {
            Log.d("playsong", "playFirstTor: ${main_count}")
            if (!isClickButton)
            {
                break
            }
            if ((count == 0 || (count > 0 && count < 17)) && j < 2) {
                playTackt1(songsList, listOfNotsImages, listOfNotesOnRubob)
                if (count == 16 && j != 1) {
                    main_count = 1
                    count = 0

                }

                if (count == 16 && j == 1)
                {
                    count = 16
                    main_count = 2
                }
            }
            else{
                if (main_count >= 2) {
                    playTackt2(songsList, listOfNotsImages, listOfNotesOnRubob)
                    if (count == songsList.size && j != 3)
                    {
                        main_count = 3
                        count = 16

                    }
                    Log.d("playsong", "count: ${count} size: ${songsList.size}")
                    if (count == songsList.size && j == 3)
                    {
                        Log.d("playsong", "count: ${count} size: ${songsList.size}")

                        count = 0
                        main_count = 0
                        isClickButton = false
                        Log.d("playsong", "count: ${count} size: ${songsList.size} click: ${isClickButton}")


                    }
                }

            }
        }




        play_button.isEnabled = true
    }


    private suspend fun playTackt1(
        songsList: List<Paxtaoy>,
        listOfNotsImages: List<ImageView>,
        listOfNotesOnRubob: List<ImageView>
    ) {

        listOfNotsImages[listOfNotsImages.size - 18].setColorFilter(
            ContextCompat.getColor(
                requireContext(),
                android.R.color.white
            )
        )

        listOfNotesOnRubob[listOfNotesOnRubob.size - 18].visibility = View.INVISIBLE
        cl_not1.visibility = View.VISIBLE
        cl_not2.visibility = View.INVISIBLE
        if (isPlaying) {
            cl_not1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
            cl_not2.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
        }
        isPlaying = true
        for (i in count until songsList.size - 17) {
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
                if (i == 0) {
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

                } else if (i < songs_list.size - 1) {
                    listOfNotsImages[i - 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )
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
                    listOfNotesOnRubob[i].visibility = View.VISIBLE
                    listOfNotesOnRubob[i].startAnimation(
                        AnimationUtils.loadAnimation(
                            requireContext(),
                            R.anim.fade_in_not
                        )
                    )
                    listOfNotesOnRubob[i + 1].visibility = View.INVISIBLE

                } else if (i == songsList.size - 1) {

                    listOfNotsImages[i - 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )
                    listOfNotsImages[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )

                    listOfNotesOnRubob[i - 1].visibility = View.INVISIBLE
                    listOfNotesOnRubob[i].visibility = View.VISIBLE
                    listOfNotesOnRubob[i].startAnimation(
                        AnimationUtils.loadAnimation(
                            requireContext(),
                            R.anim.fade_in_not
                        )
                    )
                }

                delay(songs_list[i].time)
            } catch (e: Exception) {
                mediaPlayer.stop()
            }
//            count = 0

        }


    }

    private suspend fun playTackt2(songsList: List<Paxtaoy>,
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

        cl_not1.visibility = View.INVISIBLE
        cl_not2.visibility = View.VISIBLE
        cl_not1.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
        cl_not2.animation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)

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
                if (i == songsList.size - 17) {
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

                } else if (i < songs_list.size - 1) {
                    listOfNotsImages[i - 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )
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
                    listOfNotesOnRubob[i].visibility = View.VISIBLE
                    listOfNotesOnRubob[i].startAnimation(
                        AnimationUtils.loadAnimation(
                            requireContext(),
                            R.anim.fade_in_not
                        )
                    )
                    listOfNotesOnRubob[i + 1].visibility = View.INVISIBLE

                } else if (i == songsList.size - 1) {
                    listOfNotsImages[i - 1].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.white
                        )
                    )
                    listOfNotsImages[i].setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            android.R.color.holo_red_light
                        )
                    )

                    listOfNotesOnRubob[i - 1].visibility = View.INVISIBLE
                    listOfNotesOnRubob[i].visibility = View.VISIBLE
                    listOfNotesOnRubob[i].startAnimation(
                        AnimationUtils.loadAnimation(
                            requireContext(),
                            R.anim.fade_in_not
                        )
                    )
                }

                delay(songs_list[i].time)
            } catch (e: Exception) {
                mediaPlayer.stop()
            }


        }

    }


}