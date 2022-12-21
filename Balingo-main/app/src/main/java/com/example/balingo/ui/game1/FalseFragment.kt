package com.example.balingo.ui.game1

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
import com.example.balingo.databinding.FragmentFalseBinding

class FalseFragment : DialogFragment() {
    private lateinit var binding: FragmentFalseBinding
    private val args: FalseFragmentArgs by navArgs()

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
        binding = FragmentFalseBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtbenar.text = args.myArg
        binding.txtYgBenar.text = "Jawaban yang benar adalah : "

        binding.lanjut.setOnClickListener {
            findNavController().navigate(FalseFragmentDirections.actionFalseFragmentToGameFrame1Fragment(args.soalArgs))
        }
    }

}