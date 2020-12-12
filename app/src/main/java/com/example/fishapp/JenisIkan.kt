package com.example.fishapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class JenisIkan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jenis_ikan)

        findViewById<Button>(R.id.btn_ikanNemo).setOnClickListener(){
            intent = Intent(this, InfoBadut::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btn_ikanDiscus).setOnClickListener(){
            intent = Intent(this, InfoDIscus::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btn_ikanGuppy).setOnClickListener(){
            intent = Intent(this, InfoGuppy::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btn_ikanKaosKaki).setOnClickListener(){
            intent = Intent(this, InfoKaosKaki::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btn_ikanNeonTetra).setOnClickListener(){
            intent = Intent(this, InfoNeonTetra::class.java)
            startActivity(intent)
        }

    }
}