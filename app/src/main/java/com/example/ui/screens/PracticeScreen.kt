package com.example.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.data.PracticeEntry
import com.example.data.WritingToolProvider
import java.text.SimpleDateFormat
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PracticeScreen(
    toolId: Int,
    onBack: () -> Unit,
    viewModel: PracticeViewModel = viewModel()
) {
    val tool = WritingToolProvider.getTool(toolId) ?: return
    val practices by viewModel.practices.collectAsState()
    var currentText by remember { mutableStateOf("") }

    LaunchedEffect(toolId) {
        viewModel.loadPracticesForTool(toolId)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Practice: Tool ${tool.id}") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = tool.title, style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.primary)
                Spacer(modifier = Modifier.height(8.dp))
                Card(colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.secondaryContainer)) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Text("Workshop Tasks:", style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.onSecondaryContainer)
                        tool.workshop.forEachIndexed { index, task ->
                            Text("${index + 1}. $task", style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSecondaryContainer)
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = currentText,
                    onValueChange = { currentText = it },
                    label = { Text("Write your practice text here...") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f, fill = false)
                        .heightIn(min = 150.dp, max = 300.dp),
                    maxLines = 10
                )
                Spacer(modifier = Modifier.height(8.dp))
                Button(
                    onClick = { 
                        viewModel.savePractice(toolId, currentText)
                        currentText = ""
                    },
                    modifier = Modifier.align(Alignment.End),
                    enabled = currentText.isNotBlank()
                ) {
                    Text("Save Practice")
                }
            }

            if (practices.isNotEmpty()) {
                HorizontalDivider()
                LazyColumn(
                    modifier = Modifier.weight(1f),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    item {
                        Text("Saved Practices", style = MaterialTheme.typography.titleMedium)
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                    items(practices) { practice ->
                        PracticeCard(practice = practice, onDelete = { viewModel.deletePractice(it) })
                    }
                }
            }
        }
    }
}

@Composable
fun PracticeCard(practice: PracticeEntry, onDelete: (Int) -> Unit) {
    val formattedDate = remember(practice.timestamp) {
        SimpleDateFormat("MMM dd, yyyy HH:mm", Locale.getDefault()).format(Date(practice.timestamp))
    }
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = formattedDate, style = MaterialTheme.typography.labelSmall)
                IconButton(onClick = { onDelete(practice.id) }, modifier = Modifier.size(24.dp)) {
                    Icon(Icons.Default.Delete, contentDescription = "Delete", modifier = Modifier.size(16.dp))
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = practice.content, style = MaterialTheme.typography.bodyMedium)
        }
    }
}
