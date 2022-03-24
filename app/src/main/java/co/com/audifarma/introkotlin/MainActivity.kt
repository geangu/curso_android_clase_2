package co.com.audifarma.introkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import co.com.audifarma.introkotlin.models.Person

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Variables
        var edad = 34.5
        var nombre = "Andres Gutierrez"
        var flag = true

        // Constants
        val PI = 3.1415

        val tvResult = findViewById<TextView>(R.id.tvResult)
        tvResult.text = "Mi nombre es: $nombre mi edad es: $edad y la flag esta en: $flag"


        // Operadores lógicos
        // A && B operador "Y"
        // A || B operador "O"
        // !A  negacion
        //println(!flag)


        // Condicionales
        // condicionales()

        // Listas
        // listas()

        // Mapas
        // mapas()

        // Ciclos
        // ciclos()

        // Funciones
        // funciones()

        // Clases
        clases()
    }

    fun condicionales() {

        // Operadores condicionales
        // > mayor que
        // < menor que
        // >= Mayor o igual
        // <= Menor o igual
        // == Igualdad
        // != Diferentes

        // If
        val edad = 1
        if (edad >= 18) {
            println("Es adulto")
        } else if (edad in 13..18) {
            println("Es Adolescente")
        } else {
            println("Es niño")
        }

        // When
        when (edad) {
            in 0..12 -> {
                println("Es un niño")
            }
            in 13..17 -> {
                println("Es Adolescente")
            }
            in 18..69 -> {
                println("Es adulto")
            }
            in 70..99 -> {
                println("Es adulto mayor")
            }
            else -> {
                println("Caso no soportado")
            }
        }

    }

    fun listas() {

        val compras = arrayListOf<String>()
        compras.add("Leche")
        compras.add("Huevos")
        compras.add("Pan")
        println("compras: $compras")

        // Adicionar n elementos
        compras.addAll(listOf("Carne", "Enlatados"))
        println("compras: $compras")

        compras += listOf("Pasta", "Tomate")
        println("compras: $compras")

        compras.map { element ->
            println(element)
        }

        val mascotas = arrayListOf("Perro", "Gato", "Pez")
        println("mascotas: $mascotas")

        // Acceso a elementos de la lista
        println("Mi primera mascota es: ${mascotas.first()} ")
        println("Mi última mascota es: ${mascotas.last()} ")
        println("Mi segunda mascota es: ${mascotas[1]} ")
        println("El total de mascotas es: ${mascotas.count()}")

        // Limpiar una lista
        compras.clear()
        println("compras: $compras")
    }

    fun mapas() {

        // Creación de Mapas
        val user = hashMapOf<String, String>()
        user["name"] = "Andres"
        user["age"] = "34"
        user.put("nacionalidad", "Colombiano")

        println("El mapa de usuario es: $user")

        // Eliminar llaves
        user.remove("nacionalidad")
        println("El mapa de usuario es: $user")
    }

    fun ciclos() {
        val personas = listOf("Andres", "David", "Hugo", "Paco", "Luis")

        println("Iteracion lambdas")
        // Iteracion con lambdas
        personas.map { println(it) }

        println("Iteracion for in")
        // Iteracion for In
        for (persona in personas) {
            println(persona)
        }

        println("Iteracion for in range")
        // Iteracion sobre rangos
        for (element in 0..9) {
            println(element)
        }

        println("Iteracion for in range")
        // Iteracion sobre rangos
        for (element in 0..9) {
            println(element)
        }

        println("Iteracion for in range with step")
        // Iteracion sobre rangos
        for (element in 0..10 step 2) {
            println(element)
        }

        println("Iteracion for in range downTo")
        // Iteracion sobre rangos
        for (element in 10 downTo 0) {
            println(element)
        }

        println("Iteracion while")
        // While
        var x = 0
        while (x < 10) {
            println(x)
            x++
        }
    }

    fun funciones() {
        sayHello()
        sayHelloName("Andres")
        sayHelloNameAndAge("Hugo", 30)

        println(sumar(10, 5))

        val resultVararg = funcionVarargs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        println(resultVararg)
    }

    fun sayHello() {
        println("Hola mundo")
    }

    fun sayHelloName(name: String) {
        println("Hola $name")
    }

    fun sayHelloNameAndAge(name: String, age: Int) {
        println("Hola $name tienes $age años")
    }

    fun sumar(arg1: Int, arg2: Int): Int = arg1 + arg2

    fun funcionVarargs(vararg args: Int): Int {
        var result = 0
        for (arg in args) {
            result += arg
        }
        return result
    }

    fun clases() {
        val andres = Person(age = 30, name = "Andres", genre = "Masculino")
        val hugo = Person(age = 10, name = "Hugo")
        println(andres.tipoPersona())
        println(hugo.tipoPersona())
    }

    fun saludar(view: View) {
        val editTextTextPersonName = findViewById<EditText>(R.id.editTextTextPersonName)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        val nombre = editTextTextPersonName.text.toString()
        tvResult.text = "Hola $nombre"
    }
}