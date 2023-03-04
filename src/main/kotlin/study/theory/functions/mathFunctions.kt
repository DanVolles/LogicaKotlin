package study.theory.functions

import kotlin.math.*

fun main() {

    println("O maior número é: " + max(5, 6))
    println("O menor número é: " + min(5, 6))

    // Tanto a raíz quadrada quanto o quadrado de um número necessitam de Doubles para aplicar a função
    println("A raiz quadrada de 25 é: " + sqrt(25.0))
    println("O quadrado de 5 é: ${5.00.pow(2)}.")

    println(PI) // pi
    println(E) // Euler

    println("Arredondar 29.998 -> " + round(29.998))

}