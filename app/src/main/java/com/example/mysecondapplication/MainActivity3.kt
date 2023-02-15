package com.example.mysecondapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val simpleRatingBar = findViewById<RatingBar>(R.id.simpleRatingBar)
        val simpleRating = findViewById<RatingBar>(R.id.simpleRating)
        val submitButton = findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener {
            val totalStars = "Total Stars: " + simpleRatingBar.numStars
            val rating = "Rating: " + simpleRatingBar.rating
            Toast.makeText(this, """$totalStars $rating""".trimIndent(), Toast.LENGTH_SHORT).show()
//            simpleRating.rating=simpleRatingBar.rating
        }

        simpleRating.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener {
                ratingBar, rating, fromUser ->
            Toast.makeText(this, "rating$rating", Toast.LENGTH_SHORT).show()
        }

    }
}