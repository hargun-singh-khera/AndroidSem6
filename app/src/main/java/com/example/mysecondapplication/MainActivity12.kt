package com.example.mysecondapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
//        toolbar.setLogo(R.drawable.splash_afterscreen)
        toolbar.setTitle("CSE225")
        toolbar.setSubtitle("Toolbar Topic")
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener {
            Toast.makeText(this, "Pressed BackArrows", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar,menu)
        return super.onCreateOptionsMenu(menu)
//        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        when(item.itemId) {
            R.id.action_search -> {
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()
            }
            R.id.action_folder -> {
                Toast.makeText(this, "Folder", Toast.LENGTH_SHORT).show()
            }
            R.id.action_call -> {
                Toast.makeText(this, "Call ", Toast.LENGTH_SHORT).show()
            }
            R.id.action_vcall -> {
                Toast.makeText(this, "Video Call ", Toast.LENGTH_SHORT).show()
            }
            R.id.action_message -> {
                Toast.makeText(this, "Message ", Toast.LENGTH_SHORT).show()
            }
            R.id.action_share -> {
                Toast.makeText(this, "Share ", Toast.LENGTH_SHORT).show()
            }
            R.id.action_help -> {
                Toast.makeText(this, "Help", Toast.LENGTH_SHORT).show()
            }
            else -> {
                Toast.makeText(this, "Please select any one option!", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}