package com.uca.attentiprecipes.utils

import com.uca.attentiprecipes.model.Cuisine
import com.uca.attentiprecipes.model.Recipes
import com.uca.attentiprecipes.model.ResultsSearch
import java.lang.Exception

sealed class DataState {
    object Idle: DataState()
    data class SuccessRecipe(val recipe: List<ResultsSearch>): DataState()
    data class ErrorRecipe(val exception: Exception): DataState()
    data class SuccessRecipeInfo(val recipe: List<Recipes>): DataState()
    data class SuccessRecipeByCuisine(val recipe: List<Recipes>): DataState()
    object Loading: DataState()
}