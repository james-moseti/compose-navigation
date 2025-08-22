package com.jmcoding.compose_navigation.login

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object LoginDestination

fun NavGraphBuilder.loginScreen(  // Since this function is an extension of the NavGraphBuilder, it doesn't have to be composable
    onNavigateToMain: () -> Unit,
    onNavigateToSignUp: () -> Unit
) {
    composable<LoginDestination> {
        LoginScreen(
            onNavigateToMain = onNavigateToMain,
            onNavigateToSignUp = onNavigateToSignUp
        )
    }
}