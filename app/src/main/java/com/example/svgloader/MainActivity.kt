package com.example.svgloader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.svgloader.databinding.ActivityMainBinding
import com.example.svgloader.glideUtil.loadImage

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUi()
    }

    private fun setupUi() {
        binding.apply {
            imageOne.loadImage("https://www.hblbbapp.com/NextGenContent/Icons/Dashboard/Advance/Payment.png")
            imageTwo.loadImage("https://www.hblbbapp.com/NextGenContent/Icons/Dashboard/Advance/Payment.svg")
        }
    }
}