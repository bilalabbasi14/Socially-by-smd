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
import de.hdodenhof.circleimageview.CircleImageView

class myprofile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_myprofile)
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
        var explore=findViewById<ImageView>(R.id.explore)
        explore.setOnClickListener {
            var exploreIntent=Intent(this, explorepage::class.java)
            startActivity(exploreIntent)
        }

        var posting= findViewById<ImageView>(R.id.post)
        posting.setOnClickListener {
            var postingIntent= Intent(this, post::class.java)
            startActivity(postingIntent)
        }
        var editProfile= findViewById<CardView>(R.id.editprofile)
        editProfile.setOnClickListener {
            var editProfileIntent= Intent(this, editprofile::class.java)
            startActivity(editProfileIntent)
        }
        var highlightView= findViewById<CircleImageView>(R.id.highlight1)
        highlightView.setOnClickListener {
            var highlightViewIntent= Intent(this, highlights::class.java)
            startActivity(highlightViewIntent)
        }
        var storyUpload=findViewById<CircleImageView>(R.id.profileImage)
        storyUpload.setOnClickListener {
            var storyUploadIntent= Intent(this, createmystory::class.java)
            startActivity(storyUploadIntent)
        }
    }
}