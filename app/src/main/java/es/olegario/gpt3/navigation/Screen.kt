package es.olegario.gpt3.navigation

import es.olegario.gpt3.core.Constants.AUTH_SCREEN
import es.olegario.gpt3.core.Constants.PROFILE_SCREEN

sealed class Screen(val route: String) {
    object AuthScreen: Screen(AUTH_SCREEN)
    object ProfileScreen: Screen(PROFILE_SCREEN)
}