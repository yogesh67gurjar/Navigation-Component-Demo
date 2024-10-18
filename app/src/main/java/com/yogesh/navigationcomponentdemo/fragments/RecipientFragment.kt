package com.yogesh.navigationcomponentdemo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.yogesh.navigationcomponentdemo.databinding.FragmentRecipientBinding

class RecipientFragment : Fragment() {
    private lateinit var fragmentRecipientBinding: FragmentRecipientBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentRecipientBinding = FragmentRecipientBinding.inflate(inflater, container, false)
        initHeader()
        setup()
        return fragmentRecipientBinding.root
    }

    private fun setup() {
        fragmentRecipientBinding.cancelBtn.setOnClickListener {

        }

        fragmentRecipientBinding.okBtn.setOnClickListener {

        }
    }

    private fun initHeader() {
        fragmentRecipientBinding.header.title.text = "Enter recipient name"
        fragmentRecipientBinding.header.backBtn.setOnClickListener {

        }
    }
}