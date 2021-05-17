package com.uca.attentiprecipes.utils

import com.uca.attentiprecipes.model.Cuisine
import com.uca.attentiprecipes.model.Recipes
import java.lang.Exception

sealed class DataState {
    object Idle: DataState()
    data class SuccessRecipe(val recipe: List<Recipes>): DataState()
    data class ErrorRecipe(val exception: Exception): DataState()
    object Loading: DataState()
}