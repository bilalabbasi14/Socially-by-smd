package com.example.sociallybysmd

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import de.hdodenhof.circleimageview.CircleImageView

class editprofile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_editprofile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val cancel=findViewById<TextView>(R.id.cancel)
        cancel.setOnClickListener {
            val cancelIntent= Intent(this, myprofile::class.java)
            startActivity(cancelIntent)
        }
        val done=findViewById<TextView>(R.id.done)
        done.setOnClickListener {
            val doneIntent= Intent(this, myprofile::class.java)
            startActivity(doneIntent)
        }
        var dp = findViewById<CircleImageView>(R.id.profileImage)
        var launcher= registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()){
            if(it.resultCode== RESULT_OK){
                var uri= it.data?.data
                dp.setImageURI(uri)
            }

        }

        dp.setOnClickListener {
            var intent= Intent()
            intent.action= Intent.ACTION_GET_CONTENT
            intent.type= "image/*"
            launcher.launch(intent)

        }
    }
}