package com.example.temilolaoluwa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.temilolaoluwa.R.id.btn1
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar

class ForgotpasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpassword)

        val forgetbtn: MaterialButton = findViewById(R.id.btn1)
        val emailfield: EditText = findViewById(R.id.emailfield)

        forgetbtn.setOnClickListener{
            val userEmail : String = emailfield.text.toString()
            if (!userEmail.matches(Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\$"))){
//                Hello Mr Anthony, hopefully you see this. I don't know why my message declaration
//                is red.

                message = "Enter an email address"
            }else{
                message = "an email has been sent"

            }
            Snackbar.make(findViewById(R.id.forgothost),message,
                Snackbar.LENGTH_LONG
            )
                .show()
        }

    }
}
