package com.example.balingo.ui.game3

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.balingo.R
import com.example.balingo.databinding.FragmentGameFrame3Binding

class GameFrame3Fragment : Fragment() {
    private lateinit var binding: FragmentGameFrame3Binding
    private var isClicked = false
    private var answer: String = ""
    private var soal: Int = 0
    private var uSoal: Int = 0
    private val args: GameFrame3FragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentGameFrame3Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        uSoal = args.soalArgs
        gantiSoal()
        periksa()

        binding.answer1.setOnClickListener{
            resetcv()
            isClicked = uSoal == 0 || uSoal == 3
            binding.answer1.setBackgroundColor(Color.WHITE)
            binding.answer1.setTextColor(Color.parseColor("#744504"))
            binding.answer.visibility = View.VISIBLE
            binding.answer.text = binding.answer1.text
        }

        binding.answer2.setOnClickListener{
            resetcv()
            isClicked = false
            binding.answer2.setBackgroundColor(Color.WHITE)
            binding.answer2.setTextColor(Color.parseColor("#744504"))
            binding.answer.visibility = View.VISIBLE
            binding.answer.text = binding.answer2.text
        }

        binding.answer3.setOnClickListener{
            resetcv()
            isClicked = false
            binding.answer3.setBackgroundColor(Color.WHITE)
            binding.answer3.setTextColor(Color.parseColor("#744504"))
            binding.answer.visibility = View.VISIBLE
            binding.answer.text = binding.answer3.text
        }

        binding.answer4.setOnClickListener{
            resetcv()
            isClicked = false
            binding.answer4.setBackgroundColor(Color.WHITE)
            binding.answer4.setTextColor(Color.parseColor("#744504"))
            binding.answer.visibility = View.VISIBLE
            binding.answer.text = binding.answer4.text
        }

        binding.answer5.setOnClickListener{
            resetcv()
            isClicked = false
            binding.answer5.setBackgroundColor(Color.WHITE)
            binding.answer5.setTextColor(Color.parseColor("#744504"))
            binding.answer.visibility = View.VISIBLE
            binding.answer.text = binding.answer5.text
        }

        binding.answer6.setOnClickListener{
            resetcv()
            isClicked = uSoal == 1 || uSoal == 4
            binding.answer6.setBackgroundColor(Color.WHITE)
            binding.answer6.setTextColor(Color.parseColor("#744504"))
            binding.answer.visibility = View.VISIBLE
            binding.answer.text = binding.answer6.text
        }

    }

    private fun resetcv(){
        binding.answer.visibility = View.INVISIBLE
        binding.answer1.setBackgroundColor(Color.TRANSPARENT)
        binding.answer1.setTextColor(Color.WHITE)
        binding.answer2.setBackgroundColor(Color.TRANSPARENT)
        binding.answer2.setTextColor(Color.WHITE)
        binding.answer3.setBackgroundColor(Color.TRANSPARENT)
        binding.answer3.setTextColor(Color.WHITE)
        binding.answer4.setBackgroundColor(Color.TRANSPARENT)
        binding.answer4.setTextColor(Color.WHITE)
        binding.answer5.setBackgroundColor(Color.TRANSPARENT)
        binding.answer5.setTextColor(Color.WHITE)
        binding.answer6.setBackgroundColor(Color.TRANSPARENT)
        binding.answer6.setTextColor(Color.WHITE)
    }

    private fun soal(){
        if (binding.answer1.text.toString() == "Bapak" && uSoal == 0){
            soal = 1
            answer = binding.answer1.text.toString()
        }
        if (binding.answer1.text.toString() == "SELAMAT SIANG" && uSoal == 1){
            soal = 2
            answer = binding.answer6.text.toString()
        }
        if (binding.answer1.text.toString() == "SELAMAT SIANG" && uSoal == 4){
            soal = 5
            answer = binding.answer5.text.toString()
        }
        if (binding.answer1.text.toString() == "BAPAK" && uSoal == 3){
            soal = 4
            answer = binding.answer2.text.toString()
        }
    }

    private fun periksa(){
        binding.btnPeriksa.setOnClickListener {
            soal()
            if (isClicked) {
                findNavController().navigate(GameFrame3FragmentDirections.actionGameFrame3FragmentToTrueGame3Fragment(soal))
            }
            else {
                findNavController().navigate(GameFrame3FragmentDirections.actionGameFrame3FragmentToFalseGame3Fragment(answer, soal))
            }
        }

        binding.btnLanjut.setOnClickListener {
            if (uSoal == 2) {
                findNavController().navigate(
                    GameFrame3FragmentDirections.actionGameFrame3FragmentToPelajaranSelesaiFragment(
                        1
                    )
                )
            }
            if (uSoal == 5) {
                findNavController().navigate(
                    GameFrame3FragmentDirections.actionGameFrame3FragmentToPelajaranSelesaiFragment(
                        2
                    )
                )
            }
        }
    }

    private fun gantiSoal(){
        if (uSoal == 1){
            binding.imgBahasa.setImageResource(R.drawable.talk_bale2)
            binding.answer1.text = "SELAMAT SIANG"
            binding.answer2.text = "HALO"
            binding.answer3.text = "SUDAH"
            binding.answer4.text = "BELUM"
            binding.answer5.text = "HAI"
            binding.answer6.text = "SELAMAT DATANG"
        }
        if (uSoal == 2){
            binding.imgBahasa.setImageResource(R.drawable.talk_bale2)
            binding.answer1.text = "SELAMAT SIANG"
            binding.answer2.text = "HALO"
            binding.answer3.text = "SUDAH"
            binding.answer4.text = "BELUM"
            binding.answer5.text = "HAI"
            binding.answer6.text = "SELAMAT DATANG"
            binding.btnBenar.visibility = View.VISIBLE
            binding.btnLanjut.visibility = View.VISIBLE
            binding.btnPeriksa.visibility = View.GONE
        }
        if (uSoal == 3){
            binding.imgBahasa.setImageResource(R.drawable.talk_bale)
            binding.answer1.text = "BAPAK"
            binding.answer2.text = "NENEK"
            binding.answer3.text = "KAKEK"
            binding.answer4.text = "SAYA"
            binding.answer5.text = "KAMU"
            binding.answer6.text = "KAKAK PEREMPUAN"
        }
        if (uSoal == 4){
            binding.imgBahasa.setImageResource(R.drawable.talk_bale2)
            binding.answer1.text = "SELAMAT SIANG"
            binding.answer2.text = "HALO"
            binding.answer3.text = "SUDAH"
            binding.answer4.text = "BELUM"
            binding.answer5.text = "HAI"
            binding.answer6.text = "SELAMAT DATANG"
        }
        if (uSoal == 5){
            binding.imgBahasa.setImageResource(R.drawable.talk_bale2)
            binding.answer1.text = "SELAMAT SIANG"
            binding.answer2.text = "HALO"
            binding.answer3.text = "SUDAH"
            binding.answer4.text = "BELUM"
            binding.answer5.text = "HAI"
            binding.answer6.text = "SELAMAT DATANG"
            binding.btnBenar.visibility = View.VISIBLE
            binding.btnLanjut.visibility = View.VISIBLE
            binding.btnPeriksa.visibility = View.GONE
        }
    }



}