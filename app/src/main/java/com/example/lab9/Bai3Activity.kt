package com.example.lab9

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class Bai3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai3)

        val btnInputName: Button = findViewById(R.id.btnInputName)
        val tvName: TextView = findViewById(R.id.tvName)

        btnInputName.setOnClickListener {
            val dialogView = layoutInflater.inflate(R.layout.dialog_input_name, null)
            val editTextName: TextInputEditText = dialogView.findViewById(R.id.editTextName)

            AlertDialog.Builder(this)
                .setTitle("Nhập tên của bạn")
                .setView(dialogView)
                .setPositiveButton("Lưu") { _, _ ->
                    tvName.text = editTextName.text.toString()
                }
                .setNegativeButton("Hủy", null)
                .show()
        }
    }
}
