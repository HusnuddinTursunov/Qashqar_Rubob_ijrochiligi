package com.raqamlidunyo.qashqarrubob.ui.splash

import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.raqamlidunyo.qashqarrubob.R
import com.google.android.material.textview.MaterialTextView
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.Runnable


class SplashFragment : Fragment() {

    private lateinit var splashTitle:MaterialTextView
    private lateinit var splashDescription:MaterialTextView
    private lateinit var author_name:MaterialTextView
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var scope: CoroutineScope
    private lateinit var rubob_image:ImageView
    private var isFinish:Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        scope = CoroutineScope(Main)
        splashTitle = view.findViewById(R.id.splash_title)
        splashDescription = view.findViewById(R.id.splash_description)
        author_name = view.findViewById(R.id.author_name)
        rubob_image = view.findViewById(R.id.music_id)
        mediaPlayer = MediaPlayer.create(view.context, R.raw.kirish_orgenal)
        mediaPlayer.start()

        Log.d("playsong", "onViewCreated: ${mediaPlayer.currentPosition}")

        opening()


    }


    private fun opening()
    {


        scope.launch {
            Log.d("playsong", "onViewCreated: ")
            delay(12000)

        }

        splashTitle.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_mainFragment)
        }
        splashTitle.startAnimation(AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in))

        scope.launch {

            object : Runnable{
                override fun run() {

                    Log.d("playsong", "run: ${mediaPlayer.currentPosition}")

                    if (mediaPlayer.currentPosition > 3000 && mediaPlayer.currentPosition < 4000) {
                        splashDescription.alpha = 1f
                        splashDescription.startAnimation(AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in))
                    }

                    if (mediaPlayer.currentPosition > 5000 && mediaPlayer.currentPosition < 6000) {
                        rubob_image.alpha = 1f
                        rubob_image.startAnimation(AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in))
                    }

                    if (mediaPlayer.currentPosition > 6000 && mediaPlayer.currentPosition < 7000) {
                        author_name.alpha = 1f
                        author_name.startAnimation(AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in))
                    }
                    if (mediaPlayer.currentPosition == 11480)
                    {
                        isFinish = true
                        findNavController().navigate(R.id.action_splashFragment_to_mainFragment)

                    }
                    if (!isFinish) {
                        val handler = Handler()
                        handler.postDelayed(this, 1000)
                    }

                }

            }.run()


        }
    }

    override fun onStart() {
        super.onStart()
        mediaPlayer.start()
    }

    override fun onPause() {
        super.onPause()
        mediaPlayer.pause()
    }

    override fun onStop() {
        super.onStop()
        mediaPlayer.pause()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mediaPlayer.stop()
        scope.cancel()
    }
}