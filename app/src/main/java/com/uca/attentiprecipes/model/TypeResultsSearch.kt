package com.uca.attentiprecipes.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class TypeResultsSearch(

    @SerializedName("name")
    @Expose
    var nameResult : String,

    @SerializedName("totalResults")
    @Expose
    var total : Int,

    @SerializedName("results")
    @Expose
    var results: Recipes
)