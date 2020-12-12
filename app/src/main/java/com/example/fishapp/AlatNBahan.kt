package com.example.fishapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AlatNBahan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alat_n_bahan)

        findViewById<Button>(R.id.btn_akuarium).setOnClickListener(){
            intent = Intent(this, Akuarium::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn_aeratorfilter).setOnClickListener(){
            intent = Intent(this, AeratorFilter::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn_Pakan).setOnClickListener(){
            intent = Intent(this, Pakan::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn_Aksesoris).setOnClickListener(){
            intent = Intent(this, Aksesoris::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btn_alatpembersih).setOnClickListener(){
            intent = Intent(this, AlatPembersih::class.java)
            startActivity(intent)
        }

    }
}