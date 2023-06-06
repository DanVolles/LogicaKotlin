package study.theory.collections.functionsCollections

import study.theory.collections.functionsCollections.dataClasses.geraDados

fun main() {
    val data = geraDados()
    // É necessário um conjunto de numeros para trabalhar com ela
    println(listOf(1, 1, 2, 3, 5, 8, 13, 21).average()) // Retorna a média dos valores dessa lista

    println(data.map { it.calorias }.average()) // Retorna a média das calorias das receitas de 'data'
}