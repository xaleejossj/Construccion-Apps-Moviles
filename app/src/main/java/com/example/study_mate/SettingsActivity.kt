package com.example.study_mate

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        // Get references to UI elements
        val profileName: TextView = findViewById(R.id.profileName)
        val profileEmail: TextView = findViewById(R.id.profileEmail)
        val profileImage: ImageView = findViewById(R.id.profileImage)

        // Set fictitious user profile data
        profileName.text = "John Doe"
        profileEmail.text = "johndoe@example.com"
        profileImage.setImageResource(R.drawable.ic_profile)

        // Setup Navigation Bar on click listeners
        val homeButton: LinearLayout = findViewById(R.id.homeButton)
        val homeworksButton: LinearLayout = findViewById(R.id.homeworksButton)
        val calendarButton: LinearLayout = findViewById(R.id.calendarButton)
        val settingsButton: LinearLayout = findViewById(R.id.settingsButton)

        // Add navigation listeners
        homeButton.setOnClickListener {
            // Navigate to HomeActivity
        }
        homeworksButton.setOnClickListener {
            // Navigate to HomeworksActivity
        }
        calendarButton.setOnClickListener {
            // Navigate to CalendarActivity
        }
        settingsButton.setOnClickListener {
            // Already in SettingsActivity
        }
    }
}
