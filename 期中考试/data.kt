package com.example.middleexam.ui

data class Commodity(
    val name:String,
    val rank:Int,
    val num:Int,
    val weight:Int,
    val role:String,
)
data class Equipment(
    val name: String,
    val rank: Int,
    val num: Int,
    val weight: Int,
    val role: String,
)
object user {
    val Commodity: List<Commodity> = listOf(
        Commodity(
            "王大帅",
            1,
            1,
            1,
            "可以",
        ),
        Commodity(
            "小帅",
            2,
            2,
            2,
            "可以"
        )
    )
    val Equipment: List<Equipment> = listOf(
        Equipment(
            "中帅",
            2,
            2,
            2,
            "好吃",
        )
    )
}




