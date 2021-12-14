package com.mdapp.kotlinbasicsmdapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.snackbar.Snackbar
import com.mdapp.kotlinbasicsmdapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        binding.button1.setOnClickListener {
            Snackbar.make(binding.rlLayout, "Button tapped!", 2000).show()
        }

        binding.imageElasticView.setOnClickListener {
            Snackbar.make(binding.rlLayout, "CardView tapped!", 2000).show()
        }

    }
}


