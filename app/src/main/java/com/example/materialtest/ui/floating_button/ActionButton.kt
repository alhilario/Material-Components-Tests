package com.example.materialtest.ui.floating_button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.materialtest.databinding.ActivityActionButtonBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ActionButton : AppCompatActivity() {

    private lateinit var binding: ActivityActionButtonBinding

    private var isOpen: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActionButtonBinding.inflate(layoutInflater)

        var fbaShare: FloatingActionButton = binding.btnShare
        var fbaCopy: FloatingActionButton = binding.btnCopy
        var fbaMail: FloatingActionButton = binding.btnMail

        val textCopy: TextView = binding.textCopy
        val textMail: TextView = binding.textMail

        fbaShare.setOnClickListener() {
            if(isOpen) {
                fbaCopy.hide()
                fbaMail.hide()

                textCopy.visibility = View.INVISIBLE
                textMail.visibility = View.INVISIBLE

                isOpen = false
            }
            else {
                fbaCopy.show()
                fbaMail.show()

                textCopy.visibility = View.VISIBLE
                textMail.visibility = View.VISIBLE

                isOpen = true
            }
        }

        setContentView(binding.root)
    }
}
