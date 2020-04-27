package com.jbarrows.tipcalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView.visibility = View.INVISIBLE

        calculateButton.setOnClickListener {
            val bill = billEditText.text.toString().toDouble()
            val tipPercentage = tipPercentageEditText.text.toString().toDouble() / 100
            val tip = bill * tipPercentage
            val totalCheck = bill + tip

            infoTextView.visibility = View.VISIBLE
            infoTextView.text = "Tip: ${doubleToDollar(tip)} Total Check: ${doubleToDollar(totalCheck)}"

        }
    }

    fun doubleToDollar(number:Double) : String {
        return "$" + String.format("%.2f",number)
    }
}
