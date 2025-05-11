package com.example.intrestcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import java.util.logging.Level.parse

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get references of all view
        var et_investment = findViewById<EditText>(R.id.et_investment)
        var et_rate = findViewById<EditText>(R.id.et_percentage)
        var et_time = findViewById<EditText>(R.id.invested_years)
        var et_amout = findViewById<EditText>(R.id.invested_total_amount)
        var et_return = findViewById<EditText>(R.id.et_return)
        var et_total_value = findViewById<EditText>(R.id.total_value)
        var bt_calculate = findViewById<Button>(R.id.calculate)


        bt_calculate.setOnClickListener {
            val investment = Integer.parseInt(et_investment.text.toString())
            val rate = Integer.parseInt(et_rate.text.toString())
            val time = Integer.parseInt(et_time.text.toString())
            var SI: Int = (investment * rate * time) / 100
            et_amout.setText(investment.toString())
            et_return.setText(SI.toString())
            var total_after_maturity = SI + investment
            et_total_value.setText(total_after_maturity.toString())
        }


    }

}