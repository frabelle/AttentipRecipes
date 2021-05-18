package com.uca.attentiprecipes.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ResultsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(resultsCacheEntity: ResultsCacheEntity): Long

    @Query("SELECT * FROM results")
    suspend fun get(): ResultsCacheEntity
}