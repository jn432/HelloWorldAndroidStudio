package com.example.helloworldandroidstudio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {

    /** Runs when object is created */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        //get the EditText with id editTextTextPersonName
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        //get the string value inside the EditText
        val message = editText.text.toString()

        //create an Intent
        val intent = Intent(this, DisplayMessageActivity::class.java).apply{
            //add a key-value pair (extra) to the intent
            putExtra(EXTRA_MESSAGE, message)
        }

        //start an instance of Class specified by intent(DisplayMessageActivity)
        startActivity(intent)
    }

}