package com.example.balingo.ui.opening

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.balingo.R
import com.example.balingo.databinding.FragmentOpeningFrame5Binding


class OpeningFrame5Fragment : Fragment() {
    private lateinit var binding: FragmentOpeningFrame5Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOpeningFrame5Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener{
            findNavController().navigate(R.id.action_openingFrame5Fragment_to_openingFrame7Fragment)
        }

        binding.btnBljr1.setOnClickListener{
            resetbtn()
            binding.btnBljr1.setBackgroundColor(Color.WHITE)
            binding.btnBljr1.setTextColor(Color.parseColor("#744504"))
        }
        binding.btnBljr2.setOnClickListener{
            resetbtn()
            binding.btnBljr2.setBackgroundColor(Color.WHITE)
            binding.btnBljr2.setTextColor(Color.parseColor("#744504"))
        }
        binding.btnBljr3.setOnClickListener{
            resetbtn()
            binding.btnBljr3.setBackgroundColor(Color.WHITE)
            binding.btnBljr3.setTextColor(Color.parseColor("#744504"))
        }
        binding.btnBljr4.setOnClickListener{
            resetbtn()
            binding.btnBljr4.setBackgroundColor(Color.WHITE)
            binding.btnBljr4.setTextColor(Color.parseColor("#744504"))
        }
    }

    private fun resetbtn() {
        binding.btnBljr1.setBackgroundColor(Color.TRANSPARENT)
        binding.btnBljr1.setTextColor(Color.WHITE)
        binding.btnBljr2.setBackgroundColor(Color.TRANSPARENT)
        binding.btnBljr2.setTextColor(Color.WHITE)
        binding.btnBljr3.setBackgroundColor(Color.TRANSPARENT)
        binding.btnBljr3.setTextColor(Color.WHITE)
        binding.btnBljr4.setBackgroundColor(Color.TRANSPARENT)
        binding.btnBljr4.setTextColor(Color.WHITE)
    }

}
