package com.uca.attentiprecipes.di

import com.uca.attentiprecipes.repository.ResultsRepository
import com.uca.attentiprecipes.retrofit.RecipeRetroFit
import com.uca.attentiprecipes.retrofit.ResultsNetworkMapper
import com.uca.attentiprecipes.room.ResultsCacheMapper
import com.uca.attentiprecipes.room.ResultsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideResultsRepository(
        resultsDao: ResultsDao,
        recipeRetroFit: RecipeRetroFit,
        resultsCacheMapper: ResultsCacheMapper,
        resultsNetworkMapper: ResultsNetworkMapper
    ): ResultsRepository{
        return ResultsRepository(resultsDao,recipeRetroFit,resultsCacheMapper,resultsNetworkMapper)
    }

}