package com.rskigus.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lbl_follower_count = findViewById<TextView>(R.id.lbl_follower_count)
        val btn_follow = findViewById<Button>(R.id.btn_follow)
        var follow_count = 900

        lbl_follower_count.text = follow_count.toString()
        btn_follow.setOnClickListener {
            follow_count++
            lbl_follower_count.text = follow_count.toString()
        }
    }
}