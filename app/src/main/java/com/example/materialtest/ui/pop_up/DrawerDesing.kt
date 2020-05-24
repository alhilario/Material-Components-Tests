package com.example.materialtest.ui.pop_up

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.example.materialtest.R
import com.example.materialtest.databinding.ActivityDrawerDesingBinding
import com.google.android.material.navigation.NavigationView

class DrawerDesing : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityDrawerDesingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrawerDesingBinding.inflate(layoutInflater)

        val toolbar: Toolbar = binding.mainTollbar
        setSupportActionBar(toolbar)

        val drawerLaout: DrawerLayout = binding.drawerLayout

        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            drawerLaout,
            toolbar,
            R.string.open_nav,
            R.string.close_nav
        )

        drawerLaout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        val navigationView: NavigationView = binding.navView
        navigationView.setNavigationItemSelectedListener(this)

        setContentView(binding.root)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return false
    }
}
