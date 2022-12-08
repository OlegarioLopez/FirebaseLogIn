package es.olegario.gpt3.domain.repository

import es.olegario.gpt3.domain.model.Response

typealias SignOutResponse = Response<Boolean>
typealias RevokeAccessResponse = Response<Boolean>

interface ProfileRepository {
    val displayName: String
    val photoUrl: String

    suspend fun signOut(): SignOutResponse

    suspend fun revokeAccess(): RevokeAccessResponse
}