package com.davila.alessandro.usolayoutsv4
import kotlin.collections.forEach

data class Contacto(
    val nombre: String,
    val telefono: String,
    val email: String
)

class Agenda {
    private val contactos: MutableList<Contacto> = mutableListOf()

    fun agregarContacto(contacto: Contacto) {
        contactos.add(contacto)
    }

    fun listarContactos() {
        if (contactos.isEmpty()) {
            println("No hay contactos en la agenda.")
        } else {
            contactos.forEach { contacto ->
                println("Nombre: ${contacto.nombre}, Telefono: ${contacto.telefono}, Email: ${contacto.email}")
            }
        }
    }

    fun buscarContactoPorNombre(nombre: String): Contacto? {
        return contactos.find { it.nombre.equals(nombre, ignoreCase = true) }
    }
}

fun main() {
    val agenda = Agenda()
    val contacto1 = Contacto("Juan Perez", "123456789", "juan@email.com")
    val contacto2 = Contacto("Ana Gomez", "987654321", "ana@email.com")
    val contacto3 = Contacto("Carlos Martinez", "456789123", "carlos@email.com")

    agenda.agregarContacto(contacto1)
    agenda.agregarContacto(contacto2)
    agenda.agregarContacto(contacto3)

    println("Lista de contactos:")
    agenda.listarContactos()

    val nombreABuscar = "Ana Gómez"
    val contactoEncontrado = agenda.buscarContactoPorNombre(nombreABuscar)

    if (contactoEncontrado != null) {
        println("\nContacto encontrado: ${contactoEncontrado.nombre}, Teléfono: ${contactoEncontrado.telefono}, Email: ${contactoEncontrado.email}")
    } else {
        println("\nContacto no encontrado.")
    }
}
