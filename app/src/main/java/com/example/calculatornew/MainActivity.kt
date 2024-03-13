package com.example.calculatornew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var input1: EditText
    lateinit var input2: EditText
    lateinit var resultView: TextView
    var result: Double = 0.0
    var num1: Int = 0
    var num2: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input1 = findViewById<EditText>(R.id.input1)
        input2 = findViewById<EditText>(R.id.input2)
        resultView = findViewById<TextView>(R.id.result)

    }

    fun divide(view: View) {
        num1 = 0
        num2 = 0
        result = 0.0
        num1 = input1.text.toString().toInt()
        num2 = input2.text.toString().toInt()


        result = num1 / num2.toDouble()


        resultView.text = result.toString()


    }

    fun multiply(view: View) {
        num1 = 0
        num2 = 0
        result = 0.0
        num1 = input1.text.toString().toInt()
        num2 = input2.text.toString().toInt()

        result = num1 * num2.toDouble()
        resultView.text = result.toInt().toString()

    }

    fun subtract(view: View) {
        num1 = 0
        num2 = 0
        result = 0.0
        num1 = input1.text.toString().toInt()
        num2 = input2.text.toString().toInt()


        result = num1 - num2.toInt().toDouble()

        resultView.text = result.toString()
    }

    fun add(view: View) {
        num1 = 0
        num2 = 0
        result = 0.0
        num1 = input1.text.toString().toInt()
        num2 = input2.text.toString().toInt()
        result = num1 + num2.toDouble()
        resultView.text = result.toInt().toString()
    }


}