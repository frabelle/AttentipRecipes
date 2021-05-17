package com.uca.attentiprecipes.di

import android.app.Application
import com.uca.attentiprecipes.repository.RecipesRepository
import com.uca.attentiprecipes.retrofit.RecipeNetworkMapper
import com.uca.attentiprecipes.retrofit.RecipeRetroFit
import com.uca.attentiprecipes.room.RecipeCacheMapper
import com.uca.attentiprecipes.room.RecipeDao
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
    fun provideRecipeRepository(
        recipeDao: RecipeDao,
        recipeRetroFit: RecipeRetroFit,
        recipeCacheMapper: RecipeCacheMapper,
        recipeNetworkMapper: RecipeNetworkMapper
    ): RecipesRepository{
        return RecipesRepository(recipeDao,recipeRetroFit,recipeCacheMapper,recipeNetworkMapper)
    }

}