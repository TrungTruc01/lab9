package com.example.lab9

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Bai4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai4)
    }

    override fun onCreateOptionsMenu(menu: android.view.Menu?): Boolean {
        menuInflater.inflate(R.menu.bai4_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: android.view.MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_search -> Toast.makeText(this, "Chức năng Tìm kiếm đang được thực thi", Toast.LENGTH_SHORT).show()
            R.id.menu_settings -> Toast.makeText(this, "Chức năng Cài đặt đang được thực thi", Toast.LENGTH_SHORT).show()
            R.id.menu_share -> Toast.makeText(this, "Chức năng Chia sẻ đang được thực thi", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
