package com.example.materialtest.ui.regular

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.example.materialtest.databinding.ActivityTextFieldStuffBinding

class TextFieldStuff : AppCompatActivity() {

    private lateinit var binding: ActivityTextFieldStuffBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTextFieldStuffBinding.inflate(layoutInflater)

        val products = arrayListOf<String>("Pan", "Galletas", "Bizcochos", "Flan", "Brazo Gitano")
        val adapter = ArrayAdapter(this.applicationContext, R.layout.simple_spinner_dropdown_item, products)

        val dropDown: AutoCompleteTextView = binding.autoCompleteDropDown
        dropDown.setAdapter(adapter)

        setContentView(binding.root)
    }
}
