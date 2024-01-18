package com.example.passdatafromonepagetosecondpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    companion object{
        const val KEY  = "com.example.passdatafromonepagetosecondpage.MainActivity.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val nextPageButton = findViewById<Button>(R.id.NextPageButton)
    val nameText = findViewById<EditText>(R.id.enterYourName)
    nextPageButton.setOnClickListener {
        val intent = Intent(this , MainActivity2::class.java)
        val yourName = nameText.text.toString()
        intent.putExtra(KEY , yourName)
        startActivity(intent)
    }

    }
}