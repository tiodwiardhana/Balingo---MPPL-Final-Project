package com.example.balingo.ui.opening

import android.graphics.Color
import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.balingo.R
import com.example.balingo.databinding.FragmentOpeningFrame7Binding

class OpeningFrame7Fragment : Fragment() {
    private lateinit var binding: FragmentOpeningFrame7Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOpeningFrame7Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_openingFrame7Fragment_to_openingFrame8Fragment)
        }

        binding.btnTigaMnt.text = Html.fromHtml("3 Menit/ Hari \t\t\t\t\t\t\t\t\t\t\t\t Santai")
        binding.btnSepuluhMnt.text = Html.fromHtml("10 Menit/ Hari \t\t\t\t\t\t\t\t\t\t\t\t Biasa")
        binding.btnLimaBelasMnt.text =
            Html.fromHtml("15 Menit/ Hari \t\t\t\t\t\t\t\t\t\t\t\t Serius")
        binding.btnTigaPuluhMnt.text =
            Html.fromHtml("30 Menit/ Hari \t\t\t\t\t\t\t\t\t\t\t\t Hebat")

        binding.btnTigaMnt.setOnClickListener {
            resetbtn()
            binding.btnTigaMnt.setBackgroundColor(Color.WHITE)
            binding.btnTigaMnt.setTextColor(Color.parseColor("#744504"))
        }
        binding.btnSepuluhMnt.setOnClickListener {
            resetbtn()
            binding.btnSepuluhMnt.setBackgroundColor(Color.WHITE)
            binding.btnSepuluhMnt.setTextColor(Color.parseColor("#744504"))
        }
        binding.btnLimaBelasMnt.setOnClickListener {
            resetbtn()
            binding.btnLimaBelasMnt.setBackgroundColor(Color.WHITE)
            binding.btnLimaBelasMnt.setTextColor(Color.parseColor("#744504"))
        }
        binding.btnTigaPuluhMnt.setOnClickListener {
            resetbtn()
            binding.btnTigaPuluhMnt.setBackgroundColor(Color.WHITE)
            binding.btnTigaPuluhMnt.setTextColor(Color.parseColor("#744504"))
        }
    }

    private fun resetbtn() {
        binding.btnTigaMnt.setBackgroundColor(Color.TRANSPARENT)
        binding.btnTigaMnt.setTextColor(Color.WHITE)
        binding.btnSepuluhMnt.setBackgroundColor(Color.TRANSPARENT)
        binding.btnSepuluhMnt.setTextColor(Color.WHITE)
        binding.btnLimaBelasMnt.setBackgroundColor(Color.TRANSPARENT)
        binding.btnLimaBelasMnt.setTextColor(Color.WHITE)
        binding.btnTigaPuluhMnt.setBackgroundColor(Color.TRANSPARENT)
        binding.btnTigaPuluhMnt.setTextColor(Color.WHITE)
    }
}