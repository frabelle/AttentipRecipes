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

        @ColumnInfo(name = "readyInMinutes")
        @SerializedName("readyInMinutes")
        @Expose
        var readyInMinutes: Int,

        @ColumnInfo(name = "sourceName")
        @SerializedName("sourceName")
        @Expose
        var sourceName: String?,

        @ColumnInfo(name = "sourceUrl")
        @SerializedName("sourceUrl")
        @Expose
        var sourceUrl: String,

        @ColumnInfo(name = "pricePerServing")
        @SerializedName("pricePerServing")
        @Expose
        var pricePerServing: Float,

        @ColumnInfo(name = "servings")
        @SerializedName("servings")
        @Expose
        var servings: Int,

        @ColumnInfo(name = "summary")
        @SerializedName("summary")
        @Expose
        var summary: String,

//        @ColumnInfo(name = "cuisines")
//        @SerializedName("cuisines")
//        @Expose
//        var cuisines: List<String>
)