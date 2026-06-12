package com.example.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface PracticeDao {
    @Query("SELECT * FROM practices WHERE toolId = :toolId ORDER BY timestamp DESC")
    fun getPracticesForTool(toolId: Int): Flow<List<PracticeEntry>>

    @Query("SELECT * FROM practices ORDER BY timestamp DESC")
    fun getAllPractices(): Flow<List<PracticeEntry>>

    @Insert
    suspend fun insert(practice: PracticeEntry)

    @Update
    suspend fun update(practice: PracticeEntry)

    @Query("DELETE FROM practices WHERE id = :id")
    suspend fun delete(id: Int)
}
