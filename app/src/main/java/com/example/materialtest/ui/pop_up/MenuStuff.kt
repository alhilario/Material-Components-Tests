package com.example.materialtest.ui.pop_up

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.example.materialtest.R
import com.example.materialtest.databinding.ActivityMenuStuffBinding

class MenuStuff : AppCompatActivity() {

    private lateinit var binding: ActivityMenuStuffBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuStuffBinding.inflate(layoutInflater)

        setSupportActionBar(binding.bar)

        val fruit = arrayListOf<String>("Pizza", "Coca Cola", "Azucar")
        val adapter = ArrayAdapter(this.applicationContext, android.R.layout.simple_spinner_dropdown_item, fruit)

        val dropDown: AutoCompleteTextView = binding.filledExposedDropdown
        dropDown.setAdapter(adapter)

        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}
