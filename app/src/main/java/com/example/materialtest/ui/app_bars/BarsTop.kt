package com.example.materialtest.ui.app_bars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialtest.databinding.ActivityBarsTopBinding

class BarsTop : AppCompatActivity() {

    private lateinit var binding: ActivityBarsTopBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBarsTopBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}
