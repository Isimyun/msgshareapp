package com.mobiledevelopment.msgshareapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//When using AppCompat, make sure the theme in AndroidManifest.xml file is updated accordingly
class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //This is attaching the xml file to the kt file
        setContentView(R.layout.activity_main)

        //Create a local variable for this button, and get the ID from the xml file
        val btnShowToast: Button = findViewById(R.id.btnShowToast)
        btnShowToast.setOnClickListener {
            //Logcat information(This is only for developer to see)
            Log.i("Main Activity", "Button was clicked")

            //Toast is the popup for users, make sure it have ".show()"
            //Parameters, current activity, text, length of popup
            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()
        }
    }
}