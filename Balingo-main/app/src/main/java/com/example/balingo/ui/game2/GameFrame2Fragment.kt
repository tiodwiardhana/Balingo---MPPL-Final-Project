package com.example.balingo.ui.game2

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.balingo.R
import com.example.balingo.databinding.FragmentGameFrame2Binding

class GameFrame2Fragment : Fragment() {
    private var _binding: FragmentGameFrame2Binding? = null
    private var isClicked = false
    private val binding get() = _binding!!
    private var answer: String = ""
    private var soal: Int = 0
    private var uSoal: Int = 0
    private val args: GameFrame2FragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentGameFrame2Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        uSoal = args.soalArgs
        gantiSoal()
        periksa()

        binding.answer1.setOnClickListener{
            resetcv()
            isClicked = uSoal == 1 || uSoal == 2 || uSoal == 5
            binding.answer1.setBackgroundColor(Color.WHITE)
            binding.answer1.setTextColor(Color.BLACK)
        }

        binding.answer2.setOnClickListener{
            resetcv()
            isClicked = false
            binding.answer2.setBackgroundColor(Color.WHITE)
            binding.answer2.setTextColor(Color.BLACK)
        }

        binding.answer3.setOnClickListener{
            resetcv()
            isClicked = uSoal == 0 || uSoal == 4 || uSoal == 6
            binding.answer3.setBackgroundColor(Color.WHITE)
            binding.answer3.setTextColor(Color.BLACK)
        }

        binding.answer4.setOnClickListener{
            resetcv()
            isClicked = false
            binding.answer4.setBackgroundColor(Color.WHITE)
            binding.answer4.setTextColor(Color.BLACK)
        }

    }

    private fun resetcv(){
        binding.answer1.setBackgroundColor(Color.TRANSPARENT)
        binding.answer1.setTextColor(Color.WHITE)
        binding.answer2.setBackgroundColor(Color.TRANSPARENT)
        binding.answer2.setTextColor(Color.WHITE)
        binding.answer3.setBackgroundColor(Color.TRANSPARENT)
        binding.answer3.setTextColor(Color.WHITE)
        binding.answer4.setBackgroundColor(Color.TRANSPARENT)
        binding.answer4.setTextColor(Color.WHITE)
    }

    private fun soal(){
        if (binding.tvBahasa.text.toString() == "Bagaimana cara mengucapkan “Selamat Siang” dalam Bahasa Bali ?"){
            soal = 1
            answer = binding.answer3.text.toString()
        }
        if (binding.tvBahasa.text.toString() == "Bagaimana cara mengucapkan “Selamat Pagi” dalam Bahasa Bali ?"){
            soal = 2
            answer = binding.answer1.text.toString()
        }
        if (binding.tvBahasa.text.toString() == "Bagaimana cara mengucapkan “Selamat Datang” dalam Bahasa Bali ?"){
            soal = 3
            answer = binding.answer1.text.toString()
        }
        if (binding.tvBahasa.text.toString() == "Bagaimana cara mengucapkan “Terima Kasih” dalam Bahasa Bali ?"){
            soal = 5
            answer = binding.answer3.text.toString()
        }
        if (binding.tvBahasa.text.toString() == "Bagaimana cara mengucapkan “Apa Kabarnya” dalam Bahasa Bali ?"){
            soal = 6
            answer = binding.answer1.text.toString()
        }
        if (binding.tvBahasa.text.toString() == "Bagaimana cara mengucapkan “Berapa harga barang ini ?” dalam Bahasa Bali ?"){
            soal = 7
            answer = binding.answer3.text.toString()
        }
    }

    private fun periksa(){
        binding.btnPeriksa.setOnClickListener {
            soal()
            if (isClicked) {
                findNavController().navigate(GameFrame2FragmentDirections.actionGameFrame2FragmentToTrueGame2Fragment(soal))
            }
            else {
                findNavController().navigate(GameFrame2FragmentDirections.actionGameFrame2FragmentToFalseGame2Fragment(answer, soal))
            }
        }

        binding.btnLanjut.setOnClickListener {
            if (uSoal == 3) {
                findNavController().navigate(GameFrame2FragmentDirections.actionGameFrame2FragmentToGameFrame3Fragment(0))
            }
            if (uSoal == 7) {
                findNavController().navigate(GameFrame2FragmentDirections.actionGameFrame2FragmentToGameFrame3Fragment(3))
            }
        }
    }

    private fun gantiSoal(){
        if (uSoal == 1){
            binding.tvBahasa.text = "Bagaimana cara mengucapkan “Selamat Pagi” dalam Bahasa Bali ?"
            binding.answer1.text = "Rahajeng Pagi"
            binding.answer2.text = "Rahajeng Semeng"
            binding.answer3.text = "Rahajeng Siang"
            binding.answer4.text = "Rahajeng Malam"
        }
        if (uSoal == 2){
            binding.tvBahasa.text = "Bagaimana cara mengucapkan “Selamat Datang” dalam Bahasa Bali ?"
            binding.answer1.text = "Om Swastiastu"
            binding.answer2.text = "Rahajeng Wengi"
            binding.answer3.text = "Matur Suksma"
            binding.answer4.text = "Suksma Mewali"
        }
        if (uSoal == 3){
            binding.tvBahasa.text = "Bagaimana cara mengucapkan “Selamat Datang” dalam Bahasa Bali ?"
            binding.answer1.text = "Om Swastiastu"
            binding.answer2.text = "Rahajeng Wengi"
            binding.answer3.text = "Matur Suksma"
            binding.answer4.text = "Suksma Mewali"
            binding.btnBenar.visibility = View.VISIBLE
            binding.btnLanjut.visibility = View.VISIBLE
            binding.btnPeriksa.visibility = View.GONE
        }

        if (uSoal == 4){
            binding.tvBahasa.text = "Bagaimana cara mengucapkan “Terima Kasih” dalam Bahasa Bali ?"
            binding.answer1.text = "Rahajeng Pagi"
            binding.answer2.text = "Aji Kuda Niki ?"
            binding.answer3.text = "Matur Suksma"
            binding.answer4.text = "Becik-becik"
        }
        if (uSoal == 5){
            binding.tvBahasa.text = "Bagaimana cara mengucapkan “Apa Kabarnya” dalam Bahasa Bali ?"
            binding.answer1.text = "Ken-ken Kabare ?"
            binding.answer2.text = "Aji Kuda Niki ?"
            binding.answer3.text = "Om Swastiastu"
            binding.answer4.text = "Suksma Mewali"
        }
        if (uSoal == 6){
            binding.tvBahasa.text = "Bagaimana cara mengucapkan “Berapa harga barang ini ?” dalam Bahasa Bali ?"
            binding.answer1.text = "Ken-ken Kabare ?"
            binding.answer2.text = "Aji Kuda Niki ?"
            binding.answer3.text = "Harga Niki ?"
            binding.answer4.text = "Suksma Mewali"
        }
        if (uSoal == 7){
            binding.tvBahasa.text = "Bagaimana cara mengucapkan “Berapa harga barang ini ?” dalam Bahasa Bali ?"
            binding.answer1.text = "Ken-ken Kabare ?"
            binding.answer2.text = "Aji Kuda Niki ?"
            binding.answer3.text = "Harga Niki ?"
            binding.answer4.text = "Suksma Mewali"
            binding.btnBenar.visibility = View.VISIBLE
            binding.btnLanjut.visibility = View.VISIBLE
            binding.btnPeriksa.visibility = View.GONE
        }
    }

}