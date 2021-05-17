package com.uca.attentiprecipes.di

import android.content.Context
import androidx.room.Room
import com.uca.attentiprecipes.room.AttentipDatabase
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

object RoomModule {

    @Singleton
    @Provides
    fun provideRecipeDb(@ApplicationContext context: Context): AttentipDatabase{
        return Room
            .databaseBuilder(context, AttentipDatabase::class.java, AttentipDatabase.DATABASE_NAME).fallbackToDestructiveMigration().build()
    }
}