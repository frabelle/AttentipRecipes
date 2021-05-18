package com.uca.attentiprecipes.repository

import com.uca.attentiprecipes.retrofit.RecipeNetworkMapper
import com.uca.attentiprecipes.retrofit.RecipeRetroFit
import com.uca.attentiprecipes.room.RecipeCacheMapper
import com.uca.attentiprecipes.room.RecipeDao
import com.uca.attentiprecipes.utils.DataState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

class RecipesRepository(
    private val recipeDao: RecipeDao,
    private val recipeRetroFit: RecipeRetroFit,
    private val recipeCacheMapper: RecipeCacheMapper,
    private val recipeNetworkMapper: RecipeNetworkMapper
){
    suspend fun getRecipes(): kotlinx.coroutines.flow.Flow<DataState> = flow{
        emit(DataState.Loading)
        delay(1000)
//        try {
//            val recipeData = recipeRetroFit.get()
//            val recipeMap = recipeNetworkMapper.mapFromEntityListRecipe(recipeData)
//
//            for (temp in recipeMap){
//                recipeDao.insert(recipeCacheMapper.mapToEntity(temp))
//            }
//
//            val recipeCache = recipeDao.get()
//            emit(DataState.SuccessRecipe(recipeCacheMapper.mapFromEntityListRecipe(recipeCache)))
//
//        }catch (e:Exception){
//            emit(DataState.ErrorRecipe(e))
//        }

    }
}