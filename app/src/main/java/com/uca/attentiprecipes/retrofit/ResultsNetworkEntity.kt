package com.uca.attentiprecipes.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.uca.attentiprecipes.model.TypeResultsSearch

class ResultsNetworkEntity (

    @SerializedName("searchResults")
    @Expose
    var searchResults : ArrayList<TypeResultsSearch>

)