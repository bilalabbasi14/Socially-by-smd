package com.example.sociallybysmd

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dm)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val dmsBack=findViewById<ImageView>(R.id.dmback)
        dmsBack.setOnClickListener {
            val dmBackIntent= Intent(this, feed::class.java)
            startActivity(dmBackIntent)
        }
        val dmOpen=findViewById<TextView>(R.id.chunkz)
        dmOpen.setOnClickListener {
            val dmOpenIntent= Intent(this, opendm::class.java)
            startActivity(dmOpenIntent)
        }
        val camOpen= findViewById<ImageView>(R.id.dmbottomcam)
        camOpen.setOnClickListener {
            val camOpenIntent=Intent(this, capture::class.java)
            startActivity(camOpenIntent)
        }
    }
}