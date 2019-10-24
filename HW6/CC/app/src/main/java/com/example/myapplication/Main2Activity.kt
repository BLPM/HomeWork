package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup

class Main2Activity : AppCompatActivity() {
    private var send_btn: Button? = null
    private var set_drink: EditText? = null
    private var rg1: RadioGroup? = null
    private var rg2: RadioGroup? = null
    private var sugar = "無糖"
    private val ice_opt = "微冰"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        rg1 = findViewById(R.id.Group2)

        rg1!!.setOnCheckedChangeListener { group, i ->
            when (i) {
                R.id.radioButton5 -> sugar = "無糖"
                R.id.radioButton6 -> sugar = "少糖"
                R.id.radioButton7 -> sugar = "半糖"
                R.id.radioButton8 -> sugar = "全糖"
            }
        }
        rg2 = findViewById(R.id.Group1)

        rg2!!.setOnCheckedChangeListener { group, i ->
            when (i) {
                R.id.radioButton -> sugar = "微冰"
                R.id.radioButton2 -> sugar = "少冰"
                R.id.radioButton3 -> sugar = "正常冰"
            }
        }
        send_btn = findViewById(R.id.button)
        send_btn!!.setOnClickListener {
            set_drink = findViewById(R.id.ed_drink)
            val drink = set_drink!!.text.toString()
            val i = Intent()
            val b = Bundle()
            b.putString("sugar", sugar)
            b.putString("drink", drink)
            b.putString("ice", ice_opt)

            i.putExtras(b)
            setResult(101, i)
            finish()
        }


    }
}