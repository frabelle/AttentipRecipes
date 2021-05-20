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

}