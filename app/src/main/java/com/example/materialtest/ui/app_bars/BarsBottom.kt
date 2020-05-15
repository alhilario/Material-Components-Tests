package com.example.materialtest.ui.app_bars

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import com.example.materialtest.R
import com.example.materialtest.databinding.ActivityBarsBottomBinding
import com.google.android.material.bottomappbar.BottomAppBar


class BarsBottom : AppCompatActivity() {

    private lateinit var binding: ActivityBarsBottomBinding

    private lateinit var bottomBar: BottomAppBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBarsBottomBinding.inflate(layoutInflater)

        bottomBar = binding.bottomBar
        setSupportActionBar(bottomBar)

        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.bottom_bar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}
