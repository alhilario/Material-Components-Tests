package com.example.materialtest.ui.cars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialtest.databinding.ActivityCarsDesingBinding

class CarsDesing : AppCompatActivity() {

    private lateinit var binding: ActivityCarsDesingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarsDesingBinding.inflate(layoutInflater)

        binding.actionUno.setOnClickListener {
            Toast.makeText(this, "Arete agregado al carro", Toast.LENGTH_SHORT).show()
        }

        binding.actionDos.setOnClickListener {
            Toast.makeText(this, "Salir", Toast.LENGTH_SHORT).show()
        }

        setContentView(binding.root)
    }
}
