package com.example.sociallybysmd

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profilepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profilepage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var followBtn=findViewById<CardView>(R.id.Followbtn)
        followBtn.setOnClickListener {
            var followBtnIntent= Intent(this, profilepage2::class.java)
            startActivity(followBtnIntent)
        }
        var back=findViewById<ImageView>(R.id.back)
        back.setOnClickListener {
            var backIntent=Intent(this,feed::class.java)
            startActivity(backIntent)
        }
    }
}