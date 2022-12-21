package com.example.balingo.ui.opening

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.balingo.R
import com.example.balingo.databinding.FragmentOpeningFrame1Binding

class OpeningFrame1Fragment : Fragment() {
    private lateinit var binding: FragmentOpeningFrame1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOpeningFrame1Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnMulai.setOnClickListener{
            findNavController().navigate(R.id.action_openingFrame1Fragment_to_openingFrame2Fragment)
        }

        binding.btnAkun.setOnClickListener{
            findNavController().navigate(R.id.action_openingFrame1Fragment_to_profileFragment)
        }
    }

}