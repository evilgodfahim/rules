package com.example

import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.ui.screens.PracticeScreen
import com.example.ui.screens.ToolDetailScreen
import com.example.ui.screens.ToolListScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "tool_list") {
        composable("tool_list") {
            ToolListScreen(
                onToolClick = { toolId ->
                    navController.navigate("tool_detail/$toolId")
                }
            )
        }
        
        composable(
            route = "tool_detail/{toolId}",
            arguments = listOf(navArgument("toolId") { type = NavType.IntType })
        ) { backStackEntry ->
            val toolId = backStackEntry.arguments?.getInt("toolId") ?: return@composable
            ToolDetailScreen(
                toolId = toolId,
                onBack = { navController.popBackStack() },
                onPracticeClick = { id -> 
                    navController.navigate("practice/$id") 
                }
            )
        }

        composable(
            route = "practice/{toolId}",
            arguments = listOf(navArgument("toolId") { type = NavType.IntType })
        ) { backStackEntry ->
            val toolId = backStackEntry.arguments?.getInt("toolId") ?: return@composable
            PracticeScreen(
                toolId = toolId,
                onBack = { navController.popBackStack() }
            )
        }
    }
}
