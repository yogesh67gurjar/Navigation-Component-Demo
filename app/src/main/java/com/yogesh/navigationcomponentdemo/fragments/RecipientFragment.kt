package com.yogesh.navigationcomponentdemo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.yogesh.navigationcomponentdemo.R
import com.yogesh.navigationcomponentdemo.databinding.FragmentRecipientBinding

class RecipientFragment : Fragment() {
    private lateinit var fragmentRecipientBinding: FragmentRecipientBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentRecipientBinding = FragmentRecipientBinding.inflate(inflater, container, false)
        setup()
        return fragmentRecipientBinding.root
    }

    private fun setup() {
        fragmentRecipientBinding.cancelBtn.setOnClickListener {
            findNavController().navigateUp()
        }

        fragmentRecipientBinding.okBtn.setOnClickListener {
            findNavController().navigate(R.id.action_recipientFragment_to_enterAmountFragment)
        }
    }
}