package com.yogesh.navigationcomponentdemo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yogesh.navigationcomponentdemo.R
import com.yogesh.navigationcomponentdemo.databinding.FragmentEnterAmountBinding

class EnterAmountFragment : Fragment() {
    private lateinit var fragmentEnterAmountBinding: FragmentEnterAmountBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentEnterAmountBinding = FragmentEnterAmountBinding.inflate(inflater, container, false)
        initHeader()
        setup()
        return fragmentEnterAmountBinding.root
    }

    private fun setup() {
        fragmentEnterAmountBinding.cancelBtn.setOnClickListener {

        }

        fragmentEnterAmountBinding.okBtn.setOnClickListener {

        }
    }

    private fun initHeader() {
        fragmentEnterAmountBinding.header.title.text = "Enter Amount"
        fragmentEnterAmountBinding.header.backBtn.setOnClickListener {

        }
    }
}