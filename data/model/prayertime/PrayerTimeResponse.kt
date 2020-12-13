package com.tauheedid.data.model.prayertime


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
@JsonClass(generateAdapter = true)
data class PrayerTimeResponse(
    @Json(name = "code")
    val code: Int = 0,
    @Json(name = "results")
    val results: Results = Results(),
    @Json(name = "status")
    val status: String = ""
) : Parcelable