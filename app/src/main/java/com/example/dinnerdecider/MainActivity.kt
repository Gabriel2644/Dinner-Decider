package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodList = mutableListOf("McDonalds", "Pizza", "Humburger", "Barros Pizza", "Chinese", "Burger Kings")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decide.setOnClickListener {
//            Toast.makeText(this, "Hello Gabriel", Toast.LENGTH_LONG).show()
            val random = Random()
            val randomFood= random.nextInt(foodList.count())
            selectedFood.text=foodList[randomFood]
        }
        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
        }
    }
}