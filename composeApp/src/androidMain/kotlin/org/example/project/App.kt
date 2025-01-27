package org.example.project

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.details.DetailsScreen
import kotlinx.serialization.Serializable
import org.jetbrains.compose.ui.tooling.preview.Preview

@Serializable
object Main
@Serializable
object Details

@Composable
@Preview
fun App() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Main
    ) {
        composable<Main> {
            MainScreen {
                navController.navigate(Details)
            }
        }
        composable<Details> { DetailsScreen() }
    }

}
