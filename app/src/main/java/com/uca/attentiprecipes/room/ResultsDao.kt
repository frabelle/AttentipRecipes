package com.uca.attentiprecipes.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.uca.attentiprecipes.model.Recipes

@Dao
interface ResultsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(resultsCacheEntity: ResultsCacheEntity): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecipes(resultsCacheEntity: Recipes): Long

    @Query("SELECT * FROM results")
    suspend fun get(): List<ResultsCacheEntity>

    @Query("SELECT * FROM recipes")
    suspend fun getRecipes(): List<Recipes>
}