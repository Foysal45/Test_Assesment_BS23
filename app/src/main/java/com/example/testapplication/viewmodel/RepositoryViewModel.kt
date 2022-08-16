package com.example.testapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testapplication.api.model.RepositoryItem
import com.example.testapplication.repository.AppRepository
import com.example.testapplication.utils.ViewState
import com.haroldadmin.cnradapter.NetworkResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber

class RepositoryViewModel(private val repository: AppRepository) : ViewModel() {

    val viewState = MutableLiveData<ViewState>(ViewState.NONE)

    fun getRepositoryList(): LiveData<List<RepositoryItem>> {
        viewState.value = ViewState.ProgressState(true)
        val responseBody = MutableLiveData<List<RepositoryItem>>()
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.getRepositoryList()
            withContext(Dispatchers.Main) {
                viewState.value = ViewState.ProgressState(false)
                when (response) {
                    is NetworkResponse.Success -> {

                        responseBody.value = response.body.items

                        Timber.d("response:${response.body}")
                    }
                    is NetworkResponse.ServerError -> {
                        val message =
                            "দুঃখিত, এই মুহূর্তে আমাদের সার্ভার কানেকশনে সমস্যা হচ্ছে, কিছুক্ষণ পর আবার চেষ্টা করুন"
                        viewState.value = ViewState.ShowMessage(message)
                    }
                    is NetworkResponse.NetworkError -> {
                        val message = "দুঃখিত, এই মুহূর্তে আপনার ইন্টারনেট কানেকশনে সমস্যা হচ্ছে"
                        viewState.value = ViewState.ShowMessage(message)
                    }
                    is NetworkResponse.UnknownError -> {
                        val message = "কোথাও কোনো সমস্যা হচ্ছে, আবার চেষ্টা করুন"
                        viewState.value = ViewState.ShowMessage(message)
                        Timber.d(response.error)
                    }
                }
            }

        }
        return responseBody
    }
}