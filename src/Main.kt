class Persona (var peso: Double, var altura: Double) {
    var nombre: String = "Sin nombre"
    val imc: Double = peso/(altura * altura)

    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }

    override fun toString(): String = "Persona: $nombre\nPeso: $peso\nAltura: $altura\nIMC: $imc"
}

fun main() {
    try {
        val persona1 = Persona(58.0, 1.6)
        val persona2 = Persona("Diego", 75.0, 1.9)
        val persona3 = Persona("Tomi", 75.0, 1.7)

        print("Introduce tu nombre persona1: ")
        persona1.nombre = readln()
        println(persona1.nombre)
        println(persona1.peso)
        println(persona1.altura)

        println(persona3.imc)
        println(persona3.altura)
        println(persona3.peso)
        persona3.altura = 1.8
        println(persona3.imc)
        println(persona3.altura)
        println(persona3.peso)

        persona2.altura = persona3.altura
        println(persona2)
        println(persona3)

    } catch (e: IllegalArgumentException) {
        println("Error, $e")
    }

}