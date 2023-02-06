package com.example.onboarddop.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onboarddop.R
import com.example.onboarddop.databinding.FragmentAppBinding
import com.example.onboarddop.ui.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class AppFragment : Fragment() {

    private lateinit var binding: FragmentAppBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}