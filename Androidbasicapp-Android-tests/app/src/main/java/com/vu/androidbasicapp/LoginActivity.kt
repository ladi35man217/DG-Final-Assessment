package com.vu.androidbasicapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val buttonPointer = findViewById<Button>(R.id.buttonLogin)
        buttonPointer.setOnClickListener {

            /* Not sure how to pass username and password. need to figure out api config first

            val usernameFinder = findViewById<TextView>(R.id.editTextUsername)
            if(usernameFinder.text == "Daniel") {
                Log.v("username", "go girl")
            }

            val passwordFinder = findViewById<TextView>(R.id.editTextPassword)
            if(passwordFinder.text == "s4673382") {
                Log.v("password", "yessir")
            }

             */

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }



    }
}