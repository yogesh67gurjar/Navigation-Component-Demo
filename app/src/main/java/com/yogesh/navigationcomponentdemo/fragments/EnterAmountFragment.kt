package com.yogesh.navigationcomponentdemo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.yogesh.navigationcomponentdemo.R
import com.yogesh.navigationcomponentdemo.databinding.FragmentEnterAmountBinding

class EnterAmountFragment : Fragment() {
    private lateinit var fragmentEnterAmountBinding: FragmentEnterAmountBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentEnterAmountBinding = FragmentEnterAmountBinding.inflate(inflater, container, false)
        setup()
        return fragmentEnterAmountBinding.root
    }

    private fun setup() {
        fragmentEnterAmountBinding.cancelBtn.setOnClickListener {
            findNavController().navigateUp()
        }

        fragmentEnterAmountBinding.okBtn.setOnClickListener {
            findNavController().navigate(R.id.action_enterAmountFragment_to_reviewFragment)
        }
    }
}