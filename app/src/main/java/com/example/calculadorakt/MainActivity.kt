package com.example.calculadorakt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import com.example.calculadorakt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.sumBtn.setOnClickListener {
            val num1 = binding.edtn1.text.toString().toInt()
            val num2 = binding.edtn2.text.toString().toInt()
            val result = num1 + num2
            binding.resultTv.text = result.toString()
        }

        binding.substBtn.setOnClickListener {
            val num1 = binding.edtn1.text.toString().toInt()
            val num2 = binding.edtn2.text.toString().toInt()
            val result = num1 - num2
            binding.resultTv.text = result.toString()
        }

        binding.multBtn.setOnClickListener {
            val num1 = binding.edtn1.text.toString().toInt()
            val num2 = binding.edtn2.text.toString().toInt()
            val result = num1 * num2
            binding.resultTv.text = result.toString()
        }

        binding.divBtn.setOnClickListener {
            val num1 = binding.edtn1.text.toString().toInt()
            val num2 = binding.edtn2.text.toString().toInt()
            val result = num1 / num2
            binding.resultTv.text = result.toString()
        }
    }
}