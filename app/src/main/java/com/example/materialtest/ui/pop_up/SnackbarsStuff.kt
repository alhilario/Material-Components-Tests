package com.example.materialtest.ui.pop_up

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.materialtest.databinding.ActivitySnackbarsStuffBinding
import com.google.android.material.snackbar.Snackbar

class SnackbarsStuff : AppCompatActivity() {

    private lateinit var binding: ActivitySnackbarsStuffBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySnackbarsStuffBinding.inflate(layoutInflater)

        val buttonShow: Button = binding.btnSnackbar

        buttonShow.setOnClickListener {
            val snackBar: Snackbar = Snackbar.make(it, "Punchala punchala punchala", Snackbar.LENGTH_LONG)

            snackBar.setAction("Okay", {
                buttonShow.setText("Se montro")
            })
            snackBar.setActionTextColor(Color.BLUE)
            snackBar.setBackgroundTint(Color.GRAY)

            snackBar.show()
        }

        setContentView(binding.root)
    }
}
