package com.danilovolles.rpgdiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

val d4 = Dice(4)
val d6 = Dice(6)
val d8 = Dice(8)
val d10 = Dice(10)
val d12 = Dice(12)
val d20 = Dice(20)
val d100 = Dice(100)

class MainActivity : AppCompatActivity() {

    private lateinit var rollResult: TextView
    private lateinit var btnD4Var: Button
    private lateinit var btnD6Var: Button
    private lateinit var btnD8Var: Button
    private lateinit var btnD10Var: Button
    private lateinit var btnD12Var: Button
    private lateinit var btnD20Var: Button
    private lateinit var btnD100Var: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollResult = findViewById(R.id.rollVisualization)
        btnD4Var = findViewById(R.id.btnD4)
        btnD6Var = findViewById(R.id.btnD6)
        btnD8Var = findViewById(R.id.btnD8)
        btnD10Var = findViewById(R.id.btnD10)
        btnD12Var = findViewById(R.id.btnD12)
        btnD20Var = findViewById(R.id.btnD20)
        btnD100Var = findViewById(R.id.btnD100)

    }

    fun rollD4Btn() {
        val result = d4.rollDie()
        rollResult.text = result.toString()
    }

    fun rollD6Btn() {
        val result = d6.rollDie()
        rollResult.text = result.toString()
    }

    fun rollD8Btn() {
        val result = d8.rollDie()
        rollResult.text = result.toString()
    }

    fun rollD10Btn() {
        val result = d10.rollDie()
        rollResult.text = result.toString()
    }

    fun rollD12Btn() {
        val result = d12.rollDie()
        rollResult.text = result.toString()
    }

    fun rollD20Btn() {
        val result = d20.rollDie()
        rollResult.text = result.toString()
    }

    fun rollD100Btn() {
        val result = d100.rollDie()
        rollResult.text = result.toString()
    }
}