package co.com.audifarma.introkotlin.models

class Person(
    val name: String,
    val age: Int,
    val genre: String? = null
) {

    fun tipoPersona(): String =
        when (age) {
            in 0..12 -> "$name es un niño"
            in 13..17 -> "$name es adolescente"
            in 18..69 -> "$name es adulto"
            in 70..99 -> "$name adulto mayor"
            else -> "$name no sabemos que paso..."
        }

    override fun toString(): String {
        return "{name: $name, genre: $genre}"
    }
}