package com.uca.attentiprecipes.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RecipeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(recipeEntity: RecipeCacheEntity): Long

    @Query("SELECT * FROM recipes")
    suspend fun get(): List<RecipeCacheEntity>
}