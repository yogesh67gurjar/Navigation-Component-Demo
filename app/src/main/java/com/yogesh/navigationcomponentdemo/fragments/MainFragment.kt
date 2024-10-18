package com.yogesh.navigationcomponentdemo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.yogesh.navigationcomponentdemo.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var fragmentMainBinding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentMainBinding = FragmentMainBinding.inflate(inflater, container, false)
        initHeader()
        return fragmentMainBinding.root
    }


    private fun initHeader() {
        fragmentMainBinding.header.title.text = "Home"
        fragmentMainBinding.header.backBtn.visibility = View.GONE
    }
}