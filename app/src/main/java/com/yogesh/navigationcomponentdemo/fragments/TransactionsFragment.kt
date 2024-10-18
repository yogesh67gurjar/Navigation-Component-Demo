package com.yogesh.navigationcomponentdemo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yogesh.navigationcomponentdemo.R
import com.yogesh.navigationcomponentdemo.databinding.FragmentTransactionsBinding

class TransactionsFragment : Fragment() {
    lateinit var fragmentTransactionsBinding: FragmentTransactionsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentTransactionsBinding =
            FragmentTransactionsBinding.inflate(inflater, container, false)
        initHeader()

        return fragmentTransactionsBinding.root
    }


    private fun initHeader() {
        fragmentTransactionsBinding.header.title.text = "View Transactions"
        fragmentTransactionsBinding.header.backBtn.setOnClickListener {

        }
    }

}