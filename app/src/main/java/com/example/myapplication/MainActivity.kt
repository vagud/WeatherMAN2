package com.example.myapplication

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.net.URL

class MainActivity : AppCompatActivity() {
    private var user_field: EditText? = null
    private var main_btn: Button? = null
    private var result_info: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        user_field = findViewById(R.id.user_field)
        main_btn = findViewById(R.id.main_btn)
        result_info = findViewById(R.id.result_info)

        main_btn?.setOnClickListener {
            if (user_field?.text?.toString()?.trim()?.equals("")!!)
                Toast.makeText(this, "Enter city", Toast.LENGTH_LONG).show()
            else {
                var city: String = user_field?.text.toString()
                var key: String = "3beb7520990be7f62b47ab48cb0c3b80"
                var url: String = "https://api.openweathermap.org/data/2.5/weather?q=$city&appid=$key&units=metric"




                val apiResponse = URL(url).readText()
                Log.d("INFO", apiResponse)




            }
        }
    }
}