package com.tauheedid.data.model.prayertime


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
@JsonClass(generateAdapter = true)
data class Datetime(
    @Json(name = "date")
    val date: Date = Date(),
    @Json(name = "times")
    val times: Times = Times()
) : Parcelable