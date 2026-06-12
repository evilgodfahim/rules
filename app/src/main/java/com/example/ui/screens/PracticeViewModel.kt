package com.example.ui.screens

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.AppDatabase
import com.example.data.PracticeEntry
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PracticeViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = AppDatabase.getDatabase(application).practiceDao()

    private val _practices = MutableStateFlow<List<PracticeEntry>>(emptyList())
    val practices: StateFlow<List<PracticeEntry>> = _practices.asStateFlow()

    fun loadPracticesForTool(toolId: Int) {
        viewModelScope.launch {
            dao.getPracticesForTool(toolId).collect {
                _practices.value = it
            }
        }
    }

    fun savePractice(toolId: Int, content: String) {
        if (content.isBlank()) return
        viewModelScope.launch {
            dao.insert(PracticeEntry(toolId = toolId, content = content))
        }
    }

    fun deletePractice(id: Int) {
        viewModelScope.launch {
            dao.delete(id)
        }
    }
}
