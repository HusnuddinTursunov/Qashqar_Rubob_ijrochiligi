package com.raqamlidunyo.qashqarrubob.ui.music.songs.util

import com.raqamlidunyo.qashqarrubob.ui.music.songs.model.Songs

object SongsUtil {

    fun songsList():List<Songs>
    {
        val list = ArrayList<Songs>()
        list.add(Songs("PAXTAOY"))
        list.add(Songs("DO'LONCHA"))
        list.add(Songs("ANDIJON POLKA"))
        list.add(Songs("QASHQARCHA"))
        list.add(Songs("YALLAMA YORIM"))

        return list
    }

}