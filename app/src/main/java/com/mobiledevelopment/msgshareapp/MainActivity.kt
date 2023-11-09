package com.mobiledevelopment.msgshareapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
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

        val btnSendDataToNextActivity: Button = findViewById(R.id.btnSendMessageToNextActivity)
        btnSendDataToNextActivity.setOnClickListener {

            //This part will be comment
            //Everytime want to use ID from xml just create local variable, and set the data type according to the xml file
            val etUserMessage: EditText = findViewById(R.id.etUserMessage)

            //What happened here is what text is in the "Edit Text", it will be converted to String and stored inside message variable
            val message: String = etUserMessage.text.toString()

//            //This part is commented because recent update, is at second activity
//            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            //Intent is basically what u wanna do
            //Currently we just wanna navigate to another activity
            //Create variable, use Intent with parameters of address of current activity and the target activity
            //include ::class.java
            val intent = Intent(this, SecondActivity::class.java)

            //putExtra method is to send data to another activity
            //parameters are key(unique name) and value(variable or message)
            intent.putExtra("user_message", message)

            //Basically starts a new activity
            startActivity(intent)
        }
    }
}