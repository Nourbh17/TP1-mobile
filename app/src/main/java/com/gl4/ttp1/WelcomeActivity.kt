package com.gl4.ttp1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val email = intent.getStringExtra("email")

        val txtWelcome = findViewById<TextView>(R.id.txtWelcome)
        txtWelcome.text = "Bienvenue $email"
    }
}
