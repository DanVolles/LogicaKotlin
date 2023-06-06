package study.theory.collections.functionsCollections

import study.theory.collections.functionsCollections.dataClasses.geraDados

// MAX E MIN
// Nesse caso também só podemos tratar de dados numéricos.

fun main() {
    val data = geraDados()

    // Max
    println(data.maxOf { it.calorias }) // Nos retorna a receita com mais calorias
    // Min
    println(data.minOf { it.calorias }) // retorna a receita com menos calorias

    println(listOf(1, 1, 2, 3, 5, 8, 13, 21).max()) // Retorna o maior valor da lista
    println(listOf(1, 1, 2, 3, 5, 8, 13, 21).maxOf { it }) // Também nos retorna o maior valor da lista
    println(listOf(1, 1, 2, 3, 5, 8, 13, 21).maxOrNull()) // Se for um conjunto vazio vai lançar uma excessão

    // Tudo isso funciona para o Min também
    println(listOf(1, 1, 2, 3, 5, 8, 13, 21).min())
    println(listOf(1, 1, 2, 3, 5, 8, 13, 21).minOf { it })
    println(listOf(1, 1, 2, 3, 5, 8, 13, 21).minOrNull())

    // maxBy // minBy
    println(data.maxBy { it.calorias }) // Retorna o objeto completo que possui a maior quantidade de calorias

}