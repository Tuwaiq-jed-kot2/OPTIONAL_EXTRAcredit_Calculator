package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var num1TV: TextView
    private lateinit var num2TV: TextView
    private lateinit var resultTV: TextView
    private lateinit var addBtn: Button
    private lateinit var subtractionBtn: Button
    private lateinit var multiplyBtn: Button
    private lateinit var divideBtn: Button
    private lateinit var clearBtn: Button
    var num1 = 0
    var num2 = 0
    var total = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pageElements()

        addBtn.setOnClickListener {
            add()
        }

        subtractionBtn.setOnClickListener {
            subtraction()
        }

        multiplyBtn.setOnClickListener {
            multiply()
        }

        divideBtn.setOnClickListener {
            divide()
        }

        clearBtn.setOnClickListener {
            num1TV.setText("")
            num2TV.setText("")
            resultTV.setText("")
            num1 = 0
            num2 = 0
            total = 0
        }
    }

    private fun pageElements() {
        num1TV = findViewById(R.id.num1_text)
        num2TV = findViewById(R.id.num2_text)
        addBtn = findViewById(R.id.add_btn)
        subtractionBtn = findViewById(R.id.sub_btn)
        multiplyBtn = findViewById(R.id.mul_btn)
        divideBtn = findViewById(R.id.div_btn)
        clearBtn = findViewById(R.id.clear_btn)
        resultTV = findViewById(R.id.result_text)
    }

    private fun numbers(){
        num1 = num1TV.text.toString().toInt()
        num2 = num2TV.text.toString().toInt()
    }

    private fun add() {
        if (num1TV.text.isEmpty() || num2TV.text.isEmpty()) {
            Toast.makeText(this, "Please Enter A Number", Toast.LENGTH_SHORT).show()
        } else {
            numbers()
            total = num1 + num2
            resultTV.setText("$total")
        }
    }

    private fun subtraction() {
        if (num1TV.text.isEmpty() || num2TV.text.isEmpty()) {
            Toast.makeText(this, "Please Enter A Number", Toast.LENGTH_SHORT).show()
        } else if (num2 > num1) {
            numbers()
            total = num2 - num1
            resultTV.setText("$total")
        } else {
            numbers()
            total = num1 - num2
            resultTV.setText("$total")
        }
    }

    private fun multiply() {
        if (num1TV.text.isEmpty() || num2TV.text.isEmpty()) {
            Toast.makeText(this, "Please Enter A Number", Toast.LENGTH_SHORT).show()
        } else {
            numbers()
            total = num1 * num2
            resultTV.setText("$total")
        }
    }

    private fun divide() {
        var divTotal: Double
        numbers()

        if (num1TV.text.isEmpty() || num2TV.text.isEmpty()) {
            Toast.makeText(this, "Please Enter A Number", Toast.LENGTH_SHORT).show()
        }
        else if (num2 == 0 ){
            Toast.makeText(this, "Cannot Divide by Zero", Toast.LENGTH_SHORT).show()
        }
        else {
            divTotal = (num1.toDouble() / num2.toDouble())
            resultTV.setText("${"%.2f".format(divTotal)}")
        }
    }



}