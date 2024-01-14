package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var editText1 : EditText
    lateinit var editText2 : EditText
    lateinit var textView1 : TextView
    lateinit var btn1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText1  = findViewById(R.id.first_name)
        editText2  = findViewById(R.id.last_name)
        textView1  = findViewById(R.id.text)
        btn1=findViewById(R.id.button)
        btn1.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var firstName=editText1.text
        var lastName=editText2.text
        textView1.text="$firstName $lastName"
    }

}