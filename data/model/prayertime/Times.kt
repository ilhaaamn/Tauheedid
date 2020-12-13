package com.tauheedid.data.model.prayertime


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
@JsonClass(generateAdapter = true)
data class Times(
    @Json(name = "Asr")
    val asr: String = "",
    @Json(name = "Dhuhr")
    val dhuhr: String = "",
    @Json(name = "Fajr")
    val fajr: String = "",
    @Json(name = "Imsak")
    val imsak: String = "",
    @Json(name = "Isha")
    val isha: String = "",
    @Json(name = "Maghrib")
    val maghrib: String = "",
    @Json(name = "Midnight")
    val midnight: String = "",
    @Json(name = "Sunrise")
    val sunrise: String = "",
    @Json(name = "Sunset")
    val sunset: String = ""
) : Parcelable