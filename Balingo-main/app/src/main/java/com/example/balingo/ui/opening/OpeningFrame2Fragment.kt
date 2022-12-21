package com.example.balingo.ui.opening

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.balingo.R
import com.example.balingo.databinding.FragmentOpeningFrame2Binding

class OpeningFrame2Fragment : Fragment() {
    private lateinit var binding: FragmentOpeningFrame2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOpeningFrame2Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener{
            findNavController().navigate(R.id.action_openingFrame2Fragment_to_openingFrame3Fragment)
        }

        binding.back.setOnClickListener{
            findNavController().navigate(R.id.action_openingFrame2Fragment_to_openingFrame1Fragment)
        }
    }

}