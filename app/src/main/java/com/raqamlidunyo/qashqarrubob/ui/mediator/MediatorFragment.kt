package com.raqamlidunyo.qashqarrubob.ui.mediator

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
class MediatorFragment : Fragment() {

    private lateinit var exoPlayer: PlayerView
    private lateinit var mcv_video_player: MaterialCardView
    private lateinit var mcv_shtrix1: MaterialCardView
    private lateinit var mcv_shtrix2: MaterialCardView
    private lateinit var mcv_shtrix3: MaterialCardView
    private lateinit var mcv_shtrix4: MaterialCardView
    private lateinit var mcv_shtrix_up: MaterialCardView
    private lateinit var mcv_shtrix_down: MaterialCardView
    private lateinit var imv_play_video: ImageView

    private val players = mutableListOf<ExoPlayer>()
    private lateinit var simpleExoPlayer_1: ExoPlayer
    private lateinit var simpleExoPlayer_2: ExoPlayer
    private lateinit var simpleExoPlayer_3: ExoPlayer
    private lateinit var simpleExoPlayer_4: ExoPlayer
    private lateinit var simpleExoPlayer_5: ExoPlayer
    private lateinit var simpleExoPlayer_6: ExoPlayer

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
        imv_play_video = view.findViewById(R.id.imv_video_play)

        simpleExoPlayer_1 = newPlayer()
        simpleExoPlayer_2 = newPlayer()
        simpleExoPlayer_3 = newPlayer()
        simpleExoPlayer_4 = newPlayer()
        simpleExoPlayer_5 = newPlayer()
        simpleExoPlayer_6 = newPlayer()

        mcv_shtrix1.setOnClickListener { playOnly(simpleExoPlayer_1, video) }
        mcv_shtrix2.setOnClickListener { playOnly(simpleExoPlayer_2, video_2) }
        mcv_shtrix3.setOnClickListener { playOnly(simpleExoPlayer_3, video_3) }
        mcv_shtrix4.setOnClickListener { playOnly(simpleExoPlayer_4, video_4) }
        mcv_shtrix_up.setOnClickListener { playOnly(simpleExoPlayer_5, video_up) }
        mcv_shtrix_down.setOnClickListener { playOnly(simpleExoPlayer_6, video_down) }
    }

    private fun newPlayer(): ExoPlayer {
        val player = ExoPlayer.Builder(requireContext()).build()
        // Video tugagach boshiga qaytadi (eski seekTo(0) xatti-harakati)
        player.repeatMode = Player.REPEAT_MODE_ONE
        players.add(player)
        return player
    }

    /** Tanlangan pleyerni ijro etadi, qolganlarini to'xtatadi. */
    private fun playOnly(target: ExoPlayer, videoUri: String) {
        players.filter { it !== target }.forEach { it.playWhenReady = false }

        exoPlayer.player = target
        exoPlayer.useController = false
        imv_play_video.visibility = View.INVISIBLE

        if (target.mediaItemCount == 0) {
            target.setMediaItem(MediaItem.fromUri(Uri.parse(videoUri)))
            target.prepare()
        }
        target.playWhenReady = true

        mcv_video_player.setOnClickListener {
            if (target.playWhenReady) {
                target.playWhenReady = false
                imv_play_video.visibility = View.VISIBLE
            } else {
                target.playWhenReady = true
                imv_play_video.visibility = View.INVISIBLE
            }
        }
    }

    private fun pauseAll() {
        players.forEach { it.playWhenReady = false }
    }

    override fun onPause() {
        super.onPause()
        pauseAll()
        imv_play_video.visibility = View.VISIBLE
    }

    override fun onStop() {
        super.onStop()
        pauseAll()
        imv_play_video.visibility = View.VISIBLE
    }

    override fun onDestroyView() {
        super.onDestroyView()
        exoPlayer.player = null
        players.forEach { it.release() }
        players.clear()
    }
}
