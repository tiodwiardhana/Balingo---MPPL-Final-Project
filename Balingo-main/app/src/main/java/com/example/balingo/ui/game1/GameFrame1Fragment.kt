package com.example.balingo.ui.game1

import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.balingo.R
import com.example.balingo.databinding.FragmentGameFrame1Binding

class GameFrame1Fragment : Fragment() {
    private var _binding: FragmentGameFrame1Binding? = null
    private var isClicked = false
    private val binding get() = _binding!!
    private var answer: String = ""
    private var soal: Int = 0
    private var uSoal: Int = 0
    private val args: GameFrame1FragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentGameFrame1Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        uSoal = args.soalArgs
        gantiSoal()
        periksa()

        binding.audio.setOnClickListener{
            audio()
        }

        binding.cv1.setOnClickListener{
            resetcv()
            isClicked = uSoal == 0 || uSoal == 2 || uSoal == 6
            binding.cv1.setCardBackgroundColor(Color.WHITE)
            binding.tvGameA.setTextColor(Color.BLACK)
        }

        binding.cv2.setOnClickListener{
            resetcv()
            isClicked = uSoal == 7
            binding.cv2.setCardBackgroundColor(Color.WHITE)
            binding.tvGameB.setTextColor(Color.BLACK)
        }

        binding.cv3.setOnClickListener{
            resetcv()
            isClicked = uSoal == 1 || uSoal == 4 || uSoal == 5
            binding.cv3.setCardBackgroundColor(Color.WHITE)
            binding.tvGameC.setTextColor(Color.BLACK)
        }

