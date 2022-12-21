package ControlFlow

fun main(args: Array<String>) {

// ----------- While
    var sum = 1
    while (sum < 1_000) {
        sum += 1
        println(sum)
        break
    }

// Estrutura de repetição
    var numeros = arrayOf(1, 2, 3, 4, 5, 6, 100, 200, 300, 400, 500, 600)
    var i = 0
    while (i <= numeros.size - 1) { // usa-se -1 por que o treco é estranho e adiciona um no array
        println(numeros[i])
        i++
    }

}