package com.example.materialtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialtest.databinding.ActivityMainBinding
import com.example.materialtest.ui.app_bars.BarsBottom
import com.example.materialtest.ui.app_bars.BarsTop
import com.example.materialtest.ui.cars.CarsDesing
import com.example.materialtest.ui.floating_button.ActionButton
import com.example.materialtest.ui.navigation.NavigationBottom
import com.example.materialtest.ui.picker.PickerStuff
import com.example.materialtest.ui.pop_up.DialogsStuff
import com.example.materialtest.ui.pop_up.DrawerDesing
import com.example.materialtest.ui.pop_up.MenuStuff
import com.example.materialtest.ui.selection_controls.ChecksboxesStuff
import com.example.materialtest.ui.selection_controls.ChipsStuff
import com.example.materialtest.ui.selection_controls.RadioButtonsStuff

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btnAppBarBottom.setOnClickListener{
            val intent = Intent(this, BarsBottom::class.java)
            startActivity(intent)
        }

        binding.btnAppBarTop.setOnClickListener {
            val intent = Intent(this, BarsTop::class.java)
            startActivity(intent)
        }

        binding.btnBottomNavigation.setOnClickListener {
            val intent = Intent(this, NavigationBottom::class.java)
            startActivity(intent)
        }

        binding.btnFloatingButton.setOnClickListener {
            val intent = Intent(this, ActionButton::class.java)
            startActivity(intent)
        }

        binding.btnCards.setOnClickListener {
            val intent = Intent(this, CarsDesing::class.java)
            startActivity(intent)
        }

        binding.btnChips.setOnClickListener {
            val intent = Intent(this, ChipsStuff::class.java)
            startActivity(intent)
        }

        binding.btnDialogs.setOnClickListener {
            val intent = Intent(this, DialogsStuff::class.java)
            startActivity(intent)
        }

        binding.btnMenus.setOnClickListener {
            val intent = Intent(this, MenuStuff::class.java)
            startActivity(intent)
        }

        binding.btnDrawer.setOnClickListener {
            val intent = Intent(this, DrawerDesing::class.java)
            startActivity(intent)
        }

        binding.btnPickers.setOnClickListener {
            val intent = Intent(this, PickerStuff::class.java)
            startActivity(intent)
        }

        binding.btnCheckboxes.setOnClickListener {
            val intent = Intent(this, ChecksboxesStuff::class.java)
            startActivity(intent)
        }

        binding.btnRadios.setOnClickListener {
            val intent = Intent(this, RadioButtonsStuff::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }
}
