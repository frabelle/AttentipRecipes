package com.uca.attentiprecipes.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [RecipeCacheEntity::class], version = 1)
abstract class AttentipDatabase: RoomDatabase() {
    companion object{
        val DATABASE_NAME = "AttentipRecipes"
    }

    abstract fun recipeDao(): RecipeDao
}