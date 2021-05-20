package com.uca.attentiprecipes.di

import android.content.Context
import androidx.room.Room
import com.uca.attentiprecipes.room.AttentipDatabase
import com.uca.attentiprecipes.room.ResultsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RoomModule {

    @Singleton
    @Provides
    fun provideRecipeDb(@ApplicationContext context: Context): AttentipDatabase{
        return Room
            .databaseBuilder(context, AttentipDatabase::class.java, AttentipDatabase.DATABASE_NAME).fallbackToDestructiveMigration().build()
    }

    @Singleton
    @Provides
    fun provideResults(attentipDatabase: AttentipDatabase): ResultsDao{
        return attentipDatabase.resultsDao()
    }

}