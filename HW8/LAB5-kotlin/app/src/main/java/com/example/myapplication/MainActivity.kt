package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener(View.OnClickListener {
            val dialog=AlertDialog.Builder(this)
            dialog.setTitle("請選擇功能")
            dialog.setMessage("請根據下方按鈕選擇要顯示的物件")
            dialog.setNeutralButton("取消")
            { dialog, i ->
                Toast.makeText(this, "dialog關閉", Toast.LENGTH_SHORT).show()
            }

            dialog.setNegativeButton("自訂義toast")
            { dialog, which -> showToast() }

            dialog.setPositiveButton("顯示list")
            { dialog, which -> showListDialog() }

            dialog.show()
        })
        }

    private fun showToast()
    {
        val toast = Toast(this@MainActivity)
        toast.setGravity(Gravity.TOP, 0, 50)
        toast.duration = Toast.LENGTH_SHORT
        val inflater = layoutInflater
        
        val CC=inflater.inflate(R.layout.custom_toast ,findViewById(R.id.custom_toast_root))
        toast.view=CC
        toast.show()

    }
    private fun showListDialog() {
        val list = arrayOf("Message1", "Message2", "Message3", "Message4", "Message5")
        val dialog_list = android.app.AlertDialog.Builder(this@MainActivity)
        dialog_list.setTitle("使用LIST呈現")
        dialog_list.setItems(
            list
        ) { dialog, i ->
            Toast.makeText(this, "你選得是" + list[i], Toast.LENGTH_SHORT).show()
        }
        dialog_list.show()

    }
}
