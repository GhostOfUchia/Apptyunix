package com.example.apptunix.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.apptunix.R
import com.example.apptunix.databinding.FragmentSubmitBinding

class SubmitFragment : Fragment() {
    private var _binding: FragmentSubmitBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSubmitBinding.inflate(inflater, container, false)
        binding.submitButton.setOnClickListener {
            findNavController().navigate(R.id.action_submitFragment_to_welcomwBack)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
