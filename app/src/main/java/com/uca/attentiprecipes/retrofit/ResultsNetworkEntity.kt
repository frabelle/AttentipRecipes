package com.uca.attentiprecipes.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.uca.attentiprecipes.model.Recipes
import com.uca.attentiprecipes.model.TypeResultsSearch

class ResultsNetworkEntity (

    @SerializedName("results")
    @Expose
    var searchResults : List<Recipes>,

    @SerializedName("totalResults")
    @Expose
    var totalResults : Int


)