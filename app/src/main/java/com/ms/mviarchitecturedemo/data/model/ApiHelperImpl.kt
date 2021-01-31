package com.ms.mviarchitecturedemo.data.model

import com.ms.mviarchitecturedemo.data.api.ApiHelper
import com.ms.mviarchitecturedemo.data.api.ApiService

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {
    override suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }
}