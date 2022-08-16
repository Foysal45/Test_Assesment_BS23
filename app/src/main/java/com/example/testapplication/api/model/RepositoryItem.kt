package com.example.testapplication.api.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class RepositoryItem(
    @SerializedName("allow_forking")
    val allow_forking: Boolean = false,
    @SerializedName("archive_url")
    val archive_url: String = "",
    @SerializedName("archived")
    val archived: Boolean = false,
    @SerializedName("assignees_url")
    val assignees_url: String = "",
    @SerializedName("blobs_url")
    val blobs_url: String = "",
    @SerializedName("branches_url")
    val branches_url: String = "",
    @SerializedName("clone_url")
    val clone_url: String = "",
    @SerializedName("collaborators_url")
    val collaborators_url: String = "",
    @SerializedName("comments_url")
    val comments_url: String = "",
    @SerializedName("commits_url")
    val commits_url: String = "",
    @SerializedName("compare_url")
    val compare_url: String = "",
    @SerializedName("contents_url")
    val contents_url: String = "",
    @SerializedName("contributors_url")
    val contributors_url: String = "",
    @SerializedName("created_at")
    val created_at: String = "",
    @SerializedName("default_branch")
    val default_branch: String = "",
    @SerializedName("deployments_url")
    val deployments_url: String = "",
    @SerializedName("description")
    val description: String = "",
    @SerializedName("disabled")
    val disabled: Boolean = false,
    @SerializedName("downloads_url")
    val downloads_url: String = "",
    @SerializedName("events_url")
    val events_url: String = "",
    @SerializedName("fork")
    val fork: Boolean = false,
    @SerializedName("forks")
    val forks: Int = 0,
    @SerializedName("forks_count")
    val forks_count: Int = 0,
    @SerializedName("forks_url")
    val forks_url: String = "",
    @SerializedName("full_name")
    val full_name: String = "",
    @SerializedName("git_commits_url")
    val git_commits_url: String = "",
    @SerializedName("git_refs_url")
    val git_refs_url: String = "",
    @SerializedName("git_tags_url")
    val git_tags_url: String = "",
    @SerializedName("git_url")
    val git_url: String = "",
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("updated_at")
    val updated_at: String = "",
    @SerializedName("stargazers_count")
    val stargazers_count: String = "",
    @SerializedName("owner")
    val owner: RepositoryDetails,
) : Parcelable