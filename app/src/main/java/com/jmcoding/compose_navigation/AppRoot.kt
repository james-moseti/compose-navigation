package com.jmcoding.compose_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.jmcoding.compose_navigation.login.LoginDestination
import com.jmcoding.compose_navigation.login.loginScreen
import com.jmcoding.compose_navigation.main.mainScreen
import com.jmcoding.compose_navigation.main.navigateToMain
import com.jmcoding.compose_navigation.signup.navigateToSignUp
import com.jmcoding.compose_navigation.signup.signUpScreen
import kotlinx.serialization.Serializable

@Composable
fun AppRoot() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = LoginDestination
    ) {
        loginScreen(
            onNavigateToMain = { navController.navigateToMain() },
            onNavigateToSignUp = {navController.navigateToSignUp() }
        )
        signUpScreen(
            onNavigateToMain = { navController.navigateToMain() },
            onNavigateUp = { navController.navigateUp() }
        )
        mainScreen(
            onOpenEmailDetails = {},
            onComposeNewEmail = {}
        )
    }
}
