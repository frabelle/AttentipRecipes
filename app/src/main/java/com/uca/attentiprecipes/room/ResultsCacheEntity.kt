package com.uca.attentiprecipes.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.uca.attentiprecipes.model.TypeResultsSearch

@Entity(tableName = "results" )
class ResultsCacheEntity (

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "searchResults")
    var searchResults: ArrayList<TypeResultsSearch>

)