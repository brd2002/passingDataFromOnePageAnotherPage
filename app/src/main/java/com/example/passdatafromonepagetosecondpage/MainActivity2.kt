package com.example.passdatafromonepagetosecondpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val textFromFirstPage = findViewById<TextView>(R.id.secondPageText)
        val getingNameFromFirstPage = intent.getStringExtra(MainActivity.KEY)
        textFromFirstPage.text = getingNameFromFirstPage
    }
}