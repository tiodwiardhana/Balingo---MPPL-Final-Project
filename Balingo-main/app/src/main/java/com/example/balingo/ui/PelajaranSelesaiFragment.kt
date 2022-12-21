package com.example.balingo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.balingo.R
import com.example.balingo.databinding.FragmentPelajaranSelesaiBinding
import com.example.balingo.ui.game3.GameFrame3FragmentArgs

class PelajaranSelesaiFragment : Fragment() {
    private lateinit var binding: FragmentPelajaranSelesaiBinding
    private val args: PelajaranSelesaiFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentPelajaranSelesaiBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNext.setOnClickListener{
            findNavController().navigate(PelajaranSelesaiFragmentDirections.actionPelajaranSelesaiFragmentToMapFrameFragment(args.mapArgs))
        }
    }
}