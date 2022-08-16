package com.example.testapplication.api.model

import com.google.gson.annotations.SerializedName

data class RepositoryList(
    @SerializedName("incomplete_results")
    val incomplete_results: Boolean = false,
    @SerializedName("items")
    val items: List<RepositoryItem> = listOf(),
    @SerializedName("total_count")
    val total_count: Int = 0
)