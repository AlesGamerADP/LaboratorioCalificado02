package com.davila.alessandro.usolayoutsv4

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio01 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio01)

        // Referencias a los botones y la vista
        val btnMostrar: Button = findViewById(R.id.btnMostrar)
        val btnOcultar: Button = findViewById(R.id.btnOcultar)
        val viewVerde: View = findViewById(R.id.viewVerde)

        // Establecer el comportamiento de los botones

        // Mostrar la vista verde
        btnMostrar.setOnClickListener {
            viewVerde.visibility = View.VISIBLE
        }

        // Ocultar la vista verde
        btnOcultar.setOnClickListener {
            viewVerde.visibility = View.GONE
        }
    }
}
