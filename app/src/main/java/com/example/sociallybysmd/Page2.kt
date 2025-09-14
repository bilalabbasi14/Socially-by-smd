package com.example.sociallybysmd

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import de.hdodenhof.circleimageview.CircleImageView

class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val goBack= findViewById<ImageView>(R.id.back)
        goBack.setOnClickListener {
            val gobackIntent= Intent(this, login::class.java)
            startActivity(gobackIntent)
        }
        val loginBtn =findViewById<CardView>(R.id.signupLogin)
        loginBtn.setOnClickListener {
            val loginIntent= Intent(this, login::class.java)
            startActivity(loginIntent)
        }


        var dp = findViewById<CircleImageView>(R.id.dp)
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