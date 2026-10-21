package com.example.legostarwarsgameshop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val optie1 = findViewById<FrameLayout>(R.id.TheCompleteSaga)
        val optie2 = findViewById<FrameLayout>(R.id.CloneWars)
        val optie3 = findViewById<FrameLayout>(R.id.TheForceAwakens)
        val optie4 = findViewById<FrameLayout>(R.id.TheSkywalkerSaga)


        optie1.setOnClickListener {
            val TCS = "The Complete Saga"
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            intent.putExtra("selectedGame", TCS)

            startActivity(intent)
        }

        optie2.setOnClickListener {
            val CW = "Clone Wars"
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            intent.putExtra("selectedGame", CW)

            startActivity(intent)
        }
        optie3.setOnClickListener {
            val TFA = "The Force Awakens"
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            intent.putExtra("selectedGame", TFA)

            startActivity(intent)
        }

        optie4.setOnClickListener {
            val TSS = "The Skywalker Saga"
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            intent.putExtra("selectedGame", TSS)

            startActivity(intent)
        }

        val knop = findViewById<Button>(R.id.button)
        knop.setOnClickListener {
                finish()
        }
    }
}