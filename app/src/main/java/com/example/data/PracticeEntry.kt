package com.example.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "practices")
data class PracticeEntry(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val toolId: Int,
    val content: String,
    val timestamp: Long = System.currentTimeMillis()
)
