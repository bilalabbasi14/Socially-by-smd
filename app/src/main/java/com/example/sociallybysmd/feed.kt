package com.example.sociallybysmd

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import de.hdodenhof.circleimageview.CircleImageView

class feed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_feed)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            var systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var dms=findViewById<ImageView>(R.id.dms)
        dms.setOnClickListener {
            var dmsIntent= Intent(this, dm::class.java)
            startActivity(dmsIntent)
        }

        var storyView= findViewById<CircleImageView>(R.id.story2)
        storyView.setOnClickListener {
            var storyViewIntent= Intent(this, story::class.java)
            startActivity(storyViewIntent)
        }

        var explore=findViewById<ImageView>(R.id.explorefeed)
        explore.setOnClickListener {
            var exploreIntent=Intent(this, explorepage::class.java)
            startActivity(exploreIntent)
        }

        var notification=findViewById<ImageView>(R.id.notificationfeed)
        notification.setOnClickListener {
            var notificationIntent=Intent(this, notificationpage1::class.java)
            startActivity(notificationIntent)
        }


    }
}