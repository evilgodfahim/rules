package com.example.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.data.WritingToolProvider

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToolDetailScreen(
    toolId: Int,
    onBack: () -> Unit,
    onPracticeClick: (Int) -> Unit
) {
    val tool = WritingToolProvider.getTool(toolId) ?: return

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Tool ${tool.id}") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = { onPracticeClick(tool.id) },
                icon = { Icon(Icons.Default.Edit, contentDescription = "Practice this tool") },
                text = { Text("Practice") }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .padding(horizontal = 24.dp, vertical = 16.dp)
                .verticalScroll(rememberScrollState())
        ) {
             Text(
                text = tool.title, 
                style = MaterialTheme.typography.headlineMedium, 
                color = MaterialTheme.colorScheme.onBackground,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(12.dp))
            Surface(
                color = MaterialTheme.colorScheme.tertiaryContainer,
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                 Text(
                    text = tool.subtitle, 
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onTertiaryContainer,
                    modifier = Modifier.padding(16.dp)
                 )
            }
            Spacer(modifier = Modifier.height(24.dp))
            
            Text(
                text = "Explanation", 
                style = MaterialTheme.typography.titleLarge, 
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = tool.explanation, 
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.9f),
                lineHeight = MaterialTheme.typography.bodyLarge.lineHeight * 1.2
            )
            
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = "Workshop", 
                style = MaterialTheme.typography.titleLarge, 
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(12.dp))
            tool.workshop.forEachIndexed { index, task ->
                Row(modifier = Modifier.padding(bottom = 12.dp)) {
                    Surface(
                        color = MaterialTheme.colorScheme.secondaryContainer,
                        shape = RoundedCornerShape(percent = 50),
                        modifier = Modifier.size(28.dp)
                    ) {
                        Box(contentAlignment = androidx.compose.ui.Alignment.Center) {
                             Text(
                                text = "${index + 1}", 
                                style = MaterialTheme.typography.labelMedium,
                                color = MaterialTheme.colorScheme.onSecondaryContainer,
                                fontWeight = FontWeight.Bold
                             )
                        }
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = task, 
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.8f),
                        lineHeight = MaterialTheme.typography.bodyLarge.lineHeight * 1.2
                    )
                }
            }
            Spacer(modifier = Modifier.height(80.dp)) // Space for FAB
        }
    }
}
