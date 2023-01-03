package com.raqamlidunyo.qashqarrubob.ui.main.util

import com.raqamlidunyo.qashqarrubob.R
import com.raqamlidunyo.qashqarrubob.ui.main.model.MainModule

object MainUtil {
    fun mainList():List<MainModule>
    {
        val list = ArrayList<MainModule>()
        list.add(MainModule("Ilovadan foydalanish qoidalari", R.drawable.icon_history))
        list.add(MainModule("Cholg’u tarixi,sozlanishi va tuzilishi", R.drawable.read_book_icon))
        list.add(MainModule("Ijro qilish qoidalari", R.drawable.icon_rules))
        list.add(MainModule("Mezrob (Mediator) ni ishlatish", R.drawable.practice_icon))
        list.add(MainModule("Tovushlar joylashuvi", R.drawable.national))
        list.add(MainModule("Ijro mahoratini oshiruvchi mashqlar", R.drawable.icon_help_practice))
        list.add(MainModule("Kuy ijro qilish", R.drawable.song_icon))
        list.add(MainModule("Muallif haqida", R.drawable.read_book_icon))

        return list
    }
}