package com.ms.mviarchitecturedemo.ui.viewstate

import com.ms.mviarchitecturedemo.data.model.User

sealed class MainState {
    object Idle : MainState()
    object Loading : MainState()
    data class Users(val user: List<User>) : MainState()
    data class Error(val error: String?) : MainState()

}