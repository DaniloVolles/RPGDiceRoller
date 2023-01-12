package com.danilovolles.rpgdiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

val d4 = Dice(4)
val d6 = Dice(6)
val d8 = Dice(8)
val d10 = Dice(10)
val d12 = Dice(12)
val d20 = Dice(20)
val d100 = Dice(100)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var d4Result = d4.rollDie()

}