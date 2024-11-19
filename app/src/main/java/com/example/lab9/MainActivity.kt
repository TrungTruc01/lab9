package com.example.lab9

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_bai1 -> startActivity(Intent(this, Bai1Activity::class.java))
                R.id.nav_bai2 -> startActivity(Intent(this, Bai2Activity::class.java))
                R.id.nav_bai3 -> startActivity(Intent(this, Bai3Activity::class.java))
                R.id.nav_bai4 -> startActivity(Intent(this, Bai4Activity::class.java))
                R.id.nav_bai5 -> startActivity(Intent(this, Bai5Activity::class.java))
                R.id.nav_bai6 -> startActivity(Intent(this, Bai6Activity::class.java))
            }
            drawerLayout.closeDrawers()
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_bai1 -> startActivity(Intent(this, Bai1Activity::class.java))
            R.id.menu_bai2 -> startActivity(Intent(this, Bai2Activity::class.java))
            R.id.menu_bai3 -> startActivity(Intent(this, Bai3Activity::class.java))
            R.id.menu_bai4 -> startActivity(Intent(this, Bai4Activity::class.java))
            R.id.menu_bai5 -> startActivity(Intent(this, Bai5Activity::class.java))
            R.id.menu_bai6 -> startActivity(Intent(this, Bai6Activity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}
