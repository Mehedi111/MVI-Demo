package com.ms.mviarchitecturedemo.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ms.mviarchitecturedemo.data.api.ApiHelper
import com.ms.mviarchitecturedemo.data.repository.MainRepository
import com.ms.mviarchitecturedemo.ui.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}