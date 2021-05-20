package com.uca.attentiprecipes.retrofit

import com.uca.attentiprecipes.R
import com.uca.attentiprecipes.utils.data.Constants
import com.uca.attentiprecipes.utils.data.Constants.API_KEY_SPOONACULAR
import retrofit2.http.GET

interface RecipeRetroFit {
    @GET("recipes/complexSearch?apiKey="+ API_KEY_SPOONACULAR + "&addRecipeInformation=true&number=15")
    suspend fun get(): ResultsNetworkEntity
}