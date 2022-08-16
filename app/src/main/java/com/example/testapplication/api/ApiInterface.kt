package com.example.testapplication.api

import com.example.testapplication.api.model.ErrorResponse
import com.example.testapplication.api.model.RepositoryList
import com.haroldadmin.cnradapter.NetworkResponse
import retrofit2.Retrofit
import retrofit2.http.GET

interface ApiInterface {

    companion object {
        operator fun invoke(retrofit: Retrofit): ApiInterface {
            return retrofit.create(ApiInterface::class.java)
        }
    }

    @GET("search/repositories?q=android&page=2&per_page=20")
    suspend fun getRepositoryList(): NetworkResponse<RepositoryList, ErrorResponse>
}