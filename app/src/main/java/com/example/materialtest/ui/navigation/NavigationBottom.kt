package com.example.materialtest.ui.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialtest.R
import com.example.materialtest.databinding.ActivityNavigationBottomBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class NavigationBottom : AppCompatActivity() {

    private lateinit var binding: ActivityNavigationBottomBinding

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {
        when (it.itemId) {
            R.id.bottom_bar_favorite -> {
                binding.mainText.text = "Favoritos en construcción"
                return@OnNavigationItemSelectedListener true
            }
            R.id.bottom_bar_products -> {
                binding.mainText.text = "Productos en construcción"
                return@OnNavigationItemSelectedListener true
            }
            R.id.bottom_bar_offerts -> {
                binding.mainText.text = "Ofertas en construcción"
                return@OnNavigationItemSelectedListener true
            }
            R.id.bottom_bar_stores -> {
                binding.mainText.text = "Tiendas en construcción"
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavigationBottomBinding.inflate(layoutInflater)

        val bottomNavigationView = binding.bottomNavigation

        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        setContentView(binding.root)
    }
}
