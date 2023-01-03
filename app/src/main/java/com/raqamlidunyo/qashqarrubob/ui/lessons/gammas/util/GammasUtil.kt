package com.raqamlidunyo.qashqarrubob.ui.lessons.gammas.util

import com.raqamlidunyo.qashqarrubob.ui.main.model.GammasModule

object GammasUtil {

    fun createGammasList(numItem:Int):List<GammasModule>
    {
        val list = ArrayList<GammasModule>()

        list.add(GammasModule(title = "Do major"))
        list.add(GammasModule(title = "Sol major"))
        list.add(GammasModule(title = "Re major"))
        list.add(GammasModule(title = "Lya major"))
        list.add(GammasModule(title = "Mi major"))
        list.add(GammasModule(title = "Si major"))
        list.add(GammasModule(title = "Fa diyez major"))
        list.add(GammasModule(title = "Do diyez major"))
        list.add(GammasModule(title = "lya minor"))
        list.add(GammasModule(title = "mi minor"))
        list.add(GammasModule(title = "si minor"))
        list.add(GammasModule(title = "fa diyez minor"))
        list.add(GammasModule(title = "do diyez minor"))
        list.add(GammasModule(title = "sol diyez minor"))
        list.add(GammasModule(title = "re diyez minor"))
        list.add(GammasModule(title = "lya diyez minor"))
        list.add(GammasModule(title = "Fa major"))
        list.add(GammasModule(title = "Si bemol major"))
        list.add(GammasModule(title = "Mi bemol major"))
        list.add(GammasModule(title = "Lya bemol major"))
        list.add(GammasModule(title = "Re bemol major"))
        list.add(GammasModule(title = "Sol bemol major"))
        list.add(GammasModule(title = "do bemol major"))
        list.add(GammasModule(title = "re minor"))
        list.add(GammasModule(title = "sol minor"))
        list.add(GammasModule(title = "do minor"))
        list.add(GammasModule(title = "fa minor"))
        list.add(GammasModule(title = "si bemol minor"))
        list.add(GammasModule(title = "mi bemol minor"))
        list.add(GammasModule(title = "lya bimol minor"))


        return list
    }

}