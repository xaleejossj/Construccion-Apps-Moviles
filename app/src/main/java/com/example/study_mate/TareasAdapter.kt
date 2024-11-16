package com.example.study_mate

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.BaseAdapter

class TareasAdapter(
    private val context: Context,
    private val tasks: List<Task>
) : ArrayAdapter<Task>(context, R.layout.task_item, tasks) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.task_item, parent, false)

        val task = tasks[position]

        // Asignar los datos a las vistas del card
        val taskTitle: TextView = view.findViewById(R.id.taskTitle)
        val taskDueDate: TextView = view.findViewById(R.id.taskDueDate)
        val taskDescription: TextView = view.findViewById(R.id.taskDescription)
        val taskImportance: TextView = view.findViewById(R.id.taskImportance)
        val taskSubject: TextView = view.findViewById(R.id.taskSubject)

        taskTitle.text = task.title
        taskDueDate.text = "Fecha límite: ${task.dueDate}"
        taskDescription.text = "Descripción: ${task.description}"
        taskImportance.text = "Importancia: ${task.importance}"
        taskSubject.text = "Materia: ${task.subject}"

        return view
    }
}

