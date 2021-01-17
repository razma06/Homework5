package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_page.*

class PageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page)
        init()
    }

    private fun init(){
        Glide.with(this)
            .load("https://images.unsplash.com/photo-1531804055935-76f44d7c3621?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80")
            .placeholder(R.drawable.ic_baseline_refresh_24).error(R.mipmap.ic_launcher)
            .into(coverImage)

        Glide.with(this)
            .load("https://images.unsplash.com/photo-1419242902214-272b3f66ee7a?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1087&q=80")
            .placeholder(R.drawable.ic_baseline_refresh_24)
            .error(R.mipmap.ic_launcher)
            .into(profileImage)

    }
}
