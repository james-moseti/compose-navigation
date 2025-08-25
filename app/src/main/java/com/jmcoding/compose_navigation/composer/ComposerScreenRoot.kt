package com.jmcoding.compose_navigation.composer

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jmcoding.compose_navigation.composersettings.composerSettingsScreen
import com.jmcoding.compose_navigation.composersettings.navigateToComposerSettings
import com.jmcoding.compose_navigation.ui.theme.ComposenavigationTheme
import kotlinx.serialization.Serializable

@Serializable
private data object ComposerDestination

@Composable
fun ComposerScreenRoot(
    onNavigateUp: () -> Unit
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ComposerDestination
    ) {
        composable<ComposerDestination> {
            ComposerScreen(
                onNavigateUp = onNavigateUp,
                onOpenSettings = { navController.navigateToComposerSettings() }
            )
        }
        composerSettingsScreen(
            onNavigateUp = { navController.navigateUp() }
        )
    }
}

@Preview
@Composable
private fun PreviewComposer() {
    ComposenavigationTheme {
        ComposerScreenRoot(
            onNavigateUp = {}
        )
    }
}