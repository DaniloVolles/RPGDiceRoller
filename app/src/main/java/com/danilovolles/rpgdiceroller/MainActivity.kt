package com.danilovolles.rpgdiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.danilovolles.rpgdiceroller.databinding.ActivityMainBinding

val d4 = Dice(4)
val d6 = Dice(6)
val d8 = Dice(8)
val d10 = Dice(10)
val d12 = Dice(12)
val d20 = Dice(20)
val d100 = Dice(100)

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    private lateinit var rollResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnD4.setOnClickListener(this)
        binding.btnD6.setOnClickListener(this)
        binding.btnD8.setOnClickListener(this)
        binding.btnD10.setOnClickListener(this)
        binding.btnD12.setOnClickListener(this)
        binding.btnD20.setOnClickListener(this)
        binding.btnD100.setOnClickListener(this)

        rollResult = findViewById(R.id.rollVisualization)

    }

    override fun onClick(view: View) {
        when(view.id) {
            R.id.btnD4 -> showResult(d4)
            R.id.btnD6 -> showResult(d6)
            R.id.btnD8 -> showResult(d8)
            R.id.btnD10 -> showResult(d10)
            R.id.btnD12 -> showResult(d12)
            R.id.btnD20 -> showResult(d20)
            R.id.btnD100 -> showResult(d100)
        }
    }

    private fun showResult(die: Dice){
        val result = die.rollDie().toString()
        binding.rollVisualization.text = result
    }
}