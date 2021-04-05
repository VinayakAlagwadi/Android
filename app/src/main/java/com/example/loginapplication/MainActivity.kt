package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {


            // setContentView(R.layout.second)

            // Toast.makeText(this,"second",Toast.LENGTH_LONG).show()

            var myintent= Intent(this,RegisterActivity::class.java)

            startActivity(myintent)

        }


           button2.setOnClickListener {

           //    var myintent= Intent(this@MainActivity,ThirdActivity::class.java)


        var strUser = intent.getStringExtra("Username")
        var strPassword = intent.getStringExtra("Password")

        var un = editTextTextEmailAddress.text.toString()
        var pass= editTextTextPassword.text.toString()

               if (strPassword.equals(pass)){

                   var intent= Intent(this,ThirdActivity::class.java)
                   startActivity(intent)
               }
               else
               {
                   Toast.makeText(this,"Incorrect Credentials",Toast.LENGTH_LONG).show()

               }



                // setContentView(R.layout.second)
             //   Toast.makeText(this, "Sign-up first", Toast.LENGTH_LONG).show()


           }
        }
    }
