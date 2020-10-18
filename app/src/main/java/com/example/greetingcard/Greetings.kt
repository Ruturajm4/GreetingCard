package com.example.greetingcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_greetings.*
import kotlinx.android.synthetic.main.activity_main.*

class Greetings : AppCompatActivity() {

    companion object{ //variables becomes static

        const val nameExtra = "nameExtra" //once it is const then we can't value
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greetings)

        val name = intent.getStringExtra(nameExtra)
        birthdayGreeting.text = "Happy Birthday\n $name!!!"
    }

}