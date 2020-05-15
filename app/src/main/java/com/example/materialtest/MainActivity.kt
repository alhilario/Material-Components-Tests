package com.example.materialtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialtest.databinding.ActivityMainBinding
import com.example.materialtest.ui.app_bars.BarsBottom
import com.example.materialtest.ui.app_bars.BarsTop
import com.example.materialtest.ui.floating_button.ActionButton
import com.example.materialtest.ui.navigation.NavigationBottom

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btnAppBarBottom.setOnClickListener{
            val intent = Intent(this, BarsBottom::class.java)
            startActivity(intent)
        }

        binding.btnAppBarTop.setOnClickListener {
            val intent = Intent(this, BarsTop::class.java)
            startActivity(intent)
        }

        binding.btnBottomNavigation.setOnClickListener {
            val intent = Intent(this, NavigationBottom::class.java)
            startActivity(intent)
        }

        binding.btnFloatingButton.setOnClickListener {
            val intent = Intent(this, ActionButton::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }
}
