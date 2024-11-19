package com.example.lab9
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class Bai5Activity : AppCompatActivity() {
    private val names = mutableListOf("Nguyễn Văn A", "Trần Thị B", "Lê Văn C")
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai5)

        val listView: ListView = findViewById(R.id.listView)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)
        listView.adapter = adapter
        registerForContextMenu(listView)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: android.view.View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val info = item.menuInfo as AdapterView.AdapterContextMenuInfo
        val selectedName = names[info.position]
        when (item.itemId) {
            R.id.context_edit -> {
                val editText = android.widget.EditText(this)
                AlertDialog.Builder(this)
                    .setTitle("Chỉnh sửa tên")
                    .setView(editText)
                    .setPositiveButton("Lưu") { _, _ ->
                        names[info.position] = editText.text.toString()
                        adapter.notifyDataSetChanged()
                    }
                    .setNegativeButton("Hủy", null)
                    .show()
            }
            R.id.context_delete -> {
                names.removeAt(info.position)
                adapter.notifyDataSetChanged()
                Toast.makeText(this, "$selectedName đã bị xóa", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onContextItemSelected(item)
    }
}
