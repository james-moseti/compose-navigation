package com.jmcoding.compose_navigation.composer

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.jmcoding.compose_navigation.ui.theme.ComposenavigationTheme

@Composable
fun ComposerScreenRoot(
    onNavigateUp: () -> Unit
) {

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