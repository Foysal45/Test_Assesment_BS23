package com.example.testapplication.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.api.model.RepositoryItem
import com.example.testapplication.databinding.ItemJobListBinding
import java.util.*

class RepoListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    private val repoList: MutableList<RepositoryItem> = mutableListOf()
    var onItemClick: ((repoListClick: RepositoryItem, position: Int) -> Unit)? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding: ItemJobListBinding =
            ItemJobListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewModel(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ViewModel) {
            val model = repoList[position]
            val binding = holder.binding

            binding.repoId.text = "Repo Id : ${model.id}"
            binding.repoName.text = "Repo Name : ${model.name}"
            binding.repoFullName.text = "Repo Full Name : ${model.full_name}"

        }
    }

    override fun getItemCount(): Int = repoList.size

    inner class ViewModel(val binding: ItemJobListBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                if (absoluteAdapterPosition != RecyclerView.NO_POSITION) {
                    onItemClick?.invoke(repoList[absoluteAdapterPosition], absoluteAdapterPosition)
                }
            }
        }

    }

    @SuppressLint("NotifyDataSetChanged")
    fun initLoad(list: List<RepositoryItem>) {
        repoList.clear()
        repoList.addAll(list)
        notifyDataSetChanged()
    }
}