package com.example.bookshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlin.math.sign

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//this is a text
Button.setOnclickListener{
            val editTextEmailAddress = null
            val editTextTextPassword = null
            if (editTextEmailAddress.isNullOrBlank()&&editTextTextPassword.isNullOrBlank()) {
                Toast.makeText(this, "please fill the required fields", Toast.LENGTH_SHORT).show()
            }
                else
                {
                    Toast.makeText(this,"${editTextEmailAddress} is logged in!!", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        val signuphere = null
        signuphere.setOnClickListener{

        startActivity(Intent(this, SingUpActivity::class.java))
    }
}

        }

