package ru.tjournalnews

import java.io.Serializable

data class News(val title:String, val date:String, val author:String ): Serializable
