package com.tauheedid.data.repository

import com.tauheedid.data.source.remote.PrayerTimeService
import com.tauheedid.data.source.remote.QuranService
import javax.inject.Inject

class QuranRepositoryImpl @Inject constructor(private val quranService: QuranService) {
    suspend fun getQuranTableOfContent() = quranService.getQuranTableOfContent()
}