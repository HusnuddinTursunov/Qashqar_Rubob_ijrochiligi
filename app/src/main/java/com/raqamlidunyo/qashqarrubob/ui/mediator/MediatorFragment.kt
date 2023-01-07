package com.raqamlidunyo.qashqarrubob.ui.mediator

import android.net.Uri
import android.os.Bundle
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

class MediatorFragment : Fragment() {

    private lateinit var exoPlayer: SimpleExoPlayerView
    private lateinit var mcv_video_player: MaterialCardView
    private lateinit var mcv_shtrix1: MaterialCardView
    private lateinit var mcv_shtrix2: MaterialCardView
    private lateinit var mcv_shtrix3: MaterialCardView
    private lateinit var mcv_shtrix4: MaterialCardView
    private lateinit var mcv_shtrix_up: MaterialCardView
    private lateinit var mcv_shtrix_down: MaterialCardView
    private lateinit var imv_play_video: ImageView
    private lateinit var imv_play_video_2: ImageView
    private lateinit var imv_play_video_3: ImageView
    private lateinit var simpleExoPlayer_1: SimpleExoPlayer
    private lateinit var simpleExoPlayer_2: SimpleExoPlayer
    private lateinit var simpleExoPlayer_3: SimpleExoPlayer
    private lateinit var simpleExoPlayer_4: SimpleExoPlayer
    private lateinit var simpleExoPlayer_5: SimpleExoPlayer
    private lateinit var simpleExoPlayer_6: SimpleExoPlayer
    private var onPlay_1: Boolean = false
    private var onPlay_2: Boolean = false
    private var onPlay_3: Boolean = false
    private var onPlay_4: Boolean = false
    private val video = "file:///android_asset/shtrix1.mp4"
    private val video_2 = "file:///android_asset/shtrix2.mp4"
    private val video_3 = "file:///android_asset/shtrix3.mp4"
    private val video_4 = "file:///android_asset/shtrix4.mp4"
    private val video_up = "file:///android_asset/shtrix_up.mp4"
    private val video_down = "file:///android_asset/shtrix_down.mp4"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mediator, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        exoPlayer = view.findViewById(R.id.video_player)
        mcv_video_player = view.findViewById(R.id.mcv_video_player)
        mcv_shtrix1 = view.findViewById(R.id.shtrix_1)
        mcv_shtrix2 = view.findViewById(R.id.shtrix_2)
        mcv_shtrix3 = view.findViewById(R.id.shtrix_3)
        mcv_shtrix4 = view.findViewById(R.id.shtrix_4)
        mcv_shtrix_up = view.findViewById(R.id.shtrix_up)
        mcv_shtrix_down = view.findViewById(R.id.shtrix_down)

        val trackerSelector = DefaultTrackSelector()
        simpleExoPlayer_1 = ExoPlayerFactory.newSimpleInstance(view.context, trackerSelector)
        simpleExoPlayer_2 = ExoPlayerFactory.newSimpleInstance(view.context, trackerSelector)
        simpleExoPlayer_3 = ExoPlayerFactory.newSimpleInstance(view.context, trackerSelector)
        simpleExoPlayer_4 = ExoPlayerFactory.newSimpleInstance(view.context, trackerSelector)
        simpleExoPlayer_5 = ExoPlayerFactory.newSimpleInstance(view.context, trackerSelector)
        simpleExoPlayer_6 = ExoPlayerFactory.newSimpleInstance(view.context, trackerSelector)

        imv_play_video = view.findViewById(R.id.imv_video_play)

//        playVideos(exoPlayer, simpleExoPlayer_1, video, mcv_video_player)

        mcv_shtrix1.setOnClickListener {
            playVideos(exoPlayer, simpleExoPlayer_1, video, mcv_video_player)
           simpleExoPlayer_2.playWhenReady = false
           simpleExoPlayer_3.playWhenReady = false
           simpleExoPlayer_4.playWhenReady = false
           simpleExoPlayer_5.playWhenReady = false
           simpleExoPlayer_6.playWhenReady = false
        }

        mcv_shtrix2.setOnClickListener {
            playVideos(exoPlayer, simpleExoPlayer_2, video_2, mcv_video_player)
            simpleExoPlayer_1.playWhenReady = false
            simpleExoPlayer_3.playWhenReady = false
            simpleExoPlayer_4.playWhenReady = false
            simpleExoPlayer_5.playWhenReady = false
            simpleExoPlayer_6.playWhenReady = false
        }

