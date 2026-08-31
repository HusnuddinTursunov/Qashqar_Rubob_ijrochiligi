package com.raqamlidunyo.qashqarrubob.ui.rules

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.OptIn
import androidx.fragment.app.Fragment
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import com.google.android.material.card.MaterialCardView
import com.raqamlidunyo.qashqarrubob.R

@OptIn(UnstableApi::class)
class RulesFragment : Fragment() {

    private lateinit var exoPlayer_1: PlayerView
    private lateinit var exoPlayer_2: PlayerView
    private lateinit var mcv_video_player_1: MaterialCardView
    private lateinit var mcv_video_player_2: MaterialCardView
    private lateinit var imv_play_video_1: ImageView
    private lateinit var imv_play_video_2: ImageView
    private lateinit var simpleExoPlayer_1: ExoPlayer
    private lateinit var simpleExoPlayer_2: ExoPlayer

    private val video = "file:///android_asset/Qo’l bilan tutish holati.mp4"
    private val video_2 = "file:///android_asset/Ko’krak qafasida tutish.mp4"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
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

        simpleExoPlayer_1 = ExoPlayer.Builder(requireContext()).build()
        simpleExoPlayer_2 = ExoPlayer.Builder(requireContext()).build()

        simpleExoPlayer_1.repeatMode = Player.REPEAT_MODE_ONE
        simpleExoPlayer_2.repeatMode = Player.REPEAT_MODE_ONE

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

        prepare(simpleExoPlayer_1, video_2)
        prepare(simpleExoPlayer_2, video)
    }

    private fun prepare(player: ExoPlayer, videoUri: String) {
        player.setMediaItem(MediaItem.fromUri(Uri.parse(videoUri)))
        player.prepare()
        player.playWhenReady = false
    }

    override fun onPause() {
        super.onPause()
        simpleExoPlayer_1.playWhenReady = false
        simpleExoPlayer_2.playWhenReady = false
        imv_play_video_1.visibility = View.VISIBLE
        imv_play_video_2.visibility = View.VISIBLE
    }

    override fun onDestroyView() {
        super.onDestroyView()
        exoPlayer_1.player = null
        exoPlayer_2.player = null
        simpleExoPlayer_1.release()
        simpleExoPlayer_2.release()
    }
}
