package com.tauheedid.data.model.quran.tboc


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
@JsonClass(generateAdapter = true)
data class Hasil(
    @Json(name = "arti")
    val arti: String = "",
    @Json(name = "asma")
    val asma: String = "",
    @Json(name = "ayat")
    val ayat: String = "",
    @Json(name = "keterangan")
    val keterangan: String = "",
    @Json(name = "nama")
    val nama: String = "",
    @Json(name = "name")
    val name: String = "",
    @Json(name = "nomor")
    val nomor: String = "",
    @Json(name = "rukuk")
    val rukuk: String = "",
    @Json(name = "start")
    val start: String = "",
    @Json(name = "type")
    val type: String = "",
    @Json(name = "urut")
    val urut: String = ""
) : Parcelable