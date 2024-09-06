package com.example.lista

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var alumnoAdapter: AlumnoAdapter
    private lateinit var listaAlumnos: MutableList<Alumno>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        listaAlumnos = mutableListOf(
            Alumno("Alvaro Jasiel", "202290", R.drawable.jas, "jasiel@gmail.com"),
            Alumno("Angel Andres", "2020230", R.drawable.andyy, "andy@gmail.com"),
            Alumno("Beatriz", "20196818", R.drawable.betty, "betty@gmail.com"),
            Alumno("Choco", "20166818", R.drawable.choco, "choco@gmail.com"),
            Alumno("Henry", "20189564", R.drawable.henry, "jerry@gmail.com"),

        )

        recyclerView = findViewById(R.id.recyclerViewAlumnos)
        recyclerView.layoutManager = LinearLayoutManager(this)
        alumnoAdapter = AlumnoAdapter(listaAlumnos)
        recyclerView.adapter = alumnoAdapter

        findViewById<Button>(R.id.btnAgregar).setOnClickListener {
            listaAlumnos.add(Alumno("Nuevo Alumno", "00000000", R.drawable.ic_launcher_foreground, "nuevo@example.com"))
            alumnoAdapter.notifyItemInserted(listaAlumnos.size - 1)
        }
    }

    private fun AppCompatActivity.enableEdgeToEdge() {
        // Implementación de la función
    }
}
