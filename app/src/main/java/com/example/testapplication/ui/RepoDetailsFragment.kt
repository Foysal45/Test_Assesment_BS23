package com.example.testapplication.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.testapplication.R
import com.example.testapplication.api.model.RepositoryItem
import com.example.testapplication.databinding.FragmentRepoDetailsBinding
import java.text.SimpleDateFormat

class RepoDetailsFragment : Fragment() {

    private var binding: FragmentRepoDetailsBinding? = null
    private lateinit var model: RepositoryItem

    private val options = RequestOptions()
        .placeholder(R.drawable.ic_person_circle)
        .error(R.drawable.ic_person_circle)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        (requireActivity() as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        (requireActivity() as AppCompatActivity).supportActionBar?.title = "Repository Details "
        // Inflate the layout for this fragment
        return FragmentRepoDetailsBinding.inflate(inflater, container, false).also {
            binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        fetchRepoDetails()

    }

    @SuppressLint("SetTextI18n", "SimpleDateFormat")
    private fun fetchRepoDetails() {

        model = arguments?.getParcelable("repoDetails")!!

        val givenDateFromat = "yyyy-MM-dd'T'HH:mm:ss"
        val ourDateFromat = "MM-dd-yyyy, HH:mm"

        val formatInput = SimpleDateFormat(givenDateFromat)
        val formatOutput = SimpleDateFormat(ourDateFromat)

        val parseDate = formatInput.parse(model.updated_at)
        val viewDateFromat = parseDate?.let { formatOutput.format(it) }

        binding?.updatedAt?.text = "Last Update : ${viewDateFromat}"
        binding?.repoOwnerName?.text = "Repo Owner : ${model.owner.login}"

        if (model.description != null){
            binding?.repoDetails?.text = "Repo Description : ${model.description}"
        }else{
            binding?.repoDetails?.text = "Repo Description : ${context?.getString(R.string.no_data_found)}"
        }


            Glide.with(binding!!.photoOwner)
                .load(model.owner.avatar_url)
                .apply(options)
                .into(binding!!.photoOwner)

    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}