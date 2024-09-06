package com.example.lista

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlumnoAdapter(private val listaAlumnos: List<Alumno>) : RecyclerView.Adapter<AlumnoAdapter.AlumnoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_alumno, parent, false)
        return AlumnoViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlumnoViewHolder, position: Int) {
        val alumno = listaAlumnos[position]
        holder.nombre.text = alumno.nombre
        holder.cuenta.text = alumno.cuenta
        holder.correo.text = alumno.correo
        holder.imagen.setImageResource(alumno.imagen)
    }

    override fun getItemCount(): Int = listaAlumnos.size

    class AlumnoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombre: TextView = itemView.findViewById(R.id.textViewNombre)
        val cuenta: TextView = itemView.findViewById(R.id.textViewCuenta)
        val correo: TextView = itemView.findViewById(R.id.textViewCorreo)
        val imagen: ImageView = itemView.findViewById(R.id.imageViewAlumno)
    }
}
