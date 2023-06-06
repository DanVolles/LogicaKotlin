package study.theory.collections.functionsCollections

import study.theory.collections.functionsCollections.dataClasses.geraDados

fun main() {
    val data = geraDados()
    // First e Last
    println("Primeira receita: ${data.first()}") // Retorna a primeira receita
    println("Primeira receita: ${data.first().nome}") // Retorna o nome da receita
    println("Última receita: ${data.last().calorias}") // Retorna as calorias da última receita

    // No caso de listas nulas, sem itens
    listOf<Int>().firstOrNull() // Para não dar erro, precisa ter o null, já que a lista está vazia
    listOf<Int>().lastOrNull()

}