package com.tauheedid.data.model.quran.tboc


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
@JsonClass(generateAdapter = true)
data class Query(
    @Json(name = "format")
    val format: String = "",
    @Json(name = "surat")
    val surat: String = ""
) : Parcelable