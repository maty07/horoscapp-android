package com.matydev.horoscapp.ui.home.palmistry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.matydev.horoscapp.databinding.FragmentPalmestryBinding

class PalmistryFragment : Fragment() {

    private var _binding: FragmentPalmestryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPalmestryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}