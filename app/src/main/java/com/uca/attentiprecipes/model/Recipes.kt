package com.uca.attentiprecipes.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "recipes")
class Recipes(

        @PrimaryKey(autoGenerate = false)
        @ColumnInfo(name = "id")
        @SerializedName("id")
        @Expose
        var id: Int,

        @ColumnInfo(name = "name")
        @SerializedName("title")
        @Expose
        var name: String,

        @ColumnInfo(name = "image")
        @SerializedName("image")
        @Expose
        var image: String,

//        @SerializedName("link")
//        @Expose
//        var link: String,
//
//        @SerializedName("content")
//        @Expose
//        var content: String
)