package com.example.materialtest.ui.pop_up

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialtest.R
import com.example.materialtest.databinding.ActivityDialogsStuffBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class DialogsStuff : AppCompatActivity() {

    private lateinit var binding: ActivityDialogsStuffBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDialogsStuffBinding.inflate(layoutInflater)

        binding.btnPopUp.setOnClickListener {
            val builder = MaterialAlertDialogBuilder(this)

            builder.setTitle("Juan el cacahuate")
            builder.setMessage("Soy un cacaguate")
            builder.setIcon(R.drawable.ic_cloud_download_black_24dp)
            builder.setPositiveButton("Okay", DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this, "Todos Somos Cacahuates", Toast.LENGTH_SHORT).show()
                }
            )
            builder.setNegativeButton("Olvidar", DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "Ya somos un guineo", Toast.LENGTH_SHORT).show()
                }
            )
            builder.show()
        }

        setContentView(binding.root)
    }
}
