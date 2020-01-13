package com.example.a175410197_fauzan_azimah

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu__dua.*

class Menu_dua: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu__dua)

        asu()
    }

    private fun asu() {
        btn_kamera_menudua.setOnClickListener{
            val asu = Intent(this, Menu_kameran::class.java)
            startActivity(asu)
        }
        btn_lept_menudua.setOnClickListener{
            val asu = Intent(this, Menu_leptop::class.java)
            startActivity(asu)
        }
        btn_hendPhone_menudua.setOnClickListener{
            val asu = Intent(this, Menu_hp::class.java)
            startActivity(asu)
        }

    }
}