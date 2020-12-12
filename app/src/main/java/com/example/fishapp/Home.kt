package com.example.fishapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<Button>(R.id.btn_infoIkan).setOnClickListener(){
            intent = Intent(this, JenisIkan::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btn_aquascape).setOnClickListener(){
            intent = Intent(this, DasarAquascape::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btn_alatBahan).setOnClickListener(){
            intent = Intent(this, AlatNBahan::class.java)
            startActivity(intent)
        }



    }
}