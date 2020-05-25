package com.example.materialtest.ui.selection_controls

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView
import com.example.materialtest.databinding.ActivityRadioButtonsStuffBinding

class RadioButtonsStuff : AppCompatActivity() {

    private lateinit var binding: ActivityRadioButtonsStuffBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRadioButtonsStuffBinding.inflate(layoutInflater)

        val radioChocolate: RadioButton = binding.radioChocolate
        val radioVanilla: RadioButton = binding.radioVanilla
        val radioStrawberry: RadioButton = binding.radioStrawberry
        val radioCocoa: RadioButton = binding.radioCocoa

        val textResult: TextView = binding.textResult

        binding.btnResult.setOnClickListener {
            var resultText = "Ñeñeco"

            if(radioChocolate.isChecked) {
                resultText = "Chocolate"
            }

            if(radioVanilla.isChecked) {
                resultText = "Vainilla"
            }

            if(radioStrawberry.isChecked) {
                resultText = "Fresa"
            }

            if(radioCocoa.isChecked) {
                resultText = "Cacao"
            }

            textResult.text = ("Su sabor favorito es " + resultText)
        }

        setContentView(binding.root)
    }
}
