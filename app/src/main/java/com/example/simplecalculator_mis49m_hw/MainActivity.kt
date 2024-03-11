package com.example.simplecalculator_mis49m_hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.simplecalculator_mis49m_hw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun sumFunc(view: View) {
        val numberOne = binding.firstNumberText.text.toString().toDoubleOrNull()
        val numberTwo = binding.secondNumberText.text.toString().toDoubleOrNull()
        if (numberOne != null && numberTwo != null) {
            val result = numberOne + numberTwo
            binding.resultText.text = "Result \n ${result}"
        }
        else {
            binding.resultText.text = "Please Enter A Number"
        }
    }

    fun subtractFunc(view: View){
        val numberOne = binding.firstNumberText.text.toString().toDoubleOrNull()
        val numberTwo = binding.secondNumberText.text.toString().toDoubleOrNull()
        if (numberOne != null && numberTwo != null) {
            val result = numberOne - numberTwo
            binding.resultText.text = "Result \n ${result}"
        }
        else {
            binding.resultText.text = "Please Enter A Number"
        }
    }

    fun multiplyFunc(view: View){
        val numberOne = binding.firstNumberText.text.toString().toDoubleOrNull()
        val numberTwo = binding.secondNumberText.text.toString().toDoubleOrNull()
        if (numberOne != null && numberTwo != null) {
            val result = numberOne * numberTwo
            binding.resultText.text = "Result \n ${result}"
        }
        else {
            binding.resultText.text = "Please Enter A Number"
        }
    }

    fun divideFunc(view: View){
        val numberOne = binding.firstNumberText.text.toString().toDoubleOrNull()
        val numberTwo = binding.secondNumberText.text.toString().toDoubleOrNull()
        if (numberOne != null && numberTwo != null) {
            val result = numberOne / numberTwo
            binding.resultText.text = "Result \n ${result}"
        }
        else {
            binding.resultText.text = "Please Enter A Number"
        }
    }
}