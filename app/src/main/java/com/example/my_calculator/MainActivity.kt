package com.example.my_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.view.View
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var textViewNum1: EditText
    private lateinit var textViewNum2 : EditText
    private lateinit var textViewRe: TextView
    private lateinit var sumButton: Button
    private lateinit var subButton: Button
    private lateinit var dubleButton: Button
    private lateinit var qButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()


        sumButton.setOnClickListener {
            val resultNum1 = textViewNum1.text.toString().toInt()
            val resultNum2 = textViewNum2.text.toString().toInt()
            addNum(resultNum1, resultNum2)


        }
        subButton.setOnClickListener {
            val resultNum1 = textViewNum1.text.toString().toInt()
            val resultNum2 = textViewNum2.text.toString().toInt()

            sumNum(resultNum1,resultNum2)
        }
        dubleButton.setOnClickListener {
            val resultNum1 = textViewNum1.text.toString().toInt()
            val resultNum2 = textViewNum2.text.toString().toInt()

            dubleNum(resultNum1,resultNum2)
        }
        qButton.setOnClickListener {
            val resultNum1 = textViewNum1.text.toString().toInt()
            val resultNum2 = textViewNum2.text.toString().toInt()

            diveNum(resultNum1,resultNum2)
        }

    }

    private fun init() {
        textViewNum1 = findViewById(R.id.num1)
        textViewNum2 = findViewById(R.id.num2)
        textViewRe = findViewById(R.id.result)

        subButton = findViewById(R.id.sub)
        sumButton = findViewById(R.id.sum)
        dubleButton = findViewById(R.id.duble)
        qButton = findViewById(R.id.q)
    }

    private fun addNum(resultNum1:Int,resultNum2:Int){

        val result =resultNum1 + resultNum2
        textViewRe.text =result.toString()

    }
    private fun sumNum(resultNum1:Int,resultNum2:Int){

        val result =resultNum1 - resultNum2
        textViewRe.text =result.toString()

    }
    private fun diveNum(resultNum1:Int,resultNum2:Int){

        val result =resultNum1 / resultNum2
        textViewRe.text =result.toString()


    }
    private fun dubleNum(resultNum1:Int,resultNum2:Int){

        val result =resultNum1 * resultNum2
        textViewRe.text =result.toString()


    }

    }
