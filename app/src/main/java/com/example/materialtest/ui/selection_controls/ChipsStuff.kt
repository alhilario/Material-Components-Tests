package com.example.materialtest.ui.selection_controls

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialtest.R
import com.example.materialtest.databinding.ActivityChipsStuffBinding
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_chips_stuff.view.*

class ChipsStuff : AppCompatActivity() {

    private lateinit var binding: ActivityChipsStuffBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChipsStuffBinding.inflate(layoutInflater)

        binding.btnChipsAction.setOnClickListener {
            Toast.makeText(this, "Do I wanna Know?", Toast.LENGTH_SHORT).show()
        }

        binding.btnProcesar.setOnClickListener {

            val tags = binding.entrada.text!!.toString().split(" ".toRegex())
                .dropLastWhile { it.isEmpty() }.toTypedArray()

            for(tag in tags) {
                val chip_item: Chip = layoutInflater.inflate(R.layout.chip_items,null, false) as Chip

                chip_item.text = tag

                binding.chipGroup.addView(chip_item)

            }

        }

        setContentView(binding.root)
    }
}
