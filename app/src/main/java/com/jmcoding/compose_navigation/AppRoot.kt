package com.jmcoding.compose_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.jmcoding.compose_navigation.composer.composerScreenRoot
import com.jmcoding.compose_navigation.composer.navigateToComposer
import com.jmcoding.compose_navigation.emaildetails.emailDetailsScreen
import com.jmcoding.compose_navigation.emaildetails.navigateToEmailDetails
import com.jmcoding.compose_navigation.login.LoginDestination
import com.jmcoding.compose_navigation.login.loginScreen
import com.jmcoding.compose_navigation.main.mainScreen
import com.jmcoding.compose_navigation.main.navigateToMain
import com.jmcoding.compose_navigation.signup.navigateToSignUp
import com.jmcoding.compose_navigation.signup.signUpScreen

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
            onOpenEmailDetails = { emailId: Int -> navController.navigateToEmailDetails(emailId) },
            onComposeNewEmail = { navController.navigateToComposer() }
        )
        emailDetailsScreen(
            onReplyToEmail = { navController.navigateToComposer() },
            onNavigateUp = { navController.navigateUp() }
        )
        composerScreenRoot(
            onNavigateUp = { navController.navigateUp() }
        )
    }
}
