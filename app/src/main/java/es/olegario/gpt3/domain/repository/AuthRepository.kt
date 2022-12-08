package es.olegario.gpt3.domain.repository

import com.google.android.gms.auth.api.identity.BeginSignInResult
import com.google.firebase.auth.AuthCredential
import es.olegario.gpt3.domain.model.Response

typealias OneTapSignInResponse = Response<BeginSignInResult>
typealias SignInWithGoogleResponse = Response<Boolean>

interface AuthRepository {
    val isUserAuthenticatedInFirebase: Boolean

    suspend fun oneTapSignInWithGoogle(): OneTapSignInResponse

    suspend fun firebaseSignInWithGoogle(googleCredential: AuthCredential): SignInWithGoogleResponse
}