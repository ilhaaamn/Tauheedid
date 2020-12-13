package com.tauheedid.data.model.prayertime


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
@JsonClass(generateAdapter = true)
data class Settings(
    @Json(name = "fajr_angle")
    val fajrAngle: Double = 0.0,
    @Json(name = "highlat")
    val highlat: String = "",
    @Json(name = "isha_angle")
    val ishaAngle: Double = 0.0,
    @Json(name = "juristic")
    val juristic: String = "",
    @Json(name = "school")
    val school: String = "",
    @Json(name = "timeformat")
    val timeformat: String = ""
) : Parcelable