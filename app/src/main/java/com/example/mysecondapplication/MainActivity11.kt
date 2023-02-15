package com.example.mysecondapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)
        val btn=findViewById<Button>(R.id.btn_toast)
        btn.setOnClickListener {
            val viewGroup=findViewById<ViewGroup>(R.id.cl)
            val view=layoutInflater.inflate(R.layout.customlayoutoftoast,viewGroup)
            val tv=view.findViewById<TextView>(R.id.textView)
            tv.setText("Demo of Custom Layout")
            val toast = Toast(applicationContext)
            toast.duration=Toast.LENGTH_SHORT
            //toast.setGravity(Gravity.CENTER_VERTICAL,0,100)
            toast.setView(view)
            toast.show()
        }

//        val btn = findViewById<Button>(R.id.btn_toast)
//        btn.setOnClickListener {
//            val viewGroup = findViewById<ViewGroup>(R.id.cl)
//            val view = layoutInflater.inflate(R.layout.customlayoutoftoast,viewGroup)
//            val tv = view.findViewById<TextView>(R.id.textView)
//            tv.setText("Demo of Custom Layout")
////            val toast = Toast(this)
//            val toast = Toast(applicationContext)
//            toast.duration=Toast.LENGTH_LONG
////            toast.setGravity(Gravity.CENTER_VERTICAL,0,0)
//            toast.setView(view)
//            toast.show()
//        }
    }
}