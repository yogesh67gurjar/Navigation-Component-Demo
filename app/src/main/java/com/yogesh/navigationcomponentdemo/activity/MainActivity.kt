package com.yogesh.navigationcomponentdemo.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.yogesh.navigationcomponentdemo.R
import com.yogesh.navigationcomponentdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        activityMainBinding.oneBtn.setOnClickListener {
            startActivity(Intent(this, OneActivity::class.java))
        }

        activityMainBinding.twoBtn.setOnClickListener {
            startActivity(Intent(this, TwoActivity::class.java))
        }

        activityMainBinding.threeBtn.setOnClickListener {
            startActivity(Intent(this, ThreeActivity::class.java))
        }
    }
}