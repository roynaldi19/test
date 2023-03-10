package com.roynaldi19.test

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.roynaldi19.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnUrutkan.setOnClickListener {
            val angka1 = binding.edt1.text.toString().toInt()
            val angka2 = binding.edt2.text.toString().toInt()
            val angka3 = binding.edt3.text.toString().toInt()
            val angka4 = binding.edt4.text.toString().toInt()
            val angka5 = binding.edt5.text.toString().toInt()

            if (angka1 > angka2 && angka1 > angka3 && angka1 > angka4 && angka1 > angka5) {
                binding.tvAngkaMaximal.text = "nilai maximal atau terbesar adalah $angka1"

            } else if (angka2 > angka1 && angka2 > angka3 && angka2 > angka4 && angka2 > angka5) {
                binding.tvAngkaMaximal.text = "nilai maximal atau terbesar adalah $angka2"
            } else if (angka3 > angka1 && angka3 > angka2 && angka3 > angka4 && angka3 > angka5) {
                binding.tvAngkaMaximal.text = "nilai maximal atau terbesar adalah $angka3"
            } else if (angka4 > angka1 && angka4 > angka2 && angka4 > angka3 && angka4 > angka5) {
                binding.tvAngkaMaximal.text = "nilai maximal atau terbesar adalah $angka4"
            } else {
                binding.tvAngkaMaximal.text = "nilai maximal atau terbesar adalah $angka5"

            }

//            val edtArray = arrayOf(angka1, angka2, angka3, angka4, angka5)
//
//            edtArray.sort()
//            for (i in 0 until edtArray.size ){
//                binding.tvAngkaSort.text = "$edtArray[i].to, $edtArray[2]"
//
//            }
        }
    }
}