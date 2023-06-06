package study.theory.collections.functionsCollections

import study.theory.collections.functionsCollections.dataClasses.geraDados

fun main() {
    val data = geraDados()

    val lista1 = listOf(1, 1, 2, 3, 5, 8, 13, 21)
    val lista2 = listOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
    val lista3 = listOf("a", "b", "a", "a", "c", "b", "c", "a", "b")
    val lista4 = listOf(2, 4, 5, 1, 5, 2, 8, 6, 7, 2, 3, 9, 0, 1, 1, 2, 5, 6, 7, 2, 5)

    // DISTINCT
    // Você só quer valores distintos, perceba que ele só pega um de cada
    println(lista1.distinct())
    println(lista2.distinct())
    println(lista3.distinct())

    // Com o distinctBy
    println(data.distinctBy { it.nome })
    println(data.distinctBy { it.calorias })

    // SORTED
    println(lista4.sorted()) // Organiza os valores em ordem crescente
    println(lista4.sortedDescending()) // Organiza os valores em ordem descreescente

    // Reversed
    println(lista4.reversed()) // Organiza os valores de trás para frente
    println(lista1.reversed())
}