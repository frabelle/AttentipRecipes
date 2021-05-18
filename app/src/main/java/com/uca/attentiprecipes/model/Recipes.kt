package com.uca.attentiprecipes.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Recipes(

        @SerializedName("id")
        @Expose
        var id: Int,

        @SerializedName("name")
        @Expose
        var name: String,

        @SerializedName("image")
        @Expose
        var image: String,

        @SerializedName("link")
        @Expose
        var link: String,

        @SerializedName("content")
        @Expose
        var content: String
)