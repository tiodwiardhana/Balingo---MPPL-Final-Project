package com.example.balingo.ui.setting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.balingo.R
import com.example.balingo.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {
    private lateinit var binding: FragmentSettingsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSettingsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.profile.setOnClickListener{
            findNavController().navigate(R.id.action_settingsFragment2_to_profileFragment)
        }
        binding.kontrol.setOnClickListener{
            findNavController().navigate(R.id.action_settingsFragment2_to_kontrolFragment)
        }
        binding.syarat.setOnClickListener{
            findNavController().navigate(R.id.action_settingsFragment2_to_SKFragment)
        }
        binding.aboutus.setOnClickListener{
            findNavController().navigate(R.id.action_settingsFragment2_to_aboutUsFragment)
        }
        binding.back.setOnClickListener{
            findNavController().navigate(R.id.action_settingsFragment2_to_landingFragment)
        }
    }

}