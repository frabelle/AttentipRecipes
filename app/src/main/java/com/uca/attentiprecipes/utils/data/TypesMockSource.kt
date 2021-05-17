package com.uca.attentiprecipes.utils.data

import com.uca.attentiprecipes.model.Cuisine

class TypesMockSource {

    fun getCuisines(): MutableList<Cuisine>{
        var types: MutableList<Cuisine> = ArrayList()

        types.add(Cuisine("Africa",0,"africa"))
        types.add(Cuisine("American",0,"africa"))
        types.add(Cuisine("British",0,"africa"))

        return types
    }
}