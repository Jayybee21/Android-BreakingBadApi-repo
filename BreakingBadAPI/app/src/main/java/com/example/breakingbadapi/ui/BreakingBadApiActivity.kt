package com.example.breakingbadapi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.breakingbadapi.R
import com.example.breakingbadapi.databinding.ActivityBreakingBadApiBinding

class BreakingBadApiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreakingBadApiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBreakingBadApiBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}