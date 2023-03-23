package com.example.apptunix.fragment

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.apptunix.R

class WelcomeFragment : Fragment() {
    private var fragment: SubmitFragment? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        fragment = SubmitFragment()

        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_welcomeFragment_to_submitFragment)
        }, 2000)

        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }
}