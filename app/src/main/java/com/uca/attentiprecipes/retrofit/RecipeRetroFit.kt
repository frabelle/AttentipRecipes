package com.uca.attentiprecipes.retrofit

import com.uca.attentiprecipes.R
import retrofit2.http.GET

interface RecipeRetroFit {
    @GET("search?apiKey=" + R.string.API_KEY + "&query=all&number=100" )
    suspend fun get(): List<RecipeNetworkEntity>
}