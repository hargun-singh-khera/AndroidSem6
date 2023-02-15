package com.example.mysecondapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val simpleRatingBar = findViewById<RatingBar>(R.id.simpleRatingBar)
        val simpleRatingBar2 = findViewById<RatingBar>(R.id.simpleRatingBar2)
        val simpleRatingBar3 = findViewById<RatingBar>(R.id.simpleRatingBar3)
        val simpleRatingBar4 = findViewById<RatingBar>(R.id.simpleRatingBar4)
        val simpleRating = findViewById<RatingBar>(R.id.simpleRating)
        val submitButton = findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener {
            val totalRating = simpleRatingBar.rating + simpleRatingBar2.rating + simpleRatingBar3.rating + simpleRatingBar4.rating
            val avgRating = totalRating/4
            simpleRating.rating=avgRating
            Toast.makeText(this, "Your overall rating is $avgRating", Toast.LENGTH_SHORT).show()
        }
//
//        val totalRating = simpleRatingBar.rating + simpleRatingBar2.rating + simpleRatingBar3.rating + simpleRatingBar4.rating
//        val avgRating = totalRating/4

        simpleRating.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener {
                ratingBar, rating, fromUser ->
            Toast.makeText(this, "rating$rating", Toast.LENGTH_SHORT).show()
        }
    }
}