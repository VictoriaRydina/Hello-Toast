package com.example.helloconstraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import helloconstraint.R

class SayHello : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_say_hello)
        val textView = findViewById<TextView>(R.id.textView2)

        val intent = getIntent().getStringExtra("count")
        textView.text = intent
    }
}