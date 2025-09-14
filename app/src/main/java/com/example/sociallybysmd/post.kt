package com.example.sociallybysmd

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class post : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_post)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val cancel=findViewById<TextView>(R.id.cancel)
        cancel.setOnClickListener {
            val cancelIntent= Intent(this, feed::class.java)
            startActivity(cancelIntent)
        }
        val done=findViewById<TextView>(R.id.done)
        done.setOnClickListener {
            val doneIntent= Intent(this, feed::class.java)
            startActivity(doneIntent)
        }
    }
}