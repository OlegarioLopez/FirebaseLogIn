package es.olegario.gpt3.presentation.profile.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import es.olegario.gpt3.components.ProgressBar
import es.olegario.gpt3.core.Utils.Companion.print
import es.olegario.gpt3.domain.model.Response.*
import es.olegario.gpt3.presentation.profile.ProfileViewModel

@Composable
fun RevokeAccess(
    viewModel: ProfileViewModel = hiltViewModel(),
    navigateToAuthScreen: (accessRevoked: Boolean) -> Unit,
    showSnackBar: () -> Unit
) {
    when(val revokeAccessResponse = viewModel.revokeAccessResponse) {
        is Loading -> ProgressBar()
        is Success -> revokeAccessResponse.data?.let { accessRevoked ->
            LaunchedEffect(accessRevoked) {
                navigateToAuthScreen(accessRevoked)
            }
        }
        is Failure -> LaunchedEffect(Unit) {
            print(revokeAccessResponse.e)
            showSnackBar()
        }
    }
}