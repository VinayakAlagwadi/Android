package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        button3.setOnClickListener{

        var name = editTextTextPersonName.text.toString()
        var email = editTextTextEmailAddress2.text.toString()
        var phno = editTextPhone.text.toString()
        var pass1 = editTextTextPassword2.text.toString()
        var pass2 = editTextTextPassword3.text.toString()

           // var list : List= listOf<>()


            var myintent= Intent(this@RegisterActivity,MainActivity::class.java)

              myintent.putExtra("Username", email)
            myintent.putExtra("Password", pass1)
            startActivity(myintent)



        }
        button4.setOnClickListener {

            var myintent= Intent(this@RegisterActivity,MainActivity::class.java)
            startActivity(myintent)



        }



    }


}