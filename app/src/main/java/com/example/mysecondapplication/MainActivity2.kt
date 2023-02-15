package com.example.mysecondapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.lang.StringBuilder

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val username = findViewById<EditText>(R.id.editTextTextPersonName)
        val password = findViewById<EditText>(R.id.editTextTextPassword)
        val submit = findViewById<Button>(R.id.submit)
        val reset = findViewById<Button>(R.id.reset)

        submit.setOnClickListener {
            if (username.text.toString().isEmpty() || password.text.toString().isEmpty()) {
                Toast.makeText(this, "Please fill all the mandatory fields before submitting", Toast.LENGTH_SHORT).show()
            }
            else {
                var result = StringBuilder();
                result.append("\nYour username: ${username.text}")
                result.append("\nYour password: ${password.text}")
                Toast.makeText(this, result.toString(), Toast.LENGTH_SHORT).show()
            }
        }

        reset.setOnClickListener {
            if (username.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
                username.setText(null);
                password.setText(null);
            }
        }

    }
}