package com.roynaldi19.test

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
//            val angka3 = binding.edt3.text.toString().toInt()
//            val angka4 = binding.edt4.text.toString().toInt()
//            val angka5 = binding.edt5.text.toString().toInt()

            if (angka1 < angka2){
                binding.tvHasil.text = "$angka1, $angka2"

            } else{
                binding.tvHasil.text = "$angka2, $angka1"
            }
        }
    }
}