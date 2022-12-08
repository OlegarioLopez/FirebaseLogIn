package es.olegario.gpt3.presentation.auth.components

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import es.olegario.gpt3.core.Constants.AUTH_SCREEN

@Composable
fun AuthTopBar() {
    TopAppBar (
        title = {
            Text(
                text = AUTH_SCREEN
            )
        }
    )
}