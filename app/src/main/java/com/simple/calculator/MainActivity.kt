package com.simple.calculator

import android.icu.text.CaseMap.Title
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilHead:TextView
    lateinit var tilNumOne:TextInputLayout
    lateinit var tilNumTwo:TextInputLayout
    lateinit var buttonOne:Button
    lateinit var buttonTwo:Button
    lateinit var buttonThree:Button
    lateinit var button4:Button
    lateinit var tilResults:TextView
    lateinit var etNumOne:TextInputEditText
    lateinit var etNumTwo:TextInputEditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilNumOne = findViewById(R.id.tilNumOne)
        tilNumTwo = findViewById(R.id.tilNumTwo)
        tilResults = findViewById(R.id.tilResults)
        buttonOne = findViewById(R.id.buttonOne)
        buttonTwo = findViewById(R.id.buttonTwo)
        buttonThree = findViewById(R.id.buttonThree)
        button4 = findViewById(R.id.button4)
        etNumOne = findViewById(R.id.etNumOne)
        etNumTwo = findViewById(R.id.etNumTwo)

        buttonOne.setOnClickListener {
            var firstNumber = etNumOne.text.toString().toInt()
            var secondNumber = etNumTwo.text.toString().toInt()
            var result = firstNumber + secondNumber
            tilResults.text = " Result: $result"

        }
        buttonTwo.setOnClickListener {
            var firstNumber = etNumOne.text.toString().toInt()
            var secondNumber = etNumTwo.text.toString().toInt()
            var result = firstNumber - secondNumber
            tilResults.text = " Result: $result"
        }
        buttonThree.setOnClickListener {
            var firstNumber = etNumOne.text.toString().toInt()
            var secondNumber = etNumTwo.text.toString().toInt()
            var result = firstNumber / secondNumber
            tilResults.text = " Result: $result"
        }
        button4.setOnClickListener {
            var firstNumber = etNumOne.text.toString().toInt()
            var secondNumber = etNumTwo.text.toString().toInt()
            var result = firstNumber % secondNumber
            tilResults.text = " Result: $result"
        }
    }

}