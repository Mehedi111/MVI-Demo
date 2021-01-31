package com.ms.mviarchitecturedemo.data.repository

import com.ms.mviarchitecturedemo.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}