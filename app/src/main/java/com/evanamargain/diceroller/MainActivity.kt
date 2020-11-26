package com.evanamargain.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.evanamargain.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    val view = binding.root
    setContentView(view)

    binding.rollButton.text = "Let's roll"
    binding.rollButton.setOnClickListener {
      rollDice()
    }
  }

  private fun rollDice() {
    val randomInt = Random.nextInt(6) + 1

    binding.resultText.text = randomInt.toString()
  }
}
