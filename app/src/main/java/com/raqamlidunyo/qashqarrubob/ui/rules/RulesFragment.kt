package com.raqamlidunyo.qashqarrubob.ui.rules

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.raqamlidunyo.qashqarrubob.R
import com.google.android.exoplayer2.ExoPlayerFactory
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.source.ExtractorMediaSource
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector
import com.google.android.exoplayer2.ui.SimpleExoPlayerView
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util
import com.google.android.material.card.MaterialCardView

class RulesFragment : Fragment() {

    private lateinit var exoPlayer_1: SimpleExoPlayerView
    private lateinit var exoPlayer_2: SimpleExoPlayerView
    private lateinit var mcv_video_player_1: MaterialCardView
    private lateinit var mcv_video_player_2: MaterialCardView
    private lateinit var imv_play_video_1: ImageView
    private lateinit var imv_play_video_2: ImageView
    private lateinit var simpleExoPlayer_1: SimpleExoPlayer
    private lateinit var simpleExoPlayer_2: SimpleExoPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rules, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mcv_video_player_1 = view.findViewById(R.id.mcv_video_player_1)
        mcv_video_player_2 = view.findViewById(R.id.mcv_video_player_2)
        exoPlayer_1 = view.findViewById(R.id.video_player_1)
        exoPlayer_2 = view.findViewById(R.id.video_player_2)
        imv_play_video_1 = view.findViewById(R.id.imv_video_play_1)
        imv_play_video_2 = view.findViewById(R.id.imv_video_play_2)

        val trackerSelector = DefaultTrackSelector()
        simpleExoPlayer_1 = ExoPlayerFactory.newSimpleInstance(view.context, trackerSelector)
        simpleExoPlayer_2 = ExoPlayerFactory.newSimpleInstance(view.context, trackerSelector)

        exoPlayer_1.player = simpleExoPlayer_1
        exoPlayer_1.useController = false

        exoPlayer_2.player = simpleExoPlayer_2
        exoPlayer_2.useController = false


        mcv_video_player_1.setOnClickListener {
            if (simpleExoPlayer_1.playWhenReady) {
                simpleExoPlayer_1.playWhenReady = false
                imv_play_video_1.visibility = View.VISIBLE
            } else {
                simpleExoPlayer_1.playWhenReady = true
                simpleExoPlayer_2.playWhenReady = false
                imv_play_video_1.visibility = View.INVISIBLE
                imv_play_video_2.visibility = View.VISIBLE

            }
        }

        mcv_video_player_2.setOnClickListener {

            if (simpleExoPlayer_2.playWhenReady) {
                simpleExoPlayer_2.playWhenReady = false
                imv_play_video_2.visibility = View.VISIBLE
            } else {
                simpleExoPlayer_2.playWhenReady = true
                simpleExoPlayer_1.playWhenReady = false
                imv_play_video_2.visibility = View.INVISIBLE
                imv_play_video_1.visibility = View.VISIBLE


            }
        }

        simpleExoPlayer_1.addListener(object : Player.DefaultEventListener(){
            override fun onPlayerStateChanged(playWhenReady: Boolean, playbackState: Int) {
                super.onPlayerStateChanged(playWhenReady, playbackState)
                when(playbackState)
                {
                    Player.STATE_ENDED ->{
                        simpleExoPlayer_1.seekTo(0)
                    }
                }
            }
        })

        simpleExoPlayer_2.addListener(object : Player.DefaultEventListener(){
            override fun onPlayerStateChanged(playWhenReady: Boolean, playbackState: Int) {
                super.onPlayerStateChanged(playWhenReady, playbackState)
                when(playbackState)
                {
                    Player.STATE_ENDED ->{
                        simpleExoPlayer_2.seekTo(0)
                    }
                }
            }
        })


        val video = "file:///android_asset/Qo’l bilan tutish holati.mp4"
        val video_2 = "file:///android_asset/Ko’krak qafasida tutish.mp4"
        val url =
            "https://go.wootly.ch/dash?source=web&id=939515a74959c481bbc1d171edf4f293b6bfe58c&sig=qFmC72AVJVNtPt-nGTcZDg&expire=1668669698&ofs=12&usr=115875"


        playVideos(simpleExoPlayer_1, video_2)
        playVideos(simpleExoPlayer_2, video)
    }

    private fun playVideos(simpleExoPlayer: SimpleExoPlayer?, video: String) {
        val dataSourceFactory =
            DefaultDataSourceFactory(view?.context, Util.getUserAgent(view?.context, "VideoName"))
        val mediaSource =
            ExtractorMediaSource.Factory(dataSourceFactory).createMediaSource(Uri.parse(video)  )
        simpleExoPlayer?.prepare(mediaSource)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        simpleExoPlayer_1.playWhenReady = false
        simpleExoPlayer_2.playWhenReady = false
        Log.d("Rules", "onDestroyView: ")
    }


}