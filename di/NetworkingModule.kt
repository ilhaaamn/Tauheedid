package com.tauheedid.di

import com.tauheedid.constant.URLConstant
import com.tauheedid.data.source.remote.PrayerTimeService
import com.tauheedid.data.source.remote.QuranService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object NetworkingModule {
    @Provides
    @Singleton
    fun provideAuthInterceptorOkHttpClient(): OkHttpClient{
        return OkHttpClient.Builder().build()
    }

    @Provides
    @Singleton
    fun providePrayerTimeService(okHttpClient: OkHttpClient): PrayerTimeService {
        return Retrofit.Builder().client(okHttpClient)
            .baseUrl(URLConstant.PRAYER_TIME_URL)
            .build()
            .create(PrayerTimeService::class.java)
    }

    @Provides
    @Singleton
    fun provideQuranService(okHttpClient: OkHttpClient): QuranService {
        return Retrofit.Builder().client(okHttpClient)
            .baseUrl(URLConstant.QURAN_URL)
            .build()
            .create(QuranService::class.java)
    }

}