package com.tauheedid.data.source.remote

import com.tauheedid.data.model.quran.tboc.QuranListResponse
import retrofit2.Response
import retrofit2.http.GET

interface QuranService {
    @GET("surat")
    suspend fun getQuranTableOfContent(): Response<QuranListResponse>
}