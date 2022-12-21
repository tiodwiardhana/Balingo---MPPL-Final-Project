package com.example.balingo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.balingo.R
import com.example.balingo.databinding.FragmentMapFrameBinding
import com.example.balingo.ui.game3.TrueGame3FragmentArgs
import com.google.android.material.snackbar.Snackbar
import kotlin.properties.Delegates


class MapFrameFragment : Fragment(){
    private lateinit var binding: FragmentMapFrameBinding
    private val args: MapFrameFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMapFrameBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        map()


        binding.btn2.setOnClickListener {
            if (args.mapArgs == 1) {
                findNavController().navigate(
                    MapFrameFragmentDirections.actionMapFrameFragmentToOpeningFrame4Fragment(
                        4
                    )
                )
            }
            else {
                Snackbar.make(binding.root, "Selesaikan liga saat ini", Snackbar.LENGTH_SHORT)
                    .setBackgroundTint(
                        ContextCompat.getColor(requireContext(),
                            R.color.secondary_light
                        ))
                    .setTextColor(ContextCompat.getColor(requireContext(), R.color.main_dark))
                    .show()
            }
        }

        binding.btn3.setOnClickListener {
            if (args.mapArgs == 2){
                findNavController().navigate(MapFrameFragmentDirections.actionMapFrameFragmentToOpeningFrame4Fragment(5))
            }
            else {
                Snackbar.make(binding.root, "Selesaikan liga saat ini", Snackbar.LENGTH_SHORT)
                    .setBackgroundTint(
                        ContextCompat.getColor(requireContext(),
                            R.color.secondary_light
                    ))
                    .setTextColor(ContextCompat.getColor(requireContext(), R.color.main_dark))
                    .show()
            }
        }

        binding.btn4.setOnClickListener {
            if (args.mapArgs == 3){
                findNavController().navigate(MapFrameFragmentDirections.actionMapFrameFragmentToOpeningFrame4Fragment(5))
            }
            else {
                Snackbar.make(binding.root, "Selesaikan liga saat ini", Snackbar.LENGTH_SHORT)
                    .setBackgroundTint(
                        ContextCompat.getColor(requireContext(),
                            R.color.secondary_light
                        ))
                    .setTextColor(ContextCompat.getColor(requireContext(), R.color.main_dark))
                    .show()
            }
        }
        binding.btn5.setOnClickListener {
            if (args.mapArgs == 4){
                findNavController().navigate(MapFrameFragmentDirections.actionMapFrameFragmentToOpeningFrame4Fragment(5))
            }
            else {
                Snackbar.make(binding.root, "Selesaikan liga saat ini", Snackbar.LENGTH_SHORT)
                    .setBackgroundTint(
                        ContextCompat.getColor(requireContext(),
                            R.color.secondary_light
                        ))
                    .setTextColor(ContextCompat.getColor(requireContext(), R.color.main_dark))
                    .show()
            }
        }
        binding.btn6.setOnClickListener {
            if (args.mapArgs == 5){
                findNavController().navigate(MapFrameFragmentDirections.actionMapFrameFragmentToOpeningFrame4Fragment(5))
            }
            else {
                Snackbar.make(binding.root, "Selesaikan liga saat ini", Snackbar.LENGTH_SHORT)
                    .setBackgroundTint(
                        ContextCompat.getColor(requireContext(),
                            R.color.secondary_light
                        ))
                    .setTextColor(ContextCompat.getColor(requireContext(), R.color.main_dark))
                    .show()
            }
        }
        binding.btn7.setOnClickListener {
            if (args.mapArgs == 6){
                findNavController().navigate(MapFrameFragmentDirections.actionMapFrameFragmentToOpeningFrame4Fragment(5))
            }
            else {
                Snackbar.make(binding.root, "Selesaikan liga saat ini", Snackbar.LENGTH_SHORT)
                    .setBackgroundTint(
                        ContextCompat.getColor(requireContext(),
                            R.color.secondary_light
                        ))
                    .setTextColor(ContextCompat.getColor(requireContext(), R.color.main_dark))
                    .show()
            }
        }
        binding.btn8.setOnClickListener {
            if (args.mapArgs == 7){
                findNavController().navigate(MapFrameFragmentDirections.actionMapFrameFragmentToOpeningFrame4Fragment(5))
            }
            else {
                Snackbar.make(binding.root, "Selesaikan liga saat ini", Snackbar.LENGTH_SHORT)
                    .setBackgroundTint(
                        ContextCompat.getColor(requireContext(),
                            R.color.secondary_light
                        ))
                    .setTextColor(ContextCompat.getColor(requireContext(), R.color.main_dark))
                    .show()
            }
        }

        binding.btnProfile.setOnClickListener{
            findNavController().navigate(R.id.action_mapFrameFragment_to_profileFragment)
        }

    }

    fun map(){
        if (args.mapArgs == 1){
            binding.btn1.setImageResource(R.drawable.done)
            binding.btn2.setImageResource(R.drawable.mulai)
        }
        if (args.mapArgs == 2){
            binding.btn1.setImageResource(R.drawable.done)
            binding.btn2.setImageResource(R.drawable.done)
            binding.btn3.setImageResource(R.drawable.mulai)
        }
        if (args.mapArgs == 3){
            binding.btn1.setImageResource(R.drawable.done)
            binding.btn2.setImageResource(R.drawable.done)
            binding.btn3.setImageResource(R.drawable.done)
            binding.btn4.setImageResource(R.drawable.mulai)
        }
        if (args.mapArgs == 4){
            binding.btn1.setImageResource(R.drawable.done)
            binding.btn2.setImageResource(R.drawable.done)
            binding.btn3.setImageResource(R.drawable.done)
            binding.btn4.setImageResource(R.drawable.done)
            binding.btn5.setImageResource(R.drawable.mulai)
        }
        if (args.mapArgs == 4){
            binding.btn1.setImageResource(R.drawable.done)
            binding.btn2.setImageResource(R.drawable.done)
            binding.btn3.setImageResource(R.drawable.done)
            binding.btn4.setImageResource(R.drawable.done)
            binding.btn5.setImageResource(R.drawable.mulai)
        }
        if (args.mapArgs == 5){
            binding.btn1.setImageResource(R.drawable.done)
            binding.btn2.setImageResource(R.drawable.done)
            binding.btn3.setImageResource(R.drawable.done)
            binding.btn4.setImageResource(R.drawable.done)
            binding.btn5.setImageResource(R.drawable.done)
            binding.btn6.setImageResource(R.drawable.mulai)
        }
    }

}