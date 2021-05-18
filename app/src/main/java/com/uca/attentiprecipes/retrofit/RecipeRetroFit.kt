package com.uca.attentiprecipes.retrofit

import com.uca.attentiprecipes.R
import retrofit2.http.GET

interface RecipeRetroFit {
    @GET("recipes/complexSearch?apiKey=4b7a6ec8a963480c9be6dc162d2afb29&query=italian&number=30" )
    suspend fun get(): ResultsNetworkEntity
}