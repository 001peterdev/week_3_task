package com.example.week_3_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/* adding onChecked listener to toggle between Light mode and Night mode*/
        val sw = findViewById<SwitchCompat>(R.id.switchButton)
        sw.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
            else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
//            val message = if (isChecked) "Switch1:ON" else "Switch1:OFF"
//            Toast.makeText(this@MainActivity, message,
//                Toast.LENGTH_SHORT).show()
        }
    }
}
