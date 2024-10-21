package com.yogesh.navigationcomponentdemo.fragments

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.yogesh.navigationcomponentdemo.R
import com.yogesh.navigationcomponentdemo.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {

    lateinit var ctx: Context
    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx = context
    }

    private lateinit var binding: FragmentSplashBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        (activity as AppCompatActivity).supportActionBar?.hide()

        binding.logo.animate().scaleX(1.5f).setDuration(3000).start()
        binding.logo.animate().scaleY(1.5f).setDuration(3000).start()

        object : CountDownTimer(3000, 3000) {
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                val sharedPreferences: SharedPreferences =
                    ctx.getSharedPreferences("Nav", MODE_PRIVATE)
                if (sharedPreferences.getBoolean("Is_Login", false)) {
                    findNavController().navigate(R.id.action_splashFragment_to_homePageFragment)
                } else {
                    findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
                }
            }
        }.start()
        return binding.root
    }
}