package study.controlFlow

fun main(args: Array<String>) {

// ----------- While
// O while sempre espera um booleano na sua condição. Enquanto true/false faça...
    var i = 0
    while (i <=    100) {
        println(i)
        i++
    }

// Estrutura de repetição
    val numeros = arrayOf(1, 2, 3, 4, 5, 6, 100, 200, 300, 400, 500, 600)
    var j = 0
    while (i <= numeros.size - 1) { // usa-se -1 por que o treco é estranho e adiciona um no array
        println(numeros[i])
        i++
    }

    do {
        print("Qaul o seu nome?")
        val nome = readln()
    } while (nome == "" || nome != "Danilo")

}