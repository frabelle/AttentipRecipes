package com.uca.attentiprecipes.utils

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.uca.attentiprecipes.model.Recipes
import com.uca.attentiprecipes.model.ResultsSearch
import com.uca.attentiprecipes.model.TypeResultsSearch

class Converters {

    @TypeConverter
    fun StringtoResult(value: TypeResultsSearch): String = Gson().toJson(value)

    @TypeConverter
    fun ResulttoString(value: String): TypeResultsSearch = Gson().fromJson(value, TypeResultsSearch::class.java)

    @TypeConverter
    fun StringtoRecipes(value: Recipes): String = Gson().toJson(value)

    @TypeConverter
    fun RecipestoString(value: String): Recipes = Gson().fromJson(value, Recipes::class.java)

}