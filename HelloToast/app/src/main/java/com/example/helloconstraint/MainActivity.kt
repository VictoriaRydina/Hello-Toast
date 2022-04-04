package com.example.helloconstraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import helloconstraint.R

class MainActivity : AppCompatActivity() {

    private var mCount: Int = 0
    private lateinit var showCount : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showCount = findViewById(R.id.show_count)
    }

    fun showToast(view: View) {
        val toast = Toast.makeText(this, R.string.toast_message,
            Toast.LENGTH_SHORT)
        toast.show()
    }
    fun countUp(view: View) {
        mCount++
        showCount.text = mCount.toString()
    }
}