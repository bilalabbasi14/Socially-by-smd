package com.example.sociallybysmd

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class deflogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_deflogin)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val signupText = findViewById<TextView>(R.id.Signup)
        signupText.setOnClickListener {
            val signupIntent = Intent(this, Page2::class.java)
            startActivity(signupIntent)
        }
        val switchText= findViewById<TextView>(R.id.switchacc)

        switchText.setOnClickListener {
            val switchIntent = Intent(this, login::class.java)
            startActivity(switchIntent)
        }

        val loginBtn =findViewById<Button>(R.id.Logintofeed)
        loginBtn.setOnClickListener {
            val loginIntent= Intent(this, feed::class.java)
            startActivity(loginIntent)
        }
    }
}