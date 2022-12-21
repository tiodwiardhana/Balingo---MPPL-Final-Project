package com.example.balingo.ui.opening

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.balingo.R
import com.example.balingo.databinding.FragmentOpeningFrame8Binding

class OpeningFrame8Fragment : Fragment() {
    private lateinit var binding: FragmentOpeningFrame8Binding
    private val args: OpeningFrame4FragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOpeningFrame8Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener{
            if (args.soalArgs == 0){
                findNavController().navigate(R.id.action_openingFrame8Fragment_to_landingFragment)
            }
            if (args.soalArgs == 4){
                findNavController().navigate(OpeningFrame8FragmentDirections.actionOpeningFrame8FragmentToGameFrame1Fragment(4))
            }
        }
    }

}