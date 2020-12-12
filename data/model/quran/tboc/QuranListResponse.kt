package com.tauheedid.data.model.quran.tboc


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
@JsonClass(generateAdapter = true)
data class QuranListResponse(
    @Json(name = "hasil")
    val hasil: List<Hasil> = listOf(),
    @Json(name = "query")
    val query: Query = Query(),
    @Json(name = "status")
    val status: String = ""
) : Parcelable