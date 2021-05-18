package com.uca.attentiprecipes.utils

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.uca.attentiprecipes.model.Recipes
import java.lang.reflect.Type


class Converters {

    @TypeConverter
    fun listToJson(value: List<Recipes>?) = Gson().toJson(value)

    @TypeConverter
    fun jsonToList(value: String) = Gson().fromJson(value, Array<Recipes>::class.java).toList()

//    @TypeConverter
//    fun StringtoResult(value: TypeResultsSearch): String = Gson().toJson(value)
//
//    @TypeConverter
//    fun ResulttoString(value: String): TypeResultsSearch = Gson().fromJson(value, TypeResultsSearch::class.java)
//
//    @TypeConverter
//    fun StringtoRecipes(value: ArrayList<Recipes>): String = Gson().toJson(value)
//
//    @TypeConverter
//    fun RecipestoString(value: String): Recipes = Gson().fromJson(value, Recipes::class.java)
//
//    @TypeConverter
//    fun toResultsList(value: String?): List<Recipes> {
//
//        val gson = Gson()
//        return gson.fromJson(value, Array<Recipes>::class.java).asList()
//    }

}