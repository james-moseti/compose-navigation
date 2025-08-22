package com.jmcoding.compose_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.jmcoding.compose_navigation.login.LoginDestination
import com.jmcoding.compose_navigation.login.loginScreen
import kotlinx.serialization.Serializable

@Composable
fun AppRoot() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = LoginDestination
    ) {
        loginScreen(
            onNavigateToMain = {},
            onNavigateToSignUp = {}
        )
    }
}
