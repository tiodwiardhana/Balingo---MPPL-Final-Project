package com.example.balingo.ui.opening

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.balingo.R
import com.example.balingo.databinding.FragmentOpeningFrame4Binding
import com.example.balingo.ui.MapFrameFragmentArgs

class OpeningFrame4Fragment : Fragment() {
    private lateinit var binding: FragmentOpeningFrame4Binding
    private val args: OpeningFrame4FragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOpeningFrame4Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (args.soalArgs == 0) {
            Handler(Looper.myLooper()!!).postDelayed({
                findNavController().navigate(R.id.action_openingFrame4Fragment_to_openingFrame5Fragment)
            }, 1000)
        }
        if (args.soalArgs == 4){
            binding.txt.text = "Fun Fact: Kopi termahal di dunia adalah\n Kopi Luwak yang berasal dari Bali!"
            Handler(Looper.myLooper()!!).postDelayed({
                findNavController().navigate(OpeningFrame4FragmentDirections.actionOpeningFrame4FragmentToOpeningFrame8Fragment(4))
            }, 1000)
        }
        if (args.soalArgs == 5) {
            binding.txt.text = "Fun Fact: Kopi termahal di dunia adalah\n Kopi Luwak yang berasal dari Bali!"
            Handler(Looper.myLooper()!!).postDelayed({
                findNavController().navigate(OpeningFrame4FragmentDirections.actionOpeningFrame4FragmentToOpeningFrame8Fragment(0))
            }, 1000)
        }
    }

}