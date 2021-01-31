package com.ms.mviarchitecturedemo.data.api

import com.ms.mviarchitecturedemo.data.model.User

interface ApiHelper {
    suspend fun getUsers(): List<User>
}