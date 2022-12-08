package es.olegario.gpt3.core

import android.util.Log
import es.olegario.gpt3.core.Constants.TAG

class Utils {
    companion object {
        fun print(e: Exception) {
            Log.e(TAG, e.message ?: e.toString())
        }
    }
}