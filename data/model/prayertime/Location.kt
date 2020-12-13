package com.tauheedid.data.model.prayertime


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
@JsonClass(generateAdapter = true)
data class Location(
    @Json(name = "country")
    val country: String = "",
    @Json(name = "country_code")
    val countryCode: String = "",
    @Json(name = "elevation")
    val elevation: Double = 0.0,
    @Json(name = "latitude")
    val latitude: Double = 0.0,
    @Json(name = "local_offset")
    val localOffset: Double = 0.0,
    @Json(name = "longitude")
    val longitude: Double = 0.0,
    @Json(name = "timezone")
    val timezone: String = ""
) : Parcelable