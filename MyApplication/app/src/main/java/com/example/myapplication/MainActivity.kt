package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        var nombre:String=ingrese.text
        Toast.makeText(applicationContext,"Bienvenido $nombre al canal", Toast.LENGTH_SHORT).show()
    }
}