package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webButton = findViewById<TextView>(R.id.openWeb)
        //TextView is the type of view and openWeb is the id that we have to open

        val camButton = findViewById<TextView>(R.id.openCamera)

        webButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            // Action view is used to display the action to the user

            intent.data = Uri.parse("https://www.linkedin.com/in/udit-kumar-318596189/")
            startActivity(intent)
        }
        camButton.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)

        }
    }
}