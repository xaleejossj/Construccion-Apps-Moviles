package com.example.study_mate

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class HomeworksActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeworks)

        val tasksListView = findViewById<ListView>(R.id.tasksListView)

        // Crear un conjunto más grande de tareas para mostrar
        val tasks = listOf(
            Task("Tarea 1", "2024-11-30", "Estudiar para el examen de matemáticas.", "Alta", "Matemáticas"),
            Task("Tarea 2", "2024-12-05", "Leer el capítulo 5 del libro de historia.", "Media", "Historia"),
            Task("Tarea 3", "2024-11-28", "Escribir un ensayo sobre la Revolución Francesa.", "Baja", "Historia"),
            Task("Tarea 4", "2024-12-15", "Resolver ejercicios del libro de química.", "Alta", "Química"),
            Task("Tarea 5", "2024-11-25", "Estudiar para el examen de literatura.", "Alta", "Literatura"),
            Task("Tarea 6", "2024-12-10", "Completar la práctica de física sobre leyes de Newton.", "Media", "Física"),
            Task("Tarea 7", "2024-11-29", "Revisar y corregir el proyecto final de informática.", "Alta", "Informática"),
            Task("Tarea 8", "2024-12-20", "Realizar la lectura de biología sobre genética.", "Baja", "Biología"),
            Task("Tarea 9", "2024-11-30", "Preparar la presentación para la clase de inglés.", "Alta", "Inglés"),
            Task("Tarea 10", "2024-12-01", "Estudiar para el examen de economía.", "Media", "Economía"),
            Task("Tarea 11", "2024-12-12", "Redactar el informe de la práctica de laboratorio.", "Baja", "Química"),
            Task("Tarea 12", "2024-12-05", "Terminar el informe de investigación para el curso de sociología.", "Alta", "Sociología"),
            Task("Tarea 13", "2024-12-08", "Realizar los ejercicios de matemáticas sobre álgebra.", "Alta", "Matemáticas"),
            Task("Tarea 14", "2024-12-10", "Leer el artículo sobre filosofía moderna.", "Media", "Filosofía"),
            Task("Tarea 15", "2024-12-14", "Estudiar los conceptos de programación orientada a objetos.", "Alta", "Informática"),
            Task("Tarea 16", "2024-11-30", "Revisar el informe de la práctica de biología.", "Baja", "Biología"),
            Task("Tarea 17", "2024-12-20", "Preparar los apuntes para el examen de historia.", "Media", "Historia"),
            Task("Tarea 18", "2024-12-10", "Completar los ejercicios de álgebra y trigonometría.", "Alta", "Matemáticas"),
            Task("Tarea 19", "2024-12-15", "Estudiar para el examen de física.", "Baja", "Física"),
            Task("Tarea 20", "2024-11-28", "Leer el capítulo sobre la economía del mercado global.", "Media", "Economía")
        )

        // Establecer el adaptador para el ListView
        val adapter = TareasAdapter(this, tasks)
        tasksListView.adapter = adapter
    }
}

