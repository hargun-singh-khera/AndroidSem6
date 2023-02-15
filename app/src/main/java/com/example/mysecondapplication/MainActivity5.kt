package com.example.mysecondapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.Toast

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val simpleRatingBar = findViewById<RatingBar>(R.id.simpleRatingBar)
        val simpleRatingBar2 = findViewById<RatingBar>(R.id.simpleRatingBar2)
        val simpleRatingBar3 = findViewById<RatingBar>(R.id.simpleRatingBar3)
        val simpleRatingBar4 = findViewById<RatingBar>(R.id.simpleRatingBar4)
        val simpleRating = findViewById<RatingBar>(R.id.simpleRating)

        fun rating() {
            val totalRating = simpleRatingBar.rating + simpleRatingBar2.rating + simpleRatingBar3.rating + simpleRatingBar4.rating
            val avgRating = totalRating/4
            simpleRating.rating=avgRating
        }

//        val submitButton = findViewById<Button>(R.id.submitButton)

        simpleRatingBar.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener {
                ratingBar, rating, fromUser ->
            rating()
            Toast.makeText(this, "rating $rating", Toast.LENGTH_SHORT).show()
        }

        simpleRatingBar2.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener {
                ratingBar, rating, fromUser ->
            rating()
            Toast.makeText(this, "rating $rating", Toast.LENGTH_SHORT).show()
        }

        simpleRatingBar3.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener {
                ratingBar, rating, fromUser ->
            rating()
            Toast.makeText(this, "rating $rating", Toast.LENGTH_SHORT).show()
        }

        simpleRatingBar4.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
            rating()
            Toast.makeText(this, "rating $rating", Toast.LENGTH_SHORT).show()
        }
    }
}