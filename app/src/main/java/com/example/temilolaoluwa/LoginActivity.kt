package com.example.temilolaoluwa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

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
            var message = "";
            if (userf.isEmpty() and passf.isEmpty()){
                message = "fill the required fields"
            }else {
                val intent = Intent(this, HomeActivity::class.java)
                this.startActivity(intent)
            }

            Snackbar.make(findViewById(R.id.loginhost
            ),message,
                Snackbar.LENGTH_LONG
            )
                .show()

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