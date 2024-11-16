package com.example.study_mate

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.LinearLayout

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Botón Homeworks
        val homeworksButton = findViewById<LinearLayout>(R.id.homeworksButton)
        homeworksButton.setOnClickListener {
            val intent = Intent(
                this@HomeActivity,
                HomeworksActivity::class.java
            ) // Cambio de DashboardActivity a HomeActivity
            startActivity(intent)
        }

        // Botón Calendar
        val calendarButton = findViewById<LinearLayout>(R.id.calendarButton)
        calendarButton.setOnClickListener {
            val intent = Intent(
                this@HomeActivity,
                CalendarActivity::class.java
            ) // Cambio de DashboardActivity a HomeActivity
            startActivity(intent)
        }

        // Botón Settings
        val settingsButton = findViewById<LinearLayout>(R.id.settingsButton)
        settingsButton.setOnClickListener {
            val intent = Intent(
                this@HomeActivity,
                SettingsActivity::class.java
            ) // Cambio de DashboardActivity a HomeActivity
            startActivity(intent)
        }
    }
}