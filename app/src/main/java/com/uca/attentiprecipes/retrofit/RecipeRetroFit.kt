package com.uca.attentiprecipes.retrofit

import com.uca.attentiprecipes.R
import retrofit2.http.GET

interface RecipeRetroFit {
    @GET("food/search?apiKey=4b7a6ec8a963480c9be6dc162d2afb29&query=all&number=1" )
    suspend fun get(): List<ResultsNetworkEntity>
}