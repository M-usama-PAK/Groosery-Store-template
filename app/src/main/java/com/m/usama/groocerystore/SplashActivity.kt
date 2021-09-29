package com.m.usama.groocerystore

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.m.usama.groocerystore.auth.signup.Registration

class SplashActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this, Registration::class.java)
            startActivity(intent)
            finish()
        }, 3000)


    }
}