package com.example.meineersteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doOnTextChanged

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userNameET = findViewById<EditText>(R.id.usernameET)
        val passwordET = findViewById<EditText>(R.id.passwordET)
        val eingeloggtBleibenCB = findViewById<CheckBox>(R.id.eingeloggtBleibenCB)
        val loginBTN = findViewById<Button>(R.id.loginBTN)
        val ergebnisTV = findViewById<TextView>(R.id.ergebnisTV)

        userNameET.doOnTextChanged { text, _, _, _ ->

            Log.d("UserInputTest", text.toString())
            ergebnisTV.text = text

        }

        loginBTN.setOnClickListener {

            val username = getUsername()
            Log.d("UserInputTest", username)
            ergebnisTV.text = "Hallo $username"

        }
    }

    fun getUsername(): String {
        val userNameET = findViewById<EditText>(R.id.usernameET)
        return userNameET.text.toString()
    }
}