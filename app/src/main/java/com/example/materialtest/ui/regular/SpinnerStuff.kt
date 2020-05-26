package com.example.materialtest.ui.regular

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.materialtest.databinding.ActivitySpinnerStuffBinding
import com.tiper.MaterialSpinner

class SpinnerStuff : AppCompatActivity() {

    private lateinit var binding: ActivitySpinnerStuffBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpinnerStuffBinding.inflate(layoutInflater)

        val products = arrayListOf("Pan", "Galletas", "Bizcochos", "Flan", "Brazo Gitano")
        val adapter = ArrayAdapter(this.applicationContext, R.layout.simple_spinner_dropdown_item, products)

        val dropDown: MaterialSpinner = binding.materialSpinner
        dropDown.adapter = adapter

        setContentView(binding.root)
    }
}
