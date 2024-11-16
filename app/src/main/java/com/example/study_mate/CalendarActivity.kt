package com.example.study_mate

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.CalendarView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.core.view.isVisible

class CalendarActivity : AppCompatActivity() {

    private lateinit var calendarView: CalendarView
    private lateinit var tasksRecyclerView: RecyclerView
    private lateinit var tasksForSelectedDateTitle: TextView

    // Sample data for tasks (you can replace this with real data from your database or API)
    private val taskList = mutableMapOf<String, List<String>>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        // Initialize views
        calendarView = findViewById(R.id.calendarView)
        tasksRecyclerView = findViewById(R.id.tasksRecyclerView)

        // Initialize RecyclerView with a LinearLayoutManager
        tasksRecyclerView.layoutManager = LinearLayoutManager(this)

        // Add some sample tasks for testing
        addSampleTasks()

        // Set up the CalendarView listener
        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            // Format the date as a string
            val selectedDate = "$dayOfMonth-${month + 1}-$year"

            // Show the tasks for the selected date
            showTasksForSelectedDate(selectedDate)
        }

        // Set up navigation buttons
        setupNavigationBar()
    }

    // Method to add some sample tasks
    private fun addSampleTasks() {
        taskList["15-11-2024"] = listOf("Math Homework", "Study for History Exam")
        taskList["16-11-2024"] = listOf("English Essay", "Physics Project")
    }

    // Method to show tasks for the selected date
    private fun showTasksForSelectedDate(selectedDate: String) {
        val tasks = taskList[selectedDate]

        if (tasks != null && tasks.isNotEmpty()) {
            tasksForSelectedDateTitle.isVisible = true
            tasksRecyclerView.isVisible = true
            val adapter = TasksAdapter(tasks)
            tasksRecyclerView.adapter = adapter
        } else {
            tasksForSelectedDateTitle.isVisible = false
            tasksRecyclerView.isVisible = false
            Toast.makeText(this, "No tasks for selected date", Toast.LENGTH_SHORT).show()
        }
    }

    // Method to handle bottom navigation bar interactions
    private fun setupNavigationBar() {
        // Home button navigation
        val homeButton = findViewById<LinearLayout>(R.id.homeButton)
        homeButton.setOnClickListener {
            val intent = Intent(this@CalendarActivity, HomeActivity::class.java)
            startActivity(intent)
        }

        // Homeworks button navigation
        val homeworksButton = findViewById<LinearLayout>(R.id.homeworksButton)
        homeworksButton.setOnClickListener {
            val intent = Intent(this@CalendarActivity, HomeworksActivity::class.java)
            startActivity(intent)
        }

        // Calendar button navigation (no action needed here as we're already in CalendarActivity)
        val calendarButton = findViewById<LinearLayout>(R.id.calendarButton)
        calendarButton.setOnClickListener {
            Toast.makeText(this, "You are already in Calendar", Toast.LENGTH_SHORT).show()
        }

        // Settings button navigation
        val settingsButton = findViewById<LinearLayout>(R.id.settingsButton)
        settingsButton.setOnClickListener {
            val intent = Intent(this@CalendarActivity, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}
