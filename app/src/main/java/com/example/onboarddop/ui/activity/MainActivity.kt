package com.example.onboarddop.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onboarddop.R
import com.example.onboarddop.databinding.ActivityMainBinding
import com.example.onboarddop.ui.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialize()
    }

    private fun initialize() {
        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager){ tab, position ->
            when (position){
                0 -> {
                    tab.text = "binni"
                }
                1 -> {
                    tab.text = "cap"
                }
            }
        }.attach()
    }
}