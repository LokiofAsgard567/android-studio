package com.example.legostarwarsgameshop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val knop = findViewById<Button>(R.id.next)
        val knop2 = findViewById<Button>(R.id.home3)
        val knop3 = findViewById<Button>(R.id.back)
        val Adress1 = findViewById<EditText>(R.id.adress)

        knop.setOnClickListener {
            val adress = Adress1
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra("detail", adress.text.toString())
            startActivity(intent)
        }

        knop2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        knop3.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}