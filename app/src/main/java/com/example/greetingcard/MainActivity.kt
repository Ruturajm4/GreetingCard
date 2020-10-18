package com.example.greetingcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun createBirthdayCard(view: View) {

        val name = name.editableText.toString()

        val intent = Intent(this, Greetings::class.java)
        intent.putExtra(Greetings.nameExtra, name)
        startActivity(intent)
    }
}