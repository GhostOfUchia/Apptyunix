package com.example.apptunix.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.apptunix.R
import com.example.apptunix.databinding.FragmentRegistractionBinding


class RegistractionFragment : Fragment() {
    private var _binding : FragmentRegistractionBinding? = null
    private val binding get()= _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegistractionBinding.inflate(inflater, container,false)
        binding.signUp.setOnClickListener {
            findNavController().navigate(R.id.action_registraction_fragment_2_to_otpfragment)
        }
        return binding.root

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}