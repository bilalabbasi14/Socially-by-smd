package com.example.sociallybysmd

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class explorepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_explorepage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var home=findViewById<ImageView>(R.id.home)
        home.setOnClickListener {
            var exploreIntent=Intent(this, feed::class.java)
            startActivity(exploreIntent)
        }

        var notification=findViewById<ImageView>(R.id.notification)
        notification.setOnClickListener {
            var notificationIntent=Intent(this, notificationpage1::class.java)
            startActivity(notificationIntent)
        }
        var searching=findViewById<TextView>(R.id.searchbar)
        searching.setOnClickListener {
            var searchIntent= Intent(this, search::class.java)
            startActivity(searchIntent)
        }
        var posting= findViewById<ImageView>(R.id.post)
        posting.setOnClickListener {
            var postingIntent= Intent(this, post::class.java)
            startActivity(postingIntent)
        }
        var profile=findViewById<ImageView>(R.id.prof)
        profile.setOnClickListener {
            var profileIntent= Intent(this, myprofile::class.java)
            startActivity(profileIntent)
        }
    }
}