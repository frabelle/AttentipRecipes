package com.uca.attentiprecipes.repository

import android.util.Log
import com.uca.attentiprecipes.DetailsFragment
import com.uca.attentiprecipes.retrofit.RecipeRetroFit
import com.uca.attentiprecipes.retrofit.ResultsNetworkMapper
import com.uca.attentiprecipes.room.ResultsCacheMapper
import com.uca.attentiprecipes.room.ResultsDao
import com.uca.attentiprecipes.utils.DataState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

class ResultsRepository (
    private val resultsDao: ResultsDao,
    private val recipeRetroFit: RecipeRetroFit,
    private val resultsCacheMapper: ResultsCacheMapper,
    private val resultsNetworkMapper: ResultsNetworkMapper
    ){
        suspend fun getRecipes(): kotlinx.coroutines.flow.Flow<DataState> = flow{
            emit(DataState.Loading)
            delay(1000)
            try {

                val resultsCache = resultsDao.get()
                val recipesCache = resultsDao.getRecipes()

                //Se estableció esta condicional para ahorrar recursos debido a que la API establece cuotas diarias por request y points
                if(resultsCache.isNullOrEmpty() && recipesCache.isNullOrEmpty()){

                    val recipeData = recipeRetroFit.get()
                    val recipeMap = resultsNetworkMapper.mapFromEntity(recipeData)

                    resultsDao.insert(resultsCacheMapper.mapToEntity(recipeMap))

                    for (temp in recipeMap.searchResults){
                        resultsDao.insertRecipes(temp)
                    }

                    emit(DataState.SuccessRecipe(resultsCacheMapper.mapFromEntityListResults(resultsDao.get())))
                    emit(DataState.SuccessRecipeInfo(resultsDao.getRecipes()))

                    val cuisineCache = resultsDao.getRecipes()
                    emit(DataState.SuccessRecipeByCuisine(cuisineCache))

                }else{

                    emit(DataState.SuccessRecipe(resultsCacheMapper.mapFromEntityListResults(resultsCache)))
                    emit(DataState.SuccessRecipeInfo(recipesCache))

                    val cuisineCache = resultsDao.getRecipes()
                    emit(DataState.SuccessRecipeByCuisine(cuisineCache))
                }

            }catch (e:Exception){
                emit(DataState.ErrorRecipe(e))
                val resultsCache = resultsDao.get()
                emit(DataState.SuccessRecipe(resultsCacheMapper.mapFromEntityListResults(resultsCache)))

                val recipesCache = resultsDao.getRecipes()
                emit(DataState.SuccessRecipeInfo(recipesCache))
            }

        }
}