package com.example.introduccionkotlin

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onClick(v: View?)  {
        when(v?.id){
            R.id.boton -> Toast.makeText(this,"Hola que hace",Toast.LENGTH_LONG).show()
            R.id.boton2 -> Toast.makeText(this,"Hola, nada",Toast.LENGTH_LONG).show()
        }
    }
    }
