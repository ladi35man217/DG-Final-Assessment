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

            val username = findViewById<TextView>(R.id.editTextUsername).text.toString()
            val password = findViewById<TextView>(R.id.editTextPassword).text.toString()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("usernameKey", username)
            intent.putExtra("passwordKey", password)
            startActivity(intent)

        }

    }
}