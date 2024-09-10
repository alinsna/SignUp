package com.example.signup

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to the input fields
        val emailEditText = findViewById<EditText>(R.id.editTextEmail)
        val fullNameEditText = findViewById<EditText>(R.id.editTextFullName)
        val usernameEditText = findViewById<EditText>(R.id.editTextUsername)
        val passwordEditText = findViewById<EditText>(R.id.editTextPassword)

        // Button click listener
        val signUpButton = findViewById<Button>(R.id.buttonSignUp)
        signUpButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val fullName = fullNameEditText.text.toString()
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Show a toast message with the user inputs
            Toast.makeText(this, "Email: $email\nFullname: $fullName\nUsername: $username\nPassword: $password", Toast.LENGTH_LONG).show()
        }
    }
}
