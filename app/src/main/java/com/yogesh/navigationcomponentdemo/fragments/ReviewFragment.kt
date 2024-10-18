package com.yogesh.navigationcomponentdemo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yogesh.navigationcomponentdemo.R
import com.yogesh.navigationcomponentdemo.databinding.FragmentReviewBinding

class ReviewFragment : Fragment() {
    lateinit var fragmentReviewBinding: FragmentReviewBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentReviewBinding = FragmentReviewBinding.inflate(inflater, container, false)
        initHeader()
        setup()
        return fragmentReviewBinding.root
    }

    private fun setup() {

    }

    private fun initHeader() {
        fragmentReviewBinding.header.title.text = "Review Transfer"
        fragmentReviewBinding.header.backBtn.setOnClickListener {

        }
    }
}