        mcv_shtrix3.setOnClickListener {
            playVideos(exoPlayer, simpleExoPlayer_3, video_3, mcv_video_player)
            simpleExoPlayer_2.playWhenReady = false
            simpleExoPlayer_1.playWhenReady = false
            simpleExoPlayer_4.playWhenReady = false
            simpleExoPlayer_5.playWhenReady = false
            simpleExoPlayer_6.playWhenReady = false
        }

        mcv_shtrix4.setOnClickListener {
            playVideos(exoPlayer, simpleExoPlayer_4, video_4, mcv_video_player)
            simpleExoPlayer_2.playWhenReady = false
            simpleExoPlayer_3.playWhenReady = false
            simpleExoPlayer_1.playWhenReady = false
            simpleExoPlayer_5.playWhenReady = false
            simpleExoPlayer_6.playWhenReady = false
        }

        mcv_shtrix_up.setOnClickListener {
            playVideos(exoPlayer, simpleExoPlayer_5, video_up, mcv_video_player)
            simpleExoPlayer_2.playWhenReady = false
            simpleExoPlayer_3.playWhenReady = false
            simpleExoPlayer_1.playWhenReady = false
            simpleExoPlayer_4.playWhenReady = false
            simpleExoPlayer_6.playWhenReady = false
        }

        mcv_shtrix_down.setOnClickListener {
            playVideos(exoPlayer, simpleExoPlayer_6, video_down, mcv_video_player)
            simpleExoPlayer_2.playWhenReady = false
            simpleExoPlayer_3.playWhenReady = false
            simpleExoPlayer_1.playWhenReady = false
            simpleExoPlayer_5.playWhenReady = false
            simpleExoPlayer_4.playWhenReady = false
        }

    }

    private fun playVideos(
        exoPlayer: SimpleExoPlayerView,
        simpleExoPlayer: SimpleExoPlayer?,
        video: String,
        mcv_video_player:MaterialCardView
    ) {
        exoPlayer.player = simpleExoPlayer
        simpleExoPlayer?.playWhenReady = true
        exoPlayer.useController = false
        imv_play_video.visibility = View.INVISIBLE
        val dataSourceFactory =
            DefaultDataSourceFactory(view?.context, Util.getUserAgent(view?.context, "VideoName"))
        val mediaSource =
            ExtractorMediaSource.Factory(dataSourceFactory).createMediaSource(Uri.parse(video))
        simpleExoPlayer?.prepare(mediaSource)

        mcv_video_player.setOnClickListener {

                if (simpleExoPlayer!!.playWhenReady) {
                    simpleExoPlayer.playWhenReady = false
                    imv_play_video.visibility = View.VISIBLE

                } else {
                    simpleExoPlayer.playWhenReady  = true
                    imv_play_video.visibility = View.INVISIBLE

                }

        }

        simpleExoPlayer?.addListener(object : Player.DefaultEventListener(){
            override fun onPlayerStateChanged(playWhenReady: Boolean, playbackState: Int) {
                super.onPlayerStateChanged(playWhenReady, playbackState)
                when(playbackState)
                {
                    Player.STATE_ENDED ->{
                        simpleExoPlayer.seekTo(0)
                    }
                }
            }
        })

    }

//    override fun onStart() {
//        super.onStart()
//        simpleExoPlayer_1.playWhenReady = false
//        simpleExoPlayer_2.playWhenReady = false
//        simpleExoPlayer_3.playWhenReady = false
//        simpleExoPlayer_4.playWhenReady = false
//    }

    override fun onPause() {
        super.onPause()
        simpleExoPlayer_1.playWhenReady = false
        simpleExoPlayer_2.playWhenReady = false
        simpleExoPlayer_3.playWhenReady = false
        simpleExoPlayer_4.playWhenReady = false
        simpleExoPlayer_5.playWhenReady = false
        simpleExoPlayer_6.playWhenReady = false
        imv_play_video.visibility = View.VISIBLE
    }

    override fun onStop() {
        super.onStop()
        simpleExoPlayer_1.playWhenReady = false
        simpleExoPlayer_2.playWhenReady = false
        simpleExoPlayer_3.playWhenReady = false
        simpleExoPlayer_4.playWhenReady = false
        simpleExoPlayer_5.playWhenReady = false
        simpleExoPlayer_6.playWhenReady = false
        imv_play_video.visibility = View.VISIBLE
    }

    override fun onDestroyView() {
        super.onDestroyView()
        simpleExoPlayer_1.playWhenReady = false
        simpleExoPlayer_2.playWhenReady = false
        simpleExoPlayer_3.playWhenReady = false
        simpleExoPlayer_4.playWhenReady = false
        simpleExoPlayer_5.playWhenReady = false
        simpleExoPlayer_6.playWhenReady = false
    }

}