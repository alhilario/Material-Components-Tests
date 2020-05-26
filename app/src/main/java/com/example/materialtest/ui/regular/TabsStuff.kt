package com.example.materialtest.ui.regular

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.materialtest.databinding.ActivityTabsStuffBinding

class TabsStuff : AppCompatActivity() {

    private lateinit var binding: ActivityTabsStuffBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabsStuffBinding.inflate(layoutInflater)

        val tolbar: Toolbar = binding.appToolbar
        setSupportActionBar(tolbar)

        setContentView(binding.root)
    }
}
