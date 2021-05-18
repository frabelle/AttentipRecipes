package com.uca.attentiprecipes.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.uca.attentiprecipes.model.Recipes

@Dao
interface RecipeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(recipeEntity: Recipes): Long

    @Query("SELECT * FROM recipes")
    suspend fun get(): List<Recipes>
}