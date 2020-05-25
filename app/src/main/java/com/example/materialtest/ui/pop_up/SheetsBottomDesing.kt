package com.example.materialtest.ui.pop_up

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialtest.databinding.ActivitySheetsBottomDesingBinding

class SheetsBottomDesing : AppCompatActivity() {

    private lateinit var binding: ActivitySheetsBottomDesingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySheetsBottomDesingBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}
