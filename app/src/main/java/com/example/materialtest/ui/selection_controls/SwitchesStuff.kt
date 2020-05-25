package com.example.materialtest.ui.selection_controls

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialtest.databinding.ActivitySwitchesStuffBinding
import com.google.android.material.switchmaterial.SwitchMaterial

class SwitchesStuff : AppCompatActivity() {

    private lateinit var binding: ActivitySwitchesStuffBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySwitchesStuffBinding.inflate(layoutInflater)

        val switchWifi: SwitchMaterial = binding.switchWifi
        val switchBluetooth: SwitchMaterial = binding.switchBluetooth
        val switchNoDisturb: SwitchMaterial = binding.switchNotDisturb

        switchWifi.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                Toast.makeText(this, "Wi-fi activado", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Wi-fi desactivado", Toast.LENGTH_SHORT).show()
            }
        }

        switchBluetooth.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                Toast.makeText(this, "Bluetooth activado", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Bluetooth desactivado", Toast.LENGTH_SHORT).show()
            }
        }

        switchNoDisturb.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                Toast.makeText(this, "No interrumpir activado", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "No interrumpir desactivado", Toast.LENGTH_SHORT).show()
            }
        }

        setContentView(binding.root)
    }
}
