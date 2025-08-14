package com.jmcoding.compose_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import kotlinx.serialization.Serializable
import com.jmcoding.compose_navigation.ui.theme.ComposenavigationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposenavigationTheme {
                AppRoot()
            }
        }
    }
}

@Serializable
data object LoginDestination