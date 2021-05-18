package com.uca.attentiprecipes.model

data class ResultsSearch (
    var searchResults : List<Recipes>,
    var totalResults: Int
)