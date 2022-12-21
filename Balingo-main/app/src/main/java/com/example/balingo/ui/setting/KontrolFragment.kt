package com.example.balingo.ui.setting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.balingo.R
import com.example.balingo.databinding.FragmentKontrolBinding

class KontrolFragment : Fragment() {
    private lateinit var binding: FragmentKontrolBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentKontrolBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.back.setOnClickListener{
            findNavController().navigate(R.id.action_kontrolFragment_to_settingsFragment2)
        }
    }
}