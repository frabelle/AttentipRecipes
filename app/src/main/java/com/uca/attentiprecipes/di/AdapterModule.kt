package com.uca.attentiprecipes.di

import android.app.Application
import com.uca.attentiprecipes.utils.adapters.AdapterResults
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AdapterModule {

    @Singleton
    @Provides
    fun provideAdapterResults(application: Application): AdapterResults{
        return AdapterResults()
    }
}