package kr.ac.kumoh.ce.s20220822.jeonbuk

import com.google.gson.annotations.SerializedName

data class Player(
    val id: Long,
    val name: String,
    val position: String,
    @SerializedName("image_url") val imageUrl: String,
    val data: PlayerDetails
)

data class PlayerDetails(
    val career: String
)
