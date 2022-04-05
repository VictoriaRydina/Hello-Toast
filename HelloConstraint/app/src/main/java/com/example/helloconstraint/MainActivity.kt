package com.example.helloconstraint

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import helloconstraint.R

class MainActivity : AppCompatActivity() {

    private var mCount: Int = 0
    private var grayColor = Color.argb(100, 170, 170, 170)
    private var greenColor = Color.argb(100, 76, 175, 80)
    private lateinit var showCount : TextView
    private lateinit var countButton: Button
    private lateinit var resetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showCount = findViewById(R.id.show_count)
        countButton = findViewById(R.id.button_count)
        resetButton = findViewById(R.id.button_reset)
    }

    fun showToast(view: View) {
        val toast = Toast.makeText(this, R.string.toast_message,
            Toast.LENGTH_SHORT)
        toast.show()
    }

    fun countUp(view: View) {
        mCount += 1
        resetButton.setBackgroundColor(Color.RED)
        if (mCount % 2 == 0) {
            view.setBackgroundColor(greenColor)
        } else {
            view.setBackgroundColor(Color.BLUE)
        }
        showCount.text = mCount.toString()
    }
    
    fun reset(view: View) {
        resetButton.setBackgroundColor(grayColor)
        mCount = 0
        showCount.text = mCount.toString()
        countButton.setBackgroundColor(greenColor)
    }
}