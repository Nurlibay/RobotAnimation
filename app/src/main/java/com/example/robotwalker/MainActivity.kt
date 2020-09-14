package com.example.robotwalker

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startWalking.setOnClickListener {
            val bgImage = imageView.background as AnimationDrawable
            bgImage.start()
        }

        stopWalking.setOnClickListener {
            val bgImage = imageView.background as AnimationDrawable
            bgImage.stop()
        }
    }
}