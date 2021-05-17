package com.uca.attentiprecipes.retrofit

import retrofit2.http.GET

interface RecipeRetroFit {
    @GET("")
    suspend fun get(): List<RecipeNetworkEntity>
}