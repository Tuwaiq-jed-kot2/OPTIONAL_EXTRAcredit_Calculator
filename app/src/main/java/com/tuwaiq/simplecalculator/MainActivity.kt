package com.tuwaiq.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var displayResult: TextView
    private lateinit var editFirstNum: EditText
    private lateinit var editSecondNum: EditText
    private lateinit var add: Button
    private lateinit var sub: Button
    private lateinit var multiply: Button
    private lateinit var div: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayResult = findViewById(R.id.display_result)
        editFirstNum = findViewById(R.id.edit_first_num)
        editSecondNum = findViewById(R.id.edit_second_num)
        add = findViewById(R.id.add)
        sub = findViewById(R.id.sub)
        multiply = findViewById(R.id.multiply)
        div = findViewById(R.id.div)


        add.setOnClickListener{

             val number1 = editFirstNum.text.toString().toInt()
            val number2 = editSecondNum.text.toString().toInt()

            addition(number1,number2)
        }

        sub.setOnClickListener{

            val number1 = editFirstNum.text.toString().toInt()
            val number2 = editSecondNum.text.toString().toInt()

            subtraction(number1,number2)

        }

        multiply.setOnClickListener{

            val number1 = editFirstNum.text.toString().toInt()
            val number2 = editSecondNum.text.toString().toInt()

            multiplication(number1,number2)
         }

        div.setOnClickListener{

            val number1 = editFirstNum.text.toString().toInt()
            val number2 = editSecondNum.text.toString().toInt()

            division(number1,number2)
         }

    }

    private fun addition(number1:Int, number2:Int){
        val result = number1 + number2
        displayResult.text = result.toString()

    }

    private fun subtraction(number1:Int, number2:Int){
        val result = number1 - number2
        displayResult.text = result.toString()

    }

    private fun multiplication(number1:Int, number2:Int){
        val result = number1 * number2
        displayResult.text = result.toString()

    }

    private fun division(number1:Int, number2:Int){
        val result = number1 / number2
        displayResult.text = result.toString()

    }
}