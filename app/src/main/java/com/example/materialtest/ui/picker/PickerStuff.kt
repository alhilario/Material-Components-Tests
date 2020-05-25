package com.example.materialtest.ui.picker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.materialtest.R
import com.example.materialtest.databinding.ActivityPickerStuffBinding
import com.google.android.material.datepicker.MaterialDatePicker

class PickerStuff : AppCompatActivity() {

    private lateinit var binding: ActivityPickerStuffBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPickerStuffBinding.inflate(layoutInflater)

        val buttonPicker: Button = binding.btnDatePicker

        val builder = MaterialDatePicker.Builder.datePicker()
        builder.setTitleText(R.string.select_date)

        val materialDatePicket = builder.build()

        buttonPicker.setOnClickListener {
            materialDatePicket.show(supportFragmentManager, "Date Picker")

        }

        val selectedDatetext: TextView = binding.selectedDate

        materialDatePicket.addOnPositiveButtonClickListener {
            selectedDatetext.setText("Fecha selecionada: " + materialDatePicket.headerText)

        }

        setContentView(binding.root)
    }
}
