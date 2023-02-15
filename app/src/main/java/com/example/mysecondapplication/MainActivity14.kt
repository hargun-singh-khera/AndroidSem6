package com.example.mysecondapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.annotation.SuppressLint
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity14 : AppCompatActivity() {
    lateinit var t:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main14)

        val nv=findViewById<BottomNavigationView>(R.id.bottomNav)
        t=findViewById(R.id.tv)
        nv.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.action_favorites -> {
                    setContent("Favorites")
                    true
                }
                R.id.menu_profile -> {
                    setContent("Profile")
                    true
                }

                R.id.nav_send -> {
                    setContent("Send")
                    true
                }
                else -> false
            }
        }
    }
    fun setContent(s:String)
    {
        setTitle(s)
        t.setText(s)
    }
}