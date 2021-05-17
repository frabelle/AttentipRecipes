package com.uca.attentiprecipes.di

import android.app.Application
import com.uca.attentiprecipes.utils.adapters.AdapterRecipes
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
    fun provideAdapterRecipes(application: Application): AdapterRecipes{
        return AdapterRecipes()
    }
}