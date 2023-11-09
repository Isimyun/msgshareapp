package com.mobiledevelopment.msgshareapp

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)

        //Bundle data type is for passing data between activities, by using bundle I can transport various data types
        //Receiving the incoming intent by using getIntent.getExtras
        //Store it inside bundle with nullable Bundle data type
        val bundle: Bundle? = intent.extras

        //Extract string from bundle
        //use "!!" showing that bundle is not null
        //Store inside message
        val message = bundle!!.getString("user_message")

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        val txvUserMessage: TextView = findViewById(R.id.txvUserMessage)

        //txvUserMessage will get text from message
        txvUserMessage.text = message
    }
}