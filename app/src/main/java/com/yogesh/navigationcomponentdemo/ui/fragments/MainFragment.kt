package com.yogesh.navigationcomponentdemo.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.yogesh.navigationcomponentdemo.R
import com.yogesh.navigationcomponentdemo.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var fragmentMainBinding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentMainBinding = FragmentMainBinding.inflate(inflater, container, false)

        fragmentMainBinding.sendMoneyBtn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_recipientFragment)
        }

        fragmentMainBinding.viewTransactionsBtn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_transactionsFragment)
        }

        fragmentMainBinding.checkBalanceBtn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_viewBalanceFragment)
        }
        return fragmentMainBinding.root
    }
}