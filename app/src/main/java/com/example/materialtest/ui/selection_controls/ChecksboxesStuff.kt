package com.example.materialtest.ui.selection_controls

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import com.example.materialtest.databinding.ActivityChecksboxesStuffBinding

class ChecksboxesStuff : AppCompatActivity() {

    private lateinit var binding: ActivityChecksboxesStuffBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChecksboxesStuffBinding.inflate(layoutInflater)

        val checkPurse: CheckBox = binding.checkPurse
        val checkEarring: CheckBox = binding.checkEarrings
        val checkShoes: CheckBox = binding.checkShoes

        val textResult: TextView = binding.textResult

        binding.btnWrite.setOnClickListener {
            var resultArray: ArrayList<String> = ArrayList()

            if(checkPurse.isChecked) {
                resultArray.add("Carteras")
            }

            if(checkEarring.isChecked) {
                resultArray.add("Aretes")
            }

            if(checkShoes.isChecked) {
                resultArray.add("Zapatos")
            }

            textResult.text = resultArray.toString()
        }

        setContentView(binding.root)
    }
}
