package com.example.a175410197_fauzan_azimah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_actmain_fauzan.setOnClickListener{
            val asu = Intent(this, Menu_dua::class.java)
            startActivity(asu)
        }


}}