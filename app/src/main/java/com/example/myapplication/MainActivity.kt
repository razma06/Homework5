package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_authorisation.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorisation)
        init()
    }

    private fun init(){
        authorisationButton.setOnClickListener(){
            checker()
        }
    }
    private fun checker() {
        if (emailInput.text.isNotEmpty() && passwordInput.text.isNotEmpty())
            startActivity(Intent(this, PageActivity::class.java))
        else
            Toast.makeText(this, "Fill all fields", Toast.LENGTH_SHORT).show()
    }
}