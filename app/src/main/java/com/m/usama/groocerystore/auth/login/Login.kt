package com.m.usama.groocerystore.auth.login

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.m.usama.groocerystore.MainActivity
import com.m.usama.groocerystore.R

class Login : Activity() {
    lateinit var btnLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            startActivity(Intent(this@Login, MainActivity::class.java))
        }

    }
}