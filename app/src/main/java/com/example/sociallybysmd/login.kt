package com.example.sociallybysmd

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val signup2Text= findViewById<TextView>(R.id.signup2)

        signup2Text.setOnClickListener {
            val signup2Intent = Intent(this, Page2::class.java)
            startActivity(signup2Intent)
        }

        val goBack2= findViewById<ImageView>(R.id.backpage)
        goBack2.setOnClickListener {
            val goback2Intent= Intent(this, deflogin::class.java)
            startActivity(goback2Intent)
        }

        val loginBtn =findViewById<CardView>(R.id.mainLogin)
        loginBtn.setOnClickListener {
            val loginIntent= Intent(this, feed::class.java)
            startActivity(loginIntent)
        }

    }
}