        binding.cv4.setOnClickListener{
            resetcv()
            isClicked = false
            binding.cv4.setCardBackgroundColor(Color.WHITE)
            binding.tvGameD.setTextColor(Color.BLACK)
        }

    }

    private fun audio(){
        if (binding.tvGameA.text.toString() == "Bapak"){
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(context, R.raw.bli)
            mediaPlayer?.start()
        }
        if (binding.tvGameA.text.toString() == "Kabar Baik !"){
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(context, R.raw.kenken)
            mediaPlayer?.start()
        }
        if (binding.tvGameA.text.toString() == "Selamat Pagi"){
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(context, R.raw.matur)
            mediaPlayer?.start()
        }
        if (binding.tvGameA.text.toString() == "Kuda apa ini ?"){
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(context, R.raw.aji)
            mediaPlayer?.start()
        }
        if (binding.tvGameA.text.toString() == "Tenda"){
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(context, R.raw.umah)
            mediaPlayer?.start()
        }
    }

    private fun resetcv(){
        binding.cv1.setCardBackgroundColor(Color.TRANSPARENT)
        binding.tvGameA.setTextColor(Color.WHITE)
        binding.cv2.setCardBackgroundColor(Color.TRANSPARENT)
        binding.tvGameB.setTextColor(Color.WHITE)
        binding.cv3.setCardBackgroundColor(Color.TRANSPARENT)
        binding.tvGameC.setTextColor(Color.WHITE)
        binding.cv4.setCardBackgroundColor(Color.TRANSPARENT)
        binding.tvGameD.setTextColor(Color.WHITE)
    }

    private fun soal(){
        if (binding.tvGameA.text.toString() == "Bapak"){
            soal = 1
            answer = binding.tvGameA.text.toString()
        }
        if (binding.tvGameA.text.toString() == "Kakak Laki-laki"){
            soal = 2
            answer = binding.tvGameC.text.toString()
        }
        if (binding.tvGameA.text.toString() == "Ayah"){
            soal = 3
            answer = binding.tvGameA.text.toString()
        }
        if (binding.tvGameA.text.toString() == "Kabar Baik !"){
            soal = 5
            answer = binding.tvGameC.text.toString()
        }
        if (binding.tvGameA.text.toString() == "Selamat Pagi"){
            soal = 6
            answer = binding.tvGameC.text.toString()
        }
        if (binding.tvGameA.text.toString() == "Kuda apa ini ?"){
            soal = 7
            answer = binding.tvGameA.text.toString()
        }
        if (binding.tvGameA.text.toString() == "Tenda"){
            soal = 8
            answer = binding.tvGameB.text.toString()
        }
    }

    private fun periksa(){
        binding.btnPeriksa.setOnClickListener {
            soal()
            if (isClicked) {
                findNavController().navigate(GameFrame1FragmentDirections.actionGameFrame1FragmentToTrueFragment2(soal))
            }
            else {
                findNavController().navigate(GameFrame1FragmentDirections.actionGameFrame1FragmentToFalseFragment(answer, soal))
            }
        }

        binding.btnLanjut.setOnClickListener {
            if (uSoal == 3) {
                findNavController().navigate(
                    GameFrame1FragmentDirections.actionGameFrame1FragmentToGameFrame2Fragment(
                        0
                    )
                )
            }
            if (uSoal == 8) {
                findNavController().navigate(
                    GameFrame1FragmentDirections.actionGameFrame1FragmentToGameFrame2Fragment(
                        4
                    )
                )
            }
        }
    }

    private fun gantiSoal(){
        if (uSoal == 1){
            binding.tvBahasa.text = "mbok"
            binding.tvGameA.text = "Kakak Laki-laki"
            binding.tvGameB.text = "Ibu"
            binding.tvGameC.text = "Kakak Perempuan"
            binding.tvGameD.text = "Sepupu Laki-laki"
        }
        if (uSoal == 2){
            binding.tvBahasa.text = "biyang"
            binding.tvGameA.text = "Ayah"
            binding.tvGameB.text = "Ibu"
            binding.tvGameC.text = "Kakek"
            binding.tvGameD.text = "Adik Perempuan"
        }
        if (uSoal == 3){
            binding.tvBahasa.text = "biyang"
            binding.tvGameA.text = "Ayah"
            binding.tvGameB.text = "Ibu"
            binding.tvGameC.text = "Kakek"
            binding.tvGameD.text = "Adik Perempuan"
            binding.btnBenar.visibility = View.VISIBLE
            binding.btnLanjut.visibility = View.VISIBLE
            binding.btnPeriksa.visibility = View.GONE
        }
        if (uSoal == 4){
            binding.tvBahasa.text = "Kenken Kabare ?"
            binding.tvGameA.text = "Kabar Baik !"
            binding.tvGameB.text = "Baik Kabarnya?"
            binding.tvGameC.text = "Apa Kabarnya?"
            binding.tvGameD.text = "Selamat Datang"
        }

        if (uSoal == 5){
            binding.tvBahasa.text = "Matur Suksma"
            binding.tvGameA.text = "Selamat Pagi"
            binding.tvGameB.text = "Apa Kabarnya ?"
            binding.tvGameC.text = "Sama-sama"
            binding.tvGameD.text = "Terimakasih"
        }

        if (uSoal == 6){
            binding.tvBahasa.text = "Aji Kuda Niki ?"
            binding.tvGameA.text = "Kuda apa ini ?"
            binding.tvGameB.text = "Kuda di Taman"
            binding.tvGameC.text = "Berapa Harga Barang  ini?"
            binding.tvGameD.text = "Apa nama barang disana?"
        }
        if (uSoal == 7){
            binding.tvBahasa.text = "Umah"
            binding.tvGameA.text = "Tenda"
            binding.tvGameB.text = "Rumah"
            binding.tvGameC.text = "Taman"
            binding.tvGameD.text = "Sekolah"
        }
        if (uSoal == 8){
            binding.tvBahasa.text = "Umah"
            binding.tvGameA.text = "Tenda"
            binding.tvGameB.text = "Rumah"
            binding.tvGameC.text = "Taman"
            binding.tvGameD.text = "Sekolah"
            binding.btnBenar.visibility = View.VISIBLE
            binding.btnLanjut.visibility = View.VISIBLE
            binding.btnPeriksa.visibility = View.GONE
        }
    }

}