package com.tauheedid.data.model.prayertime


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
@JsonClass(generateAdapter = true)
data class Results(
    @Json(name = "datetime")
    val datetime: List<Datetime> = listOf(),
    @Json(name = "location")
    val location: Location = Location(),
    @Json(name = "settings")
    val settings: Settings = Settings()
) : Parcelable