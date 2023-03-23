package com.example.apptunix.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.apptunix.R
import com.example.apptunix.databinding.OtpfragmentBinding

class OtpFragment : Fragment() {
    private var _binding : OtpfragmentBinding? = null
    private val binding get()= _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = OtpfragmentBinding.inflate(inflater, container, false)
        binding.buttonCountinue.setOnClickListener {
            findNavController().navigate(R.id.action_otpfragment_to_welcomeFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}