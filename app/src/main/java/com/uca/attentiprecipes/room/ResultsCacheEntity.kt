package com.uca.attentiprecipes.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.uca.attentiprecipes.model.Recipes
import com.uca.attentiprecipes.model.TypeResultsSearch
import com.uca.attentiprecipes.utils.Converters

@Entity(tableName = "results" )
class ResultsCacheEntity (

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,

    @ColumnInfo(name = "results")
    var searchResults: List<Recipes>,

    @ColumnInfo(name = "totalResults")
    var totalResults: Int
)