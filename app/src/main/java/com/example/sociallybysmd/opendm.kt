package com.example.sociallybysmd

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class opendm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_opendm)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val opendmsBack=findViewById<ImageView>(R.id.opendmback)
        opendmsBack.setOnClickListener {
            val opendmBackIntent = Intent(this, dm::class.java)
            startActivity(opendmBackIntent)
        }
        val calling=findViewById<ImageView>(R.id.videocall)
        calling.setOnClickListener {
            val callingIntent= Intent(this,call::class.java)
            startActivity(callingIntent)
        }
    }
}