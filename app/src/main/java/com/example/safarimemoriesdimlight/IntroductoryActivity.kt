package com.example.safarimemoriesdimlight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntroductoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introductory)

        var buttonStart:Button ?= null
        var buttonContinue:Button ?= null

        //Finding the views by Id
        buttonStart = findViewById(R.id.mBtnSignUp)
        buttonContinue = findViewById(R.id.mBtnGoToLogin)

        //Setting the on Click listener
        buttonContinue.setOnClickListener {
            var goToLoginActivity = Intent(this,LoginActivity::class.java)
            startActivity(goToLoginActivity)
        }
        buttonStart.setOnClickListener {
             var goToSignUpActivity = Intent(this,LoginActivity::class.java)
            startActivity(goToSignUpActivity)
        }
    }
}