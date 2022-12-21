package com.example.balingo.ui.game3

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.balingo.databinding.FragmentFalseGame3Binding

class FalseGame3Fragment : DialogFragment() {
    private lateinit var binding: FragmentFalseGame3Binding
    private val args: FalseGame3FragmentArgs by navArgs()

    override fun onStart() {
        super.onStart()
        dialog!!.window
            ?.setLayout(
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT
            )
        dialog!!.window
            ?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFalseGame3Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtbenar.text = args.myArg
        binding.txtYgBenar.text = "Jawaban yang benar adalah : "

        binding.lanjut.setOnClickListener {
            findNavController().navigate(FalseGame3FragmentDirections.actionFalseGame3FragmentToGameFrame3Fragment(args.soalArgs))
        }
    }

}