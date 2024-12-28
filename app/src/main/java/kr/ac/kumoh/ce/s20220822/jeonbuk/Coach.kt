package kr.ac.kumoh.ce.s20220822.jeonbuk

import com.google.gson.annotations.SerializedName

data class Coach(
    val id: Long,
    val name: String,
    val role: String,
    @SerializedName("image_url") val imageUrl: String,
    val data: CoachDetails
)

data class CoachDetails(
    val career: String
)
