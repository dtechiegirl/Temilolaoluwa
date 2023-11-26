package com.example.temilolaoluwa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val usernamefield: EditText = findViewById(R.id.editText)
        val passwordfield: EditText = findViewById(R.id.editText2)

        var loginBtn: Button = findViewById(R.id.btn1)
        loginBtn.setOnClickListener{
            val userf : String = usernamefield.text.toString()
            val passf: String = passwordfield.text.toString()
            if (userf.isEmpty() and passf.isEmpty()){

                // Hello Mr Anthony, hopefully you see this. I don't know why my message declaration
//               is red. My condition works tho, i tried it with the intent activity below and it passed.
               /*val intent = Intent(this, CreateNewActivity::class.java)
                  this.startActivity(intent)
                */

                message = "fill the required fields"
            }else {
                val intent = Intent(this, HomeActivity::class.java)
                this.startActivity(intent)
            }

        }

        var jnb1: Button = findViewById(R.id.createac)
        jnb1.setOnClickListener{
            val intent = Intent(this, CreateNewActivity::class.java)
            this.startActivity(intent)
        }

        var fPass: Button = findViewById(R.id.pass)
        fPass.setOnClickListener{
            val intent = Intent(this, ForgotpasswordActivity::class.java)
            this.startActivity(intent)
        }


    }
}