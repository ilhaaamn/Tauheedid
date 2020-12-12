package com.tauheedid.data.repository

import com.tauheedid.data.source.remote.PrayerTimeService
import javax.inject.Inject

class PrayerTimeRepositoryImpl @Inject constructor(private val prayerTimeService: PrayerTimeService) {
}