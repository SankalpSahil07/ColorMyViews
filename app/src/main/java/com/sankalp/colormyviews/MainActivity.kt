package com.sankalp.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textBox1: TextView
    lateinit var textBox2: TextView
    lateinit var textBox3: TextView
    lateinit var textBox4: TextView
    lateinit var textBox5: TextView
    lateinit var button_red : Button
    lateinit var button_green : Button
    lateinit var button_yellow : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textBox1 = findViewById(R.id.text_box_one)
        textBox2 = findViewById(R.id.text_box_two)
        textBox3 = findViewById(R.id.text_box_three)
        textBox4 = findViewById(R.id.text_box_four)
        textBox5 = findViewById(R.id.text_box_five)
        button_red = findViewById(R.id.red_button)
        button_green = findViewById(R.id.green_button)
        button_yellow = findViewById(R.id.yellow_button)

        setListeners()

    }
    private fun setListeners(){
        val clickableViews: List<View> =
            listOf(textBox1, textBox2, textBox3, textBox4, textBox5, button_red, button_green, button_yellow)

            for (item in clickableViews){
                item.setOnClickListener{makeColored(it)}
            }
    }
    private fun makeColored(view: View){
        when(view.id){

         // Boxes using Color class colors for background
            R.id.text_box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.text_box_two -> view.setBackgroundColor(Color.GRAY)

        //  Boxes using Android Color resources for background
            R.id.text_box_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.text_box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.text_box_five -> view.setBackgroundResource(android.R.color.holo_green_light)

        //  Boxes using custom colors for background
            R.id.red_button -> textBox3.setBackgroundResource(R.color.my_red)
            R.id.green_button -> textBox4.setBackgroundResource(R.color.my_green)
            R.id.yellow_button -> textBox5.setBackgroundResource(R.color.my_yellow)
            
            else -> view.setBackgroundColor(Color.LTGRAY)

        }
    }
}