package com.example.study_mate
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BaseDeDatosHelper(context: Context) : SQLiteOpenHelper(context, "studyMate.db", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        val createTableSchedules = """
            CREATE TABLE horarios (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                dia TEXT,
                hora_inicio TEXT,
                hora_fin TEXT,
                actividad TEXT
            )
        """.trimIndent()

        val createTableTasks = """
            CREATE TABLE tareas (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                nombre TEXT,
                descripcion TEXT,
                fecha_entrega TEXT,
                categoria TEXT,
                prioridad TEXT,
                estado TEXT
            )
        """.trimIndent()

        val createTableReminders = """
            CREATE TABLE recordatorios (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                nombre TEXT,
                descripcion TEXT,
                fecha TEXT,
                tipo TEXT
            )
        """.trimIndent()

        db?.execSQL(createTableSchedules)
        db?.execSQL(createTableTasks)
        db?.execSQL(createTableReminders)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS horarios")
        db?.execSQL("DROP TABLE IF EXISTS tareas")
        db?.execSQL("DROP TABLE IF EXISTS recordatorios")
        onCreate(db)
    }
}
