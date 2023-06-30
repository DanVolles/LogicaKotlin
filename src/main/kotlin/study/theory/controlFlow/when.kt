package study.theory.controlFlow

fun main(args: Array<String>) {

    // Mesmo objetivo do if/else
    // Similar ao switch case do Java

    var opcao = 1

    when (opcao) {
        1 -> println("Número escolhido: 1.")
        2 -> println("Número escolhido: 2.")
        3 -> println("Número escolhido: 3.")
        else -> println("Erro.")
    }

    var mensagem = when (opcao) {
        1 -> "1"
        2 -> "2"
        3 -> "3"
        else -> "Erro"
    }

    println(mensagem)

}