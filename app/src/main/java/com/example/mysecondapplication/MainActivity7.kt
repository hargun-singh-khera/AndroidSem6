package com.example.mysecondapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        /*  Handler().postDelayed(Runnable {
           val i = Intent(this@MainActivity, SplashScreenExampleMain::class.java)
           startActivity(i)
           finish()
       }, 5000)
*/
        Handler(Looper.getMainLooper()).postDelayed({
            val i = Intent(this, MainActivity8::class.java)
            startActivity(i)
            finish()
        }, 5000)

    }
}