package com.example.materialtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialtest.databinding.ActivityMainBinding
import com.example.materialtest.ui.app_bars.BarsBottom

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btnAppBarBottom.setOnClickListener{
            val intent = Intent(this, BarsBottom::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }
}
