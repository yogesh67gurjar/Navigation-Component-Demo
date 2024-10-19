package com.yogesh.navigationcomponentdemo.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
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
            val navDirection: NavDirections =
                RecipientFragmentDirections.actionRecipientFragmentToEnterAmountFragment(
                    fragmentRecipientBinding.recipientEt.text.toString()
                )
            findNavController().navigate(navDirection)
        }
    }
}