package com.tauheedid.data.model.prayertime


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
@JsonClass(generateAdapter = true)
data class Date(
    @Json(name = "gregorian")
    val gregorian: String = "",
    @Json(name = "hijri")
    val hijri: String = "",
    @Json(name = "timestamp")
    val timestamp: Int = 0
) : Parcelable