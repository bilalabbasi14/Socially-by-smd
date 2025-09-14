package com.example.sociallybysmd

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class notificationpage2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_notificationpage2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var explore=findViewById<ImageView>(R.id.explore)
        explore.setOnClickListener {
            var exploreIntent=Intent(this, explorepage::class.java)
            startActivity(exploreIntent)
        }

        var notification=findViewById<TextView>(R.id.followingnoti2)
        notification.setOnClickListener {
            var notificationIntent=Intent(this, notificationpage1::class.java)
            startActivity(notificationIntent)
        }
        var home=findViewById<ImageView>(R.id.home)
        home.setOnClickListener {
            var exploreIntent=Intent(this, feed::class.java)
            startActivity(exploreIntent)
        }
        var posting=findViewById<ImageView>(R.id.post)
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