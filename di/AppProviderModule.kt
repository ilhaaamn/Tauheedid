package com.tauheedid.di

import com.tauheedid.data.repository.PrayerTimeRepositoryImpl
import com.tauheedid.data.repository.QuranRepositoryImpl
import com.tauheedid.data.source.remote.PrayerTimeService
import com.tauheedid.data.source.remote.QuranService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object AppProviderModule {

    @Provides
    @Singleton
    fun providePrayerTimeRepository(prayerTimeService: PrayerTimeService) =
        PrayerTimeRepositoryImpl(prayerTimeService = prayerTimeService)

    @Provides
    @Singleton
    fun provideQuranRepository(quranService: QuranService) =
        QuranRepositoryImpl(quranService = quranService)
}