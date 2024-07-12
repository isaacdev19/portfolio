package com.example.littlelemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var topLayout: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        topLayout = findViewById(R.id.topLayout)
        val textView = TextView(this)
        textView.text = resources.getText(R.string.little_lemon)
        topLayout.addView(textView)
    }
}