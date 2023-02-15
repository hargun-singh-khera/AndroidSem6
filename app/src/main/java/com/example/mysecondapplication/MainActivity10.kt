package com.example.mysecondapplication

import android.app.DownloadManager.Request
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import java.net.URI

class MainActivity10 : AppCompatActivity() {
    lateinit var imageView:ImageView
    lateinit var uri:Uri
    val picid=123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        imageView = findViewById(R.id.imageView)
        val btn = findViewById<Button>(R.id.button8)
        val btn_camera = findViewById<Button>(R.id.button9)
        val intent = registerForActivityResult(ActivityResultContracts.GetContent())
        {
            uri=it!!
        }
        btn.setOnClickListener {
            intent.launch("images/*")
        }

        btn_camera.setOnClickListener {
            val i = if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.CUPCAKE) {
                Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            } else {}
            startActivityForResult(i as Intent, picid)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==picid) {
            val b=data?.extras!!["data"] as Bitmap
            imageView.setImageBitmap(b)
        }
    }
}