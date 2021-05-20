package com.uca.attentiprecipes.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.uca.attentiprecipes.model.Recipes
import com.uca.attentiprecipes.utils.Converters

@Database(entities = [Recipes::class, ResultsCacheEntity::class], version = 3)
@TypeConverters(Converters::class)
abstract class AttentipDatabase: RoomDatabase() {
    companion object{
        val DATABASE_NAME = "AttentipRecipes"
    }

    abstract fun resultsDao(): ResultsDao
}