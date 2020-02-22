package com.example.materialapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.materialapp.R
import com.example.materialapp.databinding.FragmentNextBinding

class NextFragment : Fragment() {

    private lateinit var binding: FragmentNextBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_next, container, false)
        return binding.root
    }
}