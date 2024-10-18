package com.yogesh.navigationcomponentdemo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yogesh.navigationcomponentdemo.R
import com.yogesh.navigationcomponentdemo.databinding.FragmentViewBalanceBinding

class ViewBalanceFragment : Fragment() {
    private lateinit var fragmentViewBalanceBinding: FragmentViewBalanceBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentViewBalanceBinding = FragmentViewBalanceBinding.inflate(inflater, container, false)
        initHeader()
        return fragmentViewBalanceBinding.root
    }

    private fun initHeader() {
        fragmentViewBalanceBinding.header.title.text = "View Balance"
        fragmentViewBalanceBinding.header.backBtn.setOnClickListener {

        }
    }
}