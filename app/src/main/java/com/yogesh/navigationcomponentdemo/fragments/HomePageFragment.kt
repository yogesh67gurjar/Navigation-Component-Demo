package com.yogesh.navigationcomponentdemo.fragments

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.yogesh.navigationcomponentdemo.R
import com.yogesh.navigationcomponentdemo.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment() {
    lateinit var ctx: Context
    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx = context
    }

    private lateinit var binding: FragmentHomePageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomePageBinding.inflate(inflater, container, false)
        (activity as AppCompatActivity).supportActionBar?.show()
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false)


        val sharedPreferences: SharedPreferences = ctx.getSharedPreferences("Nav", MODE_PRIVATE)
        val edit = sharedPreferences.edit()
        binding.logOutBtn.setOnClickListener {
            edit.putBoolean("Is_Login", false)
            edit.apply()
            findNavController().navigate(R.id.action_homePageFragment_to_loginFragment)
        }

        return binding.root
    }
}