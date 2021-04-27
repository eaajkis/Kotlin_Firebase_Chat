package com.example.firebasechat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        reg_button.setOnClickListener {
            val brugernavn = brugernavn_edittext_reg.text.toString()
            val password = password_edittext_reg.text.toString()

            Log.d("MainActivity", "User is: " + brugernavn)
            Log.d("MainActivity", "Password is: $password")
        }

        allerede_oprettet_label.setOnClickListener {
            Log.d("MainActivity", "Allerede Oprettet")
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}