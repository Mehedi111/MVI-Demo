package com.ms.mviarchitecturedemo.data.api

import com.ms.mviarchitecturedemo.